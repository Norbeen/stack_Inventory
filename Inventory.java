
public class Inventory {
	
	/*
	 * In this program the customer has to give input from the main method with the scanner class
	 * 
	 *  NewPort100Box_Total  // variable declaration like this is the total inventory that needs to be maintained
	 *  NewPort100Box_Stock  // variable declaration like this is the total inventory that needs to be maintained
	 * NewPort100Box_Quantity //variable declaration like this is the total item list we need to order and gets printed on screen
	 * */
	// these are the total quantities passed from the main method(The quantity we have in the store right now)
	
	private int NewPort100Box_Stock;
	private int NewPort100soft_Stock;
	private int NewPortBox_Stock;
	private int NewPortsoft_Stock;
	
	
	// these are the total stock that needs to be in the shelf (These are the minimum stock that has to be in the store)
	
	final static int NewPort100Box_Total = 11;
	final static int NewPort100soft_Total = 10;
	final static	 int NewPortBox_Total = 10;
	final static int NewPortsoft_Total =11;
	
	// total items need to order
	

	private int NewPort100Box_Quantity; // (This is the quantity we need to order and this is the final quantity that gets printed out for the order)
	private int NewPort100soft_Quantity;
	private int NewPortBox_Quantity;
	private int NewPortsoft_Quantity;
	
	
	
	//creating a constructor to pass file values
	
Inventory(int NewPort100Box_Stock , int NewPort100soft_Stock, int NewPortBox_Stock,int NewPortsoft_Stock ){
	
	this.NewPort100Box_Stock = NewPort100Box_Stock;
	this.NewPort100soft_Stock = NewPort100soft_Stock;
	this.NewPortBox_Stock =NewPortBox_Stock;
	this.NewPortsoft_Stock = NewPortsoft_Stock;
	
}

public int NewPort100Box_Stock() {
	
	
	if (NewPort100Box_Stock < 11) {
		NewPort100Box_Quantity = NewPort100Box_Total - NewPort100Box_Stock;
	}
	return NewPort100Box_Quantity;
	
}

public int NewPort100soft_Stock() {
	
	
	if (NewPort100soft_Stock < 10) {
		NewPort100soft_Quantity = NewPort100soft_Total - NewPort100soft_Stock;
	}
	return NewPort100soft_Quantity;
	
}

public int NewPortBox_Stock() {
	
	
	if (NewPortBox_Stock < 10) {
		NewPortBox_Quantity = NewPortBox_Total - NewPortBox_Stock;
	}
	return NewPortBox_Quantity;
	
}

// This method returns the Newport Soft total quantity to order
public int NewPortsoft_Stock() {
	
	
	if (NewPortsoft_Stock < 11) {
		NewPortsoft_Quantity = NewPortsoft_Total - NewPortsoft_Stock;
	}
	return NewPortsoft_Quantity;
	
}

//This method prints the total cigarette order you have to make

public String toString() {
	

return ("\n" + "You need to order " + NewPort100Box_Stock() + " NewPort 100 Box" + "\n" +
		"You need to order " + NewPort100soft_Stock() + " NewPort 100 Soft" + "\n" +
		"You need to order " + NewPortBox_Stock()  + " NewPort Box Short" + "\n" +
		"You need to order " + NewPortsoft_Stock() + " NewPort Soft Short" + "\n");


}
}