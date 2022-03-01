package Factory;

import java.util.Scanner;

public class FactoryTest {

//    public static void main(String[] args) {
//        IServer server = new MailServer();
//        server.displayServer();
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        String serverOption = "";
//        IServer server = null;
//
//        System.out.println("Select server type: E / F");
//
//        if(input.hasNextLine()) {
//            serverOption = input.nextLine();
//        }
//
//        if (serverOption.equals("E")) {
//            server = new MailServer();
//        } else if (serverOption.equals("F")) {
//            server = new FtpServer();
//        }
//
//        server.displayServer();
//    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String serverOption = "";
        IServer server = null;

        System.out.println("Select server type: E / F");

        if(input.hasNextLine()) {
            serverOption = input.nextLine();
        }

        server = ServerFactory.createServer(serverOption);
        server.displayServer();
    }
}
