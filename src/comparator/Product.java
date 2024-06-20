package comparator;

public class Product implements Comparable<Product>{

	private String name;
	private double price;
	private double rating;
	private Integer id;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Product(String name, double price, double rating) {
		super();
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", rating=" + rating + "]";
	}
	@Override
	public int compareTo(Product o) {
		
		return Double.compare(this.rating, o.getRating());
	}
	

}
