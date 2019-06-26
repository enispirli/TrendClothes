package eteration.recursive.model;

import java.util.List;

public class Product {
private int Id;
private String Name;
private Category Category;
private List<Basket_Product> BasketProduct;

public List<Basket_Product> getBasketProduct() {
	return BasketProduct;
}
public void setBasketProduct(List<Basket_Product> basketProduct) {
	BasketProduct = basketProduct;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public Category getCategory() {
	return Category;
}
public void setCategory(Category category) {
	Category = category;
}
}
