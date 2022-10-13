package com.line.parser;

import com.line.domain.Hospital;

public class HospitalParser implements Parser<Hospital> {
    private String replaceAllQuat(String str) {
        return str.replaceAll("\"", "");
    }

    private String getSubdivision(String name) {
        String subdivision ="";
        String[] subdivisions = {"소아과", "피부과", "성형외과", "정형외과", "관절", "의원", "내과", "외과"};

        for (String subdvs : subdivisions) {
            if (name.contains(subdvs)) {
                subdivision += subdvs;
            }
        }
        return subdivision;
    }


    @Override
    public Hospital parse(String str) {
        //라인을 받을 때부터 따옴표를 없앤채로 받아온다
        str = str.replaceAll("\"", "");
        String[] splitted = str.split("\\,");
        String[] splitted_distritct = splitted[1].split(" ");
        String district = splitted_distritct[0]+" "+splitted_distritct[1];

//        address;
//        district;
//        category;
//        Integer emergengcyRoom;
//        name;
//        subdivision;

        //

        return new Hospital(splitted[0], splitted[1], district, splitted[2], Integer.parseInt(splitted[6]), splitted[10], getSubdivision(splitted[10]));
    }
}
