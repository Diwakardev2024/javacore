package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Laptop", 1200.0, 4.5));
		products.add(new Product("Smartphone", 800.0, 4.7));
		products.add(new Product("Tablet", 300.0, 4.3));
		products.add(new Product("Smartwatch", 200.0, 4.8));

		System.out.println("Before sorting:");
		for (Product product : products) {
			System.out.println(product);
		}

		// Sort products by price
		Collections.sort(products, new PriceComparator().reversed());
		System.out.println("\nAfter sorting by price:");
		for (Product product : products) {
			System.out.println(product);
		}
		Collections.sort(products);
		Collections.sort(products,new RatingComparator());
		// Sort products by rating
		Collections.sort(products, new RatingComparator()); // 1st approach
		
		Collections.sort(products, (a1,a2)->(int)(a1.getRating()-a2.getRating())); // 2nd approach
		
		Collections.sort(products, Comparator.comparing(a1->a1.getRating())); // 3nd approach
		
		Collections.sort(products, Comparator.comparing((Product a1)->a1.getRating()).thenComparing((z)->z.getPrice())); // 4th approach
		
		Collections.sort(products, Comparator.comparing((Product a1)->a1.getRating())
				.thenComparing((Product q,Product w)->q.getId().compareTo(w.getId()))); // 5th approach
		
				
		// Sort products by name
		Collections.sort(products, new NameComparator()); // 1st approach
		Collections.sort(products, (a,b)-> (int) (a.getPrice()-b.getPrice())); // 2nd approach
		Collections.sort(products, Comparator.comparing(x -> x.getPrice())); // 3rd approach
		
		// Multiple comparators
		Comparator<Product> comp =  Comparator.comparing( (Product x) -> x.getPrice())
				.thenComparing((Product t, Product o)-> t.getId().compareTo(o.getId()));
		
		Comparator<Product> comp2 =  Comparator.comparing( (Product x) -> x.getPrice())
				.thenComparing((y) -> y.getName());
		Comparator<Product> comp3 =  Comparator.comparing( (Product x) -> x.getPrice())
				.thenComparing(Product::getId);
		
		
		
		Comparator<Product> comp1 = Comparator.comparing((Product p) -> p.getPrice())
                .thenComparing((Product p1, Product p2) -> p1.getName().compareTo(p2.getName()));
		
		Collections.sort(products, comp ); // 4th approach
		
		Comparator<?> pro=Comparator.nullsFirst(Comparator.naturalOrder());
		System.out.println(pro);
	}
}
