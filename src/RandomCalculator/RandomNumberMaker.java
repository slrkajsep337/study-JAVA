package RandomCalculator;

public class RandomNumberMaker implements NumberMaker {

    @Override
    public int make(int num) {
        return (int)(Math.random()*num);
    }
}
