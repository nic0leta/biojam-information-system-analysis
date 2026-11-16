import java.util.ArrayList;

public class Customer {
	private String name;
	private String lastname;
	private String billingAddress;
	private String afm;
	private String ferregyotita;
	
	
	public Customer(String name, String lastname,String billingAddress, String afm,
			String ferregyotita) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.billingAddress = billingAddress;
		this.afm = afm;
		this.ferregyotita = ferregyotita;
	}
	
	public void printData()
	{
		System.out.println("Customer's data: "+name+" "+ lastname + " " + afm + " ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAfm() {
		return afm;
	}

	public void setAfm(String afm) {
		this.afm = afm;
	}
	
	
	
}
