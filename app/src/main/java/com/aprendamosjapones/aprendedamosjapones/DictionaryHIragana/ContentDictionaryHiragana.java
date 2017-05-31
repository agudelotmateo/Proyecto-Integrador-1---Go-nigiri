package com.aprendamosjapones.aprendedamosjapones.DictionaryHIragana;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.Arrays;
import java.util.List;

/**
 * Creado por Hermosa Programación.
 * Orden para crear nuevo item: sílaba, audio, ejemplo en hiragana, romaji de ejemplo, significado de ejempñlo, gif, imagen
 */
public class ContentDictionaryHiragana {
    private static ItemsDictionaryHiragana[] courses = {
            new ItemsDictionaryHiragana("a",
                    R.raw.aud1a, "あし", "ashi", "Pie", R.drawable.gifhira1a,
                    R.drawable.hiragana1a),

             new ItemsDictionaryHiragana("i",
                     R.raw.aud2i, "いす", "isu", "Silla", R.drawable.gifhira2i,
                    R.drawable.hiragana2i),

            new ItemsDictionaryHiragana("u",
                    R.raw.aud3u, "うし", "ushi", "Vaca", R.drawable.gifhira3u,
                    R.drawable.hiragana3u),

            new ItemsDictionaryHiragana("e",
                    R.raw.aud4e, "えき", "eki", "Estación", R.drawable.gifhira4e,
                    R.drawable.hiragana4e),

            new ItemsDictionaryHiragana("o",
                    R.raw.aud5o,"おとうさん", "otousan", "Papá", R.drawable.gifhira5o,
                    R.drawable.hiragana5o),

            new ItemsDictionaryHiragana("ka",
                    R.raw.aud6ka,"かわ", "kawa", "Río", R.drawable.gifhira6ka,
                    R.drawable.hiragana6ka),

            new ItemsDictionaryHiragana("ki",
                    R.raw.aud7ki,"きいろ", "kiiro", "Amarillo", R.drawable.gifhira7ki,
                    R.drawable.hiragana7ki),

            new ItemsDictionaryHiragana("ku",
                    R.raw.aud8ku,"くま", "kuma", "Oso", R.drawable.gifhira8ku,
                    R.drawable.hiragana8ku),

            new ItemsDictionaryHiragana("ke",
                    R.raw.aud9ke,"けいかん", "keikan", "Policía", R.drawable.gifhira9ke,
                    R.drawable.hiragana9ke),

            new ItemsDictionaryHiragana("ko",
                    R.raw.aud10ko,"ここ", "koko", "Aquí", R.drawable.gifhira10ko,
                    R.drawable.hiragana10ko),

            new ItemsDictionaryHiragana("sa",
                    R.raw.aud11sa,"さかな", "sakana", "Pez", R.drawable.gifhira11sa,
                    R.drawable.hiragana11sa),

            new ItemsDictionaryHiragana("shi",
                    R.raw.aud11sa,"し", "shi", "Sal", R.drawable.gifhira12shi,
                    R.drawable.hiragana12shi),

            new ItemsDictionaryHiragana("su",
                    R.raw.aud13su,"すいか", "suika", "Sandía", R.drawable.gifhira13su,
                    R.drawable.hiragana13su),

            new ItemsDictionaryHiragana("se",
                    R.raw.aud14se,"せんせい", "sensei", "Profesor", R.drawable.gifhira14se,
                    R.drawable.hiragana14se),

            new ItemsDictionaryHiragana("so",
                    R.raw.aud15so,"そこ", "soko", "Allá", R.drawable.gifhira15so,
                    R.drawable.hiragana15so),

            new ItemsDictionaryHiragana("ta",
                    R.raw.aud16ta,"たべる", "taberu", "Comer", R.drawable.gifhira16ta,
                    R.drawable.hiragana16ta),

            new ItemsDictionaryHiragana("chi",
                    R.raw.aud17chi,"ちず", "chizu", "Mapa", R.drawable.gifhira17chi,
                    R.drawable.hiragana17chi),

            new ItemsDictionaryHiragana("tsu",
                    R.raw.aud18tsu,"つくえ", "tsukue", "Escritorio", R.drawable.gifhira18tsu,
                    R.drawable.hiragana18tsu),

            new ItemsDictionaryHiragana("te",
                    R.raw.aud19te,"て", "te", "Mano", R.drawable.gifhira19te,
                    R.drawable.hiragana19te),

            new ItemsDictionaryHiragana("to",
                    R.raw.aud20to,"とお", "too", "Diez", R.drawable.gifhira20to,
                    R.drawable.hiragana20to),

            new ItemsDictionaryHiragana("na",
                    R.raw.aud21na,"なな", "nana", "Siete", R.drawable.gifhira21na,
                    R.drawable.hiragana21na),

            new ItemsDictionaryHiragana("ni",
                    R.raw.aud22ni,"にいさん", "niisan", "Hermano Mayor", R.drawable.gifhira22ni,
                    R.drawable.hiragana22ni),

            new ItemsDictionaryHiragana("nu",
                    R.raw.aud23nu,"いぬ", "inu", "Perro", R.drawable.gifhira23nu,
                    R.drawable.hiragana23nu),

            new ItemsDictionaryHiragana("ne",
                    R.raw.aud24ne,"ねこ", "neko", "Gato", R.drawable.gifhira24ne,
                    R.drawable.hiragana24ne),

            new ItemsDictionaryHiragana("no",
                    R.raw.aud25no,"のうか", "nouka", "Granjero", R.drawable.gifhira25no,
                    R.drawable.hiragana25no),

            new ItemsDictionaryHiragana("ha",
                    R.raw.aud26ha,"かな", "hana", "Flor", R.drawable.gifhira26ha,
                    R.drawable.hiragana26ha),

            new ItemsDictionaryHiragana("hi",
                    R.raw.aud27hi,"ひこうき", "hikouki", "Avión", R.drawable.gifhira27hi,
                    R.drawable.hiragana27hi),

            new ItemsDictionaryHiragana("fu",
                    R.raw.aud28fu,"ふね", "fune", "Barco", R.drawable.gifhira28fu,
                    R.drawable.hiragana28fu),

            new ItemsDictionaryHiragana("he",
                    R.raw.aud29he,"へい", "hei", "Muro", R.drawable.gifhira29he,
                    R.drawable.hiragana29he),

            new ItemsDictionaryHiragana("ho",
                    R.raw.aud30ho,"ほし", "hoshi", "Estrella", R.drawable.gifhira30ho,
                    R.drawable.hiragana30ho),

            new ItemsDictionaryHiragana("ma",
                    R.raw.aud31ma,"まど", "mado", "Ventana", R.drawable.gifhira31ma,
                    R.drawable.hiragana31ma),

            new ItemsDictionaryHiragana("mi",
                    R.raw.aud32mi,"みみ", "mimi", "Oreja", R.drawable.gifhira32mi,
                    R.drawable.hiragana32mi),

            new ItemsDictionaryHiragana("mu",
                    R.raw.aud33mu,"むっつ", "muttsu", "Seis", R.drawable.gifhira33mu,
                    R.drawable.hiragana33mu),

            new ItemsDictionaryHiragana("me",
                    R.raw.aud34me,"め", "me", "Ojo", R.drawable.gifhira34me,
                    R.drawable.hiragana34me),

            new ItemsDictionaryHiragana("mo",
                    R.raw.aud35mo,"もも", "momo", "durazno", R.drawable.gifhira35mo,
                    R.drawable.hiragana35mo),

            new ItemsDictionaryHiragana("ya",
                    R.raw.aud36ya,"やま", "yama", "Montaña", R.drawable.gifhira36ya,
                    R.drawable.hiragana36ya),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("yu",
                    R.raw.aud37yu,"ゆき", "yuki", "Nieve", R.drawable.gifhira37yu,
                    R.drawable.hiragana37yu),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("yo",
                    R.raw.aud38yo,"よっつ", "yottsu", "Cuatro", R.drawable.gifhira38yo,
                    R.drawable.hiragana38yo),

            new ItemsDictionaryHiragana("ra",
                    R.raw.aud39ra,"からて", "karate", "Karate", R.drawable.gifhira39ra,
                    R.drawable.hiragana39ra),

            new ItemsDictionaryHiragana("ri",
                    R.raw.aud40ri,"くすり", "kusuri", "Medicina", R.drawable.gifhira40ri,
                    R.drawable.hiragana40ri),

            new ItemsDictionaryHiragana("ru",
                    R.raw.aud41ru,"よる", "yoru", "Noche", R.drawable.gifhira41ru,
                    R.drawable.hiragana41ru),

            new ItemsDictionaryHiragana("re",
                    R.raw.aud42re,"れいきし", "reikishi", "Historia", R.drawable.gifhira42re,
                    R.drawable.hiragana42re),

            new ItemsDictionaryHiragana("ro",
                    R.raw.aud43ro,"くろい", "kuroi", "Negro", R.drawable.gifhira43ro,
                    R.drawable.hiragana43ro),

            new ItemsDictionaryHiragana("wa",
                    R.raw.aud44wa,"わし", "washi", "Águila", R.drawable.gifhira44wa,
                    R.drawable.hiragana44wa),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("wo",
                    R.raw.aud45wo,"を", "wo", "(Partícula japonesa)", R.drawable.gifhira45wo,
                    R.drawable.hiragana45wo),

            new ItemsDictionaryHiragana("n",
                    R.raw.aud46n,"こうえん", "kouen", "Parque", R.drawable.gifhira46n,
                    R.drawable.hiragana46n),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("ga",
                    R.raw.aud47ga,"がっこう", "gakkou", "Colegio", R.drawable.blanco,
                    R.drawable.hiragana47ga),

            new ItemsDictionaryHiragana("gi",
                    R.raw.aud48gi,"みぎ", "migi", "Derecha", R.drawable.blanco,
                    R.drawable.hiragana48gi),

            new ItemsDictionaryHiragana("gu",
                    R.raw.aud49gu,"かぐ", "kagu", "Mueble", R.drawable.blanco,
                    R.drawable.hiragana49gu),

            new ItemsDictionaryHiragana("ge",
                    R.raw.aud50ge,"ひげ", "hige", "Barba", R.drawable.blanco,
                    R.drawable.hiragana50ge),

            new ItemsDictionaryHiragana("go",
                    R.raw.aud51go,"ごはん", "gohan", "Comida", R.drawable.blanco,
                    R.drawable.hiragana51go),

            new ItemsDictionaryHiragana("za",
                    R.raw.aud52za,"ざっし", "zasshi", "Revista", R.drawable.blanco,
                    R.drawable.hiragana52za),

            new ItemsDictionaryHiragana("ji",
                    R.raw.aud53ji,"にんじん", "ninjin", "Zanahoria", R.drawable.blanco,
                    R.drawable.hiragana53ji),

            new ItemsDictionaryHiragana("zu",
                    R.raw.aud54zu,"ねずみ", "nezumi", "Ratón", R.drawable.blanco,
                    R.drawable.hiragana54zu),

            new ItemsDictionaryHiragana("ze",
                    R.raw.aud55ze,"かぜ", "kaze", "Viento", R.drawable.blanco,
                    R.drawable.hiragana55ze),

            new ItemsDictionaryHiragana("zo",
                    R.raw.aud56zo,"かぞく", "kazoku", "Familia", R.drawable.blanco,
                    R.drawable.hiragana56zo),

            new ItemsDictionaryHiragana("da",
                    R.raw.aud57da,"だいどころ", "daidokoro", "Cocina", R.drawable.blanco,
                    R.drawable.hiragana57da),

            new ItemsDictionaryHiragana("di",
                    R.raw.aud58ji,"ちぢむ", "chidimu", "Reducir", R.drawable.blanco,
                    R.drawable.hiragana58di),

            new ItemsDictionaryHiragana("zu",
                    R.raw.aud59zu,"つづく", "tsuzuku", "Continuar", R.drawable.blanco,
                    R.drawable.hiragana59du),

            new ItemsDictionaryHiragana("de",
                    R.raw.aud60de,"うで", "ude", "Brazo", R.drawable.blanco,
                    R.drawable.hiragana60de),

            new ItemsDictionaryHiragana("do",
                    R.raw.aud61do,"みどり", "midori", "Verde", R.drawable.blanco,
                    R.drawable.hiragana61do),

            new ItemsDictionaryHiragana("ba",
                    R.raw.aud62ba,"かばん", "kaban", "Bolso", R.drawable.blanco,
                    R.drawable.hiragana62ba),

            new ItemsDictionaryHiragana("bi",
                    R.raw.aud63bi,"ゆび", "yubi", "Dedo", R.drawable.blanco,
                    R.drawable.hiragana63bi),

            new ItemsDictionaryHiragana("bu",
                    R.raw.aud64bu,"ぶた", "buta", "Cerdo", R.drawable.blanco,
                    R.drawable.hiragana64bu),

            new ItemsDictionaryHiragana("be",
                    R.raw.aud65be,"べんごし", "bengoshi", "Abogado", R.drawable.blanco,
                    R.drawable.hiragana65be),

            new ItemsDictionaryHiragana("bo",
                    R.raw.aud66bo,"ぼく", "boku", "Yo", R.drawable.blanco,
                    R.drawable.hiragana66bo),

            new ItemsDictionaryHiragana("pa",
                    R.raw.aud67pa,"しんっぱい", "shinppai", "Error", R.drawable.blanco,
                    R.drawable.hiragana67pa),

            new ItemsDictionaryHiragana("pi",
                    R.raw.aud68pi,"ぴったり", "pittari", "Cercano", R.drawable.blanco,
                    R.drawable.hiragana68pi),

            new ItemsDictionaryHiragana("pu",
                    R.raw.aud69pu,"きっぷ", "kippu", "Tiquete", R.drawable.blanco,
                    R.drawable.hiragana69pu),

            new ItemsDictionaryHiragana("pe",
                    R.raw.aud70pe,"ほっぺた", "hoppeta", "Mejilla", R.drawable.blanco,
                    R.drawable.hiragana70pe),

            new ItemsDictionaryHiragana("po",
                    R.raw.aud71po,"ぽかん", "pokan", "Distraído", R.drawable.blanco,
                    R.drawable.hiragana71po),

            new ItemsDictionaryHiragana("kya",
                    R.raw.aud72kya,"おきゃくさん", "okyakusan", "Invitado", R.drawable.blanco,
                    R.drawable.hiragana72kya),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("kyu",
                    R.raw.aud73kyu,"きゅうり", "kyuuri", "Pepino", R.drawable.blanco,
                    R.drawable.hiragana73kyu),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("kyo",
                    R.raw.aud74kyo,"きょうかい", "kyoukai", "Iglesia", R.drawable.blanco,
                    R.drawable.hiragana74kyo),

            new ItemsDictionaryHiragana("gya",
                    R.raw.aud75gya,"", "", "", R.drawable.blanco,
                    R.drawable.hiragana75gya),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("gyu",
                    R.raw.aud76gyu,"ぎゅうにく", "gyuuniku", "Carne de res", R.drawable.blanco,
                    R.drawable.hiragana76gyu),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("gyo",
                    R.raw.aud77gyo,"にんぎょう", "ningyou", "Muñeca", R.drawable.blanco,
                    R.drawable.hiragana77gyo),

            new ItemsDictionaryHiragana("sha",
                    R.raw.aud78sha,"いしゃ", "isha", "Médico", R.drawable.blanco,
                    R.drawable.hiragana78sha),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.gifhira5o,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("shu",
                    R.raw.aud79shu,"しゅくだい", "shukudai", "Tarea", R.drawable.blanco,
                    R.drawable.hiragana79shu),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.gifhira5o,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("sho",
                    R.raw.aud80sho,"しょてん", "shoten", "Librería", R.drawable.blanco,
                    R.drawable.hiragana80sho),

            new ItemsDictionaryHiragana("ja",
                    R.raw.aud81ja,"じゃがいも", "jagaimo", "Papa", R.drawable.blanco,
                    R.drawable.hiragana81ja),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.gifhira5o,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("ju",
                    R.raw.aud82ju,"じゅうにがつ", "juunigatsu", "Diciembre", R.drawable.blanco,
                    R.drawable.hiragana82ju),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.gifhira5o,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("jo",
                    R.raw.aud83jo,"にんじょう", "ninjou", "Humanidad", R.drawable.blanco,
                    R.drawable.hiragana83jo),

            new ItemsDictionaryHiragana("cha",
                    R.raw.aud84cha,"ちゃいろ", "chairo", "Color café", R.drawable.blanco,
                    R.drawable.hiragana84cha),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.gifhira5o,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("chu",
                    R.raw.aud85chu,"ちゅうしゃ", "chuusha", "Inyección", R.drawable.blanco,
                    R.drawable.hiragana85chu),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.gifhira5o,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("cho",
                    R.raw.aud86cho,"ちょっかく", "chokkaku", "Perpendicular", R.drawable.blanco,
                    R.drawable.hiragana86cho),

            new ItemsDictionaryHiragana("nya",
                    R.raw.aud87nya,"にゃんこ", "nyanko", "Gatito", R.drawable.blanco,
                    R.drawable.hiragana87nya),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.gifhira5o,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("nyu",
                    R.raw.aud88nyu,"ぎゅうにゅう", "gyuunyuu", "Leche", R.drawable.blanco,
                    R.drawable.hiragana88nyu),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("nyo",
                    R.raw.aud89nyo,"にょう", "nyou", "Orina", R.drawable.blanco,
                    R.drawable.hiragana89nyo),

            new ItemsDictionaryHiragana("hya",
                    R.raw.aud90hya,"ひゃっかてん", "hyakkaten", "Tienda", R.drawable.blanco,
                    R.drawable.hiragana90hya),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("hyu",
                    R.raw.aud91hyu,"", "", "", R.drawable.blanco,
                    R.drawable.hiragana91hyu),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("hyo",
                    R.raw.aud92hyo,"ひょう", "hyou", "Voto", R.drawable.blanco,
                    R.drawable.hiragana92hyo),

            new ItemsDictionaryHiragana("bya",
                    R.raw.aud93bya,"さんびゃく", "sanbyaku", "Trescientos", R.drawable.blanco,
                    R.drawable.hiragana93bya),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("byu",
                    R.raw.aud94byu,"", "", "", R.drawable.blanco,
                    R.drawable.hiragana94byu),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("byo",
                    R.raw.aud95byo,"びょういん", "byouin", "Hospital", R.drawable.blanco,
                    R.drawable.hiragana95byo),

            new ItemsDictionaryHiragana("pya",
                    R.raw.aud96pya,"ろっぴゃく", "roppyaku", "Seiscientos", R.drawable.blanco,
                    R.drawable.hiragana96pya),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("pyu",
                    R.raw.aud97pyu,"", "", "", R.drawable.blanco,
                    R.drawable.hiragana97pyu),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("pyo",
                    R.raw.aud98pyo,"はっぴょう", "happyou", "Anuncio", R.drawable.blanco,
                    R.drawable.hiragana98pyo),

            new ItemsDictionaryHiragana("mya",
                    R.raw.aud99mya,"みゃく", "myaku", "Pulso", R.drawable.blanco,
                    R.drawable.hiragana99mya),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("myu",
                    R.raw.aud100myu,"", "", "", R.drawable.blanco,
                    R.drawable.hiragana100myu),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("myo",
                    R.raw.aud101myo,"みょうじ", "myouji", "Apellido", R.drawable.blanco,
                    R.drawable.hiragana101myo),

            new ItemsDictionaryHiragana("rya",
                    R.raw.aud102rya,"りゃくご", "ryakugo", "Diminuto", R.drawable.blanco,
                    R.drawable.hiragana102rya),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("ryu",
                    R.raw.aud103ryu,"りゅう", "ryuu", "Dragón", R.drawable.blanco,
                    R.drawable.hiragana103ryu),

            new ItemsDictionaryHiragana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryHiragana("ryo",
                    R.raw.aud104ryo,"りょこ", "ryoko", "Viaje", R.drawable.blanco,
                    R.drawable.hiragana104ryo),

    };

    /**
     * Obtiene como lista todos los cursos de prueba
     *
     * @return Lista de cursos
     */
    public static List<ItemsDictionaryHiragana> getCourses() {
        return Arrays.asList(courses);
    }

    /**
     * Obtiene un curso basado en la posición del array
     *
     * @param position Posición en el array
     * @return Curso seleccioando
     */
    public static ItemsDictionaryHiragana getCourseByPosition(int position) {
        return courses[position];
    }

}
