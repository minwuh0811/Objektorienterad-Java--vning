public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee("CS",21000, "Lars Eriksson");
        Customer customer=new Customer("Prytzgatan 21", "Leif Holm");
        Employee employee1=new Employee("CS",28000, "Mia Eriksson");
        Customer customer2=new Customer("Campus Möndal", "Joakim Holm");
        employee.printMe();
        employee1.printMe();
        customer.printMe();
        customer2.printMe();

    }



}
