package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccuranceTest {
    Occurance occurance;

    @Before
    public void setUp() throws Exception {
        occurance =new Occurance();
    }

    @After
    public void tearDown() throws Exception {
        occurance = null;
    }

    @Test
    public void countOccurance(){
        assertEquals("failed","10",occurance.countOccurance("Java is java again java again",'a'));

    }
    @Test
    public void countOccurancefailure(){
        assertEquals("failure",occurance.countOccurance("java is  java ",'b'));
        assertEquals("failure",5,occurance.countOccurance("cjacbbhcash",'z'));
    }


}