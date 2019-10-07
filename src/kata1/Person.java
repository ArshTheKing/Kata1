package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class Person {
    private final String Name;
    private final Calendar birthdate;
    final long MS_YEARS=(long) (365.25*24*60*60*1000);
    
    public Person(String Name, Calendar birthdate) {
        this.Name = Name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return Name;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        return "Person{" + "Name=" + Name + ", birthdate=" + ", age=" +this.getAge()+'}';
    }
    public int getAge(){
        return (int) ((GregorianCalendar.getInstance().getTimeInMillis()-birthdate.getTimeInMillis())/MS_YEARS);
    }
}
