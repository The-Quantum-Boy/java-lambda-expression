package sumit.Function;

import java.util.function.Function;

public class Demo1 {
    public static void main(String[] args) {

        // Function two args - 1. Type of parameter 2. type of return value

        Function<Integer,Integer> f=n->n*n;

        System.out.println(f.apply(3));
        System.out.println(f.apply(12));
        System.out.println(f.apply(15));

        //string length

        Function<String,Integer> fn=s -> s.length();
        System.out.println(fn.apply("sumit"));
        System.out.println(fn.apply("this is called sre"));
    }
}
