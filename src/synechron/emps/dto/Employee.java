package synechron.emps.dto;
// import lombok.Data;
//@Data
public class Employee {
    private String empId;

    public String empId() {
        return empId;
    }

    public Employee setEmpId(String empId) {
        this.empId = empId;
        return this;
    }

    public String empFirstName() {
        return empFirstName;
    }

    public Employee setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
        return this;
    }

    public String empLastName() {
        return empLastName;
    }

    public Employee setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
        return this;
    }

    public String empAddress() {
        return empAddress;
    }

    public Employee setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
        return this;
    }

    public String contactNumber() {
        return contactNumber;
    }

    public Employee setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }

    public float empSalary() {
        return empSalary;
    }

    public Employee setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
        return this;
    }

    public int deptNo() {
        return deptNo;
    }

    public Employee setDeptNo(int deptNo) {
        this.deptNo = deptNo;
        return this;
    }

    // BREAK

    private String empFirstName;
    private String empLastName;
    private String empAddress;
    private String contactNumber;
    private float empSalary;
    private int deptNo;



}
