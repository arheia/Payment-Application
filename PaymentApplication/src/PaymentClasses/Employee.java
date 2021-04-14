package PaymentClasses;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import PaymentEnum.Province;
/**
 * Final Project, PaymentApplication - OOP
 * @author Courtney Peacock
 * @date 04/04/2021
 * Employee
 */

public class Employee extends BioInfo implements Payable {

    private final LocalDate birtDate;
    private final String sin;
    private boolean isSalaried;
    private double hoursPerWeek, hourlyRate, deductions, grossPay;
	private ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
    public Employee() {
        this.birtDate =  LocalDate.now();  
        this.sin = null;
    }

    /**
	 * @param birtDate
	 * @param sin
	 * @param isSalaried
	 * @param hoursPerWeek
	 * @param hourlyRate
	 * @param deductions
	 * @param grossPay
	 */
    public Employee(String id, String firstName, String lastName, String address, String city, Province province, String postalCode, 
    		String phone, boolean hasDirectDeposit,	LocalDate startDate, String sin, LocalDate birtDate, 
    		boolean isSalaried, double hoursPerWeek, double hourlyRate) {
        super(id, firstName, lastName, address, city, province, postalCode, phone, hasDirectDeposit, startDate);
		this.birtDate = birtDate;
		this.sin = sin;
		this.isSalaried = isSalaried;
		this.hoursPerWeek = hoursPerWeek;
		this.hourlyRate = hourlyRate;
		this.deductions = deductions;
		this.grossPay = grossPay;
	}

 
    /**
	 * @return the isSalaried
	 */
	public boolean isSalaried() {
		return isSalaried;
	}

	/**
	 * @param isSalaried the isSalaried to set
	 */
	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}

	/**
	 * @return the hoursPerWeek
	 */
	public double getHoursPerWeek() {
		return hoursPerWeek;
	}

	/**
	 * @param hoursPerWeek the hoursPerWeek to set
	 */
	public void setHoursPerWeek(double hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	/**
	 * @return the hourlyRate
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}

	/**
	 * @param hourlyRate the hourlyRate to set
	 */
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	/**
	 * @return the deductions
	 */
	public double getDeductions() {
		return deductions;
	}

	/**
	 * @param deductions the deductions to set
	 */
	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}

	/**
	 * @return the grossPay
	 */
	public double getGrossPay() {
		return grossPay;
	}

	/**
	 * @param grossPay the grossPay to set
	 */
	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}

	/**
	 * @return the birtDate
	 */
	public LocalDate getBirtDate() {
		return birtDate;
	}

	/**
	 * @return the sin
	 */
	public String getSin() {
		return sin;
	}

	@Override
    public int compareTo(Object o) {
        return 
         getLastName().compareTo(((Employee)o).getLastName());
    }
	
	
	 public void sortEmployee () {
	     Collections.sort(employeeList);
	}
	 
	 public void printEmployee() {
		 System.out.println ("\n[Employee List]");
		 	for (Employee employee: employeeList)
		 		System.out.println(employee);
	}
	
	 public boolean addEmployee(Employee employee) {
			employeeList.add(employee);
			return true;
		 }
	
    @Override
    public double getPaymentAmount() {
        grossPay = calcGrossPay();
        if(checkBonus()>0.0)
            grossPay += checkBonus();
        
        if(calcAge() >= 65 || calcAge() < 18)
            deductions = grossPay * 0.12;
        else
            deductions = grossPay * 0.19;
            
           return grossPay - deductions; 
        
    }
    
    public double calcGrossPay() {
        return hoursPerWeek * hourlyRate;
        
    }
    
    public double checkBonus() {
        if(this.getYearsWithCompany()>10)
            return 100.0;
        else
            return 0.0;
        
    }
    
    public int calcAge() {
            LocalDate now = LocalDate.now();  
            return now.getYear() - birtDate.getYear();
        
    }

     // String took me a while to figure out, but it was easier with the formatting than my old projects, big time!
    @Override
    public String toString() {
    	Locale money = new Locale("en", "US");
    	NumberFormat format = NumberFormat.getCurrencyInstance(money);
    	
    	String directdeposit = "";
    	if(isHasDirectDeposit() == true) {
    		directdeposit += "Yes";
    	}
    	else {
    		directdeposit = "No";
    	}
    	
    	String string = "Employee Paystub: ";
    	String idInfo = "ID: " + getId();
    	String fullName = getFirstName() + " " + getLastName();
    	String address1 = getAddress();
    	String address2 = getCity() + ", " + getProvince() + " " + getPostalCode();
    	String lines = "----------------------------------------------------------------------------------------------------------";
    	String contactInfo = "Phone: " + getPhone() + " | Start Date: " + DateTimeFormatter.ofPattern("MM/dd/yy").format(getStartDate()) + " | Direct Deposit: " + directdeposit + 
    			             "\nSIN: " + getSin() + " | Birth Date: " + getBirtDate();
    	String paymentAmountInfo = "Hours: " + getHoursPerWeek() + "\nHourly Rate: " + format.format(getHourlyRate()) + "\nGross Pay: " + format.format(calcGrossPay()) + 
    			                   "\nBonus: " + format.format(checkBonus()) + "\nDeductions: " + format.format(getDeductions()) + "\nNet Pay: " + format.format(getPaymentAmount());
    	
    	
        return lines + "\n" + string + "\n" + lines + "\n" + idInfo + "\n" + fullName + "\n" + address1 + "\n" + address2 + "\n" + 
        	   lines + "\n" + contactInfo + "\n" + paymentAmountInfo + "\n" + lines;   
        	   
    	}
       
}
