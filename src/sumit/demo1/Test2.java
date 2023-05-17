package sumit.demo1;


interface Cab2{
    public void bookCab(String source,String destination);
}

interface Cab3{
    public  String bookCab(String source,String destination);
}



class Ola2 implements Cab2{

    @Override
    public void bookCab(String source, String destination) {
        System.out.println("Ola cab is booked form "+source+" to "+destination);
    }
}

class Ola3 implements Cab3{

    @Override
    public String bookCab(String source, String destination) {
                System.out.println("Ola cab is booked form "+source+" to "+destination);
        return ("Price : 5000 RS");
    }
}

public class Test2 {
    public static void main(String[] args) {

//        Ola cab=new Ola();
//        cab.bookCab("amt","pune");

//        Cab2 cab=(source,destination)-> System.out.println("Ola cab is booked form "+source+" to "+destination);
//        cab.bookCab("amt","nagpur");
//
//        Ola3 cab3 =new Ola3();
//
//        String res=cab3.bookCab("nagpur","amravati");
//        System.out.println(res);

        Cab3 cab3=((source, destination) -> {
            System.out.println("Ola cab is booked form "+source+" to "+destination);
            return "price : 10000 Rs";
        });

       String res= cab3.bookCab("pune","bangolore");

        System.out.println(res);

    }
}
