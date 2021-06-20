import com.ogrenci
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.abs

fun main() {

    //val kisi = Kisi("ali", "CAN", 12345678901,"AZ",Cinsiyet.ERKEK)
    //val kisi=Kisi("ali","can",51525,"TC")
    //  kisi.adi = "           veli"
    // kisi.soyadi ="canan"
    //  println(kisi.adi)
    // println(kisi.soyadi)
    // println(kisi.kimlikNo)
    // println(kisi.uyruk)

    //kisi.adiSoyadiSetle()

    //println(kisi.adiSoyadi)
    //println(kisi.BOLUM)

    //println(Pi.piGoster("%.16f"))

    //  val kisi1 = kisi.copy(adi="Veli")//= Kisi("ali", "CAN", 12345678901,"AZ") //ikinci constructor

    //val ogrenci = Ogrenci("ali", "CAN", 12345678901,"AZ", 12345678)
    //val ogrenci1 = Ogrenci("ali", "CAN", 12345678901,"AZ", 234568) //ikinci constructor

    //println(ogrenci.BOLUM)
    //println(ogrenci1==ogrenci) //==

   // println(kisi.hashCode())
    // println(kisi1.toString())

    println("Ali".length)
    println("Ali".uzunluk)
    println("Ali".buyukHarf())
    println(faktoriyel(3))
    println(listOf(-1,-2,-3).map{3*it})
    println("Ali"*4)

    var x = 3
    var y = 41
    run{
        val gecici = x
        x = y
        y = gecici
    }
    println(x)
    println(y)
}

//(1)
//class Kisi

//(2)
//class Kisi{}

//(3)
//class Kisi constructor(var adi:String)
//class Kisi(var adi:String) // bir tane parametreli yapıcı

/*
//(4)
class Kisi(val adi:String)
 */

//(5)
/*class Kisi(_adi:String){
    var adi = _adi
}
*/

/*
//(6)
class Kisi (_adi:String, _soyadi:String, _kimlikNo:Long){
    var adi =_adi
        get() = field.capitalize()
        set(deger) {
            field = deger.trim()
    }
    var soyadi = _soyadi

    val kimlikNo = _kimlikNo
}
*/

/*
//(7)
class Kisi (_adi:String, _soyadi:String, val kimlikNo:Long){
    var adi =_adi
        get() = field.capitalize()
        set(deger) {
            field = deger.trim()
        }
     var soyadi =_soyadi
        get() = field.toUpperCase()
        set(deger) {
            field = deger.trim()
        }
}
*/

/*
//(8)
class Kisi (_adi:String, _soyadi:String, val kimlikNo:Long, val uyruk:String){
    var adi =_adi
        get() = field.capitalize()
        private set(value) {
            field = value.trim()
        }
    var soyadi =_soyadi
        get() = field.toUpperCase()
        private set(value) {
            field = value.trim()
        }
    constructor(adi:String, soyadi:String, kimlikNo:Long) : this(adi,soyadi, kimlikNo, uyruk="TC")
}
*/

/*
//(9)
class Kisi (_adi:String, _soyadi:String, val kimlikNo:Long, val uyruk:String) {
    var adi = _adi
        get() = field.capitalize()
        private set(value) {
            field = value.trim()
        }
    var soyadi = _soyadi
        get() = field.toUpperCase()
        private set(value) {
            field = value.trim()
        }
    val adiSoyadi:String

    init {
        adiSoyadi = adi + " " + soyadi
        require(uyruk.length==2,{"Uyruk iki harfli olmalıdır"})
        require(adi.isNotBlank(), {"Kisinin bir adi olmalidir"})
        require(soyadi.isNotBlank(), {"Kisinin bir soyadi olmalidir"})
    }
    constructor(adi: String, soyadi: String, kimlikNo: Long) : this(adi, soyadi, kimlikNo, uyruk = "TC")
}
*/

/*
//(10)
class Kisi (_adi:String, _soyadi:String, val kimlikNo:Long, val uyruk:String) {
    var adi = _adi
        get() = field.capitalize()
        private set(value) {
            field = value.trim()
        }
    var soyadi = _soyadi
        get() = field.toUpperCase()
        private set(value) {
            field = value.trim()
        }
    // Int gibi basit ref. tipleri geçerli değil
    // var olarak tanımlanmalı
    lateinit var adiSoyadi:String

    init {
        require(uyruk.length==2, {"Uyruk iki harfli olmalıdır"})
        require(adi.isNotBlank(), {"Kisinin bir adi olmalidir"})
        require(soyadi.isNotBlank(), {"Kisinin bir soyadi olmalidir"})
    }
    constructor(adi: String, soyadi: String, kimlikNo: Long) : this(adi, soyadi, kimlikNo, uyruk = "TC")

    fun adiSoyadiSetle() {
        adiSoyadi = adi + " " + soyadi
    }
}
*/

/*
//(11)
class Kisi (_adi:String, _soyadi:String, val kimlikNo:Long, val uyruk:String) {
    var adi = _adi
        get() = field.capitalize()
        private set(value) {
            field = value.trim()
        }
    var soyadi = _soyadi
        get() = field.toUpperCase()
        private set(value) {
            field = value.trim()
        }
    //ilk deger ataması (bu alana erişildiği zaman işlemi daha sonradan gerçekleştiriyor)
    val adiSoyadi by lazy { adiSoyadiSetle() }

    init {
        require(uyruk.length==2, {"Uyruk iki harfli olmalıdır"})
        require(adi.isNotBlank(), {"Kisinin bir adi olmalidir"})
        require(soyadi.isNotBlank(), {"Kisinin bir adi olmalidir"})
    }
   constructor(adi: String, soyadi: String, kimlikNo: Long) : this(adi, soyadi, kimlikNo, uyruk = "TC")

    private fun adiSoyadiSetle() = adi + " " + soyadi
}
*/

// nesne oluşturmaya gerek yoksa (sabit tanımlası)
//static
object Pi {
    val PI = 22.0/7.0
    fun piGoster(p:String) = p.format(PI)
}

object Muhendis{
    val BOLUM:String = "Bilgisayar Muhendisligi"
}

/*
//(12)
//Miras
open class Kisi(_adi:String, _soyadi:String, val kimlikNo:Long, val uyruk:String) {
    var adi = _adi
        get() = field.capitalize()
        private set(value) {
            field = value.trim()
        }
    var soyadi = _soyadi
        get() = field.toUpperCase()
        private set(value) {
            field = value.trim()
        }
    //ilk deger ataması (bu alana erişildiği zaman işlemi daha sonradan gerçekleştiriyor)
    val adiSoyadi by lazy { adiSoyadiSetle() }

    init {
        require(uyruk.length==2, {"Uyruk iki harfli olmalıdır"})
        require(adi.isNotBlank(), {"Kisinin bir adi olmalidir"})
        require(soyadi.isNotBlank(), {"Kisinin bir adi olmalidir"})
    }
    constructor(adi: String, soyadi: String, kimlikNo: Long) : this(adi, soyadi, kimlikNo, uyruk = "TC")
    private fun adiSoyadiSetle() = adi + " " + soyadi
}

*/
/*
class Ogrenci(adi:String, soyadi:String, kimlikNo:Long, uyruk:String, var ogrenciNo: Long)
    :Kisi(adi, soyadi, kimlikNo, uyruk) {
    constructor(adi: String, soyadi: String, kimlikNo: Long, ogrenciNo: Long)
            : this(adi, soyadi, kimlikNo, "TC", ogrenciNo)

    val BOLUM:String = Muhendis.BOLUM
}
*/

//(13) Arayüz ve soyut sınıf
interface Hesapla{
    fun harfNotuHesapla(rakamNotu:Int):String
    // fun devamsizlikHesapla(devamsizlik:Int):String
}

/*
//(13)
//Miras, arayüz
open class Kisi(_adi:String, _soyadi:String, private val kimlikNo:Long, val uyruk:String) {
    var adi = _adi
        get() = field.capitalize()
        private set(value) {
            field = value.trim()
        }
    var soyadi = _soyadi
        get() = field.toUpperCase()
        private set(value) {
            field = value.trim()
        }
    val adiSoyadi by lazy { adiSoyadiSetle() }

    init {
        require(uyruk.length==2, {"Uyruk iki harfli olmalıdır"})
        require(adi.isNotBlank(), {"Kisinin bir adi olmalidir"})
        require(soyadi.isNotBlank(), {"Kisinin bir adi olmalidir"})
    }
    constructor(adi: String, soyadi: String, kimlikNo: Long) : this(adi, soyadi, kimlikNo, uyruk = "TC")

    private fun adiSoyadiSetle() = adi + " " + soyadi

    override fun equals(diger: Any?): Boolean { return  adi == (diger as Kisi).adi
            && soyadi == (diger as Kisi).soyadi
            && kimlikNo == (diger as Kisi).kimlikNo
            && uyruk == (diger as Kisi).uyruk
    }
}

class Ogrenci(adi:String, soyadi:String, kimlikNo:Long, uyruk:String, var ogrenciNo: Long)
    :Kisi(adi, soyadi, kimlikNo, uyruk), Hesapla {
    constructor(adi: String, soyadi: String, kimlikNo: Long, ogrenciNo:Long)
            : this(adi, soyadi, kimlikNo, "TC", ogrenciNo)

    override fun harfNotuHesapla(rakamNotu: Int) = when (rakamNotu) {
            in 90..100 -> "AA"
            in 80..89 -> "BA"
            in 70..79 -> "BB"
            in 60..69 -> "CB"
            in 50..59 -> "CC"
            in 40..49 -> "DC"
            in 30..39 -> "DD"
            in 20..29 -> "FD"
            in 0..19 -> "FF"
            else -> "Harf Notununda bir sorun var"
        }
    //arkadas
    companion object {
        val BOLUM: String = "Bilgisayar Muhendisligi"
    }

    val BOLUM = Ogrenci.BOLUM
}
*/


//(14)

class Kisi(val adi:String, val soyadi:String, val kimlikNo:Long, val uyruk:String) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Kisi

        if (adi != other.adi) return false
        if (soyadi != other.soyadi) return false
        if (kimlikNo != other.kimlikNo) return false
        if (uyruk != other.uyruk) return false

        return true
    }

    override fun hashCode(): Int {
        var result = adi.hashCode()
        result = 31 * result + soyadi.hashCode()
        //taşma
        result = 31 * result + kimlikNo.hashCode()
        result = 31 * result + uyruk.hashCode()
        return result
    }

    override fun toString(): String {
        return "Kisi(adi='$adi', soyadi='$soyadi', kimlikNo=$kimlikNo, uyruk='$uyruk')"
    }

    fun copy() = Kisi(adi, soyadi, kimlikNo, uyruk)
}
 

//data class Kisi(val adi:String, val soyadi:String, val kimlikNo:Long, val uyruk:String)


//(15)
enum class Cinsiyet {
    ERKEK, KIZ
}

//data class Kisi(val adi:String, val soyadi:String, val kimlikNo:Long, val uyruk:String, val cinsiyet:Cinsiyet)


//(16) Uzantı (extension)
fun String.buyukHarf() = toUpperCase() //fonksiyon
val String.uzunluk get() = length //field

//(17) özyinelemeli (recursive)

/*
fun faktoriyel(n:Int):Int {
    return if(n==0) 1 else n * faktoriyel(n-1)
}
*/

//optimizasyon işlemi (klasik yaklaşıma dönüştürme)
tailrec fun faktoriyel(n:Int): Int {
    return if(n==0) 1 else n * faktoriyel(n-1)
}

/*
fun faktoriyel(n:Int): Int {
    var i = 1
    if(n == 0) return 1;
    var gecici = n
    while(i < n) gecici *= i++
    return gecici
}
*/

//(18) Aşırı yükleme(overloading) *
operator fun String.times(i:Int) =
        (1..i).map {this}.joinToString("")

//(19) Genel(generic)
class GenelSinif<T>(private val deger: T) {
    fun degerAl(): T {
        return deger
    }
}

class GenelSinifOut<out T>(private val deger: T) {
    fun degerAl(): T {
        return deger
    }
}

class GenelSinifIn<in T> (){
    fun toString(deger:T) = deger.toString()
}

class Genel<TA, TB>(val p1: TA, val p2: TB?) {
    constructor(p1:TA) : this(p1, null)
    init {
        var x:TA = p1
    }
    fun fonksiyon() : TB? = p2
}

//(20) arguman listesi
fun <T> Liste(vararg ts: T): List<T> {
    val sonuc = ArrayList<T>()
    (ts.indices).forEach{
        sonuc.add(ts[it])
    }
    return sonuc
}

interface Karsilastir<in T> {
    fun karsilastir(birinci: T, ikinci: T): Int
}

fun ilaveler() {

    //(21) out anahtar kelimesi
    val doubleListe: List<Double> = listOf(1.0, 2.0)
    val sayiListe: List<Number> = doubleListe
    println(sayiListe)

    //(22) isimsiz sınıf
    val sayikarsilastir = object: Karsilastir<Number> {
        override fun karsilastir(birinci: Number, ikinci: Number): Int {
            return birinci.toInt() - ikinci.toInt()
        }
    }
    println(sayikarsilastir.karsilastir(21,2))

    val genel:Genel<Int,Int> = Genel(3)
    println(genel.fonksiyon())

    val liste = Liste(1.0,2.0,3.0)
    println(liste)

    println(Cinsiyet.ERKEK)
    println(Cinsiyet.valueOf("ERKEK"))

    //(23) zip
    val ogrenciAdi = listOf("Ali", "Ayse", "Hasan")
    val ogrenciNotu = listOf(66, 79, 89)
    val ogrenciAdiVeNotu = ogrenciAdi zip ogrenciNotu
    ogrenciAdiVeNotu.forEach {  println(it) }

    //pair
    val ogrenciAdiNotu = Pair("Ali", 66)
    println(ogrenciAdiNotu)

    //(24) triple
    val ogrenciAdiSoyadiNotu = Triple("Ali", "CAN", 66)
    println(ogrenciAdiSoyadiNotu)
}