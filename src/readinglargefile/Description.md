
Reading file traditional way
-----------------------------
The standard way of reading the lines of the file is in memory – both Guava and Apache Commons IO provide a quick way to do just that:
Files.readLines(new File(path), Charsets.UTF_8);

FileUtils.readLines(new File(path));
The problem with this approach is that all the file lines are kept in memory – which will quickly lead to OutOfMemoryError if the File is large enough.


Streaming with Apache Commons IO
---------------------------------
The same can be achieved using the Commons IO library as well, by using the custom LineIterator provided by the library:

LineIterator it = FileUtils.lineIterator(theFile, "UTF-8");
try {
    while (it.hasNext()) {
        String line = it.nextLine();
        // do something with line
    }
} finally {
    LineIterator.closeQuietly(it);
}
Since the entire file is not fully in memory – this will also result in pretty conservative memory consumption numbers: (~150 Mb consumed)

1
2
[main] INFO  o.b.java.CoreJavaIoIntegrationTest - Total Memory: 752 Mb
[main] INFO  o.b.java.CoreJavaIoIntegrationTest - Free Memory: 564 Mb

Streaming Through the File
Let's now look at a solution – we're going to use a java.util.Scanner to run through the contents of the file and retrieve lines serially, one by one:


Streaming Through the File
-----------------------------
Let's now look at a solution – we're going to use a java.util.Scanner to run through the contents of the file and retrieve lines serially, one by one:

FileInputStream inputStream = null;
Scanner sc = null;
try {
    inputStream = new FileInputStream(path);
    sc = new Scanner(inputStream, "UTF-8");
    while (sc.hasNextLine()) {
        String line = sc.nextLine();
        // System.out.println(line);
    }
    // note that Scanner suppresses exceptions
    if (sc.ioException() != null) {
        throw sc.ioException();
    }
} finally {
    if (inputStream != null) {
        inputStream.close();
    }
    if (sc != null) {
        sc.close();
    }
}
This solution will iterate through all the lines in the file – allowing for processing of each line – without keeping references to them – and in conclusion, without keeping them in memory: (~150 Mb consumed)







