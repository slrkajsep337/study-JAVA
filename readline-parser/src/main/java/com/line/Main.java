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

        System.out.println(hospitals.size());
        List<String> lines = new ArrayList<>();
        lines.add("INSERT INTO `hospital-db`.`seoul-hospital`\n"+
                "(`id`,`address`,`district`,`category`,`emergencyroom`,`name`,`subdivision`)\n"+
                "VALUES\n");
        for (Hospital hospital : hospitals) {
            lines.add(hospital.getTupleString());
        }
        String sqlFilename = "hospital_insert.sql";
        lrr.createANewFile(sqlFilename);
        lrr.writeLines(lines, sqlFilename);
        }
}