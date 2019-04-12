package stage2;

public class Bug {
	private String[] dir = {"LEFT", "RIGHT"};
	private int position = 0;
	private int direction;
	
	public Bug(String direction, int position) {
		this.position = position;
		if (dir[0].equalsIgnoreCase(direction)) {
			this.direction = 0;
		}else {
			this.direction = 1;
		}
	}
	
	public void turn() {
		if(direction == 0) {
			direction = 1;
		}else {
			direction = 0;
		}
	}
	
	public void move() {
		if(direction == 0) {
			position -= 1;
		}else {
			position += 1;
		}
	}
	
	public int getPosition() {
		return position;
	}
}
