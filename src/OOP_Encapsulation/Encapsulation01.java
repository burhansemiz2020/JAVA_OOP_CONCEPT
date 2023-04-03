package OOP_Encapsulation;

public class Encapsulation01 {
    /*
    TEMEL MANTIK:
    oncelikle private yapilacak
    ardindan benim iznim olana kadar
    kimse verileri okuyamaz yazamaz
    sartini bilmek gerekir.
    tum yetkiler ilk asamada iptal edilir
     */
    private String okulIsmi="Yildiz Ilkokulu";
    //okul ismi gorulsun ama degisitirilemesin

    public String getOkulIsmi() {
        return okulIsmi;
    }

    private int ogretmenUcreti;
    //okul ucreti gorulemesin


    public void setOgretmenUcreti(int ogretmenUcreti) {
        this.ogretmenUcreti = ogretmenUcreti;
    }

    public void setOkulIsmi(String okulIsmi) {
        this.okulIsmi = okulIsmi;
    }

    public int getOgretmenUcreti() {
        return ogretmenUcreti;
    }

    public String getOgretmenIsmi() {
        return ogretmenIsmi;
    }

    public void setOgretmenIsmi(String ogretmenIsmi) {
        this.ogretmenIsmi = ogretmenIsmi;
    }

    public String getOgretmenAdresi() {
        return ogretmenAdresi;
    }

    public void setOgretmenAdresi(String ogretmenAdresi) {
        this.ogretmenAdresi = ogretmenAdresi;
    }

    private String ogretmenIsmi;
    private String ogretmenAdresi;
    //bu instance variable herkes ulasabilsin
    //bu durumda public yapmak ilk cozum
    /*
    bu variable lari public yapmak yerine getter setter yapabiliriz
    islevli hale gelmis olur
     */




    }


