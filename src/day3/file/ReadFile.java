package day3.file;

import java.io.File;
import java.io.FileReader;



//파일을 읽어들일 버퍼 객체 생성
//한글자씩 읽을때는 FileReader로 충분하지만
//BufferedReader 는 흙을 푸는 삽과 같아서 처리하는 데이터의 양이 조금만 많아져도 효율성이 올라간다
//bufferedReader의 크기도 지정해줄 수 있어서 상황에 맞게 사용할 수 있다

public class ReadFile {

    //글자 두개 출력하기
    public String ReadChars(String filename) throws Exception {
        FileReader reader = new FileReader(filename);
        String str = "";
        str += (char)reader.read();
        str += (char)reader.read();

        return str;
//        System.out.println(str);
    }
    public static void main(String[] args) throws Exception {
//        int ch;
//        while ((ch = reader.read()) != -1) {
//            System.out.print((char) ch);

        ReadFile readfile = new ReadFile();
        String str = readfile.ReadChars("a_file.txt");
        System.out.println(str);

        //디렉토리에 있는 파일목록 출력하기
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
