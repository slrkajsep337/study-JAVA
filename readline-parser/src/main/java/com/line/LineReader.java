package com.line;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//파일 문장 읽어오기
public class LineReader {
    List<String> readLines(String filename) throws IOException {
        //List 형태로 return할 객체 생성
        List<String> rst = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str;
        //null이 아니면 계속 읽어오기
        while((str = br.readLine()) != null) {
            rst.add(str);
        }
        return rst;

    }

    public static void main(String[] args) throws IOException {
        String filename = "/Users/leesuujeen/Desktop/서울시 병의원 위치 정보.csv";
        LineReader lr = new LineReader();
        lr.readLines(filename);
        List<String> lines = lr.readLines(filename);
        //전체 몇줄인지 출력
        System.out.println(lines.size());
    }
}
