package sumit.Predicates;

import java.util.function.Predicate;

public class Demo1 {
    public static void main(String[] args) {

//        Predicate -> used to check certain condition
        //Predicate take the argument as type -> and return boolean value
        //ex1
        Predicate<Integer> p=i->(i>10);
        System.out.println( p.test(9));

        //ex2 check the length of given string is greater than 4 or not

        Predicate<String> pr=s->(s.length()>4);
        System.out.println(pr.test("sumit"));
        System.out.println(pr.test("dog"));

        //ex3 print array elements whose size is > 4 from array

        String names[] ={"David","Scott","smith","John","Mary"};

        //multiple condition
        for (String name:names){
            if(pr.test(name)){
                System.out.println(name);
            }
        }
        System.out.println( );

    }
}
