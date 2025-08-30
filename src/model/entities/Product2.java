package model.entities;

public class Product2 {

	private String name;
	private int qty;
	private double price;
	
	public Product2() {
	}
	public Product2(String name, int qty) {
		this.name = name;
		this.qty = qty;
	}
	public Product2(String name, int qty, double price) {
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public double TotalValueInStock() {
		return price * qty;
	}
	public void addQty(int qty) {
		this.qty += qty;
	}
	public void removeQty(int qty) {
		this.qty -= qty;
	}
	public String toString() {
		return "Updated data: " +
				name +
				", R$ " + 
				String.format("%.2f", price) +
				", " +
				qty +
				" units" +
				", Total: R$" +
				String.format("%.2f",TotalValueInStock());
		
					
	}
	
}
