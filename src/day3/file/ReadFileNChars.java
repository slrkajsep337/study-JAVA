package day3.file;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileNChars {
    //n개 글자 출력하기

    private String filename = "a_file.txt";
    public String readNChars(int N) throws IOException {
        FileReader fileReader = new FileReader(this.filename);
        String str = "";
        for(int i=0; i<N; i++) {
            int ascicd = fileReader.read();
            if (ascicd== -1) {
                return str;
            }
            str += (char) ascicd;
        }
        return str;
    }

    public static void main(String[] args) throws IOException {
        ReadFileNChars readfilenc = new ReadFileNChars();
        String str = readfilenc.readNChars(3);
        System.out.println(str);
    }


}
