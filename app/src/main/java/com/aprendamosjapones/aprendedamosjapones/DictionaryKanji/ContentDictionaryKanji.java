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
                    "Día, sol", "ニチ, ニジツ", "ひ, び", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan1dia, R.drawable.kanji1dia),

            new ItemsDictionaryKanji("Uno",
                    "Uno, sol", "イチ, イツ", "ひと(つ)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan2uno, R.drawable.kanji2uno),

            new ItemsDictionaryKanji("País",
                    "País", "", "", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan3pais, R.drawable.kanji3pais),

            new ItemsDictionaryKanji("Persona",
                    "Persona", "ジン, ニン", "ひと", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan4persona, R.drawable.kanji4persona),

            new ItemsDictionaryKanji("Año",
                    "Año, Edad", "ネン", "とし", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan5ano, R.drawable.kanji5ano),

            new ItemsDictionaryKanji("Grande",
                    "Grande", "ダイ, タイ", "おお(きい)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan6grande, R.drawable.kanji6grande),

            new ItemsDictionaryKanji("Diez",
                    "Diez", "ジュウ, ジュッ, ジッ", "とお", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan7diez, R.drawable.kanji7diez),

            new ItemsDictionaryKanji("Dos",
                    "Dos", "ニ", "ふた(つ)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan8dos, R.drawable.kanji8dos),

            new ItemsDictionaryKanji("Libro",
                    "Libro, Raiz, Origen", "ホン", "もと", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan9libro, R.drawable.kanji9libro),

            new ItemsDictionaryKanji("Dentro",
                    "Dentro, Centro", "チュウ", "なか", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan10dentro, R.drawable.kanji10dentro),

            new ItemsDictionaryKanji("Largo",
                    "Largo", "チョウ", "なが(い)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan11largo, R.drawable.kanji11largo),

            new ItemsDictionaryKanji("Salir",
                    "Salir, Irse", "シュツ", "で(る), だ(す)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan12salir, R.drawable.kanji12salir),

            new ItemsDictionaryKanji("Tres",
                    "Tres", "サン", "みっ(つ)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan13tres, R.drawable.kanji13tres),

            new ItemsDictionaryKanji("Tiempo",
                    "Tiempo", "ジ", "とき", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan14tiempo, R.drawable.kanji14tiempo),

            new ItemsDictionaryKanji("Ir",
                    "Ir", "コウ, ギョウ", "い(く), おこな(う)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan15ir, R.drawable.kanji15ir),

            new ItemsDictionaryKanji("Ver",
                    "Ver", "ケン", "み(る)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan16ver, R.drawable.kanji16ver),

            new ItemsDictionaryKanji("Mes",
                    "Mes, Luna", "ゲツ(ガツ)", "つき", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan17mes, R.drawable.kanji17mes),

            new ItemsDictionaryKanji("Atrás",
                    "Atrás, Después", "ゴ, コウ", "うし(ろ), あと", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan18atras, R.drawable.kanji18atras),

            new ItemsDictionaryKanji("Frente",
                    "Frente, Antes", "ゼン", "まえ", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan19frente, R.drawable.kanji19frente),

            new ItemsDictionaryKanji("Vida",
                    "Vida, Nacer", "セイ", "う(まねる), い(きる)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan20vida, R.drawable.kanji20vida),

            new ItemsDictionaryKanji("Cinco",
                    "Cinco", "ゴ", "いつ(つ)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan21cinco, R.drawable.kanji21cinco),

            new ItemsDictionaryKanji("Entre",
                    "Entre", "カン", "あいだ, ま", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan22entre, R.drawable.kanji22entre),

            new ItemsDictionaryKanji("Encima",
                    "Encima, Arriba", "ジョウ", "お(がる)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan23encima, R.drawable.kanji23encima),

            new ItemsDictionaryKanji("Oriente",
                    "Oriente", "トウ", "ひがし", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan24oriente, R.drawable.kanji24oriente),

            new ItemsDictionaryKanji("Cuatro",
                    "Cuatro", "シ", "よっ(つ), よん, よ", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan25cuatro, R.drawable.kanji25cuatro),

            new ItemsDictionaryKanji("Ahora",
                    "Ahora", "コン", "いま", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan26ahora, R.drawable.kanji26ahora),

            new ItemsDictionaryKanji("Oro",
                    "Oro, Dinero", "キン", "きん, かね", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan27oro, R.drawable.kanji27oro),

            new ItemsDictionaryKanji("Nueve",
                    "Nueve", "キュウ, ク", "ここの(つ)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan28nueve, R.drawable.kanji28nueve),

            new ItemsDictionaryKanji("Entrar",
                    "Entrar, Colocar", "ニュウ", "はい(る), い(ねる)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan29entrar, R.drawable.kanji29entrar),

            new ItemsDictionaryKanji("",
                    "Estudiar", "ガク", "まな(ぶ)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan30estudiar, R.drawable.kanji30estudiar),

            new ItemsDictionaryKanji("Alto",
                    "Alto, Caro", "コウ", "たか(い)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan31alto, R.drawable.kanji31alto),

            new ItemsDictionaryKanji("Círculo",
                    "Círculo, Yen", "エン", "えん", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan32circulo, R.drawable.kanji32circulo),

            new ItemsDictionaryKanji("Niño",
                    "Niño", "シ", "こ", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan33nino, R.drawable.kanji33nino),

            new ItemsDictionaryKanji("Afuera",
                    "Afuera", "ガイ", "そと", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan34afuera, R.drawable.kanji34afuera),

            new ItemsDictionaryKanji("Ocho",
                    "Ocho", "ハチ", "やっ(つ)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan35ocho, R.drawable.kanji35ocho),

            new ItemsDictionaryKanji("Seis",
                    "Seis", "ロク", "むっ(つ)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan36seis, R.drawable.kanji36seis),

            new ItemsDictionaryKanji("Debajo",
                    "Debajo, Abajo", "カ, ゲ", "した, さ(がる)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan37debajo, R.drawable.kanji37debajo),

            new ItemsDictionaryKanji("Venir",
                    "Venir", "ライ", "く(る), こ(ない), き(ます)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan38venir, R.drawable.kanji38venir),

            new ItemsDictionaryKanji("Espíritu",
                    "Espíritu", "キ", "", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan39espiritu, R.drawable.kanji39espiritu),

            new ItemsDictionaryKanji("Pequeño",
                    "Pequeño", "ショウ", "ちい(さい)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan40pequeno, R.drawable.kanji40pequeno),

            new ItemsDictionaryKanji("Siete",
                    "Siete", "シチ", "なな, なな(つ)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan41siete, R.drawable.kanji41siete),

            new ItemsDictionaryKanji("Montaña",
                    "Montaña", "サン", "やま", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan42montana, R.drawable.kanji42montana),

            new ItemsDictionaryKanji("Charla",
                    "Charla", "ワ", "はな(す), はなし", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan43charla, R.drawable.kanji43charla),

            new ItemsDictionaryKanji("Mujer",
                    "Mujer", "ジョ", "おんな", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan44mujer, R.drawable.kanji44mujer),

            new ItemsDictionaryKanji("Norte",
                    "Norte", "ホク", "きた", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan45norte, R.drawable.kanji45norte),

            new ItemsDictionaryKanji("Mediodía",
                    "Mediodía", "ゴ", "", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan46mediodia, R.drawable.kanji46mediodia),

            new ItemsDictionaryKanji("Cien",
                    "Cien", "ヒャク", "", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan47cien, R.drawable.kanji47cien),

            new ItemsDictionaryKanji("Escribir",
                    "Escribir", "ショ", "か(く)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan48escribir, R.drawable.kanji48escribir),

            new ItemsDictionaryKanji("Antes",
                    "Antes, Anterior", "セン", "さき", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan49antes, R.drawable.kanji49antes),

            new ItemsDictionaryKanji("Nombre",
                    "Nombre", "メイ", "な", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan50nombre, R.drawable.kanji50nombre),

            new ItemsDictionaryKanji("Río",
                    "Río", "セン", "かわ", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan51rio, R.drawable.kanji51rio),

            new ItemsDictionaryKanji("Mil",
                    "Mil", "セン", "せん, ち", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan52mil, R.drawable.kanji52mil),

            new ItemsDictionaryKanji("Agua",
                    "Agua", "スイ", "みず", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan53agua, R.drawable.kanji53agua),

            new ItemsDictionaryKanji("Mitad",
                    "Mitad", "ハン", "", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan54mitad, R.drawable.kanji54mitad),

            new ItemsDictionaryKanji("Hombre",
                    "Hombre", "ダン, ナン", "おとこ", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan55hombre, R.drawable.kanji55hombre),

            new ItemsDictionaryKanji("Occidente",
                    "Occidente", "セイ, サイ", "にし", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan56occidente, R.drawable.kanji56occidente),

            new ItemsDictionaryKanji("Electricidad",
                    "Electricidad", "デン", "", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan57electricidad, R.drawable.kanji57electricidad),

            new ItemsDictionaryKanji("Colegio",
                    "Colegio", "コウ", "", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan58colegio, R.drawable.kanji58colegio),

            new ItemsDictionaryKanji("Palabra",
                    "Palabra", "ゴ", "かた(る)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan59palabra, R.drawable.kanji59palabra),

            new ItemsDictionaryKanji("Suelo",
                    "Suelo, Tierra", "ド, ト", "つち", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan60suelo, R.drawable.kanji60suelo),

            new ItemsDictionaryKanji("Árbol",
                    "Árbol", "モク", "き", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan61arbol, R.drawable.kanji61arbol),

            new ItemsDictionaryKanji("Escuchar",
                    "Escuchar", "ブン", "き(く), き(こえる)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan62escuchar, R.drawable.kanji62escuchar),

            new ItemsDictionaryKanji("Comer",
                    "Comer", "ショク", "た(べる)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan63comer, R.drawable.kanji63comer),

            new ItemsDictionaryKanji("Carro",
                    "Carro", "シャ", "くるま", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan64carro, R.drawable.kanji64carro),

            new ItemsDictionaryKanji("Qué",
                    "Qué", "カ", "なに, なん", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan65que, R.drawable.kanji65que),

            new ItemsDictionaryKanji("Sur",
                    "Sur", "ナン", "みなみ", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan66sur, R.drawable.kanji66sur),

            new ItemsDictionaryKanji("Diez mil",
                    "Diez mil", "マン, バン", "まん", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan67diezmil, R.drawable.kanji67diezmil),

            new ItemsDictionaryKanji("Cada",
                    "Cada", "マイ", "", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan68cada, R.drawable.kanji68cada),

            new ItemsDictionaryKanji("Blanco",
                    "Blanco", "ハク", "しろ, しろ(い)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan69blanco, R.drawable.kanji69blanco),

            new ItemsDictionaryKanji("Cielo",
                    "Cielo", "テン", "", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan70cielo, R.drawable.kanji70cielo),

            new ItemsDictionaryKanji("Mamá",
                    "Mamá", "ボ", "はは", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan71mama, R.drawable.kanji71mama),

            new ItemsDictionaryKanji("Fuego",
                    "Fuego", "カ", "ひ", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan72fuego, R.drawable.kanji72fuego),

            new ItemsDictionaryKanji("Derecha",
                    "Derecha", "ウ, ユウ", "みぎ", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan73derecha, R.drawable.kanji73derecha),

            new ItemsDictionaryKanji("Leer",
                    "Leer", "ドク", "よ(む)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan74leer, R.drawable.kanji74leer),

            new ItemsDictionaryKanji("Amigo",
                    "Amigo", "ユウ", "とも", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan75amigo, R.drawable.kanji75amigo),

            new ItemsDictionaryKanji("Izquierda",
                    "Izquierda", "サ", "ひだり", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan76izquierda, R.drawable.kanji76izquierda),

            new ItemsDictionaryKanji("Descansar",
                    "Descansar", "キュウ", "やす(む)", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan77descansar, R.drawable.kanji77descansar),

            new ItemsDictionaryKanji("Papá",
                    "Papá", "フ", "ちち", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan78papa, R.drawable.kanji78papa),

            new ItemsDictionaryKanji("Lluvia",
                    "Lluvia", "ウ", "あめ", R.raw.aud1a, R.raw.aud1a, R.drawable.gifkan79lluvia, R.drawable.kanji79lluvia)
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
