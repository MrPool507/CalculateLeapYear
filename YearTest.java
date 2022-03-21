package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class YearTest {

	   //Test #: 1
    //Objective: divides year by 4
    //Input(s): year = 1996 
    //Expected O/P: "is not a leap year"
    
    public void testgetDescription001() 
    {
         testObj = ;
        
        assertEquals("Grade cannot be negative", testObj.getDescription());
    }
    
    //Test #: 2
    //Objective: divides year by 400
    //Input(s): year = 2000 
    //Expected O/P: "is a leap year"
    
    public void testgetDescription002() 
    {
         testObj = ;
        
        assertEquals("Grade cannot be negative", testObj.getDescription());
    }
    
  //Test #: 3
    //Objective: divides year by 100
    //Input(s): year = 1900 
    //Expected O/P: "is not leap year"
    
    public void testgetDescription003() 
    {
         testObj = ;
        
        assertEquals("Grade cannot be negative", testObj.getDescription());
    }
    
    //Test #: 4
    //Objective: reject invalid year
    //Input(s): year = 1380 
    //Expected O/P: "outside expected range"
    
    public void testgetDescription004() 
    {
         testObj = ;
        
        assertEquals("Grade cannot be negative", testObj.getDescription());
    }

}
