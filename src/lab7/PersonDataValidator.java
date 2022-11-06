package lab7;

public class PersonDataValidator {

    public static final String DATA_DELIMITER = "\\,";

    public static boolean isCorrect(String personData){
        String[] splittedPersonData = personData.split(DATA_DELIMITER);
        // wrong data format
        if (splittedPersonData.length > 3) return false;

        String FIO = splittedPersonData[0];
        String birthdayDate = splittedPersonData[1];
        String birthdayCity = splittedPersonData[2];

        if (FIOValidator.isCorrect(FIO)
                && DateValidator.isCorrect(birthdayDate)
                && CityValidator.isCorrect(birthdayCity))
            return true;
        else return false;
    }
}
