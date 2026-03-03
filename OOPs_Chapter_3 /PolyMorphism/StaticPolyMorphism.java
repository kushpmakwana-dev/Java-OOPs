package OOPs_Chapter_3.PolyMorphism;

public class StaticPolyMorphism {
    public static void main(String[] args) {
        sayHello();
        sayHello('s');
        sayHello("Sanika");
    }

    public static void sayHello(){
        System.out.println("Hello from first");
    }

    public static void sayHello(String name){
        System.out.println("Hello from second to " + name);
    }

    public static void sayHello(char c){
        System.out.println("Hello from third to " + c);
    }
}
