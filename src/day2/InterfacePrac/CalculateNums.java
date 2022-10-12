package day2.InterfacePrac;

public class CalculateNums {

    private Number num;

    //생성자 생성
    //매개변수에 인터페이스 사용
    // -> 인터페이스를 매개변수에 사용하여, implements한 두 클래스모두 이 생성자 사용가능
    public CalculateNums(Number num) {
        this.num = num;
    }

    //void함수이므로 return대신 출력해주기
    public void GetResult(int a, int b) {
        System.out.println(num.getNum(a)+"+"+num.getNum(b)+"="+num.getNum(a+b));
    }

}
