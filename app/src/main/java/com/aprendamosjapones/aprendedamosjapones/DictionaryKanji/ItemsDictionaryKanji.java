package com.aprendamosjapones.aprendedamosjapones.DictionaryKanji;

/**
 * POJO para los cursos
 */
public class ItemsDictionaryKanji {
    private String listen;
    private int audioListen;
    private String example1;
    private String example2;
    private String example3;
    private int practice;
    private int idImage;

    public ItemsDictionaryKanji(String listen, int audioListen, String example1, String example2, String example3, int practice, int idImage) {
        this.listen = listen;
        this.audioListen = audioListen;
        this.example1 = example1;
        this.example2 = example2;
        this.example3 = example3;
        this.practice = practice;
        this.idImage = idImage;
    }

    public String getListen() {
        return listen;
    }

    public int getExample() {
        return audioListen;
    }

    public String getExample1() {
        return example1;
    }

    public String getExample2() {
        return example2;
    }

    public String getExample3() {
        return example3;
    }

    public int getPractice() {
        return practice;
    }

    public int getIdImage() {
        return idImage;
    }
}
