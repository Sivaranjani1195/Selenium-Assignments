package homeassignments;

public abstract class MySqlConnection implements DatabaseConnection{

	public void executeQuery() {
		System.out.println("executeQuery");
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnected");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("update executed");
	}
	
	
}
