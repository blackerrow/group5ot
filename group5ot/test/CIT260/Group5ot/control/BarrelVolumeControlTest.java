/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

import CIT260.Group5ot.exceptions.BarrelVolumeCalcException;
import group5ot.Group5ot;
import java.io.PrintWriter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author crims
 */
public class BarrelVolumeControlTest {
    
    protected final PrintWriter console = Group5ot.getOutFile();    

    
    public BarrelVolumeControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCalcBarrelVolume() throws BarrelVolumeCalcException {
        this.console.println("calcBarrelVolume");
        
        // ---Test Case 1 ---
        this.console.println("\tTest case 1");
        
        // define the input variables
        double height = 36;
        double radius = 12;
        
        double expResult = 9.42; // expected result 
        
        //create instance of BarrelVolumeControl
        BarrelVolumeControl instance = new BarrelVolumeControl(); 
        
        // call the method
        double result = instance.calcBarrelVolume(height, radius);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);    
        
        
        // ---Test Case 2 ---
        this.console.println("\tTest case 2");
        
        // define the input variables
        height = 36;
        radius = -1;
        
        expResult = -1; // expected result        
                
        // call the method
        result = instance.calcBarrelVolume(height, radius);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);  
        
        
        
        // ---Test Case 3 ---
        this.console.println("\tTest case 3");
        
        // define the input variables
        height = -36;
        radius = 12;
        
        expResult = -1; // expected result 
        
        // call the method
        result = instance.calcBarrelVolume(height, radius);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);  
        
        
        // ---Test Case 4 ---
        this.console.println("\tTest case 4");
        
        // define the input variables
        height = 36;
        radius = 100;
        
        expResult = -1; // expected result 
        
        // call the method
        result = instance.calcBarrelVolume(height, radius);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);  
        
        
        // ---Test Case 5 ---
        this.console.println("\tTest case 5");
        
        // define the input variables
        height = 0;
        radius = 18;
        
        expResult = .00; // expected result 
        
        // call the method
        result = instance.calcBarrelVolume(height, radius);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);  
        
        
        // ---Test Case 6 ---
        this.console.println("\tTest case 6");
        
        // define the input variables
        height = 60;
        radius = 0;
        
        expResult = 0; // expected result 
        
        // call the method
        result = instance.calcBarrelVolume(height, radius);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);  
        
        
        // ---Test Case 7 ---
        this.console.println("\tTest case 7");
        
        // define the input variables
        height = 60;
        radius = 18;
        
        expResult = 35.32; // expected result 
        
        // call the method
        result = instance.calcBarrelVolume(height, radius);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);  
        
        //This does NOT need to be included.  Left in file for reference only.
        //It is a "default" in a test case.
        //fail("The test case is a prototype.");
    }
    
}
