import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		FruitType jam1 = new FruitType("fraoula", 600);
		System.out.println("Object Jam1 has been created");
		FruitType jam2 = new FruitType("kerasi", 420);
		System.out.println("Object Jam2 has been created");
		FruitType jam3 = new FruitType("portokali", 480);
		System.out.println("Object Jam3 has been created");
		FruitType jam4 = new FruitType("mantarini", 360);
		System.out.println("Object Jam4 has been created\n");
		
		Customer customer1 = new Customer("Olga", "Patidou","DOY B Peiraia","046208830","OK");
		System.out.println("Customer customer1 has been created");
		Customer customer2 = new Customer("Nikolaos", "Alexiou","DOY Ilioupolis","180226310","OK");
		System.out.println("Customer customer2 has been created\n");
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(customer1);
		customers.add(customer2);
		
		 Order order1 = new Order(customer1, null);
	        order1.addFruitType(jam1, 50);     
	        order1.addFruitType(jam3, 14);   
	        System.out.println("Order order1 has been created"); 
	       
	     Order order2 = new Order(customer1, null);
	        order2.addFruitType(jam4, 120);    
	        order2.addFruitType(jam3, 45);     
	        System.out.println("Order order2 has been created"); 
	        
	     Order order3 = new Order(customer2, null);
	        order3.addFruitType(jam2, 80);     
	        order3.addFruitType(jam3, 35);     
	        order3.addFruitType(jam1, 28);
	        System.out.println("Order order3 has been created"); 
	        
	     Order order4 = new Order(customer2, null);
	        order4.addFruitType(jam4, 60);  
	        System.out.println("Order order4 has been created\n"); 
	        
	      ArrayList<Order> orderList = new ArrayList<>();
	        orderList.add(order1);
	        System.out.println("Order order1 has been added to the list"); 
	        orderList.add(order2);
	        System.out.println("Order order2 has been added to the list"); 
	        orderList.add(order3);
	        System.out.println("Order order3 has been added to the list"); 
	        orderList.add(order4);
	        System.out.println("Order order4 has been added to the list\n"); 
	        
	        System.out.println("Before the removal");
	        for (Order o : orderList) {
	    	    o.printDataOrders();
	    	} 
	     
	        orderList.remove(order2);  
	      System.out.println("Order order2 has been removed from the list\n"); 
	      
	      System.out.println("After the removal");
	      for (Order o : orderList) {
	    	    o.printDataOrders();
	    	}
	}

}
