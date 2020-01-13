
import java.util.*;
import java.util.function.Consumer;

public class Sort {

    static List<String> courses = List.of("Java", "Spring", "JavaScript", "Spring Boot", "API", "Angular",
            "Microservices", "AWS", "React", "PCF", "Azure", "Docker", "Kubernetes", "Spring cloud");

    public static void main(String[] args) {
        sort();
        sortReverse();
        sortLength();
    }

    static Consumer<? super String> action = x -> System.out.print(x + ", ");

    public static void sort() {
        System.out.println("\n\n*** sort ***");
        System.out.println(courses);   
        courses.stream().sorted().forEach(action);
    }

    public static void sortReverse() {
        System.out.println("\n\n*** sortReverse ***");
        System.out.println(courses);
        courses.stream().sorted(Comparator.reverseOrder()).forEach(action);
    }

    public static void sortLength() {
        System.out.println("\n\n*** sortLength ***");
        System.out.println(courses);
        courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(action);
    }
}