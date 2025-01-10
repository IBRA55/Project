import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import org.json.JSONObject;

public class Server1 {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(6001)) {
            System.out.println("Server1 listening on port 6001...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                StringBuilder data = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    data.append(line);
                }

                JSONObject subscriber = new JSONObject(data.toString());
                System.out.println("Received subscriber: " + subscriber.getString("name_surname"));

                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
