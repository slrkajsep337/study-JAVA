package day2.InterfacePrac;

public class EvenOddKorean implements Number {

    @Override
    //void가 아니므로 return을 해준다
    public String getNum(int a) {
        if(a%2 == 0) {
            return "짝수";
        } else {
            return "홀수";
        }
    }

}
