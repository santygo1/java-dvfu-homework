package ap_2014_3;

public class Student {

    private final String name;
    private int absenceCount = 0;

    Student(String name){
        this.name = name;
    }

    Student(String name, int absenceCount){
        this(name);
        this.absenceCount = absenceCount;
    }

    public void incAbsenceCount(){
        absenceCount++;
    }

    public void setAbsenceCount(int absenceCount) {
        this.absenceCount = absenceCount;
    }

    public int getAbsenceCount() {
        return absenceCount;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\"" + name + "\", " + absenceCount;
    }
}
