package sumit.MethodReference;

public class EmployeeMapper {
    public static EmployeeDao convert(Employee employee){

        EmployeeDao employeeDao=new EmployeeDao();
        employeeDao.setId(employee.getId());
        employeeDao.setName(employee.getName());
        employeeDao.setSalary(employee.getSalary());

        return employeeDao;

    }
}
