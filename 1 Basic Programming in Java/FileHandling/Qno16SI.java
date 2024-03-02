package Labsheet.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Qno16SI {
	public static void main(String[] args) {
		 try (BufferedReader reader = new BufferedReader(new
		 FileReader("G:\\7TH\\source.txt"));
		 BufferedWriter writer = new BufferedWriter(new
		 FileWriter("G:\\7TH\\destination.txt"))) {
		 String line;
		 while ((line = reader.readLine()) != null) {
		 String[] parts = line.split(",");
		 if (parts.length == 4) {
		 String name = parts[0].trim();
		 float principle = Float.parseFloat(parts[1].trim());
		 float rate = Float.parseFloat(parts[2].trim());
		 float time = Float.parseFloat(parts[3].trim());
		 float interest = (principle * rate * time) / 100;
		 writer.write(name + " " + principle + " " + rate + " " + time +
				 "Interest: " + interest);
		 writer.newLine();
		 }
		 }
		 } catch (IOException e) {
		 e.printStackTrace();
		 } catch (NumberFormatException e) {
		 System.err.println("Invalid input format: " + e.getMessage());
		 }
		 }
}
