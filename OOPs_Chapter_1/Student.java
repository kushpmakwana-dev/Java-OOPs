package OOPs_Chapter_1;

public class Student {
    String name = "Student 1";
    int rollNumber = 1;

    public Student() {
    }

    public Student(String name) {
        this(name, 22);
    }

    Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }


    @Override
    public String toString() {
        return "Student{ " +
                "name = '" + name + '\'' +
                ", rollNumber = " + rollNumber +
                "} ";
    }
}
