package OOPs_Chapter_3.PolyMorphism;

public class DynamicPolymorphism {
    public static class ParentClass {
        void primaryMethod(){
            System.out.println("I am from Parent class");
        }

        void superParentMethod(){
            System.out.println("I am from super Parent method");
        }
    }

    public static class ChildClass extends ParentClass{
        @Override // Check if method is overriden
        void primaryMethod(){
            System.out.println("I am from Child class");
        }

        void superChildMethod(){
            System.out.println("I am from super Child Method");
        }
    }

    public static class MainClass {
        public static void main(String[] args) {


            ParentClass pc = new ChildClass();
            // This is method overriding
            pc.primaryMethod();

            // This method will first go to ChildClass and it will see if this superParentMethod exist if not then it will go to its parents
            pc.superParentMethod();
        }
    }
}
