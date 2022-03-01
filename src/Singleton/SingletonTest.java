package Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.displaySomeThing();

        System.out.println("---------------------- Creating second instance");

        Singleton instance2 = Singleton.getInstance();
        instance2.displaySomeThing();
    }
}
