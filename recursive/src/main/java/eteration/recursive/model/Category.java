package eteration.recursive.model;

import java.util.List;

public class Category {
private int Id;
private String Name;
private List<Product> Products;

public List<Product> getProducts() {
	return Products;
}
public void setProducts(List<Product> products) {
	Products = products;
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

}
