package OOPs_Chapter_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car(EngineType.PETROL, 20000, 4);
        Car maruti = new Car(EngineType.DIESEL, 400000, 7);
        Car tesla = new Car(EngineType.ELECTRIC, 500000, 5);

        Human[] humans = new Human[5];
        System.out.println("Trying to access without *new* keywords");
        System.out.println(Arrays.toString(humans)); // it shows all null
        System.out.println("Trying to access without values in objects");
        Human mary = new Human(); // Now lets try without initialising any value of object
        humans[0] = mary;
        System.out.println("This is trying to access with values");
        Human alice = new Human("Alice Lay", 21, 60, 78); // lets initialised values for same object
        humans[1] = alice;
        System.out.println(Arrays.toString(humans));

        Human kush = new Human("Kush Makwana", 22,  5.89f, 70.0f);
        System.out.println("Before Dot Operators: ");
        System.out.println(kush);
        // Object was modified using DOT OPERATOR
        kush.name = "Kush Pradeep Makwana";
        kush.age = 21;
        System.out.println("After Dot Operators: ");
        System.out.println(kush);

        Student alex = new Student(); // not setting anything for Alex
        Student meera = new Student();
        meera.name = "Meera";
        meera.rollNumber = 10;

        System.out.println(alex.toString());
        System.out.println(meera.toString());

        Student newRandom = new Student("Kunal");
        System.out.println(newRandom.toString());

    }
}
