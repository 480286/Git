package com.mypack.entity;

public class Cart {

	int cid;						//购物id
	int cartNum;					//每个购物id的商品数量
	int totalPrice;					//购物车总价 
	int subtotal;					//小计
	Goods goods;
	User user;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int cid, int cartNum, int totalPrice, int subtotal, Goods goods, User user) {
		super();
		this.cid = cid;
		this.cartNum = cartNum;
		this.totalPrice = totalPrice;
		this.subtotal = subtotal;
		this.goods = goods;
		this.user = user;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getCartNum() {
		return cartNum;
	}
	public void setCartNum(int cartNum) {
		this.cartNum = cartNum;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Cart [cid=" + cid + ", cartNum=" + cartNum + ", totalPrice=" + totalPrice + ", subtotal=" + subtotal
				+ ", goods=" + goods + ", user=" + user + "]";
	}
	
				
	
}
