package week4;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public  Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	public String getname() {
		return name;
		
	}
	public double getprice() {
		return price;
	}
	public int getquantity() {
		return quantity;
		
	}
	public boolean isAffordable(double budget) {
		double totalprice = price * quantity;
		return totalprice <= budget;
		
		
		
		
	}

}
