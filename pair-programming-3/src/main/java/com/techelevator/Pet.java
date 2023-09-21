package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String name;
    private String species;
    List<String> vaccinations = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(String vaccine) {
       vaccinations.add(vaccine);
    }

    public Pet (String name, String species ) {
        this.name = name;
        this.species = species;
    }
        public String  listVaccinations() {
            String str="";
            int i =0;
            while(i<getVaccinations().size()){
               str+=getVaccinations().get(i);
               str+=", ";
               i++;
            }
            return str.substring(0,str.length()-2);

        }



}
