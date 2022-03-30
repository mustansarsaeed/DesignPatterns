package Factory;

public class MailServer implements IServer {
    public void sendDataToServer(String url) {
        System.out.println("Sending the data."); // for the testing purpose
    }
    @Override
    public void displayServer() {
        System.out.println("Mail Server");
    }
}
