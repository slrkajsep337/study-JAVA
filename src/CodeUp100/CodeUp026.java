package CodeUp100;

import java.util.Scanner;

//미해결
public class CodeUp026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String[] arr = time.split(":");

        if(arr[1] == "00") {
            System.out.println("0");
        } else {
            System.out.println(arr[1]);
        }

    }
}
