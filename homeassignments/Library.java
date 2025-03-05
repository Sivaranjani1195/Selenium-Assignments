package homeassignments;

public class Library {
	
	protected String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	public void issueBook() {
		// TODO Auto-generated method stub
		System.out.println("Book issued successfully");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Library lb = new Library();
		String title = lb.addBook("You can Win");
		System.out.println(title);
		lb.issueBook();

	}

}
