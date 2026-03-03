package OOPs_Chapter_3.Child_Parent;

public class ChildClass extends ParentClass {
    int age;
    String degree;

    public ChildClass(){
        this.age = 22;
        this.degree = "B-Tech";
    }

    public ChildClass(int noOfProperties, int noOfCars, boolean humanTraits, int age, String degree) {
        super(noOfProperties, noOfCars, humanTraits);
        this.age = age;
        this.degree = degree;
    }

    @Override
    public void myCar() {
        System.out.println("This car belong to child class");
    }

    public void myDegree(){
        System.out.println("This is my degree: " + this.degree);
    }
}