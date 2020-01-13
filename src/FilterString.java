import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterString {

    static List<String> courses = List.of("Java", "Spring", "JavaScript", "Spring Boot", "API", "Angular",
            "Microservices", "AWS", "React", "PCF", "Azure", "Docker", "Kubernetes", "Spring cloud");

    public static void main(String[] args) {
        printCourses();
        containWord();
        atLeast5Letters();
    }

    static Consumer<? super String> action = x -> System.out.print(x + ", ");

    public static void printCourses() {
        System.out.println("\n\n*** printCourses ***");
        System.out.println(courses);
        courses.stream().forEach(System.out::println);
    }

    public static void containWord() {
        System.out.println("\n\n*** containWord Spring***");
        System.out.println(courses);
        courses.stream().filter(s -> s.contains("Spring")).forEach(action);
    }

    public static void atLeast5Letters() {
        System.out.println("\n\n*** atLeast5Letters ***");
        System.out.println(courses);
        Predicate<? super String> predicate = s -> s.length() >= 5;
        courses.stream().filter(predicate).forEach(action);
    }
}