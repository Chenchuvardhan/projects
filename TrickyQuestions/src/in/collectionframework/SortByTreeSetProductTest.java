package in.collectionframework;

import java.util.Set;
import java.util.TreeSet;

class Product {
	String name;
	Double price;
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return Double.compare(this.price, o.price);
	}
	
	
}

public class SortByTreeSetProductTest {
	public static void main(String[] args) {
     Set<Product> set=new TreeSet<>();
     Product p1=new Product("GLASS",90.00);
    // Set<Product> set=new HashSet<>();
   System.out.println( set.add(p1));
   System.out.println(set.toString());
     
	}
}
