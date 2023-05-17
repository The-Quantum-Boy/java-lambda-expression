package sumit.Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String name;
    int salary;

    Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
}

public class Demo2 {
    public static void main(String[] args) {

        ArrayList<Employee> empList=new ArrayList<>();
        empList.add(new Employee("sumit", 30000));
        empList.add(new Employee("amit", 40000));
        empList.add(new Employee("santosh", 60000));
        empList.add(new Employee("chetan", 70000));
        empList.add(new Employee("shubham", 30000));

        Function<Employee,Integer> fn=((e)->{
           int sal=e.salary;

           if(sal>=10000 && sal<=20000)
               return( sal*10/100);
           else if(sal>20000 && sal <=30000)
               return (sal*20/100);
           else if(sal>30000 && sal<=50000)
               return (sal*30/100);
           else
               return (sal*40/100);
        });

        Predicate<Integer> pr=i -> (i>10000);

        for (Employee emp:empList){
           int bonus=fn.apply(emp);
           if (pr.test(bonus)){
               System.out.println(emp.name+" has "+emp.salary+ " with bonus -> "+bonus);
           }
        }
    }

}
