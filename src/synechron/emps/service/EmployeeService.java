package synechron.emps.service;

public class EmployeeService {
    //implement the singleton DP
    // 1. write the private constructor
    //use the private constructor to create the private objects within the class only
    private EmployeeService(){
        // TODO Auto generated constructor stub
    }

    private static EmployeeService employeeService;

    // 2. add method called getInstance()==> which is responsible for creating the simpleton object
    public static EmployeeService getInstance(){
        // to hold an object you require its reference
        //static references will access only static variables / refs

        if (employeeService == null){
            employeeService = new EmployeeService();
            return employeeService;
        }
        else {
            return employeeService;
        }
    }
    //public : should be accessible outside the class
    //EmployeeService : return type
    //getInstance():
}
