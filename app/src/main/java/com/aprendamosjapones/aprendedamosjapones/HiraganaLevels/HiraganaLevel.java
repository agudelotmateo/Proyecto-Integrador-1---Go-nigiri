package com.aprendamosjapones.aprendedamosjapones.HiraganaLevels;

/**
 * POJO para los niveles
 */
public class HiraganaLevel {
    private String title;
    private String description;
    private String silabas;
    private String prununciation;
    private String example;
    private int idImage;


    public HiraganaLevel(String title, String description, String prununciation, String example, String silabas, int idImage) {
        this.title = title;
        this.description = description;
        this.prununciation = prununciation;
        this.example = example;
        this.silabas = silabas;
        this.idImage = idImage;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getMeaning() {
        return silabas;
    }

    public String getOnjomi() {
        return prununciation;
    }

    public String getKunjomi() {
        return example;
    }

    public int getIdImage() {
        return idImage;
    }
}
