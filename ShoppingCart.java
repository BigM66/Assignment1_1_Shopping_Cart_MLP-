

public class ShoppingCart implements ShoppingCartInterface {

	private ResizableArrayBag<Item> shoppingCart;
	
	int lastUpdatedSize = 0;
	
	/*
	 * creates our shopping cart for us.
	 */
	public ShoppingCart() {
		shoppingCart = new  ResizableArrayBag<Item>();
	}
	
	/*gets the number of items currently in the cart
	 * @returns an integer of the number of items in the cart.
	 */
	public int getCurrentSize() {
		// TODO Auto-generated method stub
		return shoppingCart.getCurrentSize();
	}

	/* checks to see if the shopping cart is empty
	 * @returns true if shopping cart is empty, false if not
	 */
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return shoppingCart.isEmpty();
		
	}

	/*adds a new item to the shopping cart
	 * @param newItem The item to be added to the cart
	 * @return true if the addition was succesful or false if not
	 */
	public boolean add(Item newItem) {
		// TODO Auto-generated method stub
		return shoppingCart.add(newItem);
	}

	/* remove one item from the shopping cart at random
	 * @return either the new item if it was successful or null if it was unsuccesful
	 */
	public Item remove() {
		// TODO Auto-generated method stub
		return shoppingCart.remove();
	}

	/*removes a specific item from the shopping cart
	 * @param anItem The item to be removed from the cart
	 * @return true if the addition was successful or false if not
	 */
	public boolean remove(Item anItem) {
		// TODO Auto-generated method stub
		return shoppingCart.remove(anItem);
	}

	/*clears the shopping cart of all items
	 */
	public void clear() {
		// TODO Auto-generated method stub
		 shoppingCart.clear();
	}

	/* counts the number of times an item appears in the shopping cart
	 * @param anItem the item to be counted 
	 * @return the number of times it appears in the shopping cart 
	 */
	public int getFrequencyOf(Item anItem) {
		// TODO Auto-generated method stub
		return shoppingCart.getFrequencyOf(anItem);
	}

	/*Tests whether the shopping cart contains the Item we want 
	 * @param anItem the item we want to search for 
	 * @return true if the item is in the shopping cart or false if it is not
	 */
	public boolean contains(Item anItem) {
		// TODO Auto-generated method stub
		return shoppingCart.contains(anItem);
	}


	

	/* retrieves all of the items in the shopping cart
	 * @returns a new array of all the items in the shopping cart
	 * Note: if the shopping cart happens to be empty then so to will the shopping cart be empty
	 */
	public Object[] copyToArray() {
		// TODO Auto-generated method stub
		return shoppingCart.ToArray();
	}

	/* checks to see the price of an item 
	 * @param the item that we want to find 
	 * @return the price of the item
	 */
	public double getPrice(Item anItem) {
		// TODO Auto-generated method stub
		return anItem.getPrice();
	}

	/*
	 * adds up the total price of our shopping cart
	 * @return the total price of the cart
	 */
	public double getTotal() {
		// TODO Auto-generated method stub
		
		double totalCost = 0;
		Object[] cart = shoppingCart.ToArray();
		
		for(int index = 0; index < shoppingCart.getCurrentSize(); index ++) {
			totalCost = totalCost + ((Item) cart[index]).getPrice();
			
		}
		
		return totalCost;
		
		
	}
	
	/*
	 * sets up our string for later use in our program
	 */
	public String toString(){
		String list = "";
		Object[] cart = shoppingCart.ToArray();
		
		for(int index = 0; index < shoppingCart.getCurrentSize(); index ++) {
			list += cart[index] + "\n";
		}
		
		return list;
	}

}
