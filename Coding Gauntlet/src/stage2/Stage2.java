package stage2;

import java.util.Random;

public class Stage2 {
	public void printStage2() {
		moveBug();
		randomBug();
		battery();
		car();
	}
	
	//Stage2P1
	private void moveBug() {
		System.out.println("\nThis is the bug!");
		Bug b = new Bug("left", 0);
		System.out.println("Current position: " + b.getPosition());
		b.move();
		b.move();
		b.move();
		System.out.println("Moved 3 times left");
		System.out.println("Current position: " + b.getPosition());
		b.turn();
		b.move();
		b.move();
		System.out.println("Turned right and moved 2 times");
		System.out.println("Current position: " + b.getPosition());
		System.out.println();
	}
	
	//Stage2P2
	private void randomBug() {
		Random rand = new Random();
		Bug b1 = new Bug("left", 0);
		Bug b2 = new Bug("left", 0);
		Bug b3 = new Bug("left", 0);
		Bug b4 = new Bug("left", 0);
		Bug b5 = new Bug("left", 0);
		System.out.println("Random movement bug!");
		for(int i = 0; i < 50; i++) {
			if(rand.nextBoolean()) {
				b1.turn();
			}else {
				b1.move();
			}
		}
		for(int i = 0; i < 50; i++) {
			if(rand.nextBoolean()) {
				b2.turn();
			}else {
				b2.move();
			}
		}
		for(int i = 0; i < 50; i++) {
			if(rand.nextBoolean()) {
				b3.turn();
			}else {
				b3.move();
			}
		}
		for(int i = 0; i < 50; i++) {
			if(rand.nextBoolean()) {
				b4.turn();
			}else {
				b4.move();
			}
		}
		for(int i = 0; i < 50; i++) {
			if(rand.nextBoolean()) {
				b5.turn();
			}else {
				b5.move();
			}
		}
		System.out.println("Final position: \nBug1: " + b1.getPosition() + "\nBug2: " + b2.getPosition()
		+ "\nBug3: " + b3.getPosition() + "\nBug4: " + b4.getPosition() + "\nBug5: " + b5.getPosition());
		System.out.println();
	}

	//Stage2P3
	private void battery() {
		System.out.println("Battery!");
		Battery b = new Battery(2000);
		System.out.println("Remainging: " + b.getRemainingCap() + "\nCharge cycle: " + b.getChargeCycle());
		b.drain(150);
		System.out.println("Remainging: " + b.getRemainingCap() + "\nCharge cycle: " + b.getChargeCycle());
		b.charge();
		System.out.println("Remainging: " + b.getRemainingCap() + "\nCharge cycle: " + b.getChargeCycle());
	}

	//Stage2P4
	private void car() {
		
	}
}