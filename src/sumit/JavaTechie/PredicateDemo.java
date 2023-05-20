package sumit.JavaTechie;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> num=(i -> i%2==0 );
        System.out.println(num.test(3));

        List<Integer> list1= Arrays.asList(1,2,3,4,5);
        list1.stream().filter(i->i%2==0).forEach(integer -> System.out.println("printing "+integer));

    }
}
