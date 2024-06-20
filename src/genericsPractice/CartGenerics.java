package genericsPractice;

import java.util.ArrayList;
import java.util.List;

public class CartGenerics<T> {

	private List<T> items;

	public CartGenerics() {
		items = new ArrayList<>();
	}

	public void addItem(T item) {

		items.add(item);
	}

	public void removeItem(T item) {
		items.remove(item);
	}

	public List<T> getItems() {
		return items;
	}

	public void printItems() {
		System.out.println("Cart contains:");
		for (T item : items) {
			System.out.println(item);
		}
	}

	public static void main(String[] args) {

		// Create a Cart for Electronics
		CartGenerics<Electronic> electronicCart = new CartGenerics<>();
		electronicCart.addItem(new Electronic("Laptop", 1500));
		electronicCart.addItem(new Electronic("Smartphone", 800));
		electronicCart.printItems();

		// Create a Cart for Clothing
		CartGenerics<Clothing> clothingCart = new CartGenerics<>();
		clothingCart.addItem(new Clothing("T-Shirt", "M"));
		clothingCart.addItem(new Clothing("Jeans", "32"));
		clothingCart.printItems();

		// Create a Cart for Books
		CartGenerics<Book> bookCart = new CartGenerics<>();
		bookCart.addItem(new Book("Effective Java", "Joshua Bloch"));
		bookCart.addItem(new Book("Clean Code", "Robert C. Martin"));
		bookCart.printItems();

	}

}

class Electronic {
	private String name;
	private double price;

	public Electronic(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Electronic{name='" + name + "', price=" + price + "}";
	}
}

class Clothing {
	private String type;
	private String size;

	public Clothing(String type, String size) {
		this.type = type;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Clothing{type='" + type + "', size='" + size + "'}";
	}
}

class Book {
	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "'}";
    }
}
