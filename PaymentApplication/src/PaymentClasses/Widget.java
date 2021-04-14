package PaymentClasses;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Final Project PaymentApplication - OOP
 * @author Courtney Peacock
 * @date 04/04/2021
 * Widget
 */

public class Widget implements Comparable<Object> {
    
    private String id, name, desc;
    private double price;
    private ArrayList<Widget> widgetList = new ArrayList<Widget>();
    
    public Widget() {
    }

    /**
	 * @param id
	 * @param name
	 * @param desc
	 * @param price
	 */
	public Widget(String id, String name, String desc, double price) {
		
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	 public void sortWidget() {
	     Collections.sort(widgetList);
	}
	 
	 public void printWidget() {
		 System.out.println ("\n[Widget List]");
		 	for (Widget widget: widgetList)
		 		System.out.println(widget);
	}
	
	 public boolean addWidget(Widget widget) {
		 widgetList.add(widget);
			return true;
		 }

    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getId() + "\t\t" + getName() + "\t\t\t\t" + getDesc() + "\t\t\t" + getPrice();
	}

	@Override
    public int compareTo(Object o) {
        return this.getName().compareTo(((Widget)o).getName());
    }
    
    
}
