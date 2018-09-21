package com.company.Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccRegexTest {
    com.company.Java.OccRegex occRegex;
    @Before
    public void setUp() throws Exception {
        occRegex =new com.company.Java.OccRegex();
    }

    @After
    public void tearDown() throws Exception {
        occRegex =null;
    }

    @Test
    public void occurence() {
        assertEquals("4-6 10-12 27-29", occRegex.occurence("She sells seashells by the seashore","se"));
        assertEquals("3-4 7-8 11-12 16-17", occRegex.occurence("trying it with single letter","i"));
    }
    @Test
    public void occurenceFailure(){
        assertNotSame("3-4 7-8", occRegex.occurence("hello world","o"));
        assertNull(occRegex.occurence(null,"d"));
    }
}