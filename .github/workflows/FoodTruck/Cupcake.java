/*
 * Represents a cupcake that can be sold at a food truck
 * Cupcake is a type of Dessert
 */
public class Cupcake extends Dessert{

  /* ------------------------------ TO DO ------------------------------
   * ✅ Refactor the Cupcake class to be a subclass of Dessert.
   * -------------------------------------------------------------------
   */

  private boolean isMini;   // Whether or not a cupcake is a miniature cupcake


  public Cupcake(){
    
  }

  public Cupcake(String flavor, double price, boolean mini){
    super(flavor,price);
    this.isMini = mini;
  }

  public boolean getIsMini(){
    return isMini;
  }

  public void setIsMini(boolean mini){
    isMini = mini;
  }

  public String toString(){
    return super.toString() + "\nIs Mini? " + getIsMini();
    }
}
