package OOP_Polymorphism_Overriding_WiseQuarter;

public class DChild extends CParent {
    //Overriding Kurallari
    /*
    1. Access modifier meth sign e dahil olmadigindan
    overriden ve overriding acc modif. lar farkli olabilir
    child parenti sinirlandiramaz
    yani overriding methodun acc modif. ayni ya da  daha genis kapsamli olmalidir.
    private--default--protected--public
     */

    protected void method1() {

    }
    /*
    2. Private ve static methodlar override edilemezler.
    ayni isimde method olusturulunca Java CTE vermez
    ancak override isareti cikmaz ve @Override notasyonu kullanilmak istenirse CTE olur.
    Yani Java bunlari farkli classlardaki farkli methodlar olarak kabul eder
     */

    public static void method2() {

    }

    private void method3() {

    }

    /*
    3. return type method signature dahil olmadigindan farkli secilebilirler
    return type void veya primitive ise ayni olmak zorundadir.
    EGER RETURN TYPE LAR non primitive ise Child class daki return type lar parent
    class daki return type ile ayni ya da childi olmalidir.
    OBJECT DOGAL PARENT TIR. BUTUN CLASS LAR NIHAI OLARAK OBJECTIN COCUKLARIDIR.
     */
    public void method4() {

    }

    public String method5() {
        return "";

    }

}

