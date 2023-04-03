package OOP_Polymorphism_Overriding_WiseQuarter;

public class BChild extends AParent {
    public void method1() {
        System.out.println("child class method1");
    }
    public void method2(int a) {
        /*
        overriding olabilmesi icin hem method ismi hemde
        method signature ayni olmasi lazim
        Ayni isimde iki method olabilir ama signaturelari farkli
        olmali
         */
        System.out.println("parent class method2");
    }
    public void method2(String isim){
        System.out.println("Child class String parametreli method");
    }

    @Override
    public void method3() {
        //super.method3(); overriding varsa parent ve child class daki
        //overriden ve overriding metotlardan sadece biri calisir.
        //eger ikisini birden calistirmak isterseniz super.method yazilir
        /*
        Overriding method @Override notasyonu ile isaretlenebilir.
        @Override kullanilmayan overriding isleminde parent class daki
        overridden method silinirse hic bir sorun olmaz
        Ancak  @Override kullanilan overriding isleminde parent class daki
        overridden method silinirse JAVA CTE verir, boylece overriden methodun
        silinmesi engellenir. Ya da silinip veya signature degistirilirse hemen hata verir
         */
    }
}

