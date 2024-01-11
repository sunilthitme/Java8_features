package src;


//Those interface having only one abstract method then these interface called functional interface
//functional interface having one static and default method
public interface FunctionalInterface {

    void add();

    static void hello(){
        System.out.println("Hello static");
    }

    default void hellod(){
        System.out.println("Hello Default");
    }
}

 class MainClass{
    public static void main(String[]args){

        FunctionalInterface func=new FunctionalInterface() {
            @Override
            public void add() {
                int a=12;
                int b=21;
                System.out.println(a+b);
            }
        };
    }
}
