package lab7;

public class CityValidator {

    public static boolean isCorrect(String city) {
        final String cityPattern = "г\\.\s[А-Я]([а-я]+)";

        return city.matches(cityPattern);
    }
}
