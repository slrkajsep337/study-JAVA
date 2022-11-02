import java.util.ArrayList;

public class PrimenumPrac {

    public static void main(String[] args) {

        ArrayList<Integer> prime = new ArrayList<Integer>();
        int num = 2;



        for (int i=0; i<50; i++) {
            if((num%2==0 && num != 2) || (num%3==0 && num!=3) || (num%5==0 && num!=5) || (num%7==0 && num!=7)) {
                num++;
                continue;
            }
            prime.add(num);
            num ++;
        }

        //removeIf를 사용하는 법
//        prime.removeIf(p -> p % 2 == 0 && p != 2);
        System.out.println(prime);




    }
}
