package stage3;

public class Fiction extends Book {
	private String topic;
	private int contact;
	
	public Fiction(String title, String publisher, int year, String author, int wordCount, String topic, int contact) {
		super(title, publisher, year, author, wordCount);
		this.topic = topic;
		this.contact = contact;
	}

	public String toString() {
		return super.toString() + "\nTopic: " + topic + "\nContact: " + contact;
	}
}
