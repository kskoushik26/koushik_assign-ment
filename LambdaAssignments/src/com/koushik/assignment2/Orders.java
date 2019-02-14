package com.koushik.assignment2;

public class Orders 
{
	public String Product;
	public double Price;
	public boolean isAccepted;
	public Orders(String product, double price, boolean isAccepted) {
		super();
		Product = product;
		Price = price;
		this.isAccepted = isAccepted;
	}
	public String getProduct() {
		return Product;
	}
	public void setProduct(String product) {
		Product = product;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public boolean isAccepted() {
		return isAccepted;
	}
	public void setAccepted(boolean isAccepted) {
		this.isAccepted = isAccepted;
	}
	
}