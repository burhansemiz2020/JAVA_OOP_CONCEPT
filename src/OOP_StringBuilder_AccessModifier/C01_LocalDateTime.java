package OOP_StringBuilder_AccessModifier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime time=LocalDateTime.now();
        System.out.println(time);//2023-03-13T10:49:44.123635400
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(time.format(dtf));



    }
}
