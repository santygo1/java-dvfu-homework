package lab7;

public class FIOValidator {

    public static boolean isCorrect(String fio) {
        String fioPattern = "([А-Я][а-я]{2,30}\s){2}[А-Я][а-я]{2,30}";
        return fio.matches(fioPattern);
    }
}
