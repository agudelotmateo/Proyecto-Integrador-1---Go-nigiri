package com.aprendamosjapones.aprendedamosjapones.Games.memory;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatImageButton;
import android.widget.GridLayout;

import com.aprendamosjapones.aprendedamosjapones.R;

/**
 * Button in the memory game.
 *
 * @author Mateo Agudelo Toro
 */
public class MemoryButton extends AppCompatImageButton {
    protected int row, column, imageID, width, height;
    protected boolean down, matched;
    protected Drawable front, back;
    protected String romaji;

    public MemoryButton(Context ctx, int row, int column, int width, int height, int imageID,
                        String romaji) {
        super(ctx);
        this.row = row;
        this.column = column;
        this.imageID = imageID;
        this.romaji = romaji;
        this.width = width;
        this.height = height;
        this.down = true;
        this.matched = false;
        this.front = resize(ctx, imageID);
        this.back = resize(ctx, R.drawable.question);

        GridLayout.LayoutParams tempParams = new GridLayout.LayoutParams(GridLayout.spec(row),
                GridLayout.spec(column));
        tempParams.width = width;
        tempParams.height = height;
        setLayoutParams(tempParams);

        setBackgroundColor(Color.WHITE);
        setImageDrawable(back);
    }

    private Drawable resize(Context ctx, int imageID) {
        Drawable d = ContextCompat.getDrawable(ctx, imageID);
        Bitmap bitmap = ((BitmapDrawable) d).getBitmap();
        return new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, width,
                height, true));
    }

    public int getImageID() {
        return imageID;
    }

    public boolean isMatched() {
        return matched;
    }

    public String getRomaji() {
        return romaji;
    }

    public void setMatched(boolean matched) {
        this.matched = matched;
    }

    public void flip() {
        if (!matched) {
            setBackgroundColor(Color.WHITE);
            if (down)
                setImageDrawable(front);
            else
                setImageDrawable(back);
            down = !down;
        }
    }
}
