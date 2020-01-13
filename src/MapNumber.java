import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MapNumber {

    static List<Integer> numbers = List.of(3, 8, 11, 7, 25, 31, 4, 10, 78, 5, 12, 27, 2, 7, 3, 1, 99, 66, 53, 21, 3, 10,
            81, 9, 9, 14, 33, 5, 30, 46);

    public static void main(String[] args) {
        evenCubedNumbers();
        oddCubedNumbers();
    }

    static Consumer<? super Integer> action = x -> System.out.print(x + ", ");

    public static void evenCubedNumbers() {
        System.out.println("\n\n*** evenCubedNumbers ***");
        System.out.println(numbers);
        Predicate<? super Integer> predicate = x -> x % 2 == 0;
        numbers.stream().filter(predicate).map(x -> x * x * x).forEach(action);
    }

    public static void  oddCubedNumbers(){
        System.out.println("\n\n*** oddCubedNumbers ***");
        System.out.println(numbers);
        Predicate<? super Integer> predicate = x -> x % 2 != 0;
        Function<? super Integer, ? extends Integer> mapper = x -> x * x * x;
        numbers.stream().filter(predicate).map(mapper).forEach(action);
    }
}