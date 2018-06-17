package ps.java.tutorial.java8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesExample {

    public static void main(final String... args) throws IOException {
        readLinesJava7("testFile.txt");
        System.out.println();
        readLinesJava8("testFile.txt");
    }

    private static void readLinesJava7(final String fileName) throws IOException {
        try (final BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    private static void readLinesJava8(final String fileName) throws IOException {
        Files.readAllLines(Paths.get(fileName)).forEach(System.out::println);
    }

}
