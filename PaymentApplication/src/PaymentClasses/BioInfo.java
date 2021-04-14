package PaymentClasses;
import java.time.LocalDate;
import PaymentEnum.Province;
/**
 * Final Project, PaymentApplication - OOP
 * @author Courtney Peacock
 * @date 04/04/2021
 * BioInfo 
 */

public abstract class BioInfo implements Comparable<Object>, Payable{
    private final String id;
    private String firstName, lastName, address, city;
    private Province province;
    private String postalCode, phone;
    private LocalDate startDate;
    private boolean hasDirectDeposit;

    public BioInfo() {
        id = "";
    }

    /**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param city
	 * @param province
	 * @param postalCode
	 * @param phone
	 * @param startDate
	 * @param hasDirectDeposit
	 */

    public BioInfo(String id, String firstName, String lastName, String address, String city, Province province, String postalCode, String phone, boolean hasDirectDeposit, LocalDate startDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        this.phone = phone;
        this.startDate = startDate;
        this.hasDirectDeposit = hasDirectDeposit;
    }

    
    

    /**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the province
	 */
	public Province getProvince() {
		return province;
	}

	/**
	 * @param province the province to set
	 */
	public void setProvince(Province province) {
		this.province = province;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the startDate
	 */
	public LocalDate getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the hasDirectDeposit
	 */
	public boolean isHasDirectDeposit() {
		return hasDirectDeposit;
	}

	/**
	 * @param hasDirectDeposit the hasDirectDeposit to set
	 */
	public void setHasDirectDeposit(boolean hasDirectDeposit) {
		this.hasDirectDeposit = hasDirectDeposit;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

    public int getYearsWithCompany(){
        LocalDate now = LocalDate.now();  
        return now.getYear() - startDate.getYear();
    
    }
    // This was just breaking everything
    /*
	@Override
    public String toString() {
        return "\n[BioInfo]" + "\nID: " + id + "Full Name: "+ lastName + ", " + firstName + "\nAddress: " + address + ", City: " + city + ", Province: " + province + ", Postal Code: " + postalCode + "\nPhone: " + phone + "\nStart Date: " + startDate + "\nDirect Deposit: " + hasDirectDeposit;
    }
    */
}
