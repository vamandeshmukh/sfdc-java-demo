package com.capgemini.sfdc.str;

public class ThreadDemo extends Thread {

	private StringBuffer buffer = new StringBuffer("abc");
	private StringBuilder builder = new StringBuilder("def");

	public synchronized StringBuffer getBuffer() {
		return buffer;
	}

	public StringBuilder getBuilder() {
		return builder;
	}

	void printStrings() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getBuffer());
			System.out.println(getBuilder());
		}
	}

	@Override
	public void run() {
		printStrings();
	}

	public static void main(String[] args) {

		String str = "abcd";
		StringBuffer sbf = new StringBuffer(str);
		System.out.println(sbf);
		sbf.append("efgh");
		System.out.println(sbf);

//		ThreadDemo obj1 = new ThreadDemo();
//		obj1.start();
//		ThreadDemo obj2 = new ThreadDemo();
//		obj2.start();

	}

}
