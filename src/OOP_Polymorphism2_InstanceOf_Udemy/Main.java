package OOP_Polymorphism2_InstanceOf_Udemy;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "Animal speak";
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.getName() + " Cat is meowing...";
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.getName() + " Dog is barking...";
    }
}

class Horse extends Animal {
    public Horse(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.getName() + " Horse isneighing...";
    }
}

public class Main {
    public static void speak(Object object) {
        //System.out.println(object.speak());
        if (object instanceof Dog) {
            Dog dog=(Dog) object;
            System.out.println(dog.speak());
        } else if (object instanceof Cat) {
            Cat cat=(Cat) object;
            System.out.println(cat.speak());
        } else if (object instanceof Horse) {
            Horse horse=(Horse) object;
            System.out.println(horse.speak());
        } else if (object instanceof Animal) {
            Animal animal=(Animal) object;
            System.out.println(animal.speak());
        }
    }



    public static void main(String[] args) {
        //instance of
        //Dog dog =new Dog("Karabas");

        //if (dog instanceof Animal){
        //  System.out.println("This  object is in the class of the dog...");
        Dog dog = new Dog("Karabas");
        Cat cat = new Cat("Tekir");
        Horse horse = new Horse("Mehmet");
        Animal animal = new Animal("asalan");
        speak(dog);
        speak(cat);
        speak(horse);
        speak(animal);
    }

}

