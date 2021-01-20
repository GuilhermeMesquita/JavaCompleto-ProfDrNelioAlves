package curso_java;

public class Product {
	private String name;
	private double price;
	private int quantity;

	
	public Product() {
	}
	public Product(String name, double price, int quantity) {
	this.name = name;
	this.price = price;
	this.quantity = quantity;
	}
	public Product(String name, double price) {
	this.name = name;
	this.price = price;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName (String name){
		this.name = name;
		this.price = price;
	}
	
	public double totalValStock(){
		return price * quantity;
	}
	public void addProd(int quantity){
		this.quantity += quantity;
	}
	public void removeProd (int quantity){
		this.quantity -= quantity;
	}
	public String toString(){
		return name 
				+ ", $" 
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValStock());
	}

}
