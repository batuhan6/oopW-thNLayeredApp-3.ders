package oopWithNLayeredApp.entities;

public class Product {
	private int id;
	private String name;
	private double UnitPrice;
	
	public Product() {
		
	}

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		UnitPrice = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return UnitPrice;
	}

	public void setUnitPrice(double price) {
		UnitPrice = price;
	}
	
	
	

}
