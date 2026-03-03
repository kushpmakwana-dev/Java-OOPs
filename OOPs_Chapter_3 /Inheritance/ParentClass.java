package OOPs_Chapter_3.Child_Parent;

public class ParentClass {
    int noOfProperties;
    int noOfCars;
    boolean humanTraits;

    public ParentClass() {
        this.noOfProperties = 5;
        this.noOfCars = 2;
        this.humanTraits = true;
    }

    public ParentClass(int noOfProperties, int noOfCars, boolean humanTraits) {
        this.noOfProperties = noOfProperties;
        this.noOfCars = noOfCars;
        this.humanTraits = humanTraits;
    }

    public void myCar(){
        System.out.println("This car belongs to parent class");
    }
}
