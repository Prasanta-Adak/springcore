package com.springcore.ci;



public class Person {
private String name;
private int personId;
private Carti carti;
public Person(String name, int personId, Carti carti) {
	super();
	this.name = name;
	this.personId = personId;
	this.carti = carti;
}
@Override
public String toString() {
	return "Person [name=" + name + ", personId=" + personId + ", carti=" + carti + "]";
}


}
