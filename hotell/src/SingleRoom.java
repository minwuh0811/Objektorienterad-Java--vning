public class SingleRoom extends Room {
    private boolean bedForKid;

    public SingleRoom(int price, boolean bedForKid, String name) {
        this.price = price;
        this.bedForKid = bedForKid;
        this.name=name;
        this.states=true;
    }

    public boolean isBedForKid() {
        return bedForKid;
    }

    public void setBedForKid(boolean bedForKid) {
        this.bedForKid = bedForKid;
    }
    public void printRoom(){
        System.out.println("SingleRoom: "+name + " " + price + " The state: "+ states + " Extra Bad for kids: " + bedForKid);
    }
}
