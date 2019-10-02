public class Kund extends Person {
    private static int ID;
    private double discount;
    private String kundID;

    public Kund(String name,double discount) {
        ID++;
        this.kundID="Kund" +ID;
        this.discount = discount;
        this.name=name;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public String getKundID() {
        return kundID;
    }
}
