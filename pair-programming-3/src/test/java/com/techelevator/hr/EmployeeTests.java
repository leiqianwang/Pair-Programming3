package com.techelevator.hr;

import com.techelevator.Billable;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class EmployeeTests {

    @Test
    public void getFullNameReturnsCorrectFormat() {
        Employee employee = new Employee("Test", "Testerson");
        String fullName = employee.getFullName();

    }

    @Test
    public void raiseSalaryTest_Positive() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(5);


    }

    @Test
    public void raiseSalaryTest_Negative() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(-10); //"raise" by negative 10%


    }

    @Test
    public void getBalanceDueTes_with_walking_service() {
        Employee employee = new Employee("Test", "Testerson");
        Map<String, Double> services = new HashMap<>();
        services.put("Grooming", 389.0);
        services.put("Sitting", 120.0);
        services.put("feeding", 45.99);
        services.put("Walking", 40.20);

        assertEquals("the expected balance is different from your actual result", 575.09, employee.getBalanceDue(services), 0.0);


    }

    @Test
    public void getBalanceDueTes_without_walking_service() {
        Employee employee = new Employee("Test", "Testerson");
        Map<String, Double> services = new HashMap<>();
        services.put("Grooming", 389.0);
        services.put("Sitting", 120.0);
        services.put("feeding", 45.99);

        assertEquals("the expected balance is different from your actual result", 554.99, employee.getBalanceDue(services), 0.0);


    }

}