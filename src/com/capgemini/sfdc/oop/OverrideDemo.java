package com.capgemini.sfdc.oop;

class BasicPhone {

	public void call() {
		System.out.println("Calling...");
	}

	public void sms() {
		System.out.println("Sending SMS...");
	}
}

class FeaturePhone extends BasicPhone {

	public void music() {
		System.out.println("Playing music...");
	}
}

class SmartPhone extends FeaturePhone {

	public void camera() {
		System.out.println("Clicking pics...");
	}

	@Override
	public void music() {
		System.out.println("Playing DOLBY music...");
	}

}

class OnePlus extends SmartPhone {

}

class Iphone extends SmartPhone {

}

class Mi extends SmartPhone {

}

public class OverrideDemo {

	public static void main(String[] args) {

		SmartPhone phone = new SmartPhone();
		phone.camera();
		phone.music();
		phone.call();
		phone.sms();
	}
}

abstract class A {

	abstract void m1();
}

class B extends A {

	@Override
	void m1() {

	}

}
