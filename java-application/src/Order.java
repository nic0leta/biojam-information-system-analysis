import java.util.HashMap;
import java.util.Map;


public class Order {
	private Customer customer;
	private Map<FruitType, Integer> items;
	
	
	public Order(Customer customer, Map<FruitType, Integer> items) {
		super();
		this.customer = customer;
		this.items = new HashMap<>();
	}
	
	public void addFruitType(FruitType fruit, int amount) {
		items.put(fruit, amount);
	}
	
	public void printDataOrders()
	{
		System.out.println("\nCustomer: " + customer.getName() +" " + customer.getLastname() + " with afm: " + customer.getAfm() + 
				" has ordered: ");
        for (Map.Entry<FruitType, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey().getFruit() + " x " + entry.getValue());
        }
 
	}
}
