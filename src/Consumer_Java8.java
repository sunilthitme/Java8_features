package src;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

//It is get values but could't return anything
//accept method use
public class Consumer_Java8 {
    public static void main(String[] args) {
        //Consumer get single value but could't return anything
        Consumer<String> c = x -> System.out.println(x.length());
        c.accept("Sunil");

        //BiConsumer get two value but could't return anything
        //it is use in map key and value pair
        BiConsumer<Integer, Integer> display = (a, b) -> System.out.println(a + b);
        display.accept(1, 2);
    }
}