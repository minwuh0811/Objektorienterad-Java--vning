import javax.sql.rowset.serial.SerialArray;
import java.io.Serializable;

public class Employee extends Person implements Serializable {

    private String Department;
    private double Salary;
    private static int ID;
    private String EmployeeID;
    public static final long serialVersionUID = 2L;

    public Employee(String department, double salary, String name) {

        this.Department = department;
        this.Salary = salary;
        this.EmployeeID="Employee" +ID++;
        this.name=name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }
@Override
    public void printMe() {
        System.out.println(EmployeeID+ " " + name + " " + Department + " " + Salary);;



    }
}
