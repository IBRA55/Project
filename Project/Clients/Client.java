import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6001);

            String subscriber = "{ \"id\": 0, \"name_surname\": \"Ali Veli\", \"status\": 0 }";
            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            writer.write(subscriber);
            writer.flush();

            System.out.println("Subscriber sent: " + subscriber);

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
