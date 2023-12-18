package synechron.emps.repo;

import synechron.emps.service.EmployeeService;

public class EmployeeRepository {

    //implement the singleton design pattern
    private EmployeeRepository(){
        // TODO Auto generated constructor stub
    }

    private static EmployeeRepository employeeRepository;
    public static EmployeeRepository getInstance(){
        if (employeeRepository == null){
            employeeRepository = new EmployeeRepository();
            return employeeRepository;
        }
        else {
            return employeeRepository;
        }
    }
}
