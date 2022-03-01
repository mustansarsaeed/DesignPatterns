package Strategy;

// Algorithm instance
public class WordLongerThan5 implements CheckStrategy{
    @Override
    public boolean check(String s) {
        return s.length() > 5;
    }
}
