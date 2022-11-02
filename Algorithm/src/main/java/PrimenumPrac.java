import java.util.ArrayList;

public class PrimenumPrac {

    public static void main(String[] args) {

        ArrayList<Integer> prime = new ArrayList<Integer>();
        int num = 2;

        for (int i=0; i<50; i++) {
            if(num%2==0 || num%3==0 || num%5==0 || num%7==0) {
                prime.add(null);
                num++;
                break;
            }
            prime.add(num);
            num ++;
        }

        for(int p: prime) {
            System.out.print(p+" ");
        }




    }
}
