package day3.collection.SetPrac;

public class RandomNumberGenerator implements NumberGenerator{
    @Override
    public int generate (int num) {
        return (int)(Math.random()*num);
    }
}
