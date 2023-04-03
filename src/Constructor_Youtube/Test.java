package Constructor_Youtube;

public class Test {
    public static void main(String[] args) {
        /*
        Bir sinif var. Biz bir sinifin icindeki degiskenlere
        erisebilmek icin o classtan nesne turetmeliyiz
         */
        Ogrenci ogrenci1= new Ogrenci(10, "Ahmet", "Semiz" );
        Ogrenci ogrenci2=new Ogrenci();



//        ogrenci1.id=5;
//        ogrenci1.name="Saim";
//        ogrenci1.surName="Semiz";

        System.out.println("Ogrenci bilgileri");
        System.out.println("Ogrenci ID: " +ogrenci1.id);
        System.out.println("Name : " +ogrenci1.name);
        System.out.println("SurName : " +ogrenci1.surName);

    }
}
