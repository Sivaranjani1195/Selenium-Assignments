package homeassignments;

public interface DatabaseConnection {

	
	public void connect();
	public void disconnect();
	void executeUpdate();
}
