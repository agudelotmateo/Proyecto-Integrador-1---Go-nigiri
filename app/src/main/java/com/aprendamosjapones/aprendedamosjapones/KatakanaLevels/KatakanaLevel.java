package com.aprendamosjapones.aprendedamosjapones.KatakanaLevels;

/**
 * POJO para los niveles
 */
public class KatakanaLevel {
    private String tittle;
    private String description;
    private int idImage;

    public KatakanaLevel(String tittle, String description, int idImage) {
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
