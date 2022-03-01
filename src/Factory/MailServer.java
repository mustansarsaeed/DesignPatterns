package Factory;

public class MailServer implements IServer {
    @Override
    public void displayServer() {
        System.out.println("Mail Server");
    }
}
