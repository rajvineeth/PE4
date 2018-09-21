package com.company.Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegexFinalTest {
    com.company.Java.RegexFinal regexFinal;
    @Before
    public void setUp() throws Exception {
        regexFinal =new com.company.Java.RegexFinal();
    }

    @After
    public void tearDown() throws Exception {
        regexFinal =null;
    }

    @Test
    public void checkPresence() {
        assertEquals(true, regexFinal.checkPresence("hi Harry"));
        assertEquals(false, regexFinal.checkPresence("ref eff"));
    }
    @Test
    public void checkPresenceFailure(){
        assertNotNull(regexFinal.checkPresence("dfvger"));
        assertNotNull(regexFinal.checkPresence("edf"));
    }
}