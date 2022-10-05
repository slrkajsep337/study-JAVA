package InterfacePrac;

public class EvenOddEnglish implements Number {

    @Override
    public String getNum(int a) {
        if (a%2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
