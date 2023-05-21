package sumit.MethodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        EmployeeService service=new EmployeeService();

        EmployeeManager manager=()->new Employee();
        manager.getEmployee().getEmployeeInfo();

        service.loadEmployeesFromDB()
                .stream()
                .map(Employee::getId)
                .map(ArrayList::new)
                .forEach(System.out::println);

//        EmployeeManager manager1=()->Employee::new;
//        manager.getEmployee().getEmployeeInfo();

        //lambda
//        service.loadEmployeesFromDB()
//                .stream()
//                .forEach(i-> System.out.println(i));
//
//        System.out.println("--------------------------------------");
//
//        //method reference
//        service.loadEmployeesFromDB()
//                .stream()
//                .forEach(MethodReferenceDemo::print);
//
//        System.out.println("--------------------------------------");
//
//        service.loadEmployeesFromDB()
//                .stream()
//                .forEach(System.out::println);

        List<EmployeeDao> list = service.loadEmployeesFromDB().stream()
                .map(EmployeeMapper::convert)
                .collect(Collectors.toList());
        System.out.println(list);


        List<String> list1 = service.loadEmployeesFromDB().stream()
                .map(e -> e.getName()).collect(Collectors.toList());

        List<String> list2 = service.loadEmployeesFromDB().stream()
                .map(Employee::getName).collect(Collectors.toList());


        System.out.println(list2);

    }

    public static  void print(Employee employee){
        System.out.println(employee);
    }

}
