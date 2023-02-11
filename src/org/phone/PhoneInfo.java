package org.phone;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("samsung");

	}
     private void phoneMieiNum() {
    	 System.out.println("phone version");
		
	}
     private void camera() {
    	 System.out.println("12mp");

	}
     private void storage() {
    	 System.out.println("64gb");

	}
     private void osName() {
    	 System.out.println("andriod");

	}
     public static void main(String[] args) {
		PhoneInfo mob = new PhoneInfo();
		mob.phoneName();
		mob.phoneMieiNum();
		mob.camera();
		mob.storage();
		mob.osName(); 
		
	}
	}
