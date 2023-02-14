public class Motorbike{
    private Person1 owner;
    private double price;

    public Motorbike(Person1 theOwner, double cost){
        owner = theOwner;
        price = cost;
    }
    public void setPrice(double newPrice){
        price = newPrice;
    }
    public Person1 getOwner(){
        return owner;
    }
    public String getOwnersName(){
        return owner.getName();
    }
    public double getPrice(){
        return price;
    }
}