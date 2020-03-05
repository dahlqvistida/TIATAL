package cars;

public class BMW extends Cars{

	@Override
	public void drive() {
		System.out.println("BMW does't drive safe, they drive like idiots");
		
	}

	@Override
	public void honk() {
		System.out.println("BMW honks all the time");
		
	}

	@Override
	public void blink() {
		System.out.println("BMW doesn't know how to use the blinkers");
		
	}

	@Override
	public void setDoors(String doors) {
		System.out.println(doors);
		
	}

}
