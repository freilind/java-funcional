
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Collection {

    static List<String> courses = List.of("Java", "Spring", "JavaScript", "Spring Boot", "API", "Angular",
            "Microservices", "AWS", "React", "PCF", "Azure", "Docker", "Kubernetes", "Spring cloud");

    static List<Integer> numbers = List.of(3, 8, 11, 7, 25, 31, 4, 10, 78, 5, 12, 27, 2, 7, 3, 1, 99, 66, 53, 21, 3, 10,
    81, 9, 9, 14, 33, 5, 30, 46);

    public static void main(String[] args){
        collectionEven();
        lengthTitle();
    }

    public static void collectionEven(){
        System.out.println("\n\n*** collectionEven ***");
        System.out.println(numbers);   
        List<Integer> result = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(result);
    }

    public static void lengthTitle(){
        System.out.println("\n\n*** lengthTitle ***");
        System.out.println(courses);   
        List<String> result = courses.stream().map(x -> x.legth()).collect(Collectors.toList());
        System.out.println(result);
    }

}