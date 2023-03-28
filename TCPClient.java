import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello, server!");
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




