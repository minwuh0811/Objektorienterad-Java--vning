public class Employee extends Person {
    private static int ID;
    private String employeeID;
    private int salary;
    private String job;

    public Employee(String name, int salary, String job) {
        ID++;
        this.name=name;
        this.employeeID="Employee" +ID;
        this.salary = salary;
        this.job = job;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public int getSalary() {
        return salary;
    }

    public String getJob() {
        return job;
    }
}

