/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

import CIT260.Group5ot.exceptions.MeatShareException;
import group5ot.Group5ot;
import java.io.PrintWriter;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Flores Family
 */
public class MeatShareControlTest {
    
    protected final PrintWriter console = Group5ot.getOutFile();    

    public MeatShareControlTest() {
    }

    @Test
    public void testCalcShares() throws MeatShareException {
        
        //Test Case 1
        
        this.console.println("\tTest case 1");
        
        //input variables
        double meatWeight = 150.00;
        double numAdults = 1.00;
        double numChildren = 2.00;
        
        double expResult = 37.50;
        
        MeatShareControl instance = new MeatShareControl();
        
        double result = instance.calcShares(meatWeight, numAdults, numChildren);
        
        assertEquals(expResult, result, 0.01);
    
        
        //Test Case 2
                
        this.console.println("\tTest case 2");
        
        //input variables
        meatWeight = -1.00;
        numAdults = 1.00;
        numChildren = 2.00;
        
        expResult = -1;
             
        result = instance.calcShares(meatWeight, numAdults, numChildren);
        
        assertEquals(expResult, result, 0.01);
        
        
        //Test Case 3
                
        this.console.println("\tTest case 3");
        
        //input variables
        meatWeight = 150.00;
        numAdults = -12.00;
        numChildren = 2.00;
        
        expResult = -1;
              
        result = instance.calcShares(meatWeight, numAdults, numChildren);
        
        assertEquals(expResult, result, 0.01);
        
        
        //Test Case 4
                
        this.console.println("\tTest case 4");
        
        //input variables
        meatWeight = 150.00;
        numAdults = 1.00;
        numChildren = -8.00;
        
        expResult = -1;
               
        result = instance.calcShares(meatWeight, numAdults, numChildren);
        
        assertEquals(expResult, result, 0.01);
        
        
        //Test Case 5
                
        this.console.println("\tTest case 5");
        
        //input variables
        meatWeight = 150.00;
        numAdults = 34.00;
        numChildren = 2.00;
        
        expResult = -1;
               
        result = instance.calcShares(meatWeight, numAdults, numChildren);
        
        assertEquals(expResult, result, 0.01);
    
                
        //Test Case 6
                
        this.console.println("\tTest case 6");
        
        //input variables
        meatWeight = 150.00;
        numAdults = 1.00;
        numChildren = 8.00;
        
        expResult = -1;
               
        result = instance.calcShares(meatWeight, numAdults, numChildren);
        
        assertEquals(expResult, result, 0.01);
       
                
        //Test Case 7
                
        this.console.println("\tTest case 7");
        
        //input variables
        meatWeight = 350.00;
        numAdults = 1.00;
        numChildren = 2.00;
        
        expResult = -1;
               
        result = instance.calcShares(meatWeight, numAdults, numChildren);
        
        assertEquals(expResult, result, 0.01);
        
                
        //Test Case 8
                
        this.console.println("\tTest case 8");
        
        //input variables
        meatWeight = 1.00;
        numAdults = 1.00;
        numChildren = 1.00;
        
        expResult = .33;
               
        result = instance.calcShares(meatWeight, numAdults, numChildren);
        
        assertEquals(expResult, result, 0.01);
        
        
        //Test Case 9
                
        this.console.println("\tTest case 9");
        
        //input variables
        meatWeight = 300.00;
        numAdults = 2.00;
        numChildren = 3.00;
        
        expResult = 42.86;
               
        result = instance.calcShares(meatWeight, numAdults, numChildren);
        
        assertEquals(expResult, result, 0.01);
    }
    
}
    
    
    
