package day2.InterfacePrac;


public class EvenOddMain {
    public static void main(String[] args) {

        //객체 생성 + 클래스1 대입
        CalculateNums cct = new CalculateNums(new EvenOddKorean());
        cct.GetResult(5,6);

        //생성된 객체에 클래스2 대입
        cct = new CalculateNums(new EvenOddEnglish());
        cct.GetResult(5,6);


    }
}
