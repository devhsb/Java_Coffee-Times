public class decimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        double result1 = firstNumber * 1000;
        double result2 = secondNumber * 1000;

        if ((int) result1 == (int) result2) {
            return true;
        } else {
            return false;
        }
    }
}
