package cars;

public class Toyota extends Cars {

	@Override
	public void drive() {
		System.out.println("Toyota drives slow");
		
	}

	@Override
	public void honk() {
		System.out.println("Toyota honks sounds light and itchy");
		
	}

	@Override
	public void blink() {
		System.out.println("Toyota uses their blinkers");
		
	}

	@Override
	public void setDoors(String doors) {
		System.out.println(doors);
		
	}

}
