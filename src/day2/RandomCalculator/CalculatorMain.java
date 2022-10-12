package day2.RandomCalculator;

public class CalculatorMain {
    public static void main(String[] args) {
        NumberMaker numberMaker = new RandomNumberMaker();
        Calculator randomNumberCalculator = new Calculator(numberMaker);

        randomNumberCalculator.plus(20);

    }
}
