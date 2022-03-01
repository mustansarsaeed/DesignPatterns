package Adapter;

public class Adapter implements AbstractPlug{
    private AbstractSwitchBoard abstractSwitchBoard;

    Adapter(AbstractSwitchBoard switchBoard) {
        this.abstractSwitchBoard = switchBoard;
    }

    @Override
    public void roundPin() {
        this.abstractSwitchBoard.flatPin();
    }

    @Override
    public void pinCount() {
        this.abstractSwitchBoard.pinCount();
    }
}
