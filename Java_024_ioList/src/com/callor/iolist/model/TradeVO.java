package com.callor.iolist.model;

public class TradeVO {

	private String tradeDate;
	private String traderName;
	private String productName;

	private int tradeType;
	private int buyPrice;
	private int sellPrice;
	private int tradeAmount;
	
	
	public String getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}
	public String getTraderName() {
		return traderName;
	}
	public void setTraderName(String traderName) {
		this.traderName = traderName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getTradeType() {
		return tradeType;
	}
	public void setTradeType(int tradeType) {
		this.tradeType = tradeType;
	}
	public int getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(int buyPrice) {
		this.buyPrice = buyPrice;
	}
	public int getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}
	public int getTradeAmount() {
		return tradeAmount;
	}
	public void setTradeAmount(int priceTotal) {
		this.tradeAmount = priceTotal;
	}
	
}
