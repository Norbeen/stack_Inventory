import java.util.*;

public class main {
public static void main(String [] args) {
		
Scanner sc = new Scanner(System.in);
	
	// Inventory for New port 100 Box long

	System.out.println("Enter the inventory for New Port Box 100s: ");
	int NewPort100Box_Stock = sc.nextInt();
	
	
	// Inventory for New port 100 soft long
	
	System.out.println("Enter the inventory for New Port 100 Soft: ");
	int NewPort100soft_Stock = sc.nextInt();
	
	// Inventory for New port Box short
	
	
	System.out.println("Enter the inventory for New Port Box Short: ");
	int NewPortBox_Stock = sc.nextInt();
	
	// Inventory for New port soft short
	
	System.out.println("Enter the inventory for New Port Soft Short: ");
	int NewPortsoft_Stock = sc.nextInt();
	
// passing the arguments value to the constructor
	
	Inventory obj = new Inventory(NewPort100Box_Stock, NewPort100soft_Stock,NewPortBox_Stock,NewPortsoft_Stock);
	
	System.out.println(obj.toString());
}
}
