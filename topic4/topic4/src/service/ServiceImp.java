package service;

import topic4.ShoppingCart;

public class ServiceImp implements Service{
	ShoppingCart cart=new ShoppingCart();
	protected ServiceImp(){}
	@Override
	public void addProduct(String s) {
		cart.buy(s);
	}
	@Override
	public void removeProduct(String s) {
		cart.deleteProduct(s);
	}
	@Override
	public void modifyProduct(String s, String t) {
		cart.deleteProduct(s);
		cart.buy(t);
	}
	@Override
	public void getProducts() {
		System.out.println(cart.displayItem());
		
	}
		
	

}
