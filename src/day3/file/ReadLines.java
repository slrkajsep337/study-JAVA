package day3.file;

import java.io.BufferedReader;
import java.io.FileReader;


public class ReadLines {


    //private String filename = "a_file.txt";
    public String ReadAllLines(String filename) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str1;
        String str2 = "";
        while ((str1 = br.readLine()) != null) {
            str2 += str1+"\n";
        }
        return str2;

    }
    public static void main(String[] args) throws Exception {
        ReadLines readlines = new ReadLines();
        String str = readlines.ReadAllLines("a_file.txt");
        System.out.println(str);



    }
}
