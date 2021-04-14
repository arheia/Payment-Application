package PaymentClasses;
/**
 * Final Project, PaymentApplication - OOP
 * @author Courtney Peacock
 * @date 04/04/2021
 * Payee
 */

public class Payee extends BioInfo{
    
    private String companyName, businessNumber;

    public Payee() {
    }

    /**
	 * @param companyName
	 * @param businessNumber
	 */
	public Payee(String companyName, String businessNumber) {
		super();
		this.companyName = companyName;
		this.businessNumber = businessNumber;
	}


    /**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the businessNumber
	 */
	public String getBusinessNumber() {
		return businessNumber;
	}

	/**
	 * @param businessNumber the businessNumber to set
	 */
	public void setBusinessNumber(String businessNumber) {
		this.businessNumber = businessNumber;
	}

	
	
	 // Me experimenting, this may or may not work
	@Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public double getPaymentAmount() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Payee - " + "Company: " + companyName + ", Business Number: " + businessNumber;
	}
    
    
    
}
