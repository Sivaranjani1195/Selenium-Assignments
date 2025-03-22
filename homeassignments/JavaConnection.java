package homeassignments;

public class JavaConnection extends MySqlConnection {
	
	public static void main(String[] args) {
		JavaConnection jct = new JavaConnection();
		jct.connect();
		jct.disconnect();
		jct.executeQuery();
		jct.executeUpdate();
		
	}

	
	
}
