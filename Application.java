

/*a class that creates a shopping cart of items and the uses of one 
 * Author Matthew Parsley
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * creates our shopping cart
		 */
		ShoppingCart shoppingCart = new ShoppingCart();
		
		System.out.println("The shopping cart is empty:" + shoppingCart.isEmpty());
		
		
		/*
		 * creates the 5 items to be added to the cart
		 *
		 */
		Item item1 = new Item("watermelon", 3.75);
		Item item2 = new Item("orange", 0.75);
		Item item3 = new Item("television", 750.00);
		Item item4 = new Item("burrito", 3.50);
		Item item5 = new Item("gaming System", 450.00);
		
		
		
		
		
		
		
		/*
		 * adds  the items to the cart 
		 */
		
		shoppingCart.add(item4);
		shoppingCart.add(item2);
		shoppingCart.add(item3);
		shoppingCart.add(item4);
		shoppingCart.add(item5);
		
	
		/*
		 * prints different aspects of the shopping cart
		 */
		System.out.println( "these are the items in the shopping cart" + "\n" + shoppingCart );
		
		
		System.out.println("is item 1 in the cart?" + shoppingCart.contains(item1) );
		
		System.out.println("how many times is item 4 in the cart?" + shoppingCart.getFrequencyOf(item4));
		
		System.out.println("The price of item 2 is:" + item2.getPrice());
		
		System.out.println("The total price of the shopping cart is: " + shoppingCart.getTotal());

		
		/*
		 * removes items from the shopping cart
		 */
		shoppingCart.remove(item5);
		shoppingCart.remove(item3);
		shoppingCart.remove();
		
		System.out.println("the shopping cart after removing a few items is now:" +"\n" + shoppingCart);
		
		/*
		 * clears the shopping cart
		 */
		shoppingCart.clear();
		
		System.out.println("the shopping cart is now empty:" + shoppingCart.isEmpty());
		
		
		
		
		
		
	

		
		
		
	}

}
