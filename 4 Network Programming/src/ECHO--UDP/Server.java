package Question3;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        final int PORT = 2222;
        System.out.println("Server started.");
        System.out.println("Listening to client...");

        try (
                ServerSocket serverSocket = new ServerSocket(PORT);
                Socket clientSocket = serverSocket.accept();
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                Scanner in = new Scanner(clientSocket.getInputStream());
        ) {
            while (true)
            {
                double radius = in.nextDouble();
                double area = Math.PI*radius*radius;
                System.out.println("Radius received from client: " + radius);
                out.println(area);

                String choice = in.next();
                if (choice.equalsIgnoreCase("Y")) break;

            }
            System.out.println("Server has been stopped.");
        }


    }
}
