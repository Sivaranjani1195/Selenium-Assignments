package homeassignments;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library();
		String tl = lib.addBook("Historic Speeches");
		System.out.println(tl);
		lib.issueBook();
	}

}
