package readinglargefile;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

public class SreamingWithApacheCommons {
	private static String filePath="C:\\project\\sample.txt";

	public static void main(String[] args) {
		LineIterator it=null;
		try {
			it = FileUtils.lineIterator(new File(filePath), "UTF-8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (it.hasNext()) {
				String line = it.nextLine();
				System.out.println(line);
				// do something with line
			}
		} finally {
			try {
				it.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
