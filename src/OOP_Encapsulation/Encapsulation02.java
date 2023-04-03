package OOP_Encapsulation;

public class Encapsulation02 {
    public static void main(String[] args) {
        Encapsulation01 ogretmen1=new Encapsulation01();
        //ogretmen1.okulIsmiIsmi
        //ogretmen1.oogretmenUcreti
        ogretmen1.setOgretmenIsmi("Yizdiz");
        ogretmen1.setOgretmenAdresi("Ankara");
        //ogretmen1.getOkulIsmi()="Uzay"; degisiklik yapamiyoruz
        System.out.println(ogretmen1.getOkulIsmi());//ama consol da yazdirip okuyabiliyoruz.
        /*
        BU nedenle get bize degistirme izni vermez ama yazdirma izni verir
         */
        ogretmen1.setOgretmenUcreti(500);//burada sadece atama yapabiliriz yazdiramazyiz
        /*
        sonuc olarak set de atama yapilir ama yazdirma yapmaz.
         */
        //developperlar bazen getter setter metodunu kullanarak kullanicinin
        //islevi anlamasi saglanir.

    }
}
