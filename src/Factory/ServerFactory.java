package Factory;

public class ServerFactory {
    public static IServer createServer(String serverType) {
        if(serverType.equals("E")) {
            return new MailServer();
        } else if(serverType.equals("F")) {
            return new FtpServer();
        }  else if(serverType.equals("w")) {
            return new WebServer();
        } else {
            return null;
        }
    }
}
