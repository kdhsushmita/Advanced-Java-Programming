package Labsheet.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling14 {
	public static void main(String[] args) throws IOException {
		File file = new File("G:\\7TH\\source.txt");
		FileInputStream fis = new FileInputStream(file);
		byte bytes[] = new byte[(int) file.length()];
		fis.read(bytes);
		File out = new File("G:\\7TH\\destination.txt");
		FileOutputStream fos = new FileOutputStream(out);
		fos.write(bytes);
		fos.flush();
		System.out.println("Data successfully written in the specified file");
		}
}
