package src;

//lambda is based on functional interface
//It is anonymous function , it provide inline functionality
public class LabmdaFunction {

    public static void main(String[] args) {
        FunctionalInterfaceLambda lam = (a, b) -> {
            return a + b;
        };

       System.out.println( lam.add(12, 21));

        //we can send lambda with the help of obj

          result(22,43,(a,b)->(a*b));
    }


    public static void result(int a, int b, FunctionalInterfaceLambda lam) {
        System.out.println(lam.add(a,b));
    }
}

interface FunctionalInterfaceLambda{
    int add(int a, int b);
}