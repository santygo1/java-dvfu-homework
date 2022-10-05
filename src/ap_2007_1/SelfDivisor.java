package ap_2007_1;

public class SelfDivisor {

    /**
     * Checking if a number is a self-divisor or not
     * @param number number for checking <i>(number > 0)</i>
     * @return {@code true} if number is self-divisor, {@code false} otherwise
     * @throws IllegalArgumentException specified number doesn't meet the condition
     */
    public static boolean isSelfDivisor(int number) throws IllegalArgumentException{
        if (number < 0) throw new IllegalArgumentException();

        while (number != 0) {
            int currentNumber = number % 10;
            if (currentNumber == 0 || number % currentNumber != 0) return false;
            number /= 10;
        }
        return true;
    }

    /**
     * Finding num self-divisor number's begin from start
     * @param start from which number start finding
     * @param num count of self-divisor numbers
     * @return array of self-divisor numbers
     */
    public static int[] firstNumSelfDivisor(int start, int num){
        if (start <= 0 && num <= 0) throw new IllegalArgumentException();

        int[] result = new int[num];
        for (int i = 0; i < num; i++){
            while (!isSelfDivisor(start)) start++;// skipping number if it isn't self-diviser
            result[i] = start; // add self-divisor number in result array
            start++; // move to next number
        }

        return result;
    }
}
