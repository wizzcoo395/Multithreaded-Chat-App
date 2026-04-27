import java.io.*;
import java.net.*;

public class ChatClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 1234;

    public static void main(String[] args) {
        try {
            Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            System.out.println("Connected to chat server");

            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            
            // 👇 ADD THIS
            System.out.print("Enter your name: ");
            String name = keyboard.readLine();

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Thread to receive messages
            new Thread(() -> {
                String serverMsg;
                try {
                    while ((serverMsg = in.readLine()) != null) {
                        System.out.println(serverMsg);
                    }
                } catch (IOException e) {
                    System.out.println("Disconnected from server");
                }
            }).start();

            // Send messages
            String userInput;
            while ((userInput = keyboard.readLine()) != null) {
                // 👇 MODIFY THIS
                out.println(name + ": " + userInput);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
