package org.sun;

public class TextBlock {

	public static void main(String[] args) {
		String email = "Hi"
				+ "Welcome to \"java beam\""
				+"Regards,"
				+"Java Beam Team";
		
		System.out.println(email);
		
		String email_j15 = """
				Hi,
				Welcom to "java" beam
				Regards,
				Java Beam Team
				""";
		System.out.println(email_j15);
	}
}
