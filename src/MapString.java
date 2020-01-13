
import java.util.*;
import java.util.function.*;

public class MapString {

    static List<String> courses = List.of("Java", "Spring", "JavaScript", "Spring Boot", "API", "Angular",
            "Microservices", "AWS", "React", "PCF", "Azure", "Docker", "Kubernetes", "Spring cloud");

    public static void main(String args[]) {
        numberOfCharacters();
        upperCase();
        lowerCase();
    }

    static Consumer<? super String> action = x -> System.out.print(x + ", ");

    public static void numberOfCharacters() {
        System.out.println("\n\n*** numberOfCharacters ***");
        System.out.println(courses);
        Consumer<? super Integer> action = x -> System.out.print(x + ", ");
        courses.stream().map(x -> x.length()).forEach(action);
    }

    public static void upperCase() {
        System.out.println("\n\n*** upperCase ***");
        System.out.println(courses);
        Function<? super String, ? extends String> mapper = x -> x.toUpperCase();
        courses.stream().map(mapper).sorted().forEach(action);
    }

    public static void lowerCase() {
        System.out.println("\n\n*** lowerCase ***");
        System.out.println(courses);
        Function<? super String, ? extends String> mapper = String::toLowerCase; 
        courses.stream().map(mapper).sorted().forEach(action);
    }
}