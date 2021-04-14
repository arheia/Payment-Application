package PaymentClasses;
import java.time.LocalDate;
import PaymentClasses.Employee;
import PaymentEnum.Province;

/**
 * Final Project, PaymentApplication - OOP
 * @author Courtney Peacock
 * @date 04/04/2021
 * Paymenttron3000
 */

public class Paymentron3000 {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		Widget widget = new Widget();
		
		//Employees
		Employee jim = new Employee("0000036", "James", "Brown", "20 Willow Lane", "Moncton", 
				Province.NB, "E1B6F4", "506-555-8596", false, LocalDate.of(1980, 9, 2), 
				"000485667", LocalDate.of(1939, 4, 20), true, 20, 55);
		Employee bob = new Employee("0004785", "Robert", "Belcher", "23 Pine Street", "Moncton", 
				Province.NB, "E1C6X4", "506-555-6162", false, LocalDate.of(1995, 6, 18), 
				"101485667", LocalDate.of(1965, 2, 27), true, 30, 49);
		Employee martha = new Employee("0009694", "Martha", "Stewart", "1356 Linden Road", "Salisbury", 
				Province.NB, "E1A9R5", "506-555-5544", false, LocalDate.of(2007, 9, 2), 
				"116485667", LocalDate.of(1975, 3, 9), false, 35, 35);
		Employee jenny = new Employee("0012558", "Jennifer", "Lawrence", "5 Poplar Lane", "Halifax", 
				Province.NS, "B2E5G6", "902-555-3470", true, LocalDate.of(2012, 9, 2), 
				"125485667", LocalDate.of(1982, 6, 21), false, 36.25, 29);
		Employee steve = new Employee("0024785", "Steven", "Tyler", "8 Ash Street", "Riverview", 
				Province.NB, "E2C8B5", "506-555-5214", true, LocalDate.of(2018, 2, 2), 
				"135485667", LocalDate.of(2001, 6, 26), false, 15, 14);
		
		employee.addEmployee(jim);
		employee.addEmployee(bob);
		employee.addEmployee(martha);
		employee.addEmployee(jenny);
		employee.addEmployee(steve);
		
		employee.sortEmployee();
		employee.printEmployee();
		
		
		//Widgets
		Widget zero = new Widget("000459T20", "Swozzle", "70cm with oil coating", 52.75);
		Widget one= new Widget("000529X21", "Kablamp", "156cm with green fabric", 99.85);
		Widget two = new Widget("001779H22", "Millow", "5cm special edition", 46.99);
		Widget three = new Widget("000459T23", "Torship", "45cm oak matte finish", 57.20);
		Widget four = new Widget("005623X24", "Precks", "85cm cherry finish", 84.15);
		widget.addWidget(zero);
		widget.addWidget(one);
		widget.addWidget(two);
		widget.addWidget(three);
		widget.addWidget(four);
		
		Payee A = new Payee("Company A", "142");
        Payee B = new Payee("Company B", "113");

        
        Invoice i1 = new Invoice("2021032901", LocalDate.of(2021, 03, 24), A);
        i1.getItems().add(two);
        i1.getItems().add(three);
        i1.getItems().add(zero);
        i1.setPayee(A);
        

        
        Invoice i2 = new Invoice("2021032902", LocalDate.of(2021, 03, 25), B);
        i2.getItems().add(zero);
        i2.getItems().add(one);
        i2.getItems().add(four);
        i2.setPayee(B);
        
        Invoice i3 = new Invoice("2021032903", LocalDate.of(2021, 03, 28), A);
        i3.getItems().add(one);
        i3.getItems().add(two);
        i3.getItems().add(four);
        i3.getItems().add(three);
        i3.getItems().add(zero);
        i3.getItems().add(zero);
        i3.setPayee(A);
        
        
        System.out.println(i1);
        System.out.println(" ");
        System.out.println(i2);
        System.out.println(" ");
        System.out.println(i3);
        
		
	}

}
