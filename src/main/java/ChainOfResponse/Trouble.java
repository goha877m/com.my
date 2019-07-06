package ChainOfResponse;

public class Trouble {

	private int troubleLevel;
	public Trouble(int i) {
		this.troubleLevel = i;
	}

	public int getNumber() {
		return troubleLevel;
	}
	
	@Override
	public String toString() {
		return "[Trouble " + this.troubleLevel + "]";
	}

}
