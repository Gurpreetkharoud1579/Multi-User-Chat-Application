package muc;
public class ServerMain {
    public static void main(String[] args) {
        int port = 8808;
        Server server = new Server(port);
        server.start();
    }
}
