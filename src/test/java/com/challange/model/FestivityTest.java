/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.challange.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sebpache
 */
public class FestivityTest {
    
    private Festivity festivity;
    
    
    
    public FestivityTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        festivity = new Festivity();
        festivity.setName("Festivity");
        festivity.setPlace("Colombia");
        
    }
    
    @Test
    public void testModel(){
        assertEquals("Festivity", festivity.getName());
        assertEquals("Colombia", festivity.getPlace());
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
