package src;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

//It is predefine function
//it is use for bollean operation
//it is use for filter a values
//the test method in predicate
public class Prdicate {
    public static void main(String[] args){
        Predicate<Integer> testPredicate=(i)->{
            if(i==20){
                return true;
            }
            return false;
        };
        System.out.println(testPredicate.test(21));
    }

    //It is similar as predicate but it get two parameter
class BiPrdicate{

        public static void main(String args[]){
            BiPredicate<Integer,Integer>p=(x, y)->{
                if(x>y){
                    return true;
                }
                return false;
            };
            System.out.println(p.test(21,22));
        }

}
}
