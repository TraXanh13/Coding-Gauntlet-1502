package stage3;

public class Stage3 {
	public void printStage3() {
		book();
	}

	private void book() {
		System.out.println();
		Media m = new Media("Music", "Golden Records", 1967);
		Book b = new Book("Moby Dick", "Book company", 1955, "Guy who wrote it", 5869);
		NonFiction nf = new NonFiction("NF Book", "Book company", 2019, "Me", 12343, "My life in shambles", 1359478392);
		Fiction f = new Fiction("F Book", "Book company", 2019, "Me", 947, "My life in pieces", 1359478392);
		System.out.println(m + "\n");
		System.out.println(b + "\n");
		System.out.println(nf + "\n");
		System.out.println(f + "\n");
	}
}
