package lesson5;

public final class God {

    static void staticMethod(){
        System.out.println("Create some human!");
        God god = new God();
        god.nonStaticMethod();
    }

    void nonStaticMethod(){
        System.out.println("non-static method");
        God.staticMethod();
    }

    abstract class Power {
        void show(){
            System.out.println("show power");
        }
//        static void make(){
//            System.out.println("make something");
//        }
    }

    class SuperPower extends Power {

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("God is dead!");
    }
}
