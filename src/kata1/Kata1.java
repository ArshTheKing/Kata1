package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date=GregorianCalendar.getInstance();
        date.set(1999, 7, 20);
        
        System.out.println(new Person("Azael", date).toString());
    }
    
}
