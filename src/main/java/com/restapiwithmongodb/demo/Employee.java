package com.restapiwithmongodb.demo;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Employees")
public class Employee {
    private int id;
   private  String firstName;
   private String lastName;
   private Date dob;
   private int salary;

   
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}   
public String getFirstName() {
    return firstName;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public String getLastName() {
    return lastName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
public String getDob() {
    SimpleDateFormat sd=new SimpleDateFormat("dd/mm/yyyy");
   return sd.format(dob);
   
}
public void setDob(String dob) {
    SimpleDateFormat sd=new SimpleDateFormat("dd/mm/yyyy");
    try{
    this.dob= sd.parse(dob);
    }catch(Exception e){
        throw new Error("give date in dd/mm/yyyy format");
    }
    
   
}
public int getSalary() {
    return salary;
}
public void setSalary(int salary) {
    this.salary = salary;
}
public Employee(String firstName, String lastName, Date dob, int salary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = dob;
    this.salary = salary;
}
public Employee() {
}
@Override
public String toString() {
    return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", salary=" + salary + "]";
}

   
    
}
