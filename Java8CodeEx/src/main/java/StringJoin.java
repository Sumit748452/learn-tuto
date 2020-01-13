import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoin {

    public static void main(String[] args) {
        //Java program to join list of strings
        List<String> list = Arrays.asList("how", "to", "use", "join");
        String joinedString = String.join("", list);

        System.out.println(joinedString);

        //Java program to join array of strings
        String[] arr = new String[]{"join", "array", "array", "String"};
        String myString = String.join("#", arr);
        System.out.println(myString);
        StringJoiner joiner = new StringJoiner(", ");
        StringJoiner joiner2 = new StringJoiner(",", "{", "}");

        joiner.add("How")
                .add("To")
                .add("Do")
                .add("In")
                .add("Java");
        System.out.println(joiner);
        System.out.println(joiner);
        //3. String list of string with Collectors.joining()
        List<String> numbers = Arrays.asList("How", "To", "Do", "In", "Java");

        String joinedStringE = numbers
                .stream()
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println(joinedStringE);

        String ids = String.join(", ", ZoneId.getAvailableZoneIds());
        System.out.println(ids);

    }
}
