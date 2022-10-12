package day5.com.line;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//LineReader 에 다형성 적용하여 refactor 하기


interface Parser<T> {
    //T 타입으로 인터페이스를 선언해주기
    //파일은 String 타입이라는 사실이 변하지 않음 -> String타입 선언
    //하지만 그 파일의 종류는 병원데이터, 공공기관데이터등.. -> 오브젝트T타입 선언
    T parse(String str);
}

//Hospital 오브젝트 생성
class Hospital {
    private String id;

    //constructor 생성
    Hospital(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}


class HospitalParser implements Parser<Hospital> {
    @Override
    public Hospital parse(String str) {
        String[] splitted = str.split("\\,");
        return new Hospital(splitted[0]);
    }
}

//파일 문장 읽어오기
public class LineReaderRefactor<T> {
    //이 클래스는 Parser 인터페이스에 의존
    Parser<T> parser;

    //출력할 때 첫줄 출력할지 말지 결정하기위한 변수
    boolean isRemoveColumnName = true;


    //메인에서 생성한 LineReaderRefactor 객체에 T타입을 주입해주기 위해서
    //constructor 생성
    public LineReaderRefactor(Parser<T> parser) {
        this.parser = parser;
    }

    public LineReaderRefactor(Parser<T> parser, boolean isRemoveColumnName) {
        this.parser = parser;
        this.isRemoveColumnName = isRemoveColumnName;
    }

    List<T> readLines(String filename) throws IOException {
        //List 형태로 return할 객체 생성
        List<T> rst = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str;
        //readLine은 무조건 한줄 읽음
        //맨윗줄은 필요없는 정보라서 readLine이용해서 그냥 날리기
        if(isRemoveColumnName) {
            //
            br.readLine();
        }

        //null이 아니면 계속 읽어오기
        while((str = br.readLine()) != null) {
            rst.add(parser.parse(str));
        }
        return rst;

    }

    public static void main(String[] args) throws IOException {
//        String filename = "/Users/leesuujeen/Desktop/서울시 병의원 위치 정보.csv";
//        LineReader lr = new LineReader();
//        lr.readLines(filename);
//        List<String> lines = lr.readLines(filename);
//        //전체 몇줄인지 출력
//        System.out.println(lines.size());

        LineReaderRefactor<Hospital> hospitalLineReader = new LineReaderRefactor<>(
                new HospitalParser());
        List<Hospital> hospitals =
                hospitalLineReader.readLines("/Users/leesuujeen/Desktop/서울시 병의원 위치 정보.csv");

        System.out.println(hospitals.size());
        for(Hospital hospital: hospitals) {
            System.out.println(hospital.getId());
        }
    }
}
