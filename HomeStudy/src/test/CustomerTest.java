package test;

import java.util.ArrayList;
import java.util.List;

import inheritance.Customer;
import inheritance.GoldCustomer;
import inheritance.VIPCustomer;

public class CustomerTest {

	public static void main(String[] args) {

		List<Customer> customerList = new ArrayList<Customer>();

/*		
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10011, "신사임당");
		GoldCustomer customerHong = new GoldCustomer(10012, "홍길동");
		GoldCustomer customerYul = new GoldCustomer(10013, "이율곡");
		VIPCustomer customerKim = new VIPCustomer(10014, "김유신", 101);
*/		
		Customer customerLee;
		Customer customerShin;
		GoldCustomer customerHong;
		GoldCustomer customerYul;
		VIPCustomer customerKim;

		customerList.add(customerLee = new Customer(10010, "이순신"));
		customerList.add(customerShin = new Customer(10011, "신사임당"));
		customerList.add(customerHong = new GoldCustomer(10012, "홍길동"));
		customerList.add(customerYul = new GoldCustomer(10013, "이율곡"));
		customerList.add(customerKim = new VIPCustomer(10014, "김유신", 101));
	
//		for (Customer c : customerList) {
//			System.out.println(c.showCustomerInfo());
//		}

		int price = 10000;
		for (Customer c : customerList) {
		
			int cost = c.calcPrice(price);
		
			System.out.println(c.getCustomerName() + "님이 " + cost + "를 지불하셨습니다");
			System.out.println(c.showCustomerInfo());
		}

		
	}
}
