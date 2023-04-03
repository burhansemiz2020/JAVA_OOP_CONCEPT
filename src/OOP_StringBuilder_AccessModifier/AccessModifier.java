package OOP_StringBuilder_AccessModifier;

public class AccessModifier {

        /*
        Buyuk bir projede calistiginizda class’lara ve datalara erisim yetkisi saglamak onemli
olacaktir. Java OOP konsepte gercek hayattaki ihtiyaclarimizi kod dunyasina uyarlamistir.
Access Modifiers (erisim belirleyici) bir class uyesinin scope’unu yani nerelerden
erisilebilecegini belirler.
Bir class uyesini olustururken, bu class uyesine nerelerden erisilebilecegini ve
kullanilabilecegini belirleyen access modifier kullanmak zorundayiz.
Simdiye kadar buna dikkat etmemistik, cunku Java access modifier yazilmasa da
default access modifier tanimlar ve kodun calismasini saglar.
Java’da 4 access modifier vardir.
1- Private
2- Default
3- Protected
4- Public
NOT- Class’lar public veya default olmak zorundadir, private veya protected olamazlar.

1- Private : Private olarak belirlenen class uyelerini sadece icinde oldugu class’dan
kullanabilirsiniz.

2- Default : Default olarak belirlenen class uyelerini sadece icinde oldugunuz
package’dan kullanabilirsiniz.

3- Protected : Protected olarak belirlenen class uyelerini icinde oldugunuz
package’dan ve baska class’lardaki child class’lardan kullanabilirsiniz.

4- Public : Public olarak belirlenen class uyelerini icinde oldugunuz projedeki tum
class’lardan kullanabilirsiniz. Hic bir sinirlama (restiriction) icermez.
         */
        String isim="Ali";//burda access modifier gorunmedigi icin default access modifier gecerlidir
        //default int sayi=10; bu sekilde yazilamaz CTE verir.
        //
private static int sayi = 10;

        public static void main(String[] args) {
                System.out.println(sayi);
                sayi=20;//private variable lara baska class tan ulasilamaz
                /*
                private en dar

                 */
        }
}
