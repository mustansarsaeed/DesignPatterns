package Strategy;

// Default Strategy
public class NoFilter implements CheckStrategy{
    @Override
    public boolean check(String s) {
        return true;
    }
}
