package sumit.Predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    String ename;
    int salary;
    int experience;
    Employee(String name,int sal, int exp){
        ename=name;
        salary=sal;
        experience=exp;
    }
}

public class Demo2 {
    public static void main(String[] args) {

        // emp obj-> return name if sal>50k exp>3

        //ex1
        Employee emp1=new Employee("sumit",20000,2);

        Predicate<Employee> pr=(employee -> employee.salary> 30000 && employee.experience>3);

        System.out.println(pr.test(emp1));

        //ex2 multiple obj

        ArrayList<Employee> al=new ArrayList<>();

        al.add(new Employee("amit",30000,2));
        al.add(new Employee("jhon",50000,4));
        al.add(new Employee("davud",40000,3));
        al.add(new Employee("ranu",50000,6));
        al.add(new Employee("kaka",10000,2));
        al.add(new Employee("mama",70000,1));

        for (Employee emp:al){
            //used lambada for multiple condition
            if(pr.test(emp)){
                System.out.println(emp.ename+" is correct for this position for salary RS. "+emp.salary);
            }
        }

    }
}
