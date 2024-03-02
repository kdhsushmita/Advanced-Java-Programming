package Labsheet.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Qno17_ReadLinebyLine {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new
		FileReader("G:\\7TH\\source.txt"))) 
		{
		 String line;
		 while ((line = reader.readLine()) != null) {
		 System.out.println(line);
		 }
		 } catch (IOException e) {
		 e.printStackTrace();
		 }
		 }


}
