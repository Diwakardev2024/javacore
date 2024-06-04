package pawanClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamoperation {
	public static void main(String[] args) {
		List<Product> productList=new ArrayList<>();
		productList.add(new Product(1,"Dell", "AMD", 50000));
		productList.add(new Product(2,"Dell", "AMD", 55000));
		productList.add(new Product(3,"MSI", "AMD", 122000));
		productList.add(new Product(4,"Lenavo", "Intel-i7", 132000));
		
	productList.stream().map(item->item.price).forEach(price->System.out.print(price+" "));
	productList.stream().map(item->item.name).forEach(System.out::println);	
	productList.stream().map(item->item.id).forEach(System.out::println);	
	
	productList.stream().filter(item->item.price>100000).forEach(System.out::println);
	
	List<String> product=new ArrayList<>();
	
	product=productList.stream().map(item->(item.processor.toUpperCase())).collect(Collectors.toList());
//	productList.stream().map(item->(item.processor.toUpperCase())).forEach(System.out::println);	
	
//	System.out.println(product);
	
	
	List<Integer> numberList=Arrays.asList(2,3,4,5);
	List<Integer> multipliedList=new ArrayList<>();
	multipliedList=numberList.stream().map(n->n*3).collect(Collectors.toList());
	System.out.println(multipliedList);

	
	}
	

}

class Product{
	int id;
	String name;
	double price;
	String processor;
	
	public Product(int id,String name,String processor,double price) {
		this.id=id;
		this.name=name;
		this.processor=processor;
		this.price=price;
	}
}
