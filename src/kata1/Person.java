package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

class Person {
    private final String Name;
    private final Calendar birthdate;
    private final long MS_YEARS=(long)(365.25*24*60*60*1000);
    
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
        return "Person{" + "Name=" + Name + ", age=" +this.getAge()+'}';
    }
    public int getAge(){
        Calendar today= GregorianCalendar.getInstance();
        return (int) (milliSecondsToYear(today.getTimeInMillis()-birthdate.getTimeInMillis()));
    }
    private long milliSecondsToYear(long millis){
        return millis / MS_YEARS;
    }
}
