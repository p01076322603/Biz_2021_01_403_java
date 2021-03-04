package com.callor.shop.model;

public class CartVO {

	// public 이라면 CartVO cartVO = new CartVO();로 인스턴스화 한 뒤에
	// cartVO.userName = "value"
	private String userName;
	private String productName;
	private int qty;
	private int price;
	private int total;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
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
		return "CartVO [userName=" + userName + ", productName=" + productName + ", qty=" + qty + ", price=" + price
				+ ", total=" + total + "]";
	}
}