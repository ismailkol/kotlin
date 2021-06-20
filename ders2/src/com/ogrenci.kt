package com

class ogrenci {

    //değişebilir alan(özellik)
    //field(Property)
    var adi="ali"
        get() = field.capitalize()
      private  set(value) {
            field=value
        }


    public fun setleme(deger1:String){
        adi=deger1
    }
    val rakamNotu
        get()=(0..100).shuffled().first()





    /*
    * set(deger){
    * field=deger
    * }
    * */

    //Sınıf fonksiyonu
    //Fonksiyon(method)

   public fun harNotuHesaplama()=
            when(rakamNotu){
                in 90..100->"AA"
                in 80..89->"BA"
                in 70..79->"BB"
                in 60..69->"CB"
                in 50..59->"CC"
                in 40..49->"DC"
                in 30..39->"DD"
                in 20..29->"FD"
                in 0..19->"FF"
                else->"Harf notunda sıkıntı var"
            }


}