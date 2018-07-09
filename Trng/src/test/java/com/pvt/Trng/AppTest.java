package com.pvt.Trng;

import static org.junit.Assert.*;
import org.junit.Test;
import triangle.Triangle;


public class AppTest 
{
 
    @Test
    public void correctTriangles() {
    	Triangle trg = new Triangle(3, 3, 3); 
    	assertTrue(trg.checkTriangle());
    	assertEquals("", trg.getMessage());
    }

	
    @Test
    public void lengthOfSidesShouldBePositive() {    
      Triangle trg = new Triangle( -3, 3, 3); 
      assertFalse("Neg side A", trg.checkTriangle()); 
      assertEquals("a<=0", trg.getMessage());
      
      trg = new Triangle(3, -3, 3); 
      assertFalse("Neg side B",trg.checkTriangle());
      assertEquals("b<=0", trg.getMessage());
      
      trg = new Triangle(3, 3, -3); 
      assertFalse("Neg side C",trg.checkTriangle());
      assertEquals("c<=0", trg.getMessage());
      
      trg = new Triangle( 0, 3, 3); 
      assertFalse("Zero value for side A", trg.checkTriangle()); 
      assertEquals("a<=0", trg.getMessage());
           
      trg = new Triangle(3, 0, 3); 
      assertFalse("Zero value for side B",trg.checkTriangle());
      assertEquals("b<=0", trg.getMessage());
           
      trg = new Triangle(3, 3, 0); 
      assertFalse("Zero value for side C",trg.checkTriangle());
      assertEquals("c<=0", trg.getMessage());
    }
    
    
    
    @Test
    public void lengthOfTwoSidesShouldBeGreaterThenThird() {
    	Triangle trg = new Triangle(1, 2, 7); 
    	assertFalse(trg.checkTriangle());  
    	assertEquals("a+b<=c", trg.getMessage());
    	
    	trg = new Triangle(1, 7, 2); 
    	assertFalse(trg.checkTriangle());
    	assertEquals("a+c<=b", trg.getMessage());
    	
    	trg = new Triangle(7, 1, 2); 
    	assertFalse(trg.checkTriangle());
    	assertEquals("b+c<=a", trg.getMessage());
    }
    
    @Test
    public void detectRectangularTriangle () {
    	Triangle trg = new Triangle(3, 4, 5); 
    	assertEquals(8, trg.detectTriangle());
    	
    	trg = new Triangle(4, 5, 3); 
    	assertEquals(8, trg.detectTriangle());
    	
    	trg = new Triangle(5, 3, 4); 
    	assertEquals(8, trg.detectTriangle());
    }
    @Test
     public void oneLengthOfSidesShouldBeNull() {
    	Triangle trg = new Triangle(0, 4, 5); 
    	assertEquals(8, trg.detectTriangle());
    	
    	trg = new Triangle(7, 0, 3); 
    	assertEquals(8, trg.detectTriangle());
    	
    	trg = new Triangle(6, 3, 0); 
    	assertEquals(8, trg.detectTriangle());
    }
    
    @Test
    public void detectEquilateralTriangle () {
    	Triangle trg = new Triangle(3, 3, 3); 
    	assertEquals(1, trg.detectTriangle());
    }
    
    @Test
    public void detectIsoscelesTriangle () {
    	Triangle trg = new Triangle(3, 3, 7); 
    	assertEquals(2, trg.detectTriangle());
    	
    	trg = new Triangle(3, 7, 3); 
    	assertEquals(2, trg.detectTriangle());
    	
    	trg = new Triangle(7, 3, 3); 
    	assertEquals(2, trg.detectTriangle());
    }

    @Test
    public void detectOrdynaryTriangle () {
    	Triangle trg = new Triangle(3.7, 2, 5.5); 
    	assertEquals(4, trg.detectTriangle());
    }

    @Test
    public void testTriangleSquare () {
      Triangle trg = new Triangle(3, 4, 5); 
      assertEquals(6, trg.getSquare(), 0.000001);
    }

}
