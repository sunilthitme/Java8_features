package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//Deal with collection
//it chain methods in a single line to produce desired output
public class StreamApi_java8 {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4);
        Optional<Integer> get=lst.stream().filter((a)->a>3).findFirst();
        System.out.println(get);

        lst.stream().filter((a)->a==3).map((a)->a*2).forEach((b)->System.out.println(b));
    }
}
