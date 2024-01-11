package src;

import java.util.function.BinaryOperator;

//get two parameter but ype must be same and return type also
public class Binary_Operator_java8 {
    public static void main(String[] args) {

        BinaryOperator<String> bn=(x,y)->x+y;
        System.out.println(bn.apply("sunil","dada"));
    }
}
