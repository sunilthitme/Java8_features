package src;

import java.util.function.UnaryOperator;

//return type and parameter type must me same and get single parameter
public class UnaryOperator_java8 {
    public static void main(String[] args) {
        UnaryOperator<String> u = x->x+" "+"Hello";
        System.out.println(u.apply("Sunil"));
    }
}
