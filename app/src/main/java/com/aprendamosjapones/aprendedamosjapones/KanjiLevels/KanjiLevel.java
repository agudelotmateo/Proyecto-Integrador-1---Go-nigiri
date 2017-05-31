package com.aprendamosjapones.aprendedamosjapones.KanjiLevels;

/**
 * POJO para los niveles
 */
public class KanjiLevel {
    private String title;
    private String description;
    private int idImage;


    public KanjiLevel(String title, String description, int idImage) {
        this.title = title;
        this.description = description;
        this.idImage = idImage;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getIdImage() {
        return idImage;
    }
}
