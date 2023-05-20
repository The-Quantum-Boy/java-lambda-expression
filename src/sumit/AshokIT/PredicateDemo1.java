package sumit.AshokIT;

import java.util.function.Predicate;

public class PredicateDemo1 {

    public boolean test(int i){
        if(i>10){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        String[] names={"Sumit","Ankit","shakti","ganga","manoj","Aatik"};

        Predicate<String> res=(name)->name.charAt(0)=='A';

        for (String name:names){
            if (res.test(name)){
                System.out.println(name);
            }
        }

        Predicate<Integer> a= i->i>10;
        System.out.println(a.test(6));
    }
}
