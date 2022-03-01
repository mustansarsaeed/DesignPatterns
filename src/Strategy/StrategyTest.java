package Strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context();
        String textToFilter = "This is the sample text for strategy pattern.";

//        context.filter(textToFilter);

//        context.changeStrategy(new StartWithT());
//        context.filter(textToFilter);

        context.changeStrategy(new WordLongerThan5());
        context.filter(textToFilter);
    }
}
