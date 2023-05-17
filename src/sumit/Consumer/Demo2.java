package sumit.Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String name;
    int salary;
    String gender;

    public Employee(String name, int salary, String gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }
}

public class Demo2 {

    public static void main(String[] args) {

        ArrayList<Employee> empList=new ArrayList<>();
        empList.add(new Employee("Davic",50000,"Male"));
        empList.add(new Employee("sumit",30000,"Male"));
        empList.add(new Employee("amit",20000,"Male"));
        empList.add(new Employee("Durga",60000,"FeMale"));
        empList.add(new Employee("santosh",80000,"Male"));

        //function
        Function<Employee,Integer> f=emp->(emp.salary*10/100);

        //predicate
        Predicate<Integer> p=b->(b>5000);

        //consumer-> doesn't process anything
        Consumer<Employee> c=((emp)->{
            System.out.print(emp.name+" ");
            System.out.print(emp.salary+" ");
            System.out.print(emp.gender+" ");
            System.out.println();
        });

        for (Employee e:empList){
            int bonus=f.apply(e);
            if(p.test(bonus)){
                c.accept(e);
                System.out.println("bonus -> "+bonus);
            }
        }

    }
}
