package sumit.JavaTechie;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
//        Consumer<Integer> num=(integer -> System.out.println("printing "+integer));
//        num.accept(12);

        List<Integer> list1= Arrays.asList(1,2,3,4,5);
        list1.forEach(integer -> System.out.println("printing "+integer));

    }
}
