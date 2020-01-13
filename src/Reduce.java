
import java.util.*;
import java.util.function.*;

public class Reduce{

    static List<Integer> numbers = List.of(3, 8, 11, 7, 25, 31, 4, 10, 78, 5, 12, 27, 2, 7, 3, 1, 99, 66, 53, 21, 3, 10,
            81, 9, 9, 14, 33, 5, 30, 46);

    public static void main(String[] args){
        sumSquare();
        sumCube();
        sumOdd();
    }

    public static void sumSquare() {
        System.out.println("\n\n*** sumSquare ***");
        System.out.println(numbers);
        Function<Integer, Integer> mapper = x -> x * x;
        int sum = numbers.stream().map(mapper).reduce(0, (x, y) -> x + y);
        System.out.println(sum);
    }

    public static void sumCube() {
        System.out.println("\n\n*** sumCube ***");
        System.out.println(numbers);
        Function<Integer, Integer> mapper = x -> x * x * x;
        int sum = numbers.stream().map(mapper).reduce(0, (x, y) -> x + y);
        System.out.println(sum);
    }

    public static void sumOdd() {
        System.out.println("\n\n*** sumOdd ***");
        System.out.println(numbers);
        int sum = numbers.stream().filter(x -> x % 2 != 0).reduce(0, Integer::sum);
        System.out.println(sum);
    }

}