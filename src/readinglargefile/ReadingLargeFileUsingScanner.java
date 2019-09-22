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
				inputStream = new FileInputStream("C:\\project\\sample.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (sc != null) {
				sc.close();
			}
		}
	}
}
