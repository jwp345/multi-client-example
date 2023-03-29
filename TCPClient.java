import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

    public TCPClient() {
        try {
            Socket socket = new Socket("localhost", 10000);
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
//            BufferedWriter br = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Scanner sc = new Scanner(System.in);

            while(true) {
//                br.write(sc.nextLine() + "\n");
//                br.flush();
                pw.println(sc.nextLine());
                System.out.println(in.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new TCPClient();
    }
}