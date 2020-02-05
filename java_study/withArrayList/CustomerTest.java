package withArrayList;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "�̼���");
		Customer customerShin = new Customer(10020, "�Ż��Ӵ�");
		Customer customerHong = new Customer(10030, "ȫ�浿");
		Customer customerYul = new Customer(10040, "������");
		Customer customerKim = new Customer(10050, "������", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
		
		System.out.println("====== �� ���� ��� =======");
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		
		}
		System.out.println("========�������� ����Ʈ ���");
		
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			
		}
		
	}

}
