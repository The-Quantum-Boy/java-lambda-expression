package sumit.JavaTechie;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> sup=()->"hwllo";
        sup.get();

        List<String> list1= Arrays.asList("a","b");
        System.out.println(list1.stream().findAny().orElseGet(sup));

    }
}
