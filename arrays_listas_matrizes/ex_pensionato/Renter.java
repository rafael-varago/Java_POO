package entities;

public class Renter {

	private String name;
	private String email;
	private int room;
	
	public Renter(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getRoom() {
		return room;
	}
}
