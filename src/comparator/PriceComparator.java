package comparator;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return Double.compare(o1.getPrice(), o2.getPrice());
	}
	

}
 class RatingComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getRating(), p2.getRating());
    }
}
 
 class NameComparator implements Comparator<Product> {
	 
	 
	    @Override
	    public int compare(Product p1, Product p2) {
	        return p1.getName().compareTo(p2.getName());
	    }
	}
// class IdComparator implements Comparator<Product> {
//	 
//	 
//	    @Override
//	    public int compare(Product p1, Product p2) {
//	        return p1.getId().compareTo(p2.getId());
//	    }
//	}
 
 
 