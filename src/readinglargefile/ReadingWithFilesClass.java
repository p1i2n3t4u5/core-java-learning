package readinglargefile;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadingWithFilesClass {

  public static void main(String[] args) {

    try (Stream<String> stream = Files
        .lines(Paths.get("C:\\Users\\npanigrahi\\Downloads\\FINPERF2_API_Test_40lines_dev.jmx"));) {
      stream.forEachOrdered(System.out::print);

    } catch (Exception e) {
    }

  }

}
