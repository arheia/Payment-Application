package PaymentClasses;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
/**
 * Final Project, PaymentApplication - OOP
 * @author Courtney Peacock
 * @date 04/04/2021
 * Invoice
 */

public class Invoice implements Payable
{
	private String id;
	private LocalDate date;
	private ArrayList<Widget> items;
	private Payee payee;
	private double subtotal;
	private double tax = 0.15;
	/**
	 * @param id
	 * @param date
	 * @param items
	 * @param payee
	 * @param subtotal
	 */
	public Invoice(String id, LocalDate date, Payee payee) {
		this.id = id;
		this.date = date;
		this.payee = payee;
		items = new ArrayList<Widget>();
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}
	/**
	 * @return the items
	 */
	public ArrayList<Widget> getItems() {
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(ArrayList<Widget> items) {
		this.items = items;
	}
	/**
	 * @return the payee
	 */
	public Payee getPayee() {
		return payee;
	}
	/**
	 * @param payee the payee to set
	 */
	public void setPayee(Payee payee) {
		this.payee = payee;
	}
	/**
	 * @return the subtotal
	 */
	public double getSubtotal() {
		return subtotal;
	}
	/**
	 * @return the tax
	 */
	public double getTax() {
		return tax;
	}
	/**
	 * @param tax the tax to set
	 */
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	public void addWidget(Widget widget)
	{
		items.add(widget);
	}
	public void removeWidget(Widget widget)
	{
		for(int i = 0; i < items.size(); i++)
		{
			if(items.get(i).getName().equals(widget.getName()))
			{
				items.remove(i);
			}
		}
	}
	
	public double calcSubtotal()
	{
		for(int i = 0; i < items.size(); i++)
		{
			subtotal += items.get(i).getPrice();
		}
		
		return subtotal;
	}
	
	public double calcTax()
	{
		return subtotal*tax;
	}
	
	@Override
	public double getPaymentAmount() {
		double grandTotal = subtotal + calcTax();
		return grandTotal;
	}
	
	@Override
	public String toString()
	{
		Locale money = new Locale("en", "US");
		NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(money);
		
		String titles = "Item ID\t\t|\tItem Name\t\t|\tDescription\t\t\t|\tPrice";
		String lines = "----------------------------------------------------------------------------------------------------------";
		String invInfo = "Date: " + DateTimeFormatter.ofPattern("MM/dd/yy").format(getDate()) + "\nInvoice ID: " + getId();
		String payeeInfo = payee.toString();
		String info = "";
		for(int i = 0; i < items.size(); i++)
		{
			info = info + items.get(i).toString() + "\n";
		}
		
		return "Invoice\n" + lines + "\n" + invInfo + "\n" + lines + "\n" + payeeInfo + "\n" + lines + "\n" + titles + "\n" + info + 
				"\nSubtotal: " + dollarFormat.format(calcSubtotal()) + "\nTax: \t  " + dollarFormat.format(calcTax()) + "\nTotal: \t  " + 
				dollarFormat.format(getPaymentAmount()) + "\n" + lines;
	}
}
