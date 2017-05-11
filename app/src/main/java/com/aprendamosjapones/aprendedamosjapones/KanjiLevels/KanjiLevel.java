package com.aprendamosjapones.aprendedamosjapones.KanjiLevels;

/**
 * POJO para los niveles
 */
public class KanjiLevel {
    private String title;
    private String description;
    private String meaning;
    private String onjomi;
    private String kunjomi;
    private int idImage;


    public KanjiLevel(String title, String description, String onjomi, String kunjomi, String meaning, int idImage) {
        this.title = title;
        this.description = description;
        this.onjomi = onjomi;
        this.kunjomi = kunjomi;
        this.meaning = meaning;
        this.idImage = idImage;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getOnjomi() {
        return onjomi;
    }

    public String getKunjomi() {
        return kunjomi;
    }

    public int getIdImage() {
        return idImage;
    }
}
