package Constructor_Youtube;

public class Ogrenci {
    public int id;
    public String name;
    public String surName;
    public Ogrenci(){
        System.out.println("test");
    }
    public Ogrenci(int id){
        System.out.println("testTest");
    }
    public Ogrenci(int id, String name){
        System.out.println("testTestTest");
    }
    //bir consta hem parametreli hem parametresiz cons varsa bu method overloading dir asiri yuklenme
    public Ogrenci(int id, String name, String surName){
        //this kelimesi burda olur
        this.id = id;
        this.name = name;
        this.surName = surName;



    }
}
