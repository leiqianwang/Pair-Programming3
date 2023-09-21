package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable{
    private String phoneNumber;
    List<Pet> pets = new ArrayList<>();

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(Pet pet) {
        pets.add(pet);
    }

    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
        this.phoneNumber = "";
    }

    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {

            double totalBalanceDue = 0;

            for (Map.Entry<String, Double> services : servicesRendered.entrySet()) {
                totalBalanceDue += services.getValue();

            }
            return totalBalanceDue;
        }
    }

