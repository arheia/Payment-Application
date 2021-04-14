package PaymentTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import PaymentClasses.Invoice;
import PaymentClasses.Payee;
import PaymentClasses.Widget;
import static org.junit.Assert.*;
import java.time.LocalDate;

/**
 * Final Project, PaymentApplication - OOP
 * @author Courtney Peacock
 * @date 04/04/2021
 * InvoiceTest 
 */

public class InvoiceTest {

    public InvoiceTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void getItemsEmptyTest() {
    	Payee A = new Payee("Company A", "");
        Invoice i1 = new Invoice("2021032903", LocalDate.of(2021, 03, 28), A);
        assertEquals(i1.getItems().size(), 0);
    }
    
    @Test
    public void getIdTest() {
    	Payee A = new Payee("Company A", "");
        Invoice i1 = new Invoice("2021032903", LocalDate.of(2021, 03, 28), A);
        Widget zero = new Widget("000459T20", "Swozzle", "70cm with oil coating", 52.75);
        Widget four = new Widget("005623X24", "Precks", "85cm cherry finish", 84.15);
        Widget three = new Widget("000459T23", "Torship", "45cm oak matte finish", 57.20);
        i1.getItems().add(zero);
        i1.getItems().add(four);
        i1.getItems().add(three);
        assertEquals(i1.getId(), "2021032903");
    }

    
    
    @Test
    public void getItemsTest() {
    	Payee B = new Payee("Company B", "");
    	Invoice i2 = new Invoice("2021032902", LocalDate.of(2021, 03, 25), B);
        Widget two = new Widget("001779H22", "Millow", "5cm special edition", 46.99);
		Widget three = new Widget("000459T23", "Torship", "45cm oak matte finish", 57.20);
		Widget four = new Widget("005623X24", "Precks", "85cm cherry finish", 84.15);
        i2.getItems().add(two);
        i2.getItems().add(three);
        i2.getItems().add(four);
        assertEquals(i2.getItems().size(), 3);
    }
}