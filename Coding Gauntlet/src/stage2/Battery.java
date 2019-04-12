package stage2;

public class Battery {
	private double cap;
	private double currLife;
	private int chargeCycle = 0;
	
	public Battery(double capacity) {
		cap = capacity;
		currLife = capacity;
	}
	
	public void drain(double amount) {
		currLife -= amount;
		if(currLife < 0) {
			currLife = 0;
		}
	}
	
	public void charge() {
		currLife = cap;
		chargeCycle++;
	}
	
	public double getRemainingCap() {
		return currLife;
	}
	
	public int getChargeCycle() {
		return chargeCycle;
	}
}
