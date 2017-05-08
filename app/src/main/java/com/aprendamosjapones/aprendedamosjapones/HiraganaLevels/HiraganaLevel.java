package com.aprendamosjapones.aprendedamosjapones.HiraganaLevels;

/**
 * POJO para los niveles
 */
public class HiraganaLevel {
    private String tittle;
    private String description;
    private int idImage;

    public HiraganaLevel(String tittle, String description, int idImage) {
        this.tittle = tittle;
        this.description = description;
        this.idImage = idImage;
    }

    public String getName() {
        return tittle;
    }

    public String getDescription() {
        return description;
    }

    public int getIdImage() {
        return idImage;
    }
}
