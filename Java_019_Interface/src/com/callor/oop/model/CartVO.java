package com.callor.oop.model;

/* 카트 정보를 담아 App에서 사용할 Value Object 클래스
 * 구매자, 상품명, 규격, 날짜, 시각, 수량, 구매단가, 구매금액 */
public class CartVO {

	private String UserName;
	private String ProductName;
	private String standard;
	private String Date;
	private String Time;
	private int qty;
	private int price;
	private int total;

	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "CartVO [UserName=" + UserName + ", ProductName=" + ProductName + ", standard=" + standard + ", Date="
				+ Date + ", Time=" + Time + ", qty=" + qty + ", price=" + price + ", total=" + total + "]";
	}
	
}
