package com.line;

import com.line.domain.Hospital;
import com.line.parser.HospitalParser;
import com.line.parser.Parser;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//LineReader 에 다형성 적용하여 refactor 하기

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
            br.readLine();
        }
        //null이 아니면 계속 읽어오기
        while((str = br.readLine()) != null) {
            rst.add(parser.parse(str));
        }
        return rst;

    }

    public void createANewFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeLines(List<Hospital> hospitalList, String filename) throws IOException {
        File file = new File(filename);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write("INSERT INTO `hospital_db`.`seoul_hospital`\n"+
                "(`id`,`address`,`district`,`category`,`emergencyroom`,`name`,`subdivision`)\n"+
                "VALUES\n");

        for(int i=0; i<hospitalList.size(); i++) {
            writer.write(hospitalList.get(i).getTupleString());
            if (i == hospitalList.size() - 1) {
                writer.write(";");
                break;
            }
            writer.write(",\n");
        }
        writer.close();

//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new FileReader(filename));
//            String line = null;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("파일을찾지못했습니다.");
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (br != null) {
//                br.close();
//            }
//        }

    }

    public static void main(String[] args) throws IOException {

    }
}
