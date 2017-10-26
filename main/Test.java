package main;

import singleton.Singleton;

public class Test {

    public static void main(String[] args) {

	Singleton instance = Singleton.getInstance();
	Singleton instance2 = Singleton.getInstance();

	System.out.println(instance.getCounter());
	instance.addToCounter();
	System.out.println(instance.getCounter());
	System.out.println(instance2.getCounter());
	instance2.addToCounter();
	System.out.println(instance.getCounter());
	System.out.println(instance2.getCounter());
    }

}
