package day2.RandomCalculator;

public class Calculator {
    //NumberMaker 에서 만들어준 숫자를 가지고 사칙연산한 결과를 출력한다

    private NumberMaker numberMaker;

    public Calculator(NumberMaker numberMaker) {

        this.numberMaker = numberMaker;
    }

    public void plus(int num) {
        int rst = num + this.numberMaker.make(10);
        System.out.println(rst);
    }




}
