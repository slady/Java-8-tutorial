package ps.java.tutorial.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(final String... args) {
        final List<String> names = Arrays.asList("John Lennon", "Paul McCartney", "George Harrison", "Ringo Starr");
        final List<String> strings7 = filterJava7(names);
        printJava8(strings7);

        final List<String> strings8 = filterJava8(names);
        printJava8(strings8);
    }

    private static List<String> filterJava7(final List<String> names) {
        final List<String> result = new ArrayList<>();

        for (final String name : names) {
            final String toUpperCase = name.toUpperCase();
            if (toUpperCase.contains("E")) {
                result.add(toUpperCase);
            }
        }

        return result;
    }

    private static List<String> filterJava8(final List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .filter(s -> s.contains("E"))
                .collect(Collectors.toList());
    }

    private static void printJava8(final List<String> names) {
        names.forEach(System.out::println);
        System.out.println();
    }

}
