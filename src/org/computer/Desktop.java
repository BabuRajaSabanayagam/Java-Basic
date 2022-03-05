package org.computer;

public class Desktop extends Software {

	@Override
	public void student() {

		System.out.println("Student Name babu");
	}

public static void main(String[] args) {
	
	Desktop d = new Desktop();
	d.student();
}

}
