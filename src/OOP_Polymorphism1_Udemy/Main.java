package OOP_Polymorphism1_Udemy;

class Hayvan {
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus() {
        return "Hayvan konusuyor";

    }


}
class Kedi extends Hayvan {
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Miyavliyor...";
    }
}
class Kopek extends Hayvan {
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Havliyor...";
    }
}
class At extends Hayvan {
    public At(String isim) {
        super(isim);
    }
    @Override
    public String konus() {
        return this.getIsim() + " Kisniyor...";
    }
}
public class Main {
    public static void main(String[] args) {
       Hayvan hayvan1 = new Kopek("Karabas");


       Hayvan hayvan2 = new Kedi("Tekir");
       Hayvan hayvan3 = new At("UcanAt");
       System.out.println(hayvan1.konus()+"\n"+
                          hayvan2.konus()+"\n"+
                          hayvan3.konus());


        }
    }

