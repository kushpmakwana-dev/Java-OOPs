package OOPs_Chapter_3;

import OOPs_Chapter_3.Child_Parent.ChildClass;
import OOPs_Chapter_3.Child_Parent.GrandChildClass;
import OOPs_Chapter_3.Child_Parent.ParentClass;

public class Main {
    public static void main(String[] args) {
        ChildClass a = new ChildClass();
        a.myCar();

        ParentClass b = new ChildClass();
        b.myCar();

        ChildClass d = new ChildClass();
        d.myDegree();

        ChildClass e = new GrandChildClass(2, 3, true, 45, "MA");
        e.myDegree();


        ChildClass c = new ChildClass(5, 2, true, 10, "Btech");
        c.myCar();
    }
}
