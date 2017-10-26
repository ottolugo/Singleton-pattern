package singleton;

public class Singleton {

    private static Singleton singleton;
    private int counter;

    private Singleton() {
	counter = 0;
    }

    public static Singleton getInstance() {
	if (singleton == null) {
	    singleton = new Singleton();
	}

	return singleton;
    }

    public int getCounter() {
	return counter;
    }

    public void addToCounter() {
	counter++;
    }

}
