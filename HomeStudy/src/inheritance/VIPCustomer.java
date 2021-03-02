package inheritance;

public class VIPCustomer extends Customer {

	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		customerGrade = "VIP";
		saleRatio = 0.1;
		bonusRatio = 0.05;
		
	}
	
	@Override
	public int calcPrice(int price){
		
		bonusPoint = (int) (price * bonusRatio);
		price *= (1 - saleRatio);
		return price;
	}
	
	@Override
	public String showCustomerInfo(){ 
		return super.showCustomerInfo() + " 담당 상담원 아이디는 " + agentID + "입니다";
	}
	
}
