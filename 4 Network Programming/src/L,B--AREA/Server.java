package Question2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        final int PORT = 5555;

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server started. Waiting for clients...");

            while (true) {
                try (
                        Socket clientSocket = serverSocket.accept();
                        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                        Scanner in = new Scanner(clientSocket.getInputStream());
                ) {
                    String clientInput = in.nextLine();
                    if (clientInput.equalsIgnoreCase("exit")) {
                        System.out.println("Server closing...");
                        break;
                    }

                    String[] dimensions = clientInput.split(" ");
                    double length = Double.parseDouble(dimensions[0]);
                    double breadth = Double.parseDouble(dimensions[1]);
                    double area = calculateArea(length, breadth);
                    out.println("Area: " + area);
                }
            }
        }
    }

    private static double calculateArea(double length, double breadth) {
        return length * breadth;
    }
}
