package com.aprendamosjapones.aprendedamosjapones.Games.MemoryGame.matching;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mateo on 5/4/17.
 */

public class Words {
    public static Map<String, Match[]> hiragana, katakana;

    private Words() {}

    public static void init() {
        hiragana = new HashMap<>();
        int i;

        i = 0;
        Match[] aiueon = new Match[9];
        aiueon[i++] = new Match("あおい", "azul", new String[]{"a", "o", "i"});
        aiueon[i++] = new Match("いえ", "casa", new String[]{"i", "e"});
        aiueon[i++] = new Match("え", "pintura", new String[]{"e"});
        aiueon[i++] = new Match("いう", "decir", new String[]{"i", "u"});
        aiueon[i++] = new Match("あう", "encontrar", new String[]{"a", "u"});
        aiueon[i++] = new Match("おおい", "mucho", new String[]{"o", "o", "i"});
        aiueon[i++] = new Match("うえ", "arriba", new String[]{"u", "e"});
        aiueon[i++] = new Match("いいえ", "no", new String[]{"i", "i", "e"});
        aiueon[i++] = new Match("ん", "", new String[]{"n"});
        hiragana.put("aiueon", aiueon);

        i = 0;
        Match[] kakikukeko = new Match[13];
        kakikukeko[i++] = new Match("あかい", "rojo", new String[]{"a", "ka", "i"});
        kakikukeko[i++] = new Match("けいかん", "policía", new String[]{"ke", "i", "ka", "n"});
        kakikukeko[i++] = new Match("えき", "estación", new String[]{"e", "ki"});
        kakikukeko[i++] = new Match("こうえん", "parque", new String[]{"ko", "u", "e", "n"});
        kakikukeko[i++] = new Match("いか", "calamar", new String[]{"i", "ka"});
        kakikukeko[i++] = new Match("かき", "ostra", new String[]{"ka", "ki"});
        kakikukeko[i++] = new Match("いく", "ir", new String[]{"i", "ku"});
        kakikukeko[i++] = new Match("かく", "escribir", new String[]{"ka", "ku"});
        kakikukeko[i++] = new Match("おおきい", "grande", new String[]{"o", "o", "ki", "i"});
        kakikukeko[i++] = new Match("えき", "estación", new String[]{"e", "ki"});
        kakikukeko[i++] = new Match("くうこう", "aeropuerto", new String[]{"ku", "u", "ko", "u"});
        kakikukeko[i++] = new Match("うけ", "estanque", new String[]{"u", "ke"});
        kakikukeko[i++] = new Match("ここ", "aquí", new String[]{"ko", "ko"});
        hiragana.put("kakikukeko", kakikukeko);

        i = 0;
        Match[] sashisuseso = new Match[15];
        sashisuseso[i++] = new Match("おかあさん", "mamá", new String[]{"o", "ka", "a", "sa", "n"});
        sashisuseso[i++] = new Match("うし", "vaca", new String[]{"u", "shi"});
        sashisuseso[i++] = new Match("しお", "sal", new String[]{"shi", "o"});
        sashisuseso[i++] = new Match("すいか", "sandía", new String[]{"su", "i", "ka"});
        sashisuseso[i++] = new Match("かさ", "sombrilla", new String[]{"ka", "sa"});
        sashisuseso[i++] = new Match("あし", "pie", new String[]{"a", "shi"});
        sashisuseso[i++] = new Match("せんせい", "profesor", new String[]{"se", "n", "se", "i"});
        sashisuseso[i++] = new Match("いす", "silla", new String[]{"i", "su"});
        sashisuseso[i++] = new Match("かんそうき", "secadora", new String[]{"ka", "n", "so", "u", "ki"});
        sashisuseso[i++] = new Match("しんかんせん", "tren bala", new String[]{"shi", "n", "ka", "n", "se", "n"});
        sashisuseso[i++] = new Match("すいえい", "natación", new String[]{"su", "i", "e", "i"});
        sashisuseso[i++] = new Match("おそい", "lento", new String[]{"o", "so", "i"});
        sashisuseso[i++] = new Match("あさい", "superficial", new String[]{"a", "sa", "i"});
        sashisuseso[i++] = new Match("そこ", "allá", new String[]{"so", "ko"});
        sashisuseso[i++] = new Match("おかし", "dulces", new String[]{"o", "ka", "shi"});
        hiragana.put("sashisuseso", sashisuseso);

        i = 0;
        Match[] tachitsuteto = new Match[18];
        tachitsuteto[i++] = new Match("おとうさん", "papá", new String[]{"o", "to", "u", "sa", "n"});
        tachitsuteto[i++] = new Match("おとうと", "hermano menor", new String[]{"o", "to", "u", "to"});
        tachitsuteto[i++] = new Match("けんちくか", "arquitecto", new String[]{"ke", "n", "chi", "ku", "ka"});
        tachitsuteto[i++] = new Match("くち", "boca", new String[]{"ku", "chi"});
        tachitsuteto[i++] = new Match("つくえ", "escritorio", new String[]{"tsu", "ku", "e"});
        tachitsuteto[i++] = new Match("かた", "hombro", new String[]{"ka", "ta"});
        tachitsuteto[i++] = new Match("て", "mano", new String[]{"te"});
        tachitsuteto[i++] = new Match("くつ", "zapatos", new String[]{"ku", "tsu"});
        tachitsuteto[i++] = new Match("せんたくき", "lavadora", new String[]{"se", "n", "ta", "ku", "ki"});
        tachitsuteto[i++] = new Match("うち", "adentro", new String[]{"u", "chi"});
        tachitsuteto[i++] = new Match("あした", "mañana (día siguiente)", new String[]{"a", "shi", "ta"});
        tachitsuteto[i++] = new Match("した", "lengua", new String[]{"shi", "ta"});
        tachitsuteto[i++] = new Match("あつい", "caliente", new String[]{"a", "tsu", "i"});
        tachitsuteto[i++] = new Match("たて", "vertical", new String[]{"ta", "te"});
        tachitsuteto[i++] = new Match("たいいく", "educación física", new String[]{"ta", "i", "i", "ku"});
        tachitsuteto[i++] = new Match("つき", "luna", new String[]{"tsu", "ki"});
        tachitsuteto[i++] = new Match("きって", "estampilla", new String[]{"ki", "tte"});
        tachitsuteto[i++] = new Match("とお", "diez", new String[]{"to", "o"});
        hiragana.put("tachitsuteto", tachitsuteto);

        i = 0;
        Match[] naninuneno = new Match[14];
        naninuneno[i++] = new Match("おねえさん", "hermana mayor", new String[]{"o", "ne", "e", "sa", "n"});
        naninuneno[i++] = new Match("にいさん", "hermano mayor", new String[]{"ni", "i", "sa", "n"});
        naninuneno[i++] = new Match("きのう", "ayer", new String[]{"ki", "no", "u"});
        naninuneno[i++] = new Match("いぬ", "perro", new String[]{"i", "nu"});
        naninuneno[i++] = new Match("ねこ", "gato", new String[]{"ne", "ko"});
        naninuneno[i++] = new Match("さかな", "pez", new String[]{"sa", "ka", "na"});
        naninuneno[i++] = new Match("にく", "carne", new String[]{"ni", "ku"});
        naninuneno[i++] = new Match("きのこ", "champiñón", new String[]{"ki", "no", "ko"});
        naninuneno[i++] = new Match("にんにく", "ajo", new String[]{"ni", "n", "ni", "ku"});
        naninuneno[i++] = new Match("せなか", "espalda", new String[]{"se", "na", "ka"});
        naninuneno[i++] = new Match("おなか", "estómago", new String[]{"o", "na", "ka"});
        naninuneno[i++] = new Match("のうか", "granjero", new String[]{"no", "u", "ka"});
        naninuneno[i++] = new Match("つの", "cuerno", new String[]{"tsu", "no"});
        naninuneno[i++] = new Match("なな", "siete", new String[]{"na", "na"});
        hiragana.put("naninuneno", naninuneno);

        i = 0;
        Match[] hahifuheho = new Match[13];
        hahifuheho[i++] = new Match("ひこうき", "avión", new String[]{"hi", "ko", "u", "ki"});
        hahifuheho[i++] = new Match("はな", "flor/nariz", new String[]{"ha", "na"});
        hahifuheho[i++] = new Match("にほん", "Japón", new String[]{"ni", "ho", "n"});
        hahifuheho[i++] = new Match("ふね", "barco", new String[]{"fu", "ne"});
        hahifuheho[i++] = new Match("はと", "paloma", new String[]{"ha", "to"});
        hahifuheho[i++] = new Match("ほん", "libro", new String[]{"ho", "n"});
        hahifuheho[i++] = new Match("ふとい", "gordo", new String[]{"fu", "to", "i"});
        hahifuheho[i++] = new Match("ひくい", "bajo", new String[]{"hi", "ku", "i"});
        hahifuheho[i++] = new Match("へい", "muro", new String[]{"he", "i"});
        hahifuheho[i++] = new Match("はし", "puente", new String[]{"ha", "shi"});
        hahifuheho[i++] = new Match("ひと", "persona", new String[]{"hi", "to"});
        hahifuheho[i++] = new Match("ひ", "fuego", new String[]{"hi"});
        hahifuheho[i++] = new Match("ほし", "estrella", new String[]{"ho", "shi"});
        hiragana.put("hahifuheho", hahifuheho);

        i = 0;
        Match[] mamimumemo = new Match[20];
        mamimumemo[i++] = new Match("いもうと", "hermana menor", new String[]{"i", "mo", "u", "to"});
        mamimumemo[i++] = new Match("うみ", "mar", new String[]{"u", "mi"});
        mamimumemo[i++] = new Match("くま", "oso", new String[]{"ku", "ma"});
        mamimumemo[i++] = new Match("うま", "caballo", new String[]{"u", "ma"});
        mamimumemo[i++] = new Match("おおかみ", "lobo", new String[]{"o", "o", "ka", "mi"});
        mamimumemo[i++] = new Match("あたま", "cabeza", new String[]{"a", "ta", "ma"});
        mamimumemo[i++] = new Match("さむい", "frío", new String[]{"sa", "mu", "i"});
        mamimumemo[i++] = new Match("かみ", "cabello/papel", new String[]{"ka", "mi"});
        mamimumemo[i++] = new Match("め", "ojo", new String[]{"me"});
        mamimumemo[i++] = new Match("みみ", "oreja", new String[]{"mi", "mi"});
        mamimumemo[i++] = new Match("つめ", "uña", new String[]{"tsu", "me"});
        mamimumemo[i++] = new Match("むね", "pecho", new String[]{"mu", "ne"});
        mamimumemo[i++] = new Match("のむ", "tomar", new String[]{"no", "mu"});
        mamimumemo[i++] = new Match("くも", "nube", new String[]{"ku", "mo"});
        mamimumemo[i++] = new Match("いま", "ahora", new String[]{"i", "ma"});
        mamimumemo[i++] = new Match("むし", "insecto", new String[]{"mu", "shi"});
        mamimumemo[i++] = new Match("かいもの", "compras", new String[]{"ka", "i", "mo", "no"});
        mamimumemo[i++] = new Match("みっつ", "tres", new String[]{"mi", "ttsu"});
        mamimumemo[i++] = new Match("むっつ", "seis", new String[]{"mu", "ttsu"});
        mamimumemo[i++] = new Match("もも", "durazno", new String[]{"mo", "mo"});
        hiragana.put("mamimumemo", mamimumemo);

        i = 0;
        Match[] yayuyo = new Match[11];
        yayuyo[i++] = new Match("よっつ", "cuatro", new String[]{"yo", "ttsu"});
        yayuyo[i++] = new Match("やま", "montaña", new String[]{"ya", "ma"});
        yayuyo[i++] = new Match("やさい", "vegetal", new String[]{"ya", "sa", "i"});
        yayuyo[i++] = new Match("ゆき", "nieve", new String[]{"yu", "ki"});
        yayuyo[i++] = new Match("へや", "habitación", new String[]{"he", "ya"});
        yayuyo[i++] = new Match("ゆか", "piso", new String[]{"yu", "ka"});
        yayuyo[i++] = new Match("よむ", "leer", new String[]{"yo", "mu"});
        yayuyo[i++] = new Match("つよい", "suerte", new String[]{"tsu", "yo", "i"});
        yayuyo[i++] = new Match("やく", "aproximadamente", new String[]{"ya", "ku"});
        yayuyo[i++] = new Match("やっと", "finalmente", new String[]{"ya", "tto"});
        yayuyo[i++] = new Match("よこ", "horizontal", new String[]{"yo", "ko"});
        hiragana.put("yayuyo", yayuyo);

        i = 0;
        Match[] rarirurero = new Match[16];
        rarirurero[i++] = new Match("きいろ", "amarillo", new String[]{"ki", "i", "ro"});
        rarirurero[i++] = new Match("しろい", "blanco", new String[]{"shi", "ro", "i"});
        rarirurero[i++] = new Match("よる", "noche", new String[]{"yo", "ru"});
        rarirurero[i++] = new Match("とり", "pajaro", new String[]{"to", "ri"});
        rarirurero[i++] = new Match("くるま", "carro", new String[]{"ku", "ru", "ma"});
        rarirurero[i++] = new Match("さる", "mono", new String[]{"sa", "ru"});
        rarirurero[i++] = new Match("かみなり", "trueno", new String[]{"ka", "mi", "na", "ri"});
        rarirurero[i++] = new Match("あらし", "tormenta", new String[]{"a", "ra", "shi"});
        rarirurero[i++] = new Match("むらさき", "morado", new String[]{"mu", "ra", "sa", "ki"});
        rarirurero[i++] = new Match("きれい", "lindo", new String[]{"ki", "re", "i"});
        rarirurero[i++] = new Match("くすり", "medicina", new String[]{"ku", "su", "ri"});
        rarirurero[i++] = new Match("れきし", "historia", new String[]{"re", "ki", "shi"});
        rarirurero[i++] = new Match("くろい", "negro", new String[]{"ku", "ro", "i"});
        rarirurero[i++] = new Match("からて", "karate", new String[]{"ka", "ra", "te"});
        rarirurero[i++] = new Match("しろ", "castillo", new String[]{"shi", "ro"});
        rarirurero[i++] = new Match("はしる", "correr", new String[]{"ha", "shi", "ru"});
        hiragana.put("rarirurero", rarirurero);

        i = 0;
        Match[] wawo = new Match[9];
        wawo[i++] = new Match("かわ", "rio", new String[]{"ka", "wa"});
        wawo[i++] = new Match("にわとり", "pollo", new String[]{"ni", "wa", "to", "ri"});
        wawo[i++] = new Match("にわ", "jardín", new String[]{"ni", "wa"});
        wawo[i++] = new Match("わし", "águila", new String[]{"wa", "shi"});
        wawo[i++] = new Match("わらう", "reir", new String[]{"wa", "ra", "u"});
        wawo[i++] = new Match("かわいい", "tierno", new String[]{"ka", "wa", "i", "i"});
        wawo[i++] = new Match("よわい", "débil", new String[]{"yo", "wa", "i"});
        wawo[i++] = new Match("を", "(partícula)", new String[]{"wo"});
        wawo[i++] = new Match("へいわ", "paz", new String[]{"he", "i", "wa"});
        hiragana.put("wawo", wawo);

        i = 0;
        Match[] gagigugego = new Match[18];
        gagigugego[i++] = new Match("ごご", "tarde (parte del día)", new String[]{"go", "go"});
        gagigugego[i++] = new Match("あさごはん", "desayuno", new String[]{"a", "sa", "go", "ha", "n"});
        gagigugego[i++] = new Match("ごはん", "comida", new String[]{"go", "ha", "n"});
        gagigugego[i++] = new Match("がっこう", "colegio", new String[]{"ga", "kko", "u"});
        gagigugego[i++] = new Match("にぎり", "bola de arroz", new String[]{"ni", "gi", "ri"});
        gagigugego[i++] = new Match("うさぎ", "conejo", new String[]{"u", "sa", "gi"});
        gagigugego[i++] = new Match("ひるごはん", "almuerzo", new String[]{"hi", "ru", "go", "ha", "n"});
        gagigugego[i++] = new Match("たまご", "nuevo", new String[]{"ta", "ma", "go"});
        gagigugego[i++] = new Match("いちご", "fresa", new String[]{"i", "chi", "go"});
        gagigugego[i++] = new Match("りんご", "manzana", new String[]{"ri", "n", "go"});
        gagigugego[i++] = new Match("ひげ", "barba", new String[]{"hi", "ge"});
        gagigugego[i++] = new Match("がくせい", "estudiante", new String[]{"ga", "ku", "se", "i"});
        gagigugego[i++] = new Match("まぐろ", "atún", new String[]{"ma", "gu", "ro"});
        gagigugego[i++] = new Match("みぎ", "derecha", new String[]{"mi", "gi"});
        gagigugego[i++] = new Match("すうがく", "matemáticas", new String[]{"su", "u", "ga", "ku"});
        gagigugego[i++] = new Match("がか", "pintor", new String[]{"ga", "ka"});
        gagigugego[i++] = new Match("かぐ", "mueble", new String[]{"ka", "gu"});
        gagigugego[i++] = new Match("てがみ", "carta", new String[]{"te", "ga", "mi"});
        hiragana.put("gagigugego", gagigugego);

        i = 0;
        Match[] zajizuzezo = new Match[12];
        zajizuzezo[i++] = new Match("おじいさん", "abuelo", new String[]{"o", "ji", "i", "sa", "n"});
        zajizuzezo[i++] = new Match("ねずみ", "ratón", new String[]{"ne", "zu", "mi"});
        zajizuzezo[i++] = new Match("ひつじ", "oveja", new String[]{"hi", "tsu", "ji"});
        zajizuzezo[i++] = new Match("みず", "agua", new String[]{"mi", "zu"});
        zajizuzezo[i++] = new Match("にんじん", "zanahoria", new String[]{"ni", "n", "ji", "n"});
        zajizuzezo[i++] = new Match("かぜ", "viento", new String[]{"ka", "ze"});
        zajizuzezo[i++] = new Match("ひじ", "codo", new String[]{"hi", "ji"});
        zajizuzezo[i++] = new Match("ひざ", "rodilla", new String[]{"hi", "za"});
        zajizuzezo[i++] = new Match("かぞく", "familia", new String[]{"ka", "zo", "ku"});
        zajizuzezo[i++] = new Match("れいぞうこ", "nevera", new String[]{"re", "i", "zo", "u", "ko"});
        zajizuzezo[i++] = new Match("ちず", "mapa", new String[]{"chi", "zu"});
        zajizuzezo[i++] = new Match("ざっし", "revista", new String[]{"za", "sshi"});
        hiragana.put("zajizuzezo", zajizuzezo);

        i = 0;
        Match[] dajizudedo = new Match[11];
        dajizudedo[i++] = new Match("だいどころ", "cocina", new String[]{"da", "i", "do", "ko", "ro"});
        dajizudedo[i++] = new Match("くだもの", "fruta", new String[]{"ku", "da", "mo", "no"});
        dajizudedo[i++] = new Match("おんど", "temperatura", new String[]{"o", "n", "do"});
        dajizudedo[i++] = new Match("のど", "garganta", new String[]{"no", "do"});
        dajizudedo[i++] = new Match("うで", "brazo", new String[]{"u", "de"});
        dajizudedo[i++] = new Match("こども", "niño", new String[]{"ko", "do", "mo"});
        dajizudedo[i++] = new Match("ちぢむ", "reducir", new String[]{"chi", "di", "mu"});
        dajizudedo[i++] = new Match("まど", "ventana", new String[]{"ma", "do"});
        dajizudedo[i++] = new Match("ひだり", "izquierda", new String[]{"hi", "da", "ri"});
        dajizudedo[i++] = new Match("みどり", "verde", new String[]{"mi", "do", "ri"});
        dajizudedo[i++] = new Match("つづく", "continuar", new String[]{"tsu", "zu", "ku"});
        hiragana.put("dajizudedo", dajizudedo);

        i = 0;
        Match[] babibubebo = new Match[16];
        babibubebo[i++] = new Match("おばあさん", "abuela", new String[]{"o", "ba", "a", "sa", "n"});
        babibubebo[i++] = new Match("げつようび", "lunes", new String[]{"ge", "tsu", "yo", "u", "bi"});
        babibubebo[i++] = new Match("かようび", "martes", new String[]{"ka", "yo", "u", "bi"});
        babibubebo[i++] = new Match("すいようび", "miércoles", new String[]{"su", "i", "yo", "u", "bi"});
        babibubebo[i++] = new Match("もくようび", "jueves", new String[]{"mo", "ku", "yo", "u", "bi"});
        babibubebo[i++] = new Match("きんようび", "viernes", new String[]{"ki", "n", "yo","u", "bi"});
        babibubebo[i++] = new Match("どようび", "sábado", new String[]{"do", "yo", "u", "bi"});
        babibubebo[i++] = new Match("にちようび", "domingo", new String[]{"ni", "chi", "yo", "u", "bi"});
        babibubebo[i++] = new Match("ばんごはん", "comida (cena)", new String[]{"ba", "n", "go", "ha", "n"});
        babibubebo[i++] = new Match("ぶた", "cerdo", new String[]{"bu", "ta"});
        babibubebo[i++] = new Match("ぶどう", "uva", new String[]{"bu", "do", "u"});
        babibubebo[i++] = new Match("ゆび", "dedo", new String[]{"yu", "bi"});
        babibubebo[i++] = new Match("べんごし", "abogado", new String[]{"be", "n", "go", "shi"});
        babibubebo[i++] = new Match("たべる", "comer", new String[]{"ta", "be", "ru"});
        babibubebo[i++] = new Match("ぼく", "yo", new String[]{"bo", "ku"});
        babibubebo[i++] = new Match("かばん", "bolso", new String[]{"ka", "ba", "n"});
        hiragana.put("babibubebo", babibubebo);

        i = 0;
        Match[] papipupepo = new Match[9];
        papipupepo[i++] = new Match("ぴったり", "cercano", new String[]{"pi", "tta", "ri"});
        papipupepo[i++] = new Match("ぽかん", "distraído", new String[]{"po", "ka", "n"});
        papipupepo[i++] = new Match("しっぱい", "error", new String[]{"shi", "ppa", "i"});
        papipupepo[i++] = new Match("えんぴつ", "lapicero", new String[]{"en", "pi", "tsu"});
        papipupepo[i++] = new Match("てんぷら", "tempura (tipo de comida)", new String[]{"te", "m", "pu", "ra"});
        papipupepo[i++] = new Match("きっぷ", "tiquete", new String[]{"ki", "ppu"});
        papipupepo[i++] = new Match("やっぱり", "como pensé", new String[]{"ya", "ppa", "ri"});
        papipupepo[i++] = new Match("ほっぺた", "mejilla", new String[]{"ho", "ppe", "ta"});
        papipupepo[i++] = new Match("たっぷり", "lleno", new String[]{"ta", "ppu", "ri"});
        hiragana.put("papipupepo", papipupepo);

        i = 0;
        Match[] kyakyukyo = new Match[9];
        kyakyukyo[i++] = new Match("きょうかい", "iglesia", new String[]{"kyo", "u", "ka", "i"});
        kyakyukyo[i++] = new Match("きゅうり", "pepino", new String[]{"kyu", "u", "ri"});
        kyakyukyo[i++] = new Match("きょうしつ", "salón de clase", new String[]{"kyo", "u", "shi", "tsu"});
        kyakyukyo[i++] = new Match("やきゅう", "béisbol", new String[]{"ya", "kyu", "u"});
        kyakyukyo[i++] = new Match("おきゃくさん", "invitado", new String[]{"o", "kya", "ku", "sa", "n"});
        kyakyukyo[i++] = new Match("きょねん", "año pasado", new String[]{"kyo", "ne", "n"});
        kyakyukyo[i++] = new Match("きょうと", "Kyoto (ciudad)", new String[]{"kyo", "u", "yo"});
        kyakyukyo[i++] = new Match("とうきょう", "Tokyo (ciudad)", new String[]{"to", "u", "kyo", "u"});
        kyakyukyo[i++] = new Match("べんきょう", "estudiar", new String[]{"be", "n", "kyo", "u"});
        hiragana.put("kyakyukyo", kyakyukyo);

        i = 0;
        Match[] gyagyugyo = new Match[7];
        gyagyugyo[i++] = new Match("ぎゅうにゅう", "leche", new String[]{"gyu", "u", "nyu", "u"});
        gyagyugyo[i++] = new Match("たんぎょ", "sirena", new String[]{"ta", "n", "gyo"});
        gyagyugyo[i++] = new Match("すいぎゅう", "búfalo", new String[]{"su", "i", "gyu", "u"});
        gyagyugyo[i++] = new Match("こうぎょう", "industria", new String[]{"ko", "u", "gyo", "u"});
        gyagyugyo[i++] = new Match("にんぎょう", "muñeca", new String[]{"ni", "n", "gyo", "u"});
        gyagyugyo[i++] = new Match("ぎゅうにく", "carne de res", new String[]{"gyu", "u", "ni", "ku"});
        gyagyugyo[i++] = new Match("ぎゃ", "", new String[]{"gya"});
        hiragana.put("gyagyugyo", gyagyugyo);

        i = 0;
        Match[] shashusho = new Match[11];
        shashusho[i++] = new Match("しゅくだい", "tarea", new String[]{"shu", "ku", "da", "i"});
        shashusho[i++] = new Match("しょてん", "librería", new String[]{"sho", "te", "n"});
        shashusho[i++] = new Match("こしょう", "pimienta", new String[]{"ko", "sho", "u"});
        shashusho[i++] = new Match("いしゃ", "médico", new String[]{"i", "sha"});
        shashusho[i++] = new Match("ひしょ", "secretario", new String[]{"hi", "sho"});
        shashusho[i++] = new Match("しょうぼうし", "bombero", new String[]{"sho", "u", "bo", "u", "shi"});
        shashusho[i++] = new Match("しゃしんか", "fotógrafo", new String[]{"sha", "shi", "n", "ka"});
        shashusho[i++] = new Match("かがくしゃ", "científico", new String[]{"ka", "ga", "ku", "sha"});
        shashusho[i++] = new Match("じてんしゃ", "bicicleta", new String[]{"ji", "te", "n", "sha"});
        shashusho[i++] = new Match("きゅうきゅうしゃ", "ambulancia", new String[]{"kyu", "u", "kyu", "u", "sha"});
        shashusho[i++] = new Match("じしょ", "diccionario", new String[]{"ji", "sho"});
        hiragana.put("shashusho", shashusho);

        i = 0;
        Match[] jajujo = new Match[12];
        jajujo[i++] = new Match("じゃがい", "papa", new String[]{"ja", "ga", "i", "mo"});
        jajujo[i++] = new Match("くじゃく", "pavo real", new String[]{"ku", "ja", "ku"});
        jajujo[i++] = new Match("そうじゅう", "pilotear", new String[]{"so", "u", "ju", "u"});
        jajujo[i++] = new Match("にんじょう", "humanidad", new String[]{"ni", "n", "jo", "u"});
        jajujo[i++] = new Match("じゃんけん", "piedra, papel o tijera", new String[]{"ja", "n", "ke", "n"});
        jajujo[i++] = new Match("びじゅつ", "arte", new String[]{"bi", "ju", "tsu"});
        jajujo[i++] = new Match("きゅうじゅう", "noventa", new String[]{"kyu", "u", "ju", "u"});
        jajujo[i++] = new Match("じゅうがつ", "octubre", new String[]{"ju", "u", "ga", "tsu"});
        jajujo[i++] = new Match("あいじょう", "afección", new String[]{"a", "i", "jo", "u"});
        jajujo[i++] = new Match("たんじょうび", "cumpleaños", new String[]{"ta", "n", "jo", "u", "bi"});
        jajujo[i++] = new Match("じゅうどう", "judo", new String[]{"ju", "u", "do", "u"});
        jajujo[i++] = new Match("じゅうにがつ", "diciembre", new String[]{"ju", "u", "ni", "ga", "tsu"});
        hiragana.put("jajujo", jajujo);

        i = 0;
        Match[] chachucho = new Match[7];
        chachucho[i++] = new Match("かぼちゃ", "calabaza", new String[]{"ka", "bo", "cha"});
        chachucho[i++] = new Match("ちゃいろ", "café (color)", new String[]{"cha", "i", "ro"});
        chachucho[i++] = new Match("ちゅうしゃ", "inyección", new String[]{"chu", "u", "sha"});
        chachucho[i++] = new Match("ちょっかく", "perpendicular", new String[]{"cho", "ku", "ka", "ku"});
        chachucho[i++] = new Match("おちゃ", "té", new String[]{"o", "cha"});
        chachucho[i++] = new Match("うちゅう", "universo", new String[]{"u", "chu", "u"});
        chachucho[i++] = new Match("こうちょう", "director de escuela", new String[]{"ko", "u", "cho", "u"});
        hiragana.put("chachucho", chachucho);

        i = 0;
        Match[] nyanyunyo = new Match[3];
        nyanyunyo[i++] = new Match("ゆにゅう", "importación", new String[]{"yu", "nyu", "u"});
        nyanyunyo[i++] = new Match("にゃんこ", "gatito", new String[]{"nya", "n", "ko"});
        nyanyunyo[i++] = new Match("にょう", "orina", new String[]{"nyo", "u"});
        hiragana.put("nyanyunyo", nyanyunyo);

        i = 0;
        Match[] hyahyuhyo = new Match[8];
        hyahyuhyo[i++] = new Match("いひょう", "inesperado", new String[]{"i", "hyo", "u"});
        hyahyuhyo[i++] = new Match("にひゃく", "doscientos", new String[]{"ni", "hya", "ku"});
        hyahyuhyo[i++] = new Match("ひょう", "voto", new String[]{"hyu", "u"});
        hyahyuhyo[i++] = new Match("ひゃくおく", "diez millones", new String[]{"hya", "ku", "o", "ku"});
        hyahyuhyo[i++] = new Match("ひゃく", "cien", new String[]{"kya", "ku"});
        hyahyuhyo[i++] = new Match("ひゃっかてん", "tienda", new String[]{"hya", "kka", "te", "n"});
        hyahyuhyo[i++] = new Match("ひょっと", "por casualidad", new String[]{"kyo", "tto"});
        hyahyuhyo[i++] = new Match("ひゅ", "fusible", new String[]{"hyu"});
        hiragana.put("hyahyuhyo", hyahyuhyo);

        i = 0;
        Match[] byabyubyo = new Match[5];
        byabyubyo[i++] = new Match("びょういん", "hospital", new String[]{"byo", "u", "i", "n"});
        byabyubyo[i++] = new Match("さんびゃく", "trescientos", new String[]{"sa", "n", "bya", "ku"});
        byabyubyo[i++] = new Match("いちびょう", "un segundo", new String[]{"i", "chi", "byo", "u"});
        byabyubyo[i++] = new Match("びょうき", "enfermedad", new String[]{"byo", "u", "ki"});
        byabyubyo[i++] = new Match("びゅ", "", new String[]{"byu"});
        hiragana.put("byabyubyo", byabyubyo);

        i = 0;
        Match[] pyapyupyo = new Match[5];
        pyapyupyo[i++] = new Match("はっぴゃく", "ochocientos", new String[]{"ha", "ppya", "ky"});
        pyapyupyo[i++] = new Match("ろっぴゃく", "seiscientos", new String[]{"ro", "ppya", "ku"});
        pyapyupyo[i++] = new Match("はっぴゃくまん", "ocho millones", new String[]{"ha", "ppya", "ku", "ma", "n"});
        pyapyupyo[i++] = new Match("はっぴょう", "anuncio", new String[]{"ha", "ppyo", "u"});
        pyapyupyo[i++] = new Match("ぴゅ", "", new String[]{"pyu"});
        hiragana.put("pyapyupyo", pyapyupyo);


        i = 0;
        Match[] myamyumyo = new Match[4];
        myamyumyo[i++] = new Match("みゃく", "pulso", new String[]{"mya", "ku"});
        myamyumyo[i++] = new Match("みょうじ", "apellido", new String[]{"myo", "u", "ji"});
        myamyumyo[i++] = new Match("きみょう", "extraño", new String[]{"ki", "myo", "u"});
        myamyumyo[i++] = new Match("みゅ", "", new String[]{"myu"});
        hiragana.put("myamyumyo", myamyumyo);

        i = 0;
        Match[] ryaryuryo = new Match[7];
        ryaryuryo[i++] = new Match("りょこう", "viaje", new String[]{"ryo", "ko", "u"});
        ryaryuryo[i++] = new Match("りゅう", "dragón", new String[]{"ryu", "u"});
        ryaryuryo[i++] = new Match("りょかん", "hotel japonés", new String[]{"ryo", "ka", "n"});
        ryaryuryo[i++] = new Match("りょうしゅうしょ", "recibo", new String[]{"ryo", "u", "chu", "u", "cho"});
        ryaryuryo[i++] = new Match("あつりょく", "presión", new String[]{"a", "tsu", "ryo", "ku"});
        ryaryuryo[i++] = new Match("りょう", "cantidad", new String[]{"ryo", "u"});
        ryaryuryo[i++] = new Match("りゃくご", "diminutivo", new String[]{"rya", "ku", "go"});
        hiragana.put("ryaryuryo", ryaryuryo);



        katakana = new HashMap<>();
        i = 0;
        Match[] aiueonK = new Match[4];
        aiueonK[i++] = new Match("アイアン", "hierro", new String[]{"a", "i", "a", "n"});
        aiueonK[i++] = new Match("エア", "aire", new String[]{"e", "a"});
        aiueonK[i++] = new Match("ウ", "", new String[]{"u"});
        aiueonK[i++] = new Match("オ", "", new String[]{"o"});
        katakana.put("aiueon", aiueonK);

        i = 0;
        Match[] kakikukekoK = new Match[6];
        kakikukekoK[i++] = new Match("カカオ", "Cacao", new String[]{"ka", "ka", "o"});
        kakikukekoK[i++] = new Match("クッキー", "Galleta", new String[]{"ku", "kki", "i"});
        kakikukekoK[i++] = new Match("ケーキ", "Torta", new String[]{"ke", "e", "ki"});
        kakikukekoK[i++] = new Match("エコー", "Eco", new String[]{"e", "ko", "o"});
        kakikukekoK[i++] = new Match("コイン", "Moneda", new String[]{"ko", "i", "n"});
        kakikukekoK[i++] = new Match("クイーン", "Reina", new String[]{"ku", "i", "i", "n"});
        katakana.put("kakikukeko", kakikukekoK);

        i = 0;
        Match[] sashisusesoK = new Match[8];
        sashisusesoK[i++] = new Match("サッカー", "Fútbol", new String[]{"sa", "kka", "a"});
        sashisusesoK[i++] = new Match("スキー", "Esquiar", new String[]{"su", "ki", "i"});
        sashisusesoK[i++] = new Match("サモア", "Samoa", new String[]{"sa", "mo", "a"});
        sashisusesoK[i++] = new Match("サーカス", "Circo", new String[]{"sa", "a", "ka", "su"});
        sashisusesoK[i++] = new Match("ソース", "Salsa", new String[]{"so", "o", "su"});
        sashisusesoK[i++] = new Match("アクセス", "Acceso", new String[]{"a", "ku", "se", "su"});
        sashisusesoK[i++] = new Match("シーソー", "Balancín", new String[]{"shi", "i", "so", "o"});
        sashisusesoK[i++] = new Match("ウイスキー", "Wisky", new String[]{"u", "i", "su", "ki", "i"});
        katakana.put("sashisuseso", sashisusesoK);

        i = 0;
        Match[] tachitsutetoK = new Match[8];
        tachitsutetoK[i++] = new Match("タクシー", "Taxi", new String[]{"ta", "ku", "shi", "i"});
        tachitsutetoK[i++] = new Match("テニス", "Tenis", new String[]{"te", "ni", "su"});
        tachitsutetoK[i++] = new Match("スーツ", "Traje", new String[]{"su", "u", "tsu"});
        tachitsutetoK[i++] = new Match("スケート", "Esquiar", new String[]{"su", "ke", "e", "to"});
        tachitsutetoK[i++] = new Match("センチ", "Centímetro", new String[]{"se", "n", "chi"});
        tachitsutetoK[i++] = new Match("インスタント", "Instante", new String[]{"i", "n", "su", "ta", "n", "to"});
        tachitsutetoK[i++] = new Match("カーテン", "Cortina", new String[]{"ka", "a", "te", "n"});
        tachitsutetoK[i++] = new Match("スカート", "Falda", new String[]{"su", "ka", "a", "to"});
        katakana.put("tachitsuteto", tachitsutetoK);

        i = 0;
        Match[] naninunenoK = new Match[8];
        naninunenoK[i++] = new Match("ナイト", "Caballero", new String[]{"na", "i", "to"});
        naninunenoK[i++] = new Match("ネコ", "Gato", new String[]{"ne", "ko"});
        naninunenoK[i++] = new Match("オセアニア", "Oceanía", new String[]{"o", "se", "a", "ni", "a"});
        naninunenoK[i++] = new Match("スナック", "Snack", new String[]{"su", "na", "kku"});
        naninunenoK[i++] = new Match("オーナー", "Dueño", new String[]{"o", "o", "na", "a"});
        naninunenoK[i++] = new Match("ノート", "Cuaderno", new String[]{"no", "o", "to"});
        naninunenoK[i++] = new Match("カヌー", "Canoa", new String[]{"ka", "nu", "u"});
        naninunenoK[i++] = new Match("イノセンス", "Inocencia", new String[]{"i", "no", "se", "n", "su"});
        katakana.put("naninuneno", naninunenoK);

        i = 0;
        Match[] hahifuhehoK = new Match[8];
        hahifuhehoK[i++] = new Match("コーヒー", "Café", new String[]{"ko", "o", "hi", "i"});
        hahifuhehoK[i++] = new Match("ハイチ", "Haiti", new String[]{"ha", "i", "chi"});
        hahifuhehoK[i++] = new Match("ヒント", "Pista", new String[]{"hi", "n", "to"});
        hahifuhehoK[i++] = new Match("ソフト", "Suave", new String[]{"so", "fu", "to"});
        hahifuhehoK[i++] = new Match("ホース", "Manguera", new String[]{"ho", "o", "su"});
        hahifuhehoK[i++] = new Match("ヘナ", "(Tipo de planta)", new String[]{"he", "na"});
        hahifuhehoK[i++] = new Match("ファミリー", "Familia", new String[]{"fa", "mi", "ri", "i"});
        hahifuhehoK[i++] = new Match("インフォ", "Información", new String[]{"i", "n", "fo"});
        katakana.put("hahifuheho", hahifuhehoK);

        i = 0;
        Match[] mamimumemoK = new Match[8];
        mamimumemoK[i++] = new Match("マスク", "Máscara", new String[]{"ma", "su", "ku"});
        mamimumemoK[i++] = new Match("メキシコ", "México", new String[]{"me", "ki", "shi", "ko"});
        mamimumemoK[i++] = new Match("モナコ", "Mónaco", new String[]{"mo", "na", "ko"});
        mamimumemoK[i++] = new Match("ミニマム", "Mínimo", new String[]{"mi", "ni", "ma", "mu"});
        mamimumemoK[i++] = new Match("イエメン", "Yemen", new String[]{"i", "e", "me", "n"});
        mamimumemoK[i++] = new Match("フォーム", "Espuma", new String[]{"fo", "o", "mu"});
        mamimumemoK[i++] = new Match("トーナメント", "Torneo", new String[]{"to", "o", "na", "me", "n", "to"});
        mamimumemoK[i++] = new Match("マチネ", "Máquina", new String[]{"ma", "chi", "ne"});
        katakana.put("mamimumemo", mamimumemoK);

        i = 0;
        Match[] yayuyoK = new Match[4];
        yayuyoK[i++] = new Match("ユニコーン", "Unicornio", new String[]{"yu", "ni", "ko", "o", "n"});
        yayuyoK[i++] = new Match("ヨーヨー", "Yo-Yo", new String[]{"yo", "o", "yo", "o"});
        yayuyoK[i++] = new Match("ヨット", "Yate", new String[]{"yo", "tto"});
        yayuyoK[i++] = new Match("イヤホン", "Audífono", new String[]{"i", "ya", "ho", "n"});
        katakana.put("yayuyo", yayuyoK);

        i = 0;
        Match[] rarirureroK = new Match[8];
        rarirureroK[i++] = new Match("トイレ", "Baño", new String[]{"to", "i", "re"});
        rarirureroK[i++] = new Match("アフリカ", "África", new String[]{"a", "fu", "ri", "ka"});
        rarirureroK[i++] = new Match("アイスクリーム", "Helado", new String[]{"a", "i", "su", "ku", "ri", "i", "mu"});
        rarirureroK[i++] = new Match("メロン", "Melón", new String[]{"me", "ro", "n"});
        rarirureroK[i++] = new Match("レモン", "Limón", new String[]{"re", "mo", "n"});
        rarirureroK[i++] = new Match("セロリ", "Apio", new String[]{"se", "ro", "ri"});
        rarirureroK[i++] = new Match("フルート", "Flauta", new String[]{"fu", "ru", "u", "to"});
        rarirureroK[i++] = new Match("レストラン", "Restaurante", new String[]{"re", "su", "to", "ra", "n"});
        katakana.put("rarirurero", rarirureroK);

        i = 0;
        Match[] wawoK = new Match[6];
        wawoK[i++] = new Match("スワン", "Cisne", new String[]{"su", "wa", "n"});
        wawoK[i++] = new Match("ワイン", "Vino", new String[]{"wa", "i", "n"});
        wawoK[i++] = new Match("ルワンダ", "Ruanda", new String[]{"ru", "wa", "n", "da"});
        wawoK[i++] = new Match("ワシントン", "Washington", new String[]{"wa", "shi", "n", "to", "n"});
        wawoK[i++] = new Match("アワー", "Hora", new String[]{"a", "wa", "a"});
        wawoK[i++] = new Match("ヲ", "", new String[]{"wo"});
        katakana.put("wawo", wawoK);

        i = 0;
        Match[] gagigugegoK = new Match[8];
        gagigugegoK[i++] = new Match("モーニング", "Mañana", new String[]{"mo", "o", "ni", "n", "gu"});
        gagigugegoK[i++] = new Match("ゴルフ", "Golf", new String[]{"go", "ru", "fu"});
        gagigugegoK[i++] = new Match("ギター", "Guitarra", new String[]{"gi", "ta", "a"});
        gagigugegoK[i++] = new Match("トレーニング", "Entrenamiento", new String[]{"to", "re", "e", "ni", "n", "gu"});
        gagigugegoK[i++] = new Match("ハンガリー", "Hungaria", new String[]{"ha", "n", "ga", "ri", "i"});
        gagigugegoK[i++] = new Match("ニカラグア", "Nicaragua", new String[]{"ni", "ka", "ra", "gu", "a"});
        gagigugegoK[i++] = new Match("ゲットー", "Gueto", new String[]{"ge", "tto", "o"});
        gagigugegoK[i++] = new Match("ヨーグルト", "Yogurt", new String[]{"yo", "o", "gu", "ru", "to"});
        katakana.put("gagigugego", gagigugegoK);

        i = 0;
        Match[] zajizuzezoK = new Match[8];
        zajizuzezoK[i++] = new Match("アジア", "Asia", new String[]{"a", "ji", "a"});
        zajizuzezoK[i++] = new Match("チーズ", "Queso", new String[]{"chi", "i", "zu"});
        zajizuzezoK[i++] = new Match("エンジニア", "Ingeniero", new String[]{"e", "n", "ji", "ni", "a"});
        zajizuzezoK[i++] = new Match("リズム", "Ritmo", new String[]{"ri", "zu", "mu"});
        zajizuzezoK[i++] = new Match("アルゼンチン", "Argentina", new String[]{"a", "ru", "ze", "n", "chi", "n"});
        zajizuzezoK[i++] = new Match("タンザニア", "Tanzania", new String[]{"ta", "n", "za", "ni", "a"});
        zajizuzezoK[i++] = new Match("エキゾチック", "Exótico", new String[]{"e", "ki", "zo", "chi", "kku"});
        zajizuzezoK[i++] = new Match("ソーセージ", "Salchicha", new String[]{"so", "o", "se", "e", "ji"});
        katakana.put("zajizuzezo", zajizuzezoK);

        i = 0;
        Match[] dajizudedoK = new Match[8];
        dajizudedoK[i++] = new Match("サラダ", "Ensalada", new String[]{"sa", "ra", "da"});
        dajizudedoK[i++] = new Match("アカデミー", "Academia", new String[]{"a", "ka", "de", "mi", "i"});
        dajizudedoK[i++] = new Match("イングランド", "Inglaterra", new String[]{"i", "n", "gu", "ra", "n", "do"});
        dajizudedoK[i++] = new Match("デンマーク", "Dinamarca", new String[]{"de", "n", "ma", "a", "ku"});
        dajizudedoK[i++] = new Match("マクドナルド", "McDonald's", new String[]{"ma", "ku", "do", "na", "ru", "do"});
        dajizudedoK[i++] = new Match("ガーデン", "Jardín", new String[]{"ga", "a", "de", "n"});
        dajizudedoK[i++] = new Match("コメディー", "Comedia", new String[]{"ko", "me", "di", "i"});
        dajizudedoK[i++] = new Match("エメラルド", "Esmeralda", new String[]{"e", "me", "ra", "ru", "do"});
        katakana.put("dajizudedo", dajizudedoK);

        i = 0;
        Match[] babibubeboK = new Match[8];
        babibubeboK[i++] = new Match("ブルー", "Azul", new String[]{"bu", "ru", "u"});
        babibubeboK[i++] = new Match("ベッド", "Cama", new String[]{"be", "ddo"});
        babibubeboK[i++] = new Match("コロンビア", "Colombia", new String[]{"ko", "ro", "n", "bi", "a"});
        babibubeboK[i++] = new Match("バナナ", "Banano", new String[]{"ba", "na", "na"});
        babibubeboK[i++] = new Match("オーブン", "Horno", new String[]{"o", "o", "bu", "n"});
        babibubeboK[i++] = new Match("ボクシング", "Boxeo", new String[]{"bo", "ku", "shi", "n", "gu"});
        babibubeboK[i++] = new Match("リバーシブル", "Reversible", new String[]{"ba", "a", "shi", "bu", "ru"});
        babibubeboK[i++] = new Match("テレビ", "Televisor", new String[]{"te", "re", "bi"});
        katakana.put("babibubebo", babibubeboK);

        i = 0;
        Match[] papipupepoK = new Match[8];
        papipupepoK[i++] = new Match("スーパー", "Supermercado", new String[]{"su", "u", "pa", "a"});
        papipupepoK[i++] = new Match("ヨーロッパ", "Europa", new String[]{"yo", "o", "ro", "ppa"});
        papipupepoK[i++] = new Match("ペンギン", "Pingüino", new String[]{"pe", "n", "gi", "n"});
        papipupepoK[i++] = new Match("ヘリコプター", "Helicóptero", new String[]{"he", "ri", "ko", "pu", "ta", "a"});
        papipupepoK[i++] = new Match("スポーツ", "Deporte", new String[]{"su", "po", "o", "tsu"});
        papipupepoK[i++] = new Match("ピアノ", "Piano", new String[]{"pi", "a", "no"});
        papipupepoK[i++] = new Match("パーセント", "Porcentaje", new String[]{"pa", "a", "se", "n", "to"});
        papipupepoK[i++] = new Match("スピード", "Velocidad", new String[]{"su", "pi", "i", "do"});
        katakana.put("papipupepo", papipupepoK);

        i = 0;
        Match[] kyakyukyoK = new Match[6];
        kyakyukyoK[i++] = new Match("キャベツ", "Repollo", new String[]{"kya", "be", "tsu"});
        kyakyukyoK[i++] = new Match("キャスター", "Castor", new String[]{"kya", "su", "ta", "a"});
        kyakyukyoK[i++] = new Match("キューバ", "Cuba", new String[]{"kyu", "u", "ba"});
        kyakyukyoK[i++] = new Match("キャンドル", "Vela", new String[]{"kya", "n", "do", "ru"});
        kyakyukyoK[i++] = new Match("キャミソール ", "Camisol", new String[]{"kya", "mi", "so", "o", "ru"});
        kyakyukyoK[i++] = new Match("キョンシー", "(Tipo de zombie)", new String[]{"kyo", "n", "shi", "i"});
        katakana.put("kyakyukyo", kyakyukyoK);

        i = 0;
        Match[] gyagyugyoK = new Match[6];
        gyagyugyoK[i++] = new Match("ギャラ", "Garantía", new String[]{"gya", "ra"});
        gyagyugyoK[i++] = new Match("ギャップ", "Brecha", new String[]{"gya", "ppu"});
        gyagyugyoK[i++] = new Match("ギャラリー", "Galería", new String[]{"gya", "ra", "ri", "i"});
        gyagyugyoK[i++] = new Match("フィギュア", "Figurilla", new String[]{"fi", "gyu", "a"});
        gyagyugyoK[i++] = new Match("レギュラー", "Regular", new String[]{"re", "gyu", "ra", "a"});
        gyagyugyoK[i++] = new Match("ギョーザ", "(Tipo de comida)", new String[]{"gyo", "o", "za"});
        katakana.put("gyagyugyo", gyagyugyoK);

        i = 0;
        Match[] shashushoK = new Match[8];
        shashushoK[i++] = new Match("ギリシャ", "Grecia", new String[]{"gi", "ri", "sha"});
        shashushoK[i++] = new Match("オークション", "Subasta", new String[]{"o", "o", "ku", "sho", "n"});
        shashushoK[i++] = new Match("ティーシャツ", "Camiseta", new String[]{"ti", "i", "sha", "tsu"});
        shashushoK[i++] = new Match("エンゼルフィシュ", "Pez ángel", new String[]{"e", "n", "ze", "ru", "fi", "shu"});
        shashushoK[i++] = new Match("オーディション", "Audición", new String[]{"o", "o", "di", "sho", "n"});
        shashushoK[i++] = new Match("アクション", "Acción", new String[]{"a", "ku", "sho", "n"});
        shashushoK[i++] = new Match("インスピレーション", "Inspiración", new String[]{"i", "n", "su", "pi", "re", "e", "sho", "n"});
        shashushoK[i++] = new Match("ミッション", "Misión", new String[]{"mi", "ssho", "n"});
        katakana.put("shashusho", shashushoK);

        i = 0;
        Match[] jajujoK = new Match[6];
        jajujoK[i++] = new Match("ジュース", "Jugo", new String[]{"ju", "u", "so"});
        jajujoK[i++] = new Match("ジャマイカ", "Jamaica", new String[]{"ja", "ma", "i", "ka"});
        jajujoK[i++] = new Match("ジョーカー", "Joker", new String[]{"jo", "o", "ka", "a"});
        jajujoK[i++] = new Match("ジョーク", "Broma", new String[]{"jo", "o", "ku"});
        jajujoK[i++] = new Match("ジャズ", "Jazz", new String[]{"ja", "zu"});
        jajujoK[i++] = new Match("カジュアル", "Casual", new String[]{"ka", "ju", "a", "ru"});
        katakana.put("jajujo", jajujoK);

        i = 0;
        Match[] chachuchoK = new Match[8];
        chachuchoK[i++] = new Match("ケチャップ", "Salsa de tomate", new String[]{"ke", "cha", "ppu"});
        chachuchoK[i++] = new Match("チャンピオン", "Campeón", new String[]{"cha", "n", "pi", "o", "n"});
        chachuchoK[i++] = new Match("チョーク", "Tiza", new String[]{"cho", "o", "ku"});
        chachuchoK[i++] = new Match("チョコレート", "Chocolate", new String[]{"cho", "ko", "re", "e", "to"});
        chachuchoK[i++] = new Match("チュニジア", "Tunisia", new String[]{"chu", "ni", "ji", "a"});
        chachuchoK[i++] = new Match("アマチュア", "Amateus", new String[]{"a", "ma", "chu", "a"});
        chachuchoK[i++] = new Match("アンチョビー", "Anchoa", new String[]{"a", "n", "cho", "bi", "i"});
        chachuchoK[i++] = new Match("アドベンチャー", "Aventura", new String[]{"a", "do", "be", "n", "cha", "a"});
        katakana.put("chachucho", chachuchoK);

        i = 0;
        Match[] nyanyunyoK = new Match[7];
        nyanyunyoK[i++] = new Match("コニャック", "Coñac", new String[]{"ko", "nya", "ku"});
        nyanyunyoK[i++] = new Match("ケニア", "Kenia", new String[]{"ke", "nya"});
        nyanyunyoK[i++] = new Match("ニューヨーク", "Nueva York", new String[]{"nyu", "u", "yo", "o", "ku"});
        nyanyunyoK[i++] = new Match("ニュートン", "Newton", new String[]{"nyu", "u", "to", "n"});
        nyanyunyoK[i++] = new Match("ニュース", "Noticias", new String[]{"nyu", "u", "su"});
        nyanyunyoK[i++] = new Match("メニュー", "Menú", new String[]{"me", "nyu", "u"});
        nyanyunyoK[i++] = new Match("ニョッキ", "(Tipo de macarrón", new String[]{"nyo", "kki"});
                katakana.put("nyanyunyo", nyanyunyoK);

        i = 0;
        Match[] hyahyuhyoK = new Match[3];
        hyahyuhyoK[i++] = new Match("ヒューストン", "Houston", new String[]{"hyu", "u", "su", "to", "n"});
        hyahyuhyoK[i++] = new Match("ヒョウ", "Leopardo", new String[]{"hyo", "u"});
        hyahyuhyoK[i++] = new Match("リヒャルトワーグナー", "Richard Wagner", new String[]{"ri", "hya", "ru", "to", "wa", "a", "gu", "na", "a"});
        katakana.put("hyahyuhyo", hyahyuhyoK);

        i = 0;
        Match[] byabyubyoK = new Match[4];
        byabyubyoK[i++] = new Match("ビャクダン", "(Tipo de árbol)", new String[]{"bya", "ku", "da", "n"});
        byabyubyoK[i++] = new Match("プレビュー", "Adelanto", new String[]{"pu", "re", "byu", "u"});
        byabyubyoK[i++] = new Match("インタビュー", "Entrevista", new String[]{"i", "n", "ta", "byu", "u"});
        byabyubyoK[i++] = new Match("ビョ", "", new String[]{"byo"});
        katakana.put("byabyubyo", byabyubyoK);

        i = 0;
        Match[] pyapyupyoK = new Match[3];
        pyapyupyoK[i++] = new Match("コンピューター", "Computador", new String[]{"ko", "n", "pyu", "u", "ta", "a"});
        pyapyupyoK[i++] = new Match("ピョンヤン", "Pyonyan (Capital Corea del Norte)", new String[]{"pyo", "n", "ya", "n"});
        pyapyupyoK[i++] = new Match("ピャ", "", new String[]{"pya"});
        katakana.put("pyapyupyo", pyapyupyoK);

        i = 0;
        Match[] myamyumyoK = new Match[6];
        myamyumyoK[i++] = new Match("ミュージック", "Música", new String[]{"myu", "u", "ji", "kku"});
        myamyumyoK[i++] = new Match("ミュンヘン", "Munich", new String[]{"myu", "n", "he", "n"});
        myamyumyoK[i++] = new Match("ミュージアム", "Museo", new String[]{"myu", "u", "ji", "a", "mu"});
        myamyumyoK[i++] = new Match("コミュニケーション", "Comunicación", new String[]{"ko", "myu", "ni", "ke", "e", "sho", "n"});
        myamyumyoK[i++] = new Match("ミャンマー", "Birmania", new String[]{"mya", "n", "ma", "a"});
        myamyumyoK[i++] = new Match("ミョガ", "(Tipo de jengibre)", new String[]{"myo", "ga"});
        katakana.put("myamyumyo", myamyumyoK);

        i = 0;
        Match[] ryaryuryoK = new Match[4];
        ryaryuryoK[i++] = new Match("マトリョーシカ", "Matrioska (Muñeca rusa)", new String[]{"ma", "to", "tyo", "o", "shi", "ka"});
        ryaryuryoK[i++] = new Match("パエーリャ", "Paella", new String[]{"pa", "e", "e", "rya"});
        ryaryuryoK[i++] = new Match("スクリュー", "Tornillo", new String[]{"su", "ku", "ryu", "u"});
        ryaryuryoK[i++] = new Match("イリュージョン", "Ilusión", new String[]{"i", "ryu", "u", "jo", "n"});
        katakana.put("ryaryuryo", ryaryuryoK);

    }

}
