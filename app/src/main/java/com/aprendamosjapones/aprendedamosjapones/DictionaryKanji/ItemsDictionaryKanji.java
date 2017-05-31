package com.aprendamosjapones.aprendedamosjapones.DictionaryKanji;

/**
 * POJO para los cursos
 */
public class ItemsDictionaryKanji {
    private String listen;
    private String meaning;
    private String onjomi;
    private String kunyomi;
    private int audioOnyomi;
    private int audioKunyomi;
    private int practice;
    private int idImage;


    public ItemsDictionaryKanji(String listen, String meaning, String onjomi, String kunyomi, int audioOnyomi, int audioKunyomi, int practice, int idImage) {
       this.listen = listen;
        this.meaning = meaning;
        this.onjomi = onjomi;
        this.kunyomi = kunyomi;
        this.audioOnyomi = audioOnyomi;
        this.audioKunyomi = audioKunyomi;
        this.practice = practice;
        this.idImage = idImage;
    }

    public String getListen() {
        return listen;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getOnjomi() {
        return onjomi;
    }

    public String getKunyomi() {
        return kunyomi;
    }

    public int getAudioOnyomi() {
        return audioOnyomi;
    }

    public int getAudioKunyomi() {
        return audioKunyomi;
    }

    public int getPractice() {
        return practice;
    }

    public int getIdImage() {
        return idImage;
    }

}
