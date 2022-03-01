package Singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Constructor: Creating a singleton object.");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void displaySomeThing() {
        System.out.println("In the function displaySomeThing");
    }
}
