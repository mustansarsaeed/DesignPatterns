package State;

public class SilentState implements MobileAlertState{
    @Override
    public void alert(AlertStateContext context) {
        System.out.println("This is the silent state");
    }
}
