package day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

//파일을 읽어들일 버퍼 객체 생성

public class ReadFile {
    public static void main(String[] args) throws IOException {

//        FileReader reader = new FileReader("a_file.txt");
//        int ch;
//        while ((ch = reader.read()) != -1) {
//            System.out.print((char) ch);

        File dir = new File("./");
        File files[] = dir.listFiles();
        for(File file: files) {
            System.out.println(file);
    }
    }
    /* 출력결과
    ./.DS_Store
    ./JAVA_STUDY.iml
    ./out
    ./README.md
    ./.gitignore
    ./.git
    ./a_file.txt
    ./.idea
    ./src
     */

}
