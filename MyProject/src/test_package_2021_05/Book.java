package test_package_2021_05;

public class Book {
	private String title;
	private Double price;
	
	public Book() {}
	
	public Book(String title, Double price) {
		this.title = title;
		this.price = price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
}
