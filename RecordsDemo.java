package org.sun;

public class RecordsDemo {

	record UserRecord(int userId, String userName) {
		
	}
	
	public static void main(String[] args) {
		UserRecord rec = new UserRecord(1111, "JavaBeam");
		//rec.userName = "werwrwr";
		System.out.println(rec.userId());
		System.out.println(rec.userName());
	}
}
