public class MiscExample {
    public static void main(String[] args) {

        //(add|substract|multiply|increment|decrement|negate)Exact methods
        System.out.println(100000 * 100000);

//Using multiPlyExact
        System.out.println(Math.multiplyExact(100000, 100000));

        System.out.println(Integer.MAX_VALUE + Integer.MAX_VALUE);

//Using addExact
        System.out.println(Math.addExact(Integer.MAX_VALUE, Integer.MAX_VALUE));

        //2) floorMod and floorDiv methods
        /*Java 8 has worked to solve a very long standing problem of integer remainders. Everybody knows that expression n % 2 is
        i) 0 : if number is even
        ii) 1 : if is odd
        What if number is negative. Above expression can/cannot return -1. If fact for negative numbers, result is unpredictable to me.
        */

        System.out.println(Math.floorMod(10, 2));
        System.out.println(Math.floorMod(11, 2));
        System.out.println(Math.floorMod(-15, 2));
        System.out.println(Math.floorMod(-16, 2));

        //getting the position of a hour hand of a clock. Let’s say current time is 10 O’clock. You made adjustment of n hours and now want to get it’s position. Formula is simple:
        //Current Position = (position + adjustment) % 12
        System.out.println(Long.MAX_VALUE);
        System.out.println((int) Long.MAX_VALUE);
        System.out.println(Math.toIntExact(10_00_00_000));
        System.out.println(Math.toIntExact(Long.MAX_VALUE));
        //next down
        System.out.println(Math.nextDown(100));//99.99999
        System.out.println(Math.nextDown(100.365));//100.36499999999998
       //Please note that Math.nextUp() already existed since java 6. Only Math.nextDown() is added in java 8.





    }
}
