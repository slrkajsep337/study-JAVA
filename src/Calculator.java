public class Calculator {


    public int getRandomInt() {
        return (int) (Math.random() * 100);
    }
    private int first, second;

    public Calculator(int first, int second) {
        this.first = first;
        this.second = getRandomInt();
    }
    public void plus() {
        System.out.println(first+second);
    }
    public void minus() {
        System.out.println(first-second);
    }
    public void multiple() {
        System.out.println(first*second);
    }
    public void devide() {
        float rst = (float)first/(float)second;
        System.out.println(rst);
    }

}
