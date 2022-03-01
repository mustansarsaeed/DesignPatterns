package Adapter;

public class ConcretTarget implements AbstractPlug{
    @Override
    public void roundPin() {
        System.out.println("Round pin");
    }

    @Override
    public void pinCount() {
        System.out.println("Two pins");
    }
}
