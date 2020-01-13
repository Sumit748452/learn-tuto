import java.util.*;
import java.util.stream.Stream;

public class forEachExample {


    public static void main(String args[]) {

        List list = Arrays.asList("sumit", "Sam", "Rahul", "Rishi");

        list.forEach(System.out::println);


        list.forEach(i -> System.out.print(i));

        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        items.forEach((k, v) -> System.out.println("The Key Is" + k + " have value " + v));
        
        ArrayList<User> list2;
        list2 = new ArrayList<User>();
        User user1 = new User("sumit", "22");
        User user2 = new User("sam", "29");
        User user3 = new User("Ramit", "32");

        list2.add(user1);
        list2.add(user2);
        list2.add(user3);

        list2.forEach(i -> System.out.println("Name" +i.getName()+" Age:"+i.getAge()));

       /* for(User user:list2)
        {
            System.out.println(""+user.getAge())

        }/

       /* list2.stream()
                .filter(list2.size()>0)
                .findFirst("sumit")*/

    }

    public static class User{
        private String name;
        private String age;

        public User(String name, String age) {
            this.name = name;
            this.age = age;
        }

        public User() {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }
}