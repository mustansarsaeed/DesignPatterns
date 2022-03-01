package Adapter;

public class AdapterTest {
    public static void main(String[] args) {
        // create the `adaptee` with which Client wants to interact
        ConcreteSwitchBoard concreteSwitchBoard = new ConcreteSwitchBoard();

        // target = Adapter(adaptee)
        AbstractPlug target = new Adapter(concreteSwitchBoard);
        target.roundPin();
        target.pinCount();

    }
}
