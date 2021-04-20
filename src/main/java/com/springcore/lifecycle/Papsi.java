package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Papsi implements InitializingBean,DisposableBean {
private int price;

public Papsi() {
	super();
	// TODO Auto-generated constructor stub
}

public Papsi(int price) {
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
	return "Papsi [price=" + price + "]";
}


public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("inside interface init");
}

public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("inside interface destroy");
}

}
