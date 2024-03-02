package Labsheet.FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Qno18_quit {
	public static void main(String[] args) {
		 try (Scanner scanner = new Scanner(System.in);
		 FileWriter writer = new FileWriter("G:\\7TH\\source.txt")) {
		 String line;
		 while (true) {
		 System.out.print("Enter a line (type 'quit' to exit): ");
		 line = scanner.nextLine();
		 if (line.equals("quit")) {
		 break;
		 }
		 writer.write(line + "\n");
		 }
		 } catch (IOException e) {
		 e.printStackTrace();
		 }
		 }

}
