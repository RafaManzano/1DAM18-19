package main.test;

import main.java.model.Order;
import main.java.model.Product;
import main.java.model.Supermarket;

public class TestSupermarket 
{
	public static void main(String[] args)
	{
		Supermarket s=new Supermarket();
		Order o=new Order(1,"consumer", s);
		Order o1=new Order(1,"consumer", s);
		Product p = new Product(1, "NoEsPera", 1000000.0, s);
		
		
		s.addOrder(o);
		s.addOrder(o1);
		
		System.out.println(o.toString());
		System.out.println(o.toString());
		
		s.removeOrder(o);
		
	}
}
