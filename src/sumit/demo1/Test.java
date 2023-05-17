package sumit.demo1;


@FunctionalInterface
interface Cab{
    public void bookCab();
}


//class Ola implements Cab{
//
//    @Override
//    public void bookCab() {
//        System.out.println("Ola cab is booked...");
//    }
//}

public class Test {
    public static void main(String[] args) {
//
//        Ola cab=new Ola();
//        cab.bookCab();

        Cab cab= ()-> System.out.println("Ola cab is booked...");
        cab.bookCab();


    }
}
