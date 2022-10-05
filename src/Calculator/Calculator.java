package Calculator;

public class Calculator {
    // number creator 에서 만들어준 숫자를 가지고 사칙연산한 결과를 출력한다

    NumberCreator numberCreator;
    private int baseNum;

    public Calculator(NumberCreator numberMaker){
        //숫자 하나 리턴
        this.numberCreator = numberMaker;
        this.baseNum = 10;
    }

    public Calculator(int baseNum, NumberCreator numberMaker){
        //숫자 하나 리턴
        this.numberCreator = numberMaker;
        this.baseNum = baseNum;
    }
    public void plus(int num) {
        int rst = num + this.numberCreator.create(baseNum);
        System.out.println(rst);
    }

}
