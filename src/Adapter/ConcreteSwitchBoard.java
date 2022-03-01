package Adapter;

// Concrete Adaptee
public class ConcreteSwitchBoard implements AbstractSwitchBoard{
    @Override
    public void flatPin() {
        System.out.println("Flat pin");
    }

    @Override
    public void pinCount() {
        System.out.println("Three pins");
    }
}
