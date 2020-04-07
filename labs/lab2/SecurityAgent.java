public class SecurityAgent {

	private Combination secret;
	private DoorLock door;

	public SecurityAgent(){
		int first, second, third;

		first = (int) (Math.random()*5) + 1;
		second = (int) (Math.random()*5) + 1;
		third = (int) (Math.random()*5) + 1;

		secret = new Combination(first, second, third);
		door = new DoorLock(secret);
	}

	public DoorLock getDoorLock() {
		return door;
	}

	public void activateDoorLock() {
		door.activate(secret);
	}

}