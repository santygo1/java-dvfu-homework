package lab7;


public class Test {

    public static void main(String[] args) {
        System.out.println(PersonDataValidator.isCorrect("Спирин Данил Алексеевич,31.02.2020,г. Владивосток"));
        System.out.println(PersonDataValidator.isCorrect("sdasd, 2312,323212"));
    }
}
