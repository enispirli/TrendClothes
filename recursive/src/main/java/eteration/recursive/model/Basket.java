package eteration.recursive.model;

import java.util.List;

public class Basket {

	private int Id;
	private User User;
	private List<Basket_Product> basketProduct;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public User getUser() {
		return User;
	}
	public void setUser(User user) {
		User = user;
	}
	public List<Basket_Product> getBasketProduct() {
		return basketProduct;
	}
	public void setBasketProduct(List<Basket_Product> basketProduct) {
		this.basketProduct = basketProduct;
	}
	
}
