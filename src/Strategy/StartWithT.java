package Strategy;

// Algorithm instance
public class StartWithT implements CheckStrategy{
    @Override
    public boolean check(String s) {
        if(s.charAt(0) == 't') {
            return true;
        }
        else {
            return false;
        }
    }
}
