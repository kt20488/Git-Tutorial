package withArrayList;

public class Customer {


	protected String CustomerName;
	protected String CustomerGrade;
	protected int CustomerID;
	double bonusRatio;
	int bonusPoint;
	
	public Customer() {
		initCustomer();
	}
	
	public Customer(int CustomerID, String CustomerName) {
		this.CustomerName = CustomerName;
		this.CustomerID = CustomerID;
		
		initCustomer();
	}
	

	public String showCustomerInfo() {
		return CustomerName + "님의 등급은 " + CustomerGrade + " 이며 , 보너스 포인트는 " + bonusPoint + " 입니다. ";
	}
	
	public void initCustomer() {
		CustomerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public void bonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerGrade() {
		return CustomerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		CustomerGrade = customerGrade;
	}

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}
	
}