package sumit.MethodReference;

public class Test {
    public void m1(){
        System.out.println("m1() instance/non static method");
    }

    public static void m2(){
        System.out.println("m2() static method");
    }

    public static void main(String[] args) {

        Test.m2(); //Test::m2()->static method reference

        Test test=new Test();
        test.m1(); //test::t1()-> instance method reference





    }
}
