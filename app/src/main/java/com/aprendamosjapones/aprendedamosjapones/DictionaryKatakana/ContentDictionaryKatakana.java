package com.aprendamosjapones.aprendedamosjapones.DictionaryKatakana;

import com.aprendamosjapones.aprendedamosjapones.R;

import java.util.Arrays;
import java.util.List;

/**
 * Creado por Hermosa Programación.
 */
public class ContentDictionaryKatakana {
    private static ItemsDictionaryKatakana[] courses = {
            new ItemsDictionaryKatakana("a",
                    R.raw.aud1a, "アイアン", "aian", "Hierro", R.drawable.gifkata1a,
                     R.drawable.katakana1a),

            new ItemsDictionaryKatakana("i",
                    R.raw.aud2i, "コイン", "koin", "Moneda", R.drawable.gifkata2i,
                    R.drawable.katakana2i),

            new ItemsDictionaryKatakana("u",
                    R.raw.aud3u, "ヒョウ", "hyou", "Leopardo", R.drawable.gifkata3u,
                    R.drawable.katakana3u),

            new ItemsDictionaryKatakana("e",
                    R.raw.aud4e, "オリエンタル", "orientaru", "Oriental", R.drawable.gifkata4e,
                    R.drawable.katakana4e),

            new ItemsDictionaryKatakana("o",
                    R.raw.aud5o,"オーナー", "oonaa", "Dueño", R.drawable.gifkata5o,
                    R.drawable.katakana5o),

            new ItemsDictionaryKatakana("ka",
                    R.raw.aud6ka,"カカオ", "kakao", "Cacao", R.drawable.gifkata6ka,
                    R.drawable.katakana6ka),

            new ItemsDictionaryKatakana("ki",
                    R.raw.aud7ki,"クッキー", "kukkii", "Galleta", R.drawable.gifkata7ki,
                    R.drawable.katakana7ki),

            new ItemsDictionaryKatakana("ku",
                    R.raw.aud8ku,"クイーン", "kuiin", "Reina", R.drawable.gifkata8ku,
                    R.drawable.katakana8ku),

            new ItemsDictionaryKatakana("ke",
                    R.raw.aud9ke,"ケーキ", "keeki", "Torta", R.drawable.gifkata9ke,
                    R.drawable.katakana9ke),

            new ItemsDictionaryKatakana("ko",
                    R.raw.aud10ko,"エコー", "ekoo", "Eco", R.drawable.gifkata10ko,
                    R.drawable.katakana10ko),

            new ItemsDictionaryKatakana("sa",
                    R.raw.aud11sa,"サッカー", "sakkaa", "Fútbol", R.drawable.gifkata11sa,
                    R.drawable.katakana11sa),

            new ItemsDictionaryKatakana("shi",
                    R.raw.aud12shi,"シーソー ", "shiisoo", "Balancín", R.drawable.gifkata12shi,
                    R.drawable.katakana12shi),

            new ItemsDictionaryKatakana("su",
                    R.raw.aud13su,"スキー", "sukii", "Esquiar", R.drawable.gifkata13su,
                    R.drawable.katakana13su),

            new ItemsDictionaryKatakana("se",
                    R.raw.aud14se,"アクセス", "akusesu", "Acceso", R.drawable.gifkata14se,
                    R.drawable.katakana14se),

            new ItemsDictionaryKatakana("so",
                    R.raw.aud15so,"ソース", "soosu", "Salsa", R.drawable.gifkata15so,
                    R.drawable.katakana15so),

            new ItemsDictionaryKatakana("ta",
                    R.raw.aud16ta,"タクシー", "takushii", "Taxi", R.drawable.gifkata16ta,
                    R.drawable.katakana16ta),

            new ItemsDictionaryKatakana("chi",
                    R.raw.aud17chi,"センチ", "senchi", "Centímetro", R.drawable.gifkata17chi,
                    R.drawable.katakana17chi),

            new ItemsDictionaryKatakana("tsu",
                    R.raw.aud18tsu,"スーツ", "suutsu", "Traje", R.drawable.gifkata18tsu,
                    R.drawable.katakana18tsu),

            new ItemsDictionaryKatakana("te",
                    R.raw.aud19te,"テニス", "tenisu", "Tenis", R.drawable.gifkata19te,
                    R.drawable.katakana19te),

            new ItemsDictionaryKatakana("to",
                    R.raw.aud20to,"インスタント", "insutanto", "Instante", R.drawable.gifkata20to,
                    R.drawable.katakana20to),

            new ItemsDictionaryKatakana("na",
                    R.raw.aud21na,"ナイト", "naito", "Caballero", R.drawable.gifkata21na,
                    R.drawable.katakana21na),

            new ItemsDictionaryKatakana("ni",
                    R.raw.aud22ni,"オセアニア", "oseania", "Oceanía", R.drawable.gifkata22ni,
                    R.drawable.katakana22ni),

            new ItemsDictionaryKatakana("nu",
                    R.raw.aud23nu,"カヌー", "kanuu", "Canoa", R.drawable.gifkata23nu,
                    R.drawable.katakana23nu),

            new ItemsDictionaryKatakana("ne",
                    R.raw.aud24ne,"ネック", "nekku", "Cuello", R.drawable.gifkata24ne,
                    R.drawable.katakana24ne),

            new ItemsDictionaryKatakana("no",
                    R.raw.aud25no,"ノート", "nooto", "Cuaderno", R.drawable.gifkata25no,
                    R.drawable.katakana25no),

            new ItemsDictionaryKatakana("ha",
                    R.raw.aud26ha,"ハーフ ", "haafu", "Mitad", R.drawable.gifkata26ha,
                    R.drawable.katakana26ha),

            new ItemsDictionaryKatakana("hi",
                    R.raw.aud27hi,"コーヒー", "koohi", "Café", R.drawable.gifkata27hi,
                    R.drawable.katakana27hi),

            new ItemsDictionaryKatakana("fu",
                    R.raw.aud28fu,"ソグト", "sofuto", "Suave", R.drawable.gifkata28fu,
                    R.drawable.katakana28fu),

            new ItemsDictionaryKatakana("he",
                    R.raw.aud29he,"ヘナ", "hena", "(Un tipo de planta)", R.drawable.gifkata29he,
                    R.drawable.katakana29he),

            new ItemsDictionaryKatakana("ho",
                    R.raw.aud30ho,"ホース", "hoosu", "Manguera", R.drawable.gifkata30ho,
                    R.drawable.katakana30ho),

            new ItemsDictionaryKatakana("ma",
                    R.raw.aud31ma,"マスク", "masuku", "Máscara", R.drawable.gifkata31ma,
                    R.drawable.katakana31ma),

            new ItemsDictionaryKatakana("mi",
                    R.raw.aud32mi,"ミス", "misu", "Fallo", R.drawable.gifkata32mi,
                    R.drawable.katakana32mi),

            new ItemsDictionaryKatakana("mu",
                    R.raw.aud33mu,"ミニマム", "minimamu", "Mínimo", R.drawable.gifkata33mu,
                    R.drawable.katakana33mu),

            new ItemsDictionaryKatakana("me",
                    R.raw.aud34me,"トーナメント ", "toonamento", "Torneo", R.drawable.gifkata34me,
                    R.drawable.katakana34me),

            new ItemsDictionaryKatakana("mo",
                    R.raw.aud35mo,"モナコ", "monako", "Mónaco", R.drawable.gifkata35mo,
                    R.drawable.katakana35mo),

            new ItemsDictionaryKatakana("ya",
                    R.raw.aud36ya,"イヤホン", "iyahon", "Audífono", R.drawable.gifkata36ya,
                    R.drawable.katakana36ya),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("yu",
                    R.raw.aud37yu,"ユニコーン", "yunikoon", "Unicornio", R.drawable.gifkata37yu,
                    R.drawable.katakana37yu),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("yo",
                    R.raw.aud38yo,"ヨーヨー", "yooyoo", "Yo-yo", R.drawable.gifkata38yo,
                    R.drawable.katakana38yo),

            new ItemsDictionaryKatakana("ra",
                    R.raw.aud39ra,"トラック", "torakku", "Camión", R.drawable.gifkata39ra,
                    R.drawable.katakana39ra),

            new ItemsDictionaryKatakana("ri",
                    R.raw.aud40ri,"アフリカ", "afurika", "África", R.drawable.gifkata40ri,
                    R.drawable.katakana40ri),

            new ItemsDictionaryKatakana("ru",
                    R.raw.aud41ru,"フルート", "furuuto", "Flauta", R.drawable.gifkata41ru,
                    R.drawable.katakana41ru),

            new ItemsDictionaryKatakana("re",
                    R.raw.aud42re,"レストラン", "resutoran", "Restaurante", R.drawable.gifkata42re,
                    R.drawable.katakana42re),

            new ItemsDictionaryKatakana("ro",
                    R.raw.aud43ro,"メロン", "meron", "Melón", R.drawable.gifkata43ro,
                    R.drawable.katakana43ro),

            new ItemsDictionaryKatakana("wa",
                    R.raw.aud44wa,"ワイン", "wain", "Vino", R.drawable.gifkata44wa,
                    R.drawable.katakana44wa),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("wo",
                    R.raw.aud45wo,"", "", "", R.drawable.gifkata45wo,
                    R.drawable.katakana45wo),

            new ItemsDictionaryKatakana("n",
                    R.raw.aud46n,"インフォ", "info", "Información", R.drawable.gifkata46n,
                    R.drawable.katakana46n),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("ga",
                    R.raw.aud47ga,"マダガスカル", "madagasukaru", "Madagascar", R.drawable.blanco,
                    R.drawable.katakana47ga),

            new ItemsDictionaryKatakana("gi",
                    R.raw.aud48gi,"ギター", "gitaa", "Guitarra", R.drawable.blanco,
                    R.drawable.katakana48gi),

            new ItemsDictionaryKatakana("gu",
                    R.raw.aud49gu,"ニカラグア", "nikaragua", "Nicaragua", R.drawable.blanco,
                    R.drawable.katakana49gu),

            new ItemsDictionaryKatakana("ge",
                    R.raw.aud50ge,"ゲットー", "gettoo", "Gueto", R.drawable.blanco,
                    R.drawable.katakana50ge),

            new ItemsDictionaryKatakana("go",
                    R.raw.aud51go,"ゴール", "gooru", "Gol", R.drawable.blanco,
                    R.drawable.katakana51go),

            new ItemsDictionaryKatakana("za",
                    R.raw.aud52za,"タンザニア", "tanzania", "Tanzania", R.drawable.blanco,
                    R.drawable.katakana52za),

            new ItemsDictionaryKatakana("ji",
                    R.raw.aud53ji,"ソーセージ", "sooseeji", "Salchicha", R.drawable.blanco,
                    R.drawable.katakana53ji),

            new ItemsDictionaryKatakana("zu",
                    R.raw.aud54zu,"チーズ", "chiizu", "Queso", R.drawable.blanco,
                    R.drawable.katakana54zu),

            new ItemsDictionaryKatakana("ze",
                    R.raw.aud55ze,"ゼウス", "zeusu", "Zeus", R.drawable.blanco,
                    R.drawable.katakana55ze),

            new ItemsDictionaryKatakana("zo",
                    R.raw.aud56zo,"オゾン", "ozon", "Ozono", R.drawable.blanco,
                    R.drawable.katakana56zo),

            new ItemsDictionaryKatakana("da",
                    R.raw.aud57da,"カナダ", "kanada", "Canadá", R.drawable.blanco,
                    R.drawable.katakana57da),

            new ItemsDictionaryKatakana("di",
                    R.raw.aud58ji,"コメディー", "komedii", "Comedia", R.drawable.blanco,
                    R.drawable.katakana58di),

            new ItemsDictionaryKatakana("zu",
                    R.raw.aud59zu,"", "", "", R.drawable.blanco,
                    R.drawable.katakana59du),

            new ItemsDictionaryKatakana("de",
                    R.raw.aud60de,"アカデミー", "akademii", "Academia", R.drawable.blanco,
                    R.drawable.katakana60de),

            new ItemsDictionaryKatakana("do",
                    R.raw.aud61do,"イングランド", "ingurando", "Inlaterra", R.drawable.blanco,
                    R.drawable.katakana61do),

            new ItemsDictionaryKatakana("ba",
                    R.raw.aud62ba,"バター", "bataa", "Mantequilla", R.drawable.blanco,
                    R.drawable.katakana62ba),

            new ItemsDictionaryKatakana("bi",
                    R.raw.aud63bi,"コロンビア", "koronbia", "Colombia", R.drawable.blanco,
                    R.drawable.katakana63bi),

            new ItemsDictionaryKatakana("bu",
                    R.raw.aud64bu,"ブルー", "buruu", "Azul", R.drawable.blanco,
                    R.drawable.katakana64bu),

            new ItemsDictionaryKatakana("be",
                    R.raw.aud65be,"ベッド", "beddo", "Cama", R.drawable.blanco,
                    R.drawable.katakana65be),

            new ItemsDictionaryKatakana("bo",
                    R.raw.aud66bo,"ボクシング", "bokushingu", "Boxeo", R.drawable.blanco,
                    R.drawable.katakana66bo),

            new ItemsDictionaryKatakana("pa",
                    R.raw.aud67pa,"スーパー", "suupaa", "Supermercado", R.drawable.blanco,
                    R.drawable.katakana67pa),

            new ItemsDictionaryKatakana("pi",
                    R.raw.aud68pi,"ピアノ", "piano", "Piano", R.drawable.blanco,
                    R.drawable.katakana68pi),

            new ItemsDictionaryKatakana("pu",
                    R.raw.aud69pu,"ヘリコプター", "herikoputaa", "Helicóptero", R.drawable.blanco,
                    R.drawable.katakana69pu),

            new ItemsDictionaryKatakana("pe",
                    R.raw.aud70pe,"ペン", "pen", "Lapicero", R.drawable.blanco,
                    R.drawable.katakana70pe),

            new ItemsDictionaryKatakana("po",
                    R.raw.aud71po,"ポート ", "pooto", "Puerto", R.drawable.blanco,
                    R.drawable.katakana71po),

            new ItemsDictionaryKatakana("kya",
                    R.raw.aud72kya,"キャベツ", "kyabetsu", "Repollo", R.drawable.blanco,
                    R.drawable.katakana72kya),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("kyu",
                    R.raw.aud73kyu,"キューバ", "kyuuba", "Cuba", R.drawable.blanco,
                    R.drawable.katakana73kyu),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("kyo",
                    R.raw.aud74kyo,"キョンシー", "kyonshii", "(Tipo de zombi)", R.drawable.blanco,
                    R.drawable.katakana74kyo),

            new ItemsDictionaryKatakana("gya",
                    R.raw.aud75gya,"ギャラリー", "gyararii", "Galería", R.drawable.blanco,
                    R.drawable.katakana75gya),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("gyu",
                    R.raw.aud76gyu,"フィギュア", "figyua", "Figurilla", R.drawable.blanco,
                    R.drawable.katakana76gyu),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("gyo",
                    R.raw.aud77gyo,"ギョーザ", "gyooza", "(Tipo de comida)", R.drawable.blanco,
                    R.drawable.katakana77gyo),

            new ItemsDictionaryKatakana("sha",
                    R.raw.aud78sha,"ティーシャツ", "tiishatsu", "Camisa", R.drawable.blanco,
                    R.drawable.katakana78sha),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.gifhira5o,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("shu",
                    R.raw.aud79shu,"エンゼルフィシュ", "enzerufishu", "Pez ángel", R.drawable.blanco,
                    R.drawable.katakana79shu),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.gifhira5o,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("sho",
                    R.raw.aud80sho,"ショー ", "shoo", "show", R.drawable.blanco,
                    R.drawable.katakana80sho),

            new ItemsDictionaryKatakana("ja",
                    R.raw.aud81ja,"ジャズ", "jazu", "Jazz", R.drawable.blanco,
                    R.drawable.katakana81ja),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.gifhira5o,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("ju",
                    R.raw.aud82ju,"ジュース", "juuso", "Jugo", R.drawable.blanco,
                    R.drawable.katakana82ju),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.gifhira5o,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("jo",
                    R.raw.aud83jo,"ジョーク", "jooku", "Broma", R.drawable.blanco,
                    R.drawable.katakana83jo),

            new ItemsDictionaryKatakana("cha",
                    R.raw.aud84cha,"チャンピオン", "chanpion", "Campeón", R.drawable.blanco,
                    R.drawable.katakana84cha),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.gifhira5o,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("chu",
                    R.raw.aud85chu,"アマチュア", "amachua", "Amateur", R.drawable.blanco,
                    R.drawable.katakana85chu),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.gifhira5o,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("cho",
                    R.raw.aud86cho,"チョコレート", "chokoreeto", "Chocolate", R.drawable.blanco,
                    R.drawable.katakana86cho),

            new ItemsDictionaryKatakana("nya",
                    R.raw.aud87nya,"コニャク", "konyaku", "Coñac", R.drawable.blanco,
                    R.drawable.katakana87nya),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.gifhira5o,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("nyu",
                    R.raw.aud88nyu,"メニュー", "menyuu", "Menú", R.drawable.blanco,
                    R.drawable.katakana88nyu),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("nyo",
                    R.raw.aud89nyo,"ニョッキ", "nyokki", "(Tipo de macarrón)", R.drawable.blanco,
                    R.drawable.katakana89nyo),

            new ItemsDictionaryKatakana("hya",
                    R.raw.aud90hya,"リヒャルトワーグナー", "rihyarutowaagunaa", "Richard Wagner", R.drawable.blanco,
                    R.drawable.katakana90hya),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("hyu",
                    R.raw.aud91hyu,"ヒューストン", "hyuusuton", "Hiuston", R.drawable.blanco,
                    R.drawable.katakana91hyu),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("hyo",
                    R.raw.aud92hyo,"ヒョウ", "hyou", "Leopardo", R.drawable.blanco,
                    R.drawable.katakana92hyo),

            new ItemsDictionaryKatakana("bya",
                    R.raw.aud93bya,"ビャクダン", "byakudan", "(Tipo de árbol)", R.drawable.blanco,
                    R.drawable.katakana93bya),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("byu",
                    R.raw.aud94byu,"インタビュー", "intabyuu", "Entrevista", R.drawable.blanco,
                    R.drawable.katakana94byu),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("byo",
                    R.raw.aud95byo,"", "", "", R.drawable.blanco,
                    R.drawable.katakana95byo),

            new ItemsDictionaryKatakana("pya",
                    R.raw.aud96pya,"", "", "", R.drawable.blanco,
                    R.drawable.katakana96pya),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("pyu",
                    R.raw.aud97pyu,"コンピューター", "konpyuutaa", "Computador", R.drawable.blanco,
                    R.drawable.katakana97pyu),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("pyo",
                    R.raw.aud98pyo,"ピョニャン", "pyonyan", "(Capital Corea del Norte)", R.drawable.blanco,
                    R.drawable.katakana98pyo),

            new ItemsDictionaryKatakana("mya",
                    R.raw.aud99mya,"ミャンマー", "myanmaa", "Birmania", R.drawable.blanco,
                    R.drawable.katakana99mya),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("myu",
                    R.raw.aud100myu,"", "myuujikku", "Música", R.drawable.blanco,
                    R.drawable.katakana100myu),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("myo",
                    R.raw.aud101myo,"ミョガ", "myoga", "(Tipo de jengibre)", R.drawable.blanco,
                    R.drawable.katakana101myo),

            new ItemsDictionaryKatakana("rya",
                    R.raw.aud102rya,"パエーリャ", "paeerya", "Paella", R.drawable.blanco,
                    R.drawable.katakana102rya),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("ryu",
                    R.raw.aud103ryu,"スクリュー", "sukuryuu", "Tornillo", R.drawable.blanco,
                    R.drawable.katakana103ryu),

            new ItemsDictionaryKatakana("",
                    R.raw.aud5o,"", "", "", R.drawable.blanco,
                    R.drawable.blanco),

            new ItemsDictionaryKatakana("ryo",
                    R.raw.aud104ryo,"マトリョーシカ", "matoryooshika", "(Muñeca rusa)", R.drawable.blanco,
                    R.drawable.katakana104ryo),
    };

    /**
     * Obtiene como lista todos los cursos de prueba
     *
     * @return Lista de cursos
     */
    public static List<ItemsDictionaryKatakana> getCourses() {
        return Arrays.asList(courses);
    }

    /**
     * Obtiene un curso basado en la posición del array
     *
     * @param position Posición en el array
     * @return Curso seleccioando
     */
    public static ItemsDictionaryKatakana getCourseByPosition(int position) {
        return courses[position];
    }

}
