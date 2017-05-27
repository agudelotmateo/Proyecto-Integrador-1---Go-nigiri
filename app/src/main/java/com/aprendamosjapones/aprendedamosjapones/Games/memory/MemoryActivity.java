package com.aprendamosjapones.aprendedamosjapones.Games.memory;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.GridLayout;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * The memory game itself.
 *
 * @author Mateo Agudelo Toro
 */
public class MemoryActivity extends AppCompatActivity implements View.OnClickListener {
    // Used to generate random IDs
    private static final AtomicInteger sNextGeneratedId = new AtomicInteger(1);
    private MemoryButton firstButton, secondButton;
    private boolean busy;

    public static int rows, columns;
    public static String alphabet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getResources().getIdentifier("activity_memory", "layout", getPackageName()));

        GridLayout gridLayout = (GridLayout) findViewById(R.id.grid_memory);
        gridLayout.setRowCount(rows);
        gridLayout.setColumnCount(columns);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = Math.min(260, (displayMetrics.widthPixels) / columns);
        int height = Math.min(120, (displayMetrics.heightPixels -
                getNavigationBarHeight(this)) / rows);
        busy = false;

        String[][] matrix = Kana.getRandom(rows, columns, alphabet,
                                           alphabet.equals("kanji") ? "sigkanji" : "match_");
        shuffleMatrix(matrix);
        fillFromMatrixKana(gridLayout, matrix, width, height);
    }

    @Override
    public void onClick(View v) {
        if (!busy) {
            MemoryButton button = ((MemoryButton) v);
            if (!button.isMatched()) {
                if (firstButton == null) {
                    button.flip();
                    firstButton = button;
                } else if (button.getImageID() == firstButton.getImageID()) {
                    // do nothing
                } else if (button.getRomaji().equals(firstButton.getRomaji())) {
                    button.flip();

                    button.setMatched(true);
                    firstButton.setMatched(true);

                    button.setEnabled(false);
                    firstButton.setEnabled(false);

                    firstButton = null;
                } else {
                    button.flip();
                    secondButton = button;
                    busy = true;

                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            secondButton.flip();
                            firstButton.flip();

                            secondButton = null;
                            firstButton = null;

                            busy = false;
                        }
                    }, 800);
                }
            }
        }
    }

    /**
     * Shuffle the contents of a given matrix.
     *
     * @param matrix matrix to be shuffled.
     */
    private void shuffleMatrix(String[][] matrix) {
        int columns = matrix[0].length;
        int n = matrix.length * columns;
        int rand, randRow, randCol, myRow, myCol;
        Random random = new Random();
        String tmp;

        for (int i = n-1; i >= 0; --i) {
            rand = random.nextInt(n-i);
            randRow = rand / columns;
            randCol = rand % columns;

            myRow = i / columns;
            myCol = i % columns;

            tmp = matrix[randRow][randCol];
            matrix[randRow][randCol] = matrix[myRow][myCol];
            matrix[myRow][myCol] = tmp;
        }
    }

    /**
     * Fills layout from matrix containing the name of the drawable resources.
     *
     * @param gridLayout grid to place the images in.
     * @param width desired width of the image in the layout.
     * @param matrix matrix containing the name of the drawable resources.
     * @param height desired height of the image in the layout.
     */
    private void fillFromMatrixKana(GridLayout gridLayout, String[][] matrix, int width, int height) {
        int imageID;
        String romaji;

        for (int r = 0; r < rows; ++r)
            for (int c = 0; c < columns; ++c) {
                if (matrix[r][c].charAt(0) == 'm') {
                    romaji = matrix[r][c].substring(6);
                }
                else {
                    int i;
                    for (i = 9; i < matrix[r][c].length(); ++i)
                        if (matrix[r][c].charAt(i) < '0' || matrix[r][c].charAt(i) > '9')
                            break;
                    romaji = matrix[r][c].substring(i);
                }
                imageID = getResources().getIdentifier(matrix[r][c], "drawable", getPackageName());
                MemoryButton button = new MemoryButton(this, r, c, width, height, imageID, romaji);
                button.setId(generateViewId());
                button.setOnClickListener(this);
                gridLayout.addView(button);
            }
    }

    /**
     * Generates unique view IDs.
     * Replaces View.generateViewId() which is not available on current API level (15).
     * Taken from <a href="url">http://stackoverflow.com/questions/6790623/programmatic-views-how-to-set-unique-idstext</a>.
     *
     * @return unique view ID.
     */
    public static int generateViewId() {
        for (;;) {
            final int result = sNextGeneratedId.get();
            int newValue = result + 1;
            if (newValue > 0x00FFFFFF) newValue = 1;
            if (sNextGeneratedId.compareAndSet(result, newValue))
                return result;
        }
    }

    /**
     * @param context context.
     * @return navigation bar's height.
     */
    private static int getNavigationBarHeight(Context context) {
        Point p = getNavigationBarSize(context);
        if (p.equals(new Point()))
            return 0;
        return Math.min(p.x, p.y);
    }

    /**
     * Obtains navigation bar's size (both its height (x) and width (y)).
     * Taken from <a href="url">http://stackoverflow.com/questions/20264268/how-to-get-height-and-width-of-navigation-bar-programmatically</a>.
     *
     * @param context context.
     * @return navigation bar size.
     */
    private static Point getNavigationBarSize(Context context) {
        Point appUsableSize = getAppUsableScreenSize(context);
        Point realScreenSize = getRealScreenSize(context);

        // navigation bar on the right
        if (appUsableSize.x < realScreenSize.x)
            return new Point(realScreenSize.x - appUsableSize.x, appUsableSize.y);

        // navigation bar at the bottom
        if (appUsableSize.y < realScreenSize.y)
            return new Point(appUsableSize.x, realScreenSize.y - appUsableSize.y);

        // navigation bar not present
        return new Point();
    }

    /**
     * Used to get navigation bar's size.
     * Taken from <a href="url">http://stackoverflow.com/questions/20264268/how-to-get-height-and-width-of-navigation-bar-programmatically</a>.
     *
     * @param context context.
     * @return usable screen size.
     */
    private static Point getAppUsableScreenSize(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = windowManager.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        return size;
    }

    /**
     * Used to get navigation bar's size.
     * Taken from <a href="url">http://stackoverflow.com/questions/20264268/how-to-get-height-and-width-of-navigation-bar-programmatically</a>.
     *
     * @param context context.
     * @return total screen size.
     */
    private static Point getRealScreenSize(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = windowManager.getDefaultDisplay();
        Point size = new Point();

        if (Build.VERSION.SDK_INT >= 17)
            display.getRealSize(size);
        else
            try {
                size.x = (Integer) Display.class.getMethod("getRawWidth").invoke(display);
                size.y = (Integer) Display.class.getMethod("getRawHeight").invoke(display);
            } catch (Exception e) {}

        return size;
    }

}
