/** A class of items for sale.
    @author Frank M. Carrano
    @author Timothy M. Henry
    @version 5.0
*/
public class Item
{
   private String name;
   private double price;
   
	public Item(String productName, double productPrice) 
	{
	  name = productName ;
      price = productPrice;
	} // end constructor
	
	public String getName() 
	{
      return name;
	} // end getDescription

	public double getPrice() 
	{
      return price;
	} // end getPrice
	
	public String toString() 
	{
      return String.format("Item: %s, %.2f", name, price);
	} // end toString
} // end Item