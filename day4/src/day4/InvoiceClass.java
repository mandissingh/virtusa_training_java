package day4;
import java.util.*;
public class InvoiceClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	// Scanner object to get input
		String partNumber = scan.next();		// Getting part number from input
		String partDescription = scan.next();	// Getting part description from input
		int quantity = scan.nextInt();			// Getting quantity from input
		double price = scan.nextDouble();		// Getting price from input
		
		// Creating instance of class
		Invoice object = new Invoice(partNumber, partDescription, quantity, price); 
		System.out.println(object.getInvoice()); // printing Invoice
	}
}

class Invoice{
	// Instance variables
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	
	// Constructor to initialize instance variables
	Invoice(String partNumber, String partDescription, int quantity, double price){
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}
	
	// Getter Functions for instance variables
	public String getPartNumber(){
		return this.partNumber;
	}
	
	public String getPartDescription(){
		return this.partDescription;
	}
	
	public int getQuantity(){
		return this.quantity;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	
	// Invoice function to get invoice
	public double getInvoice(){
		return (double)(this.quantity * this.price);
	}
}
