import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample<distinctElements> {
    public static void main(String[] args) {


        //streamOf
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.forEach(System.out::println);


        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        //Stream<Integer> stream2 = list.stream();
        list.stream().forEach(x -> System.out.println(x));
        //Convert Stream to List/Set – Stream.collect( Collectors.toList() )  Stream.collect( Collectors.toSet() )

        Set<Integer> set = list.stream().collect(Collectors.toSet());
        List<Integer> list2 = list.stream().collect(Collectors.toList());

        set.forEach(System.out::println);
        list.forEach(i -> System.out.println(i));


        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        memberNames.stream().filter(p -> p.startsWith("S")).forEach(System.out::println);
        memberNames.stream().filter(p -> !p.equals("Shekhar")).forEach(System.out::println);
        memberNames.stream().filter(p -> p.startsWith("S")).map(String::toUpperCase).forEach(System.out::println);
        List<String> memNamesInUppercase = memberNames.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());

        boolean matchResult1 = memberNames.stream().anyMatch(s -> s.startsWith("S"));
        System.out.println(matchResult1);
        boolean matchResult2 = memberNames.stream().allMatch(s -> s.startsWith("S"));
        System.out.println(matchResult2);
        boolean matchResult3 = memberNames.stream().noneMatch(s -> s.startsWith("Z"));
        System.out.println(matchResult3);

        long lCount = memberNames.stream().filter(p -> p.startsWith("S")).count();
        System.out.println(lCount);
        Optional<String> reduced = memberNames.stream()
                .reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);
        String firstMatchedName = memberNames.stream()
                .filter((s) -> s.startsWith("L"))
                .findFirst().get();
//parallel Stream
        String obj = memberNames.parallelStream().filter(p -> p.startsWith("S")).findFirst().get();
        System.out.println(obj != null ? obj : "Not Exist");

//  flatMap() Convert list of lists to single list
        List<Integer> list11 = Arrays.asList(1, 2, 3);
        List<Integer> list21 = Arrays.asList(4, 5, 6);
        List<Integer> list31 = Arrays.asList(7, 8, 9);

        List<List<Integer>> listOfLists = Arrays.asList(list11, list21, list31);

        List<Integer> listOfAllIntegers = listOfLists.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        System.out.println(listOfAllIntegers);


        //flatMap() Convert array of arrays to single list
        String[][] dataArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};

        List<String> listOfAllChars = Arrays.stream(dataArray)
                .flatMap(x -> Arrays.stream(x))
                .collect(Collectors.toList());

        System.out.println(listOfAllChars);


//1. Find All Distinct Elements

        Collection<String> listL = Arrays.asList("A", "B", "C", "D", "A", "B", "C");

        // Get collection without duplicate i.e. distinct only
        List<String> distinctElements = listL.stream().distinct().collect(Collectors.toList());

//Let's verify distinct elements
        System.out.println(distinctElements);

        List<String> strings = Arrays
                .asList("how", "to", "do", "in", "java", "dot", "com");

        List<String> sorted = strings
                .stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        System.out.println(sorted);

        List<String> sortedAlt = strings
                .stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        System.out.println(sortedAlt);

        List<String> sortedrev = strings
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(sortedrev);

        List<String> sortednor = strings
                .stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .collect(Collectors.toList());

        System.out.println(sortednor);


////////////////////////////Reference to constructor – Class::new
        List<Integer> integers = IntStream
                .range(1, 100)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        Optional<Integer> max = integers.stream().reduce(Math::max);

        max.ifPresent(System.out::println);



    }




}
