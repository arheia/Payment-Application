package PaymentTest;

import static org.junit.Assert.*;
import java.time.LocalDate;
import org.junit.Test;
import PaymentClasses.BioInfo;
import PaymentClasses.Employee;
import PaymentEnum.Province;

/**
 * Final Project, PaymentApplication - OOP
 * @author Courtney Peacock
 * @date 04/04/2021
 * EmployeeTest 
 */

public class EmployeeTest {	
	
	@Test
    public void getIdTest() {
        Employee e1 = new Employee("42", "Elon", "Musk", "42 Tesla Lane", "Moncton", PaymentEnum.Province.NB, "E1C0G5", 
        		"5066547894", true, LocalDate.of(2021, 02, 28), "123456678", LocalDate.of(1971, 4, 28), 
        		true, 40.0, 70.0);
        assertEquals(e1.getId(), "42");
    }
	
    @Test
    public void bioInfoObjectContainsEmployeeTest() {
    	Employee steve = new Employee("0024785", "Steven", "Tyler", "8 Ash Street", "Riverview", 
				Province.NB, "E2C8B5", "506-555-5214", true, LocalDate.of(2018, 2, 2), 
				"135485667", LocalDate.of(2001, 6, 26), false, 15, 14);
    	assertEquals(true, steve instanceof BioInfo);
    }
    
    @Test
    public void isSalariedTest() {
        Employee e2 = new Employee("11", "Bill", "Gates", "42 Microsoft Way", "Vancouver", PaymentEnum.Province.BC, "B4G0G4", 
        		"5066537884", true, LocalDate.of(2005, 12, 05), "547896321", LocalDate.of(1955, 9, 28), 
        		true, 40.0, 70.0);
        assertEquals(e2.isSalaried(), true);
    }
    
    @Test
    public void calcAgeByYearTest() {
        Employee e2 = new Employee("11", "Bill", "Gates", "42 Microsoft Way", "Vancouver", PaymentEnum.Province.BC, "B4G0G4", 
        		"5066537884", true, LocalDate.of(2005, 12, 05), "547896321", LocalDate.of(1955, 10, 28), 
        		true, 40.0, 70.0);
        assertEquals(e2.calcAge(), 66);
    }
    
    @Test
    public void checkBonusTest() {
        Employee e2 = new Employee("13", "Ramona", "Flowers", "42 Scott Pilgrim Promanade", "Toronto", PaymentEnum.Province.ON, "B4G0G4", 
        		"5066537884", true, LocalDate.of(2011, 12, 05), "157951357", LocalDate.of(1995, 1, 1), 
        		true, 40.0, 70.0);
        assertEquals(e2.checkBonus(), 0.0, .1);
    }
       
    
}
