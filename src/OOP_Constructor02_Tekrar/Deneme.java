package OOP_Constructor02_Tekrar;

public class Deneme {
    String isim="John Doe";
    int yas=40;

    public Deneme(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }

    public static void main(String[] args) {
        Deneme obj=new Deneme("Fatih", 35 );
        System.out.println("isim : "+ obj.isim);
        System.out.println("yas : "+ obj.yas);
    }
}

