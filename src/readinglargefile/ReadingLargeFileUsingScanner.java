package readinglargefile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadingLargeFileUsingScanner {

	// String path =
	public static void main(String[] args) {
		FileInputStream inputStream = null;
		Scanner sc = null;
		try {
			try {
				inputStream = new FileInputStream("C:\\Users\\npanigrahi\\Downloads\\FINPERF2_API_Test_40lines_dev.jmx");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			sc = new Scanner(inputStream, "UTF-8");
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
			    System.out.println(line);
			}
			// note that Scanner suppresses exceptions
			if (sc.ioException() != null) {
				try {
					throw sc.ioException();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (sc != null) {
				sc.close();
			}
		}
	}
}
