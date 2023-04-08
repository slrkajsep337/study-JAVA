package com.line;

import com.line.domain.Hospital;
import com.line.parser.HospitalParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReaderRefactor<Hospital> lrr = new LineReaderRefactor<>(new HospitalParser());
        String filename = "/Users/leesuujeen/Desktop/서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals = lrr.readLines(filename);

        String sqlFilename = "hospital_insert.sql";
        lrr.writeLines(hospitals, sqlFilename);

        }
}