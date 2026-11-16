import java.util.Map;

public class SuggestedOrder extends Order{
	private int year;

	public SuggestedOrder(Customer customer, Map<FruitType, Integer> items, int year) {
		super(customer, items);
		this.year = year;
	}

	

	
	
	
}
