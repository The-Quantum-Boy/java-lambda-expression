package sumit.MethodReference;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class EmployeeService {

    public List<Employee> loadEmployeesFromDB() {
        return IntStream.rangeClosed(1, 10)
                .mapToObj(i -> new Employee(i, "emp" + i, new Random().nextInt()))
                .collect(Collectors.toList());
    }

}
