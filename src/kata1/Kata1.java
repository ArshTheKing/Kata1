package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        System.out.println(new Person("Azael", (Calendar) (new GregorianCalendar(1999,7,20))).toString());
    }
    
}
