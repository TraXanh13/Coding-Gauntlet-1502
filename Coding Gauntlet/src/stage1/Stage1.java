package stage1;

import java.util.ArrayList;
import java.util.Arrays;

public class Stage1 {
	private static int[] iData = {2, 12, 16, 1, 51, 11, 4};
	private static String[] sData = {"One", "Two", "Three", "Four"};
	private static int[][] iUnique = {{1, 5, 2, 4}, {3, 6, 7, 8}};
	private static int[][] iNotUnique = {{1, 2, 3, 4}, { 6, 5, 7, 4}};
	
	public void printStage1() {
		stage1P1();
		stage1P2();
		System.out.println(stage1P3(iUnique));
		System.out.println(stage1P3(iNotUnique));
		stage1P4();
		stage1P5();
	}
	
	private static void stage1P1() {
		Arrays.sort(iData);
		int total = iData[0] + iData[iData.length - 1];
		System.out.println(total);
	}
	
	private static void stage1P2() {
		String temp = sData[0];
		System.out.println("Unchanged:\n" + Arrays.toString(sData));
		for (int i = 0; i < sData.length - 1; i++) {
			sData[i] = sData[i + 1];
		}
		sData[sData.length-1] = temp;
		System.out.println("Changed:\n" + Arrays.toString(sData));	
	}
	/**
	 * Attempt #1
	 *
	private static void stage1P1() {
		int min = 100,
			max = 0, 
			total = 0;
		for (int i = 0; i < iData.length; i++) {
			if(min > iData[i]) {
				min = iData[i];
			}
			if(max < iData[i]) {
				max = iData[i];
			}
		}
		total = min + max;
		System.out.println(total);
	}
	
	private static void stage1P2() {
		String moveEnd = null;
		for (int i = 0; i < sData.length; i++) {
			if(i == 0) {
				moveEnd = sData[i];
				sData[i] = sData[i + 1];
			}else if(i < (sData.length - 1)) {
				sData[i] = sData[i + 1];
			}else {
				sData[i] = moveEnd;
			}
		}
		System.out.println(Arrays.toString(sData));
	}
*/
	private static boolean stage1P3(int[][] arrayCheck) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arrayCheck.length; i++) {
			for (int j = 0; j < arrayCheck[i].length; j++) {
				if(list.isEmpty()) {
					list.add(arrayCheck[i][j]);
				}else {
					for (int index = 0; index < list.size(); index++) {		
						if(arrayCheck[i][j] == list.get(index)) {
							return false;
						}
					}
					list.add(arrayCheck[i][j]);
				}
			}
		}
		return true;
	}

	private static void stage1P4() {
		System.out.println("\nUnchanged:");
		for (int i = 0; i < iUnique.length; i++) {
			for (int j = 0; j < iUnique[i].length; j++) {
				System.out.print(iUnique[i][j]);
			}
			System.out.println();
		}
		
		int[] temp = iUnique[0];
		iUnique[0] = iUnique[1];
		iUnique[1] = temp;
		
		System.out.println("\nChanged:");
		for (int i = 0; i < iUnique.length; i++) {
			for (int j = 0; j < iUnique[i].length; j++) {
				System.out.print(iUnique[i][j]);
			}
			System.out.println();
		}
	}

	private static void stage1P5() {
		System.out.println("\nConnect four");
	}
}
