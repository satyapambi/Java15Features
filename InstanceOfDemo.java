package org.sun;

public class InstanceOfDemo {

	public static void instanceTest(Object obj) {
		if(obj instanceof String) {
			String s = (String)obj;
			if(! s.isEmpty() && s.equals("abc")) {
				System.out.println("Expected input: " + s);
			}
		}
		//Java 15
		if(obj instanceof String str && ! str.isEmpty() && str.equals("abc")) {
			//String s = (String)obj;
			//if() {
				System.out.println("Expected input: " + str);
			//}
		}
		
		
	}
	public static void main(String[] args) {
		Object s = (Object)"abc";
		instanceTest(s);
	}
}
