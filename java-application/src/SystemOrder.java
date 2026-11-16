import java.util.Map;

public class SystemOrder extends Order{
	private String orderNumber;
	private String customerName;
	private String fortotiki;
	private int afm;
	private String shippingAddress;
	private double price;
	public SystemOrder(Customer customer, Map<FruitType, Integer> items, String orderNumber, String customerName,
			String fortotiki, int afm, String shippingAddress, double price) {
		super(customer, items);
		this.orderNumber = orderNumber;
		this.customerName = customerName;
		this.fortotiki = fortotiki;
		this.afm = afm;
		this.shippingAddress = shippingAddress;
		this.price = price;
	}
	
	
	
	
	
	
	
	
}
