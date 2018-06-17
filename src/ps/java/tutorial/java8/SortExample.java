package ps.java.tutorial.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {

    public static void main(final String... args) {
        final List<String> names = Arrays.asList("John Lennon", "Paul McCartney", "George Harrison", "Ringo Starr");
        sortJava7(names);
        printJava7(names);

        sortJava8Version1(names);
        printJava8(names);
        sortJava8Version2(names);
        printJava8(names);
        sortJava8Version3(names);
        printJava8(names);
        sortJava8Version4(names);
        printJava8(names);
        sortJava8Version5(names);
        printJava8(names);
    }

    private static void sortJava7(final List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
    }

    private static void printJava7(final List<String> names) {
        for (final String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }

    private static void sortJava8Version1(final List<String> names) {
        Collections.sort(names, (String a, String b) -> {
            return a.compareTo(b);
        });
    }

    private static void sortJava8Version2(final List<String> names) {
        Collections.sort(names, (String a, String b) -> a.compareTo(b));
    }

    private static void sortJava8Version3(final List<String> names) {
        Collections.sort(names, (a, b) -> a.compareTo(b));
    }

    private static void sortJava8Version4(final List<String> names) {
        Collections.sort(names, String::compareTo);
    }

    private static void sortJava8Version5(final List<String> names) {
        names.sort(String::compareTo);
    }

    private static void printJava8(final List<String> names) {
        names.forEach(System.out::println);
        System.out.println();
    }

}
