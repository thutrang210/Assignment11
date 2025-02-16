package Exercise2;

import java.util.Date;

public class Processor {

    public static void main(String[] args) {
        AnimalList animalList = new AnimalList();

        Dog dog1 = new Dog("D001", "Breeder", new Date(118, 5, 15), "Brown", "Labrador");  // June 15, 2018
        Cat cat1 = new Cat("C001", "Rescue", new Date(119, 8, 25), "Black");  // September 25, 2019

        if (dog1 instanceof Dog) {
            System.out.println("Adding Dog to the list...");
            animalList.addAnimal(dog1);
        }

        if (cat1 instanceof Cat) {
            System.out.println("Adding Cat to the list...");
            animalList.addAnimal(cat1);
        }

        animalList.displayAll();
    }

}
