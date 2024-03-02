package Labsheet.FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DublicateCharacter15 {
	public static void main(String[] args) {
		try (FileReader reader = new FileReader("G:\\\\7TH\\\\source.txt");
		 FileWriter writer = new FileWriter("G:\\\\7TH\\\\destination.txt")) 
		{
		 int c;
		 while ((c = reader.read()) != -1) {
		 writer.write(c);
		 writer.write(c);
		 }
		 System.out.println("Successfully done!");
		 } catch (IOException e) {
		 e.printStackTrace();
		 }
	}
}
