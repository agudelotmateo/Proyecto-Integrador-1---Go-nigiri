package com.aprendamosjapones.aprendedamosjapones.HiraganaLevels;

/**
 * POJO para los niveles
 */
public class HiraganaLevel {
    private String title;
    private String description;
    private int idImage;


    public HiraganaLevel(String title, String description, int idImage) {
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
