import java.net.URL;
import java.net.URLEncoder;

interface Moveable {
    default void move() {
        System.out.println("I am moving");
    }
}


public class DefaultMetodExample implements Moveable {
    public static void main(String[] args) {
        DefaultMetodExample tiger = new DefaultMetodExample();
        tiger.move();
        System.out.println(URLEncoder.encode("You have successfully subscribed in Cookly for 5 SAR/Week. Please click on the link: http://cookly.mobi/en/Account/OneTimeLoginLink/1yNPBoRD \n Username: 570982573 Password: 8272 and to unsubscribe at any time, please send U1 and for Help please send H1"));
    }
}
