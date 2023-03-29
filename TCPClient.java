import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

    public TCPClient() {
        try {
            Socket socket = new Socket("localhost", 10000);
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
//            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            Scanner sc = new Scanner(System.in);
            while(true) {
//                out.write(sc.nextLine() + "\n");
//                out.flush();
                pw.println(sc.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new TCPClient();
    }
}