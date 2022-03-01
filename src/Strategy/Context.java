package Strategy;

import java.util.StringTokenizer;

public class Context {
    private CheckStrategy strategy;

    public Context() {
        this.strategy = new NoFilter();
    }

    public void changeStrategy(CheckStrategy strategy) {
        this.strategy = strategy;
    }

    public void filter(String text) {
        StringTokenizer words = new StringTokenizer(text);
        while(words.hasMoreTokens()) {
            String word = words.nextToken();
            if(strategy.check(word)) {
                System.out.println(word);
            }
        }
    }
}
