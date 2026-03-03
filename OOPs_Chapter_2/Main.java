package OOPs_Chapter_2;

public class Main {
    public static void main(String[] args) {
        // population = 0
        System.out.println(Human.population);

        //population = 1 incremented
        Human humanOne = new Human(21, "Jiya A", 20000, true);

        //population = 2 incremented
        Human humanTwo = new Human(22, "Amruta Leimis", 1_00_000, false);

        //population = 3 incremented
        Human humanThree = new Human(34, "Sneha", 122000, true);

        System.out.println(Human.population); // it showed what ofc 3
        System.out.println(Human.population); // it showed 3
        System.out.println(Human.population); // it showed 3

        int ansAdd = Student.sum(12, 14); // can access it because this method is declared as static inside OOPs_Chapter_2.Student class
        System.out.println(ansAdd);

        Student student1 = new Student();
        System.out.println(student1.multiplication(12, 13)); // can access it because this method is declared as static inside OOPs_Chapter_2.Student class

        Main funn = new Main();
        funn.fun();

        // SingleTon starts over here
        SingleTon obj1 = SingleTon.getInstance();
        SingleTon obj2 = SingleTon.getInstance();
        SingleTon obj3 = SingleTon.getInstance();
    }

    void fun() {
        System.out.println("This is fun");
        greeting();
    }

    void greeting(){
        System.out.println("This is greet");
    }

}
