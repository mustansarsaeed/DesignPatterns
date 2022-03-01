package State;

public class AlertStateContext {
    private MobileAlertState currentState;

    public AlertStateContext() {
        this.currentState = new VibrationState();
    }

    public void setCurrentState(MobileAlertState state) {
        this.currentState = state;
    }

    public void alert() {
        this.currentState.alert(this);
    }
}
