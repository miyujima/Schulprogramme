
public class Train {
	
	private int fahrzeitMax;
	
	Train() {
		fahrzeitMax = 0;
	}

	public void addFahrzeitMax(int zeit) {
		fahrzeitMax = fahrzeitMax + zeit;
	}
	
	public int getFahrzeitMax() {
		return fahrzeitMax;
	}
	
	public void setFahrzeit(int zeit) {
		fahrzeitMax = zeit;
	}
}
