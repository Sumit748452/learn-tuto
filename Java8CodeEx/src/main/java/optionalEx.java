import java.util.Optional;

public class optionalEx {
    public static void main(String[] args) {

        Optional<Integer> canBeEmpty1 = Optional.of(5);
        canBeEmpty1.isPresent();                    // returns true
        System.out.println(canBeEmpty1.get());                         // returns 5

        Optional<Integer> canBeEmpty2 = Optional.empty();
        System.out.println(canBeEmpty2.isPresent());                         // returns false


    }

}
