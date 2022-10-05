//import java.util.Scanner;

public class MoneyPrac {
    final static int[] MONEY_UNIT = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
    public static void main(String[] args) {

        int money = 25000;
        calculate(money);
    }
        public static void calculate(int money) {

            for (int unit : MONEY_UNIT) {
                int cnt = money / unit;
                money = money % unit;
                System.out.printf("%d원? %d장\n", unit, cnt);
            }

//        Scanner sc = new Scanner(System.in);
//        int money = sc.nextInt();
//        //int money = 25000;
//
//        // step1
//        int curr50000 = 50000;
//        int curr10000 = 10000;
//        int curr5000 = 5000;
//        int curr1000 = 1000;
//        int curr500 = 500;
//        int curr100 = 100;
//        int curr50 = 50;
//        int curr10 = 10;
//
//        // step2
//        System.out.printf("50000원: %d 나머지: %d원\n", money/curr50000, money%curr50000);
//        money %= curr50000;
//        System.out.printf("10000원: %d 나머지: %d원\n", money/curr10000, money%curr10000);
//        money %= curr10000;
//        System.out.printf("5000원: %d 나머지: %d원\n", money/curr5000, money%curr5000);
//        money %= curr5000;
//        System.out.printf("1000원: %d 나머지: %d원\n", money/curr1000, money%curr1000);
//        money %= curr1000;
//        System.out.printf("500원: %d 나머지: %d원\n", money/curr500, money%curr500);
//        money %= curr500;
//        System.out.printf("100원: %d 나머지: %d원\n", money/curr100, money%curr100);
//        money %= curr100;
//        System.out.printf("50원: %d 나머지: %d원\n", money/curr50, money%curr50);
//        money %= 50;
//        System.out.printf("10원: %d 나머지: %d원\n", money/curr10, money%curr10);
//        money %= 10;
            }
        }
