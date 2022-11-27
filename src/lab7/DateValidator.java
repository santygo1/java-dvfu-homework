package lab7;

public class DateValidator {

    private static final String DATE_DELIMITER = "\\.";

    public static boolean isCorrect(String date) {
        // date has wrong format
        if (date.split(DATE_DELIMITER).length != 3) return false;

        if (isThirtyOneDaysMonthCorrect(date)) {
            return true;
        } else if (isFebruaryCorrect(date)) {
            return true;
        } else return isThirtyDaysMonthCorrect(date);
    }

    private static String buildDatePatternWithYear(String daysRangePattern, String monthRangePattern) {
        final String delimiter = "[" + DATE_DELIMITER + "]";
        String yearRange = "([1-9]{1,3}|1[0-9]{1,3}|20[0-1][0-9]|202[0-2])"; // from 1 to 2022

        return daysRangePattern + delimiter + monthRangePattern + delimiter + yearRange;
    }

    private static boolean isThirtyOneDaysMonthCorrect(String date) {
        String daysRange = "(0[1-9]|[1-2][0-9]|30|31)";
        String thirtyOneDaysMonth = "(0[13578]|10|12)";
        String pattern = buildDatePatternWithYear(daysRange, thirtyOneDaysMonth);
        return date.matches(pattern);
    }

    private static boolean isThirtyDaysMonthCorrect(String date) {
        String daysRange = "(0[1-9]|[1-2][0-9]|30)";
        String thirtyDaysMonth = "(0[469]|11)";

        return date.matches(buildDatePatternWithYear(daysRange, thirtyDaysMonth));
    }

    private static boolean isFebruaryCorrect(String date) {
        String february = "02";
        String leapYearDaysRange = "(0[1-9]|1[0-9]|2[0-9])";
        String nonLeapYearDaysRange = "(0[1-9]|1[0-9]|2[0-8])";

        int year = Integer.parseInt(date.split(DATE_DELIMITER)[2]);
        if (isLeapYear(year))
            return date.matches(buildDatePatternWithYear(leapYearDaysRange, february));
        else
            return date.matches(buildDatePatternWithYear(nonLeapYearDaysRange, february));
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0;
    }
}
