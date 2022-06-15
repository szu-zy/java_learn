import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class JDK8DateTimeTest {


    /*
    local_time
     */
    @Test
    public void testDate(){


        Date date = new Date(2020-1900,9-1,8);
        System.out.println(date);

        LocalDate now = LocalDate.now();
        LocalTime now1 = LocalTime.now();
        LocalDateTime now2 = LocalDateTime.now();

        System.out.println(now);
        System.out.println(now1);
        System.out.println(now2);

    }


}











