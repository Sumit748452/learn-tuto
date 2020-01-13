import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Base64;
import java.util.Date;
import java.util.TimeZone;

public class Base64Example {

    public static void main(String[] args) {
       // Base64.
        Base64.Encoder encoder=Base64.getEncoder();
        String normalString = "username:password";
        String encodedString = encoder.encodeToString(
                normalString.getBytes(StandardCharsets.UTF_8) );
        System.out.println(encodedString);


        // encodedString = "dXNlcm5hbWU6cGFzc3dvcmQ=";
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decodedByteArray = decoder.decode(encodedString);
     //Verify the decoded string
        System.out.println(new String(decodedByteArray));

        long sec = 186169L;
        Date d = new Date(sec * 1000L);
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss"); // HH for 0-23
        df.setTimeZone(TimeZone.getTimeZone("GMT"));
        String time = df.format(d);
        System.out.println(""+time);

      /*  long sec;
        sec = 10000L;

        Duration duration = Duration.ofSeconds(sec);
       // duration.get
        System.out.println(""+duration.toString());
        System.out.println(""+duration.toHours());

        System.out.println(""+duration.toMinutes());*/
    }
}

