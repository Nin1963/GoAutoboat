package autoboat;

public class Car extends Vehicle {
	
	public Car(String brand) {
		super(brand);
	}

	@Override  
    public String doStuff() {  
        return "Je suis " + getBrand() + " et je fais vroom vroom";  
    }
}
