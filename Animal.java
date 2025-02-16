package Exercise2;

import java.util.Date;

public class Animal {

    String id;
    String source;
    Date dateOfBirth;
    String color;

    public Animal(String id, String source, Date dateOfBirth, String color) {
        this.id = id;
        this.source = source;
        this.dateOfBirth = dateOfBirth;
        this.color = color;
    }

    public void makeSound() {
        System.out.println("Animal makes sound");
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Source: " + source);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Color: " + color);
    }
}
