package com.springcore.lifecycle;

public class Samosa {
private int price;

public Samosa() {
	super();
	// TODO Auto-generated constructor stub
}

public Samosa(int price) {
	super();
	this.price = price;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}

public void init() {
	System.out.println("inside init method");
}

public void destroy() {
	System.out.println("Inside destroy method");
}
}
