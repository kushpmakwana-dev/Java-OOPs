package OOPs_Chapter_1;

import java.util.Date;

public class Human {
    String name;
    int age;
    float heightCM;
    float weightKG;

    public Human() {
    }

    public Human(String name, int age, float heightCM, float weightKG) {
        this.name = name;
        this.age = age;
        this.heightCM = heightCM;
        this.weightKG = weightKG;
    }

    @Override
    public String toString() {
        return "Human {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", heightCM=" + heightCM +
                ", weightKG=" + weightKG +
                "} ";
    }
}
