package sumit.Predicates;

//joining Predicate - and ,or, negate

// p1 -> check number is even
// p2 -> checks greater than 50

import java.util.function.Predicate;

public class Demo3 {

    public static void main(String[] args) {
        int[] arr={5,23,34,12,15,66,77,5,4,43,22,88,45};

        Predicate<Integer> p1 = i->(i%2 == 0);
        Predicate<Integer> p2 = i->(i>50);


        //and
        System.out.println("follwing are number even and greater than 50..");
        for (Integer item:arr){
//            if (p1.test(item) && p2.test(item)) {
//                System.out.println(item);
//            }

            //p1.test(item) && p2.test(item) -> p1.and(p2).test(item)
            if (p1.and(p2).test(item)) {
                System.out.println(item);
            }
        }

        //or
        System.out.println("this is example of or....");
        for (Integer item:arr){

            //p1.test(item) || p2.test(item) -> p1.and(p2).test(item)
            if (p1.or(p2).test(item)) {
                System.out.println(item);
            }
        }

        //negate
        System.out.println("this is negate example...");
        for (Integer item:arr){

            if (p1.negate().test(item)) {
                System.out.println(item);
            }
        }

    }
}
