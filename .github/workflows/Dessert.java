/*
 * Represents a dessert that can be sold at a food truck
 */
public class Dessert {

  /* ------------------------------ TO DO ------------------------------
   * ✅ Declare instance variables for the flavor and price of a dessert.
   * -------------------------------------------------------------------
   */
  private String flavor;    // The flavor of a cupcake
  private double price;     // The price of a cupcake

    public Dessert(){
      this("vanilla", 12.99);
    }

  public Dessert(String flavor, double price){
    this.flavor = flavor;
    this.price = price;
  }
  
  public String getFlavor(){
    return flavor;
  }

  public double getPrice(){
    return price;
  }
  
  public String toString(){
    return "Flavor: " + flavor + "\nPrice: " + price;
  }
}
