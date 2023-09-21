package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
public class CustomerTest {
        @Test
        public void getBalanceDue_Test(){
            Customer customer = new Customer("fred","serki");
            Map<String, Double> services = new HashMap<>();
            services.put("Grooming", 140.0);
            services.put("Sitting", 46.0);
            services.put("Walking", 57.99);

            assertEquals("the expected balance is different from your actual result",243.99,customer.getBalanceDue(services),0.0);






        }

    }

