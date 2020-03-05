package cars;

public abstract class Cars {

	public String doors; 
	
	public abstract void drive();
	
	public abstract void honk();
	
	public abstract void blink();
	
	public void light() {
		System.out.println("This car have both half and full light");
	}
	
	public abstract void setDoors(String doors);
	
}

