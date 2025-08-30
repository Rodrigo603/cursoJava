package model.entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
	}
	public Product(String name, double price) {
		
		this.name = name;
		this.price = price;
	}
	public Product(String name,double price,int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	} //set = troca de nome || get = puxar o nome (private)
	public void setName(String name) { 
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() { //Nao existe set por que so pode ser mudado apos add ou remove
		return quantity;
	}
	public double totalValueInStock() {
		return price * quantity;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity; //this para não ocorrer ambiguidade entre as variaveis quantity = quantity
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity; 
	}
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f",price)
			+", "
			+ quantity
			+" units, Total : $ "
			+ String.format("%.2f",totalValueInStock());
	}
}
