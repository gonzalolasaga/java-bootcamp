package service;

public class ServiceProxy implements Service{
	Service implementation;
	protected ServiceProxy(Service imp){
		this.implementation=imp;
	}
	@Override
	public void addProduct(String s) {
		implementation.addProduct(s);
	}

	@Override
	public void removeProduct(String s) {
		implementation.removeProduct(s);
	}

	@Override
	public void modifyProduct(String s, String t) {
		implementation.modifyProduct(s, t);
	}

	@Override
	public void getProducts() {
		implementation.getProducts();
	}

}
