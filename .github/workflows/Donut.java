/*
 * Represents a donut that can be sold at a food truck
 * Donut is a type of Dessert
 */
public class Donut extends Dessert {
  
  private boolean hasSprinkles;   // Whether or not a donut has sprinkles

  /*
   * ✅ TO DO #1: Write a no-argument constructor in the Donut class.
   */
  public Donut(){
    
  }

  

  /*
   * ✅ TO DO #2: Write a parameterized constructor in the Donut class.
   */
  public Donut(String flavor, double price, boolean sprinkles){
    super(flavor,price);
    this.hasSprinkles = sprinkles;
  }

  public boolean getHasSprinkles(){
    return hasSprinkles;
  }
  
  public void setHasSprinkles(boolean sprinkles){
    hasSprinkles = sprinkles;
  }
  
  public String toString(){
    return super.toString() + "\nHas Sprinkles? " + getHasSprinkles();
    }
}
