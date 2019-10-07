package kata1;

import java.util.Date;

class Person {
    private final String Name;
    private final Date birthdate;
    final long MS_YEARS=365*24*60*60*1000;
    public Person(String Name, Date birthdate) {
        this.Name = Name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return Name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        return "Person{" + "Name=" + Name + ", birthdate=" + birthdate.toString() + '}';
    }
    public int getAge(){
        return (int) ((new Date().getTime()-birthdate.getTime())/MS_YEARS);
    }
}
