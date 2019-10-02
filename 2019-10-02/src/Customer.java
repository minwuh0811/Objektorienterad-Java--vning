import java.io.Serializable;

public class Customer extends Person implements Serializable {
    public static int ID;
    public String address;
    public String customerID;
    public static final long serialVersionUID = 2L;

    public Customer(String address, String name ) {
        this.customerID= "Customer"+ID++;
        this.address = address;
        this.name=name;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public void printMe() {
        System.out.println(customerID + " " + name + " " + address);;
    }
}
