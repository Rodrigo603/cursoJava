package model.entities;

public class Rooms2 {
	private String name;
	private String email;
	

	public Rooms2 () {
		
	}
	
	public Rooms2 (String name, String email) {
		this.name = name;
		this.email = email;
		
	}
	public String toString() {
		return  name
				+ ","
				+email;
	
	}
}
