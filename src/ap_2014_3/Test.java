package ap_2014_3;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Данил",3));
        studentList.add(new Student("Лиза",2));
        studentList.add(new Student("Илья", 10));
        studentList.add(new Student("Тихон", 3));
        studentList.add(new Student("Максим",2));


        SeatingChart table = new SeatingChart(studentList, 2,3);
        System.out.println(table);

        System.out.println(table.removeAbsenceStudents(2));
        System.out.println(table);
    }
}
