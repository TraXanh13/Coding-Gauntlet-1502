import stage1.Stage1;
import stage2.Stage2;
import stage3.Stage3;

public class Main {
	public static void main(String[] args) {
		Stage1 s1 = new Stage1();
		Stage2 s2 = new Stage2();
		Stage3 s3 = new Stage3();
		s1.printStage1();
		s2.printStage2();
		s3.printStage3();
	}
}