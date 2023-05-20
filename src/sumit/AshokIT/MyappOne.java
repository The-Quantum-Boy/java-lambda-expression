package sumit.AshokIT;

interface MyInterfaceOne{
    public void m1();
}

public class MyappOne implements MyInterfaceOne{

    @Override
    public void m1() {
        System.out.println("m1 method is called");
    }

    public static void main(String[] args) {
        MyappOne m=new MyappOne();
        m.m1();
    }
}
