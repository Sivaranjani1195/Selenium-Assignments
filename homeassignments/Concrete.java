package homeassignments;

public class Concrete implements DatabaseConnection{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connect");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Discconnect");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("executeUpdate");
	}

	
	public static void main(String[] args) {
		Concrete c= new Concrete();
		c.connect();
		c.disconnect();
		c.executeUpdate();
	}
}
