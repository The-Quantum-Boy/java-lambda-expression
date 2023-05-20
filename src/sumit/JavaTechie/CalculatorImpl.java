package sumit.JavaTechie;

interface Calculator{
//    void switchOn();
//    void sum(int i);

    void sum(int i,int j);
}
public class CalculatorImpl {
    public static void main(String[] args) {
//        Calculator cal=()-> System.out.println("switch on");
//        cal.switchOn();

        Calculator sum=(i,j)-> System.out.println("sum -> "+(i+j));

        sum.sum(10,30);
    }
}
