package com.aprendamosjapones.aprendedamosjapones.DictionaryKanji;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.Arrays;
import java.util.List;

/**
 * Creado por Hermosa Programación.
 */
public class ContentDictionaryKanji {
    private static ItemsDictionaryKanji[] courses = {
            new ItemsDictionaryKanji("Día",
                    "Día, sol", "ニチ, ニジツ", "ひ, び", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Uno",
                    "Uno, sol", "イチ, イツ", "ひと(つ)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("País",
                    "País", "", "", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("País",
                    "Persona", "ジン, ニン", "ひと", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Año",
                    "Año, Edad", "ネン", "とし", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Grande",
                    "Grande", "ダイ, タイ", "おお(きい)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Diez",
                    "Diez", "ジュウ, ジュッ, ジッ", "とお", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Dos",
                    "Dos", "ニ", "ふた(つ)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Libro",
                    "Libro, Raiz, Origen", "ホン", "もと", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Dentro",
                    "Dentro, Centro", "チュウ", "なか", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Largo",
                    "Largo", "チョウ", "なが(い)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Salir",
                    "Salir, Irse", "シュツ", "で(る), だ(す)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Tres",
                    "Tres", "サン", "みっ(つ)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Tiempo",
                    "Tiempo", "ジ", "とき", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Ir",
                    "Ir", "コウ, ギョウ", "い(く), おこな(う)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Ver",
                    "Ver", "ケン", "み(る)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Mes",
                    "Mes, Luna", "ゲツ(ガツ)", "つき", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Atrás",
                    "Atrás, Después", "ゴ, コウ", "うし(ろ), あと", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Frente",
                    "Frente, Antes", "ゼン", "まえ", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Vida",
                    "Vida, Nacer", "セイ", "う(まねる), い(きる)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Cinco",
                    "Cinco", "ゴ", "いつ(つ)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Entre",
                    "Entre", "カン", "あいだ, ま", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Encima",
                    "Encima, Arriba", "ジョウ", "お(がる)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Oriente",
                    "Oriente", "トウ", "ひがし", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Cuatro",
                    "Cuatro", "シ", "よっ(つ), よん, よ", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Ahora",
                    "Ahora", "コン", "いま", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Oro",
                    "Oro, Dinero", "キン", "きん, かね", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Nueve",
                    "Nueve", "キュウ, ク", "ここの(つ)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Entrar",
                    "Entrar, Colocar", "ニュウ", "はい(る), い(ねる)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("",
                    "Estudiar", "ガク", "まな(ぶ)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Alto",
                    "Alto, Caro", "コウ", "たか(い)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Círculo",
                    "Círculo, Yen", "エン", "えん", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Niño",
                    "Niño", "シ", "こ", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Afuera",
                    "Afuera", "ガイ", "そと", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Ocho",
                    "Ocho", "ハチ", "やっ(つ)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Seis",
                    "Seis", "ロク", "むっ(つ)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Debajo",
                    "Debajo, Abajo", "カ, ゲ", "した, さ(がる)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Venir",
                    "Venir", "ライ", "く(る), こ(ない), き(ます)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Espíritu",
                    "Espíritu", "キ", "", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Pequeño",
                    "Pequeño", "ショウ", "ちい(さい)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Siete",
                    "Siete", "シチ", "なな, なな(つ)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Montaña",
                    "Montaña", "サン", "やま", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Charla",
                    "Charla", "ワ", "はな(す), はなし", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Mujer",
                    "Mujer", "ジョ", "おんな", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Norte",
                    "Norte", "ホク", "きた", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Mediodía",
                    "Mediodía", "ゴ", "", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Cien",
                    "Cien", "ヒャク", "", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Escribir",
                    "Escribir", "ショ", "か(く)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Antes",
                    "Antes, Anterior", "セン", "さき", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Nombre",
                    "Nombre", "メイ", "な", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Río",
                    "Río", "セン", "かわ", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Mil",
                    "Mil", "セン", "せん, ち", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Agua",
                    "Agua", "スイ", "みず", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Mitad",
                    "Mitad", "ハン", "", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Hombre",
                    "Hombre", "ダン, ナン", "おとこ", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Occidente",
                    "Occidente", "セイ, サイ", "にし", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Electricidad",
                    "Electricidad", "デン", "", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Colegio",
                    "Colegio", "コウ", "", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Palabra",
                    "Palabra", "ゴ", "かた(る)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Suelo",
                    "Suelo, Tierra", "ド, ト", "つち", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Árbol",
                    "Árbol", "モク", "き", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Escuchar",
                    "Escuchar", "ブン", "き(く), き(こえる)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Comer",
                    "Comer", "ショク", "た(べる)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Carro",
                    "Carro", "シャ", "くるま", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Qué",
                    "Qué", "カ", "なに, なん", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Sur",
                    "Sur", "ナン", "みなみ", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Diez mil",
                    "Diez mil", "マン, バン", "まん", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Cada",
                    "Cada", "マイ", "", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Blanco",
                    "Blanco", "ハク", "しろ, しろ(い)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Cielo",
                    "Cielo", "テン", "", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Mamá",
                    "Mamá", "ボ", "はは", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Fuego",
                    "Fuego", "カ", "ひ", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Derecha",
                    "Derecha", "ウ, ユウ", "みぎ", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Leer",
                    "Leer", "ドク", "よ(む)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Amigo",
                    "Amigo", "ユウ", "とも", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Izquierda",
                    "Izquierda", "サ", "ひだり", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Descansar",
                    "Descansar", "キュウ", "やす(む)", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Papá",
                    "Papá", "フ", "ちち", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Lluvia",
                    "Lluvia", "ウ", "あめ", R.raw.aud1a, R.raw.aud1a, R.drawable.kanji1dia, R.drawable.kanji1dia)
    };

    /**
     * Obtiene como lista todos los cursos de prueba
     *
     * @return Lista de cursos
     */
    public static List<ItemsDictionaryKanji> getCourses() {
        return Arrays.asList(courses);
    }

    /**
     * Obtiene un curso basado en la posición del array
     *
     * @param position Posición en el array
     * @return Curso seleccioando
     */
    public static ItemsDictionaryKanji getCourseByPosition(int position) {
        return courses[position];
    }

}
