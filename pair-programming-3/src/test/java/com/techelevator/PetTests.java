package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;
import junit.framework.TestCase;


public class PetTests {

    @Test
    public void listVaccinations_isCorret(){
        Pet pet = new Pet("dog","corgi");
        pet.setVaccinations("Distemper");
        pet.setVaccinations("Rabie");
        pet.setVaccinations("Parvo");

        Assert.assertEquals("the return listVaccinations is not in the correct format","Distemper, Rabie, Parvo",pet.listVaccinations());


    }
}
