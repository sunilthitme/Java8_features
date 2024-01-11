package src;

import java.util.function.Supplier;

//only return values it does not have a parameter
public class Supplier_Java8 {
    public static void main(String[] args) {

        Supplier<String> sup=()->"Not Found";
        System.out.println(sup.get());
    }
}
