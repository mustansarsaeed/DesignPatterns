package State;

public class StatePatternTest {
    public static void main(String[] args) {
        AlertStateContext context = new AlertStateContext();
//        context.alert();

        context.setCurrentState(new VibrationState());
        context.alert();

        context.alert();
    }
}
