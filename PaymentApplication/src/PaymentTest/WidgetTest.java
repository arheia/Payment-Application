package PaymentTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import PaymentClasses.Widget;
import static org.junit.Assert.*;

/**
 * Final Project, PaymentApplication - OOP
 * @author Courtney Peacock
 * @date 04/04/2021
 * WidgetTest 
 */

public class WidgetTest {
    
    public WidgetTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void widgetNameTest() {
         Widget w1 = new Widget("0", "zero", null, 0);
         assertEquals(w1.getName(), "zero");
     }
     
      @Test
     public void widgetPriceTest() {
         Widget w2 = new Widget("1", "one", null, 500);
         assertEquals(w2.getPrice(), 500, 0.1);
     }    
     
     
      @Test
      public void widgetIDTest() {
    	  Widget two = new Widget("001779H22", "Millow", "5cm special edition", 46.99);
          assertEquals(two.getId(), "001779H22");
      }  
      
}

