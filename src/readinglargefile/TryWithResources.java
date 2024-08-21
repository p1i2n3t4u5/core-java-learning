package readinglargefile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResources {

  public static void main(String[] args) throws InterruptedException {
    try (Scanner scanner = new Scanner(new File("C:\\Users\\npanigrahi\\Downloads\\FINPERF2_API_Test_40lines_dev.jmx"))) {
      while (scanner.hasNext()) {
        System.out.println(scanner.nextLine());
        Thread.sleep(100);
      }
    } catch (FileNotFoundException fnfe) {
      fnfe.printStackTrace();
    }
  }

}
