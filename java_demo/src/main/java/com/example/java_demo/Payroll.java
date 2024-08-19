package com.example.java_demo;

public class Payroll {

    // add method for validating employee phone number

    /**
     * Validate the phone number of the employee
     * The phone number should be 10 digits and should not contain any characters
     *
     * @param employee
     * @return boolean
     */
    public boolean validatePhoneNumber(Employee employee) {
        String phoneNumber = employee.getPhoneNumber();
        if (phoneNumber.matches("\\d{10}")) return true;
        else return false;
    }

    // add method for validating employee email address
    public boolean validateEmailAddress(Employee employee) {
        String emailAddress = employee.getEmailAddress();
        if (emailAddress.matches("\\w+@\\w+\\.\\w+")) return true;
        else return false;
    }

    // add method for calculating employee net salary conditionally based on designation
    public double calculateNetSalary(Employee employee) {
        double basicSalary = employee.getBasicSalary();
        double netSalary = 0;
        if (employee.getDesignation().equals("Manager")) {
            netSalary = basicSalary + (basicSalary * 0.1);
        } else if (employee.getDesignation().equals("Engineer")) {
            netSalary = basicSalary + (basicSalary * 0.05);
        } else if (employee.getDesignation().equals("Analyst")) {
            netSalary = basicSalary + (basicSalary * 0.03);
        }
        return netSalary;
    }

    // add method for calculating employee tax based on age, designation, and net salary
    public double calculateTax(Employee employee) {
        double netSalary = employee.getBasicSalary();
        double tax = 0;
        if (employee.getAge() < 60) {
            if (employee.getDesignation().equals("Manager")) {
                if (netSalary > 100000) {
                    tax = netSalary * 0.3;
                } else if (netSalary > 80000) {
                    tax = netSalary * 0.2;
                } else if (netSalary > 50000) {
                    tax = netSalary * 0.1;
                }
            } else if (employee.getDesignation().equals("Engineer")) {
                if (netSalary > 100000) {
                    tax = netSalary * 0.2;
                } else if (netSalary > 80000) {
                    tax = netSalary * 0.1;
                }
            } else if (employee.getDesignation().equals("Analyst")) {
                if (netSalary > 100000) {
                    tax = netSalary * 0.1;
                }
            }
        } else {
            if (employee.getDesignation().equals("Manager")) {
                if (netSalary > 100000) {
                    tax = netSalary * 0.25;
                } else if (netSalary > 80000) {
                    tax = netSalary * 0.15;
                } else if (netSalary > 50000) {
                    tax = netSalary * 0.05;
                }
            } else if (employee.getDesignation().equals("Engineer")) {
                if (netSalary > 100000) {
                    tax = netSalary * 0.15;
                } else if (netSalary > 80000) {
                    tax = netSalary * 0.05;
                }
            } else if (employee.getDesignation().equals("Analyst")) {
                if (netSalary > 100000) {
                    tax = netSalary * 0.05;
                }
            }
        }
        return tax;
    }
}
