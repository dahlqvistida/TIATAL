package cars;

public class Volvo extends Cars {

	@Override
	public void drive() {
		System.out.println("Volvo drives safely");
		
	}

	@Override
	public void honk() {
		System.out.println("Volvo honks sounds loud");
		
	}

	@Override
	public void blink() {
		System.out.println("Volvo uses their blinkers");
		
	}

	@Override
	public void setDoors(String doors) {
		System.out.println(doors);
		
	}

	
	
}
