package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student1")
public class Student {
	@Value("Prasanta")
    private String studentName;
	@Value("21")
    private int id;
	@Value("#{address1}")
	private List<String> address;
	
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", id=" + id + ", address=" + address + "]";
}

}
