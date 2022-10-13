package com.line;

import com.line.domain.Hospital;
import com.line.parser.HospitalParser;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReaderRefactor<Hospital> hospitalFileController = new LineReaderRefactor<>(new HospitalParser());
        String filename = "/Users/leesuujeen/Desktop/서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals = hospitalFileController.readLines(filename);

        System.out.println(hospitals.size());
        for (Hospital hospital : hospitals) {
            System.out.printf("%s,%s,%s,%s,%d,%s,%s\n",
                    hospital.getId(),hospital.getAddress(), hospital.getDistrict()
                    ,hospital.getCategory(), hospital.getEmergencyRoom(), hospital.getName(),
                    hospital.getSubdivision());
        }
    }
}