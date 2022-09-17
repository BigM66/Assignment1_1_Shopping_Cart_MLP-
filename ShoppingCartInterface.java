
/*an interfacte that describes the operations of a shopping cart of items
 * Author Matthew Parsley
 */
public interface ShoppingCartInterface {
	
	/*gets the number of items currently in the cart
	 * @returns an integer of the number of items in the cart.
	 */
	public int getCurrentSize();
	
	/* checks to see if the shopping cart is empty
	 * @returns true if shopping cart is empty, false if not
	 */
	public boolean isEmpty();
	
	/*adds a new item to the shopping cart
	 * @param newItem The item to be added to the cart
	 * @return true if the addition was succesful or false if not
	 */
	public boolean add(Item newItem);
	
	/* remove one item from the shopping cart at random
	 * @return either the new item if it was successful or null if it was unsuccesful
	 */
	public Item remove();
	
	/*removes a specific item from the shopping cart
	 * @param anItem The item to be removed from the cart
	 * @return true if the addition was successful or false if not
	 */
	public boolean remove(Item anItem);
	
	/*clears the shopping cart of all items
	 */
	public void clear();
	
	/* counts the number of times an item appears in the shopping cart
	 * @param anItem the item to be counted 
	 * @return the number of times it appears in the shopping cart 
	 */
	public int getFrequencyOf(Item anItem);
	
	/*Tests whether the shopping cart contains the Item we want 
	 * @param anItem the item we want to search for 
	 * @return true if the item is in the shopping cart or false if it is not
	 */
	public boolean contains(Item anItem);
	
	
	
	/* retrieves all of the items in the shopping cart
	 * @returns a new array of all the items in the shopping cart
	 * Note: if the shopping cart happens to be empty then so to will the shopping cart be empty
	 */
	public Object[] copyToArray();
	
	/* checks to see the price of an item 
	 * @param the item that we want to find 
	 * @return the price of the item
	 */
	public double getPrice(Item anItem);
	
	/*
	 * adds up the total price of our shopping cart
	 * @return the total price of the cart
	 */
	public double getTotal();
	
}
/* end of shopping cart interface
*/