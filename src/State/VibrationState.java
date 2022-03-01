package State;

public class VibrationState implements MobileAlertState{
    @Override
    public void alert(AlertStateContext context) {
        System.out.println("This is the vibration state");
        context.setCurrentState(new SilentState());
    }
}
