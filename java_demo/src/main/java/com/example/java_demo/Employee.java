package com.example.java_demo;

public class Employee {
    private String name;
    private double basicSalary;
    private int age;
    private String designation;
    private String emailAddress;
    private String phoneNumber;

    // define a constructor that takes in all the fields as parameters
    public Employee(String name, double basicSalary, int age, String designation, String emailAddress, String phoneNumber) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.age = age;
        this.designation = designation;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    // getter and setter for all fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
