/* This is a stub for the Cafe class */
public class Cafe extends Building implements CafeRequirements{
   
    /**
    * Attributes
    */
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;
  
    /**
    * Constructor for Cafe
    * @param name name of cafe
    * @param address address of cafe
    * @param nFloors number of floors in cafe
    * @param nCoffeeOunces number of coffee ounces in the inventory
    * @param nSugarPackets number of sugar packets in the inventory
    * @param nCreams number of creams in the inventory
    * @param nCups number of cups in the inventory
    * @return an instance of Cafe
    */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }
   
    /**
    * Sells coffee by subtracting materials from the inventory
    * @param size size of coffee 
    * @param nSugarPackets number of sugar packets in the inventory
    * @param nCreams number of creams in the inventory
    */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (this.nCoffeeOunces > 0 && this.nSugarPackets > 0 && this.nCreams > 0 && this.nCups > 0) {
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            this.nCups -= 1;
        } else {
            restock(this.nCoffeeOunces, this.nSugarPackets, this.nCreams, this.nCups);
        }
    }
    /**
    * Restocks inventory of coffee supplies
    * @param nCoffeeOunces number of coffee ounces in the inventory
    * @param nSugarPackets number of sugar packets in the inventory
    * @param nCreams number of creams in the inventory
    * @param nCups number of cups in the inventory
    */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += 20;
        this.nSugarPackets += 20;
        this.nCreams += 20;
        this.nCups += 20;
    }

    /**
    * Main to test methods
    */
    public static void main(String[] args) {
        Cafe myCafe = new Cafe("Compass Cafe", "1 Chapin Way", 1, 3, 3, 3, 3);
        myCafe.sellCoffee(3, 2, 1);
        myCafe.sellCoffee(4, 3, 0);
    } 
}