public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        //set addition and subtraction values
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        //get addition result
        System.out.println(calculator.getFirstNumber() + " + " + calculator.getSecondNumber() +
                " = " + calculator.getAdditionResult());
        //get subtraction result
        System.out.println(calculator.getFirstNumber() + " - " + calculator.getSecondNumber() +
                " = " + calculator.getSubtractionResult());

        //set multiplication and division values
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        //get multiplication result
        System.out.println(calculator.getFirstNumber() + " * " + calculator.getSecondNumber() +
                " = " + calculator.getMultiplicationResult());
        //get division result
        System.out.println(calculator.getFirstNumber() + " / " + calculator.getSecondNumber() +
                " = " + calculator.getDivisionResult());


    }
}
