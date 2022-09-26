import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        // Ex. 1
        Printable printable = () -> System.out.println(" Print something ");

        // Ex. 2
        Function<Integer, Boolean> function = x -> x % 13 ==0;

        // Два задания, две строчки =)
    }
}