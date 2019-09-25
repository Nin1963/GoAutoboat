package autoboat;

public abstract class Vehicle {
	
	private String brand;
	private int kilometers;

	public Vehicle(String brand) {
		this.brand = brand;
		this.kilometers = 0;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setBrand(String Brand) {
		this.brand = brand;
	}
	
	public int getKilometers() {
		return this.kilometers;
	}
	
	public void setKilometers() {
		this.kilometers = kilometers;
	}
	
    public abstract String doStuff();
	
}