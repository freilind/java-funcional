import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterNumber {

    static List<Integer> numbers = List.of(3, 8, 11, 7, 25, 31, 4, 10, 78, 5, 12, 27, 2, 7, 3, 1, 99, 66, 53, 21, 3, 10,
            81, 9, 9, 14, 33, 5, 30, 46);

    public static void main(String[] args) {
        evenNumbers();
        oddNumbers();
        multipleOf3();
    }

    static Consumer<? super Integer> action = x -> System.out.print(x + " ");

    public static void evenNumbers() {
        System.out.println("\n\n*** evenNumbers ***");
        System.out.println(numbers);
        numbers.stream().filter(x -> x % 2 == 0).forEach(action);
    }

    public static void oddNumbers() {
        System.out.println("\n\n*** oddNumbers ***");
        System.out.println(numbers);
        Predicate<? super Integer> predicate = x -> x % 2 != 0;
        numbers.stream().filter(predicate).forEach(action);
    }

    public static void multipleOf3() {
        System.out.println("\n\n*** multipleOf3 ***");
        System.out.println(numbers);
        Predicate<? super Integer> predicate = x -> x % 3 == 0;
        numbers.stream().filter(predicate).forEach(action);
    }
}