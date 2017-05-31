package com.aprendamosjapones.aprendedamosjapones.Games.MemoryGame.matching;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mateo on 5/4/17.
 */

public class Words {
    public static Map<String, Match[]> map;

    private Words() {}

    public static void init() {
        map = new HashMap<>();
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
        aiueon[i++] = new Match("ん", "n", new String[]{"n"});
        map.put("aiueon", aiueon);

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
        map.put("kakikukeko", kakikukeko);

        i = 0;
        Match[] sashisuseso = new Match[15];
        sashisuseso[i++] = new Match("おかあさん", "mamá", new String[]{"o", "ka", "sa", "n"});
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
        map.put("sashisuseso", sashisuseso);

        i = 0;
        Match[] tachitsuteto = new Match[18];
        tachitsuteto[i++] = new Match("おとうさん", "papá", new String[]{"o", "to", "u", "sa", "n"});
        tachitsuteto[i++] = new Match("おとうと", "hermano menor", new String[]{"o", "tu", "u", "tu"});
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
        map.put("tachitsuteto", tachitsuteto);

        i = 0;
        Match[] naninuneno = new Match[14];
        naninuneno[i++] = new Match("おねえさん", "hermana mayor", new String[]{"o", "ne", "e", "sa", "n"});
        naninuneno[i++] = new Match("にいさん", "hermano mayor", new String[]{"ni", "i", "sa", "n"});
        naninuneno[i++] = new Match("きのう", "ayer", new String[]{"ki", "no", "u"});
        naninuneno[i++] = new Match("いぬ", "perro", new String[]{"i", "un"});
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
        map.put("naninuneno", naninuneno);

        i = 0;
        Match[] hahifuheho = new Match[14];
        hahifuheho[i++] = new Match("ひこうき", "avión", new String[]{"hi", "ko", "u", "ki"});
        hahifuheho[i++] = new Match("はな", "flor/nariz", new String[]{"ha", "na"});
        hahifuheho[i++] = new Match("にほん", "Japón", new String[]{"ni", "ho", "n"});
        hahifuheho[i++] = new Match("ふね", "barco", new String[]{"fu", "ne"});
        hahifuheho[i++] = new Match("はと", "paloma", new String[]{"ha", "to"});
        hahifuheho[i++] = new Match("ほん", "libro", new String[]{"ho", "n"});
        hahifuheho[i++] = new Match("はしる", "correr", new String[]{"ha", "shi", "ru"});
        hahifuheho[i++] = new Match("ふとい", "gordo", new String[]{"fu", "to", "i"});
        hahifuheho[i++] = new Match("ひくい", "bajo", new String[]{"hi", "ku", "i"});
        hahifuheho[i++] = new Match("へい", "muro", new String[]{"he", "i"});
        hahifuheho[i++] = new Match("はし", "puente", new String[]{"ha", "shi"});
        hahifuheho[i++] = new Match("ひと", "persona", new String[]{"hi", "to"});
        hahifuheho[i++] = new Match("ひ", "fuego", new String[]{"hi"});
        hahifuheho[i++] = new Match("ほし", "estrella", new String[]{"ho", "shi"});
        map.put("hahifuheho", hahifuheho);

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
        map.put("mamimumemo", mamimumemo);

        i = 0;
        Match[] yayuyo = new Match[11];
        yayuyo[i++] = new Match("よっつ", "cuatro", new String[]{"to", "ttsu"});
        yayuyo[i++] = new Match("やま", "montaña", new String[]{"ya", "ma"});
        yayuyo[i++] = new Match("やさい", "vegetal", new String[]{"ya", "sa", "i"});
        yayuyo[i++] = new Match("ゆき", "nieve", new String[]{"yu", "ki"});
        yayuyo[i++] = new Match("へや", "habitación", new String[]{"he", "ya"});
        yayuyo[i++] = new Match("ゆか", "piso", new String[]{"yu", "ka"});
        yayuyo[i++] = new Match("よむ", "leer", new String[]{"yo", "mu"});
        yayuyo[i++] = new Match("つよい", "suerte", new String[]{"tsu", "yo", "i"});
        yayuyo[i++] = new Match("やく", "aproximadamente", new String[]{"ya", "ku"});
        yayuyo[i++] = new Match("やっと", "finalmente", new String[]{"ya", "tto"});
        yayuyo[i++] = new Match("よこ", "horizontal", new String[]{"ya", "ko"});
        map.put("yayuyo", yayuyo);

        i = 0;
        Match[] rarirurero = new Match[15];
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
        map.put("rarirurero", rarirurero);

        i = 0;
        Match[] wawo = new Match[9];
        wawo[i++] = new Match("かわ", "rio", new String[]{"ka", "ka"});
        wawo[i++] = new Match("にわとり", "pollo", new String[]{"ni", "wa", "to", "ri"});
        wawo[i++] = new Match("にわ", "jardín", new String[]{"ni", "wa"});
        wawo[i++] = new Match("わし", "águila", new String[]{"wa", "shi"});
        wawo[i++] = new Match("わらう", "reir", new String[]{"wa", "ra", "u"});
        wawo[i++] = new Match("かわいい", "tierno", new String[]{"ka", "wa", "i", "i"});
        wawo[i++] = new Match("よわい", "débil", new String[]{"yo", "wa", "i"});
        wawo[i++] = new Match("を", "(partícula)", new String[]{"wo"});
        wawo[i++] = new Match("へいわ", "paz", new String[]{"he", "i", "wa"});
        map.put("wawo", wawo);

        i = 0;
        Match[] gagigugego = new Match[18];
        gagigugego[i++] = new Match("ごご", "tarde (parte del día)", new String[]{"go", "go"});
        gagigugego[i++] = new Match("あさごはん", "desayuno", new String[]{"a", "sa", "go", "ha", "n"});
        gagigugego[i++] = new Match("ごはん", "comida (en general)", new String[]{"ho", "ha", "n"});
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
        map.put("gagigugego", gagigugego);

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
        map.put("zajizuzezo", zajizuzezo);

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
        map.put("dajizudedo", dajizudedo);

        i = 0;
        Match[] babibubebo = new Match[16];
        babibubebo[i++] = new Match("おばあさん", "abuela", new String[]{"o", "ba", "sa", "n"});
        babibubebo[i++] = new Match("げつようび", "lunes", new String[]{"ge", "tsu", "yo", "u", "bi"});
        babibubebo[i++] = new Match("かようび", "martes", new String[]{"ka", "yo", "u", "bi"});
        babibubebo[i++] = new Match("すいようび", "miércoles", new String[]{"su", "i", "yo", "u", "bi"});
        babibubebo[i++] = new Match("もくようび", "jueves", new String[]{"mo", "ku", "yo", "u", "bi"});
        babibubebo[i++] = new Match("きんようび", "viernes", new String[]{"ki", "n", "u", "bi"});
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
        map.put("babibubebo", babibubebo);

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
        map.put("papipupepo", papipupepo);

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
        map.put("kyakyukyo", kyakyukyo);

        i = 0;
        Match[] gyagyugyo = new Match[7];
        gyagyugyo[i++] = new Match("ぎゅうにゅう", "leche", new String[]{"gyu", "u", "nyu", "u"});
        gyagyugyo[i++] = new Match("たんぎょ", "sirena", new String[]{"ta", "n", "gyo"});
        gyagyugyo[i++] = new Match("すいぎゅう", "búfalo", new String[]{"su", "i", "gyu", "u"});
        gyagyugyo[i++] = new Match("こうぎょう", "industria", new String[]{"ko", "u", "gyo", "u"});
        gyagyugyo[i++] = new Match("にんぎょう", "muñeca", new String[]{"ni", "n", "gyo", "u"});
        gyagyugyo[i++] = new Match("ぎゅうにく", "carne de res", new String[]{"gyu", "u", "ni", "ku"});
        gyagyugyo[i++] = new Match("ぎゃ", null, new String[]{"gya"});
        map.put("gyagyugyo", gyagyugyo);

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
        map.put("shashusho", shashusho);

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
        map.put("jajujo", jajujo);

        i = 0;
        Match[] chachucho = new Match[7];
        chachucho[i++] = new Match("かぼちゃ", "calabaza", new String[]{"ka", "bo", "cha"});
        chachucho[i++] = new Match("ちゃいろ", "café (color)", new String[]{"cha", "i", "ro"});
        chachucho[i++] = new Match("ちゅうしゃ", "inyección", new String[]{"chu", "u", "sha"});
        chachucho[i++] = new Match("ちょっかく", "perpendicular", new String[]{"cho", "ku", "ka", "ku"});
        chachucho[i++] = new Match("おちゃ", "té", new String[]{"o", "cha"});
        chachucho[i++] = new Match("うちゅう", "universo", new String[]{"u", "chu", "u"});
        chachucho[i++] = new Match("こうちょう", "director de escuela", new String[]{"ko", "u", "cho", "u"});
        map.put("chachucho", chachucho);

        i = 0;
        Match[] nyanyunyo = new Match[3];
        nyanyunyo[i++] = new Match("ゆにゅう", "importación", new String[]{"yu", "nyu", "u"});
        nyanyunyo[i++] = new Match("にゃんこ", "gatito", new String[]{"nya", "n", "ko"});
        nyanyunyo[i++] = new Match("にょう", "orina", new String[]{"nyo", "u"});
        map.put("nyanyunyo", nyanyunyo);

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
        map.put("hyahyuhyo", hyahyuhyo);

        i = 0;
        Match[] byabyubyo = new Match[5];
        byabyubyo[i++] = new Match("びょういん", "hospital", new String[]{"byo", "u", "i", "n"});
        byabyubyo[i++] = new Match("さんびゃく", "trescientos", new String[]{"sa", "n", "bya", "ku"});
        byabyubyo[i++] = new Match("いちびょう", "un segundo", new String[]{"i", "chi", "byo", "u"});
        byabyubyo[i++] = new Match("びょうき", "enfermedad", new String[]{"byo", "u", "ki"});
        byabyubyo[i++] = new Match("びゅ", null, new String[]{"byu"});
        map.put("byabyubyo", byabyubyo);

        i = 0;
        Match[] pyapyupyo = new Match[5];
        pyapyupyo[i++] = new Match("はっぴゃく", "ochocientos", new String[]{"ha", "ppya", "ky"});
        pyapyupyo[i++] = new Match("ろっぴゃく", "seiscientos", new String[]{"ro", "ppya", "ku"});
        pyapyupyo[i++] = new Match("はっぴゃくまん", "ocho millones", new String[]{"ha", "ppya", "ku", "ma", "n"});
        pyapyupyo[i++] = new Match("はっぴょう", "anuncio", new String[]{"ha", "ppyo", "u"});
        pyapyupyo[i++] = new Match("ぴゅ", null, new String[]{"pyu"});
        map.put("pyapyupyo", pyapyupyo);


        i = 0;
        Match[] myamyumyo = new Match[4];
        myamyumyo[i++] = new Match("みゃく", "pulso", new String[]{"mya", "ku"});
        myamyumyo[i++] = new Match("みょうじ", "apellido", new String[]{"myo", "u", "ji"});
        myamyumyo[i++] = new Match("きみょう", "extraño", new String[]{"ki", "myo", "u"});
        myamyumyo[i++] = new Match("みゅ", null, new String[]{"myu"});
        map.put("myamyumyo", myamyumyo);

        i = 0;
        Match[] ryaryuryo = new Match[7];
        ryaryuryo[i++] = new Match("りょこう", "viaje", new String[]{"ryo", "ko", "u"});
        ryaryuryo[i++] = new Match("りゅう", "dragón", new String[]{"ryu", "u"});
        ryaryuryo[i++] = new Match("りょかん", "hotel japonés", new String[]{"ryo", "ka", "n"});
        ryaryuryo[i++] = new Match("りょうしゅうしょ", "recibo", new String[]{"ryo", "u", "chu", "u", "cho"});
        ryaryuryo[i++] = new Match("あつりょく", "presión", new String[]{"a", "tsu", "ryo", "ku"});
        ryaryuryo[i++] = new Match("りょう", "cantidad", new String[]{"ryo", "u"});
        ryaryuryo[i++] = new Match("りゃくご", "diminutivo", new String[]{"rya", "ku", "go"});
        map.put("ryaryuryo", ryaryuryo);
    }

}
