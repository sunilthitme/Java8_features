package src;

import java.util.function.BiFunction;
import java.util.function.Function;

//It return a generic type value
//means it return any type of value at runtime
//it is same like predicate

public class FunctionJava_8 {
    //it get one parameter
    public static void main(String[] args) {


    Function<Integer, Boolean> func = (a) -> a > 50;

    System.out.println(func.apply(105));

        BiFunction<Integer, Integer, Boolean>func2=(a,b)->a>b;
        func2.apply(12,22);
    }
}


