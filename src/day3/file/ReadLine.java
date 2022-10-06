package day3.file;

import java.io.BufferedReader;
import java.io.FileReader;


//한줄의 line 읽기
public class ReadLine {

//    private String filename = ;

    public String ReadOneLine(String filename) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str1 = br.readLine();

        return str1;
    }
    public static void main(String[] args) throws Exception {

        ReadLine readline = new ReadLine();
        String str = readline.ReadOneLine("a_file.txt");
        System.out.println(str);

//        while ((str = br.readLine()) != null) {
//            System.out.println(str);
//        }

    }
}
