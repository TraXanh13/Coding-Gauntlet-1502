package stage3;

public class Media {
	private String title;
	private String pub;
	private int year;
	
	public Media(String title, String publisher, int year) {
		this.title = title;
		pub = publisher;
		this.year = year;
	}
	
	public String toString() {
		return "Title: " + title + "\nPublisher: " + pub + "\nYear: " + year;
	}
}
