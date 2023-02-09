public class Laptop{
    // Instance variables
    private String brand;
    private int ramSize;
    private double screenSize;

    // Constructors
    // public Laptop(String brand, int ramSize, double screenSize){
    //     this.brand = brand;
    //     this.ramSize = ramSize;
    //     this.screenSize = screenSize;

    // }

    // Mutator methods (Setters)
    public void setBrand(String initBrand){
        this.brand = initBrand;

    }
    public void setRam(int initRam){
        this.ramSize = initRam;

    }
    public void setScreen(double initScreen){
        this.screenSize = initScreen;
    }

    // Accessor methods
    public String getBrand(){
        return this.brand;
    }
    public int getRam(){
        return this.ramSize;
    }
    public double getScreen(){
        return this.screenSize;
    }

    public static void main(String[] args){
        Laptop laptop = new Laptop();
        laptop.setBrand("Lenovo");
        laptop.setRam(16);
        laptop.setScreen(17.5);
       
       System.out.println("Brand: " + laptop.getBrand());
       System.out.println("RAM size: " + laptop.getRam());
       System.out.println("Screen size: " + laptop.getScreen());
    }
}