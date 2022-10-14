package com.line.domain;
//T타입에 들어갈 객체들을 domain 패키지에 넣어 정리한다

import java.io.*;
import java.util.List;

//Hospital 오브젝트 생성
//parser메소드로 추출한 필요한정보들을 Hospital객체에 넣는다
public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private Integer emergencyRoom;
    private String name;
    private String subdivision;
    //ctrl+n 으로 constructor 생성


    //constructor 생성
    public Hospital(String id, String address, String district, String category, Integer emergencyRoom, String name, String subdivision) {
        this.id = id;                           //0
        this.address = address;                 //1
        //district를 추출하는 첫번째 방법
        this.district = district;
        //district를 추출하는 두번째 방법
//        this.setDistrict();          //1
        this.category = category;               //2
        this.emergencyRoom = emergencyRoom;     //6
        this.name = name;                       //10
        this.subdivision = subdivision;         //10
    }

//    public String getSqlInsertQuery() {
//        String sql = String.format(
//                "INSERT INTO `hospital-db`.`seoul-hospital`\n"+
//                "(`id`,`address`,`district`,`category`,`emergencyroom`,`name`,`subdivision`)\n"+
//                "VALUES\n"+
//                "('%s','%s','%s','%s',%s,'%s','%s')\n",
//                this.id, this.address, this.district, this.category,
//                this.emergencyRoom, this.name, this.subdivision);
//        return sql;
//    }


    public String getTupleString() {
        String sql = String.format(
                "('%s','%s','%s','%s',%d,'%s','%s')",
                this.id, this.address, this.district, this.category,
                this.emergencyRoom, this.name, this.subdivision);
        return sql;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

//    public String getDistrict() {
//        String[] splitted = this.address.split(" ");
//        return String.format("%s %s", splitted[0], splitted[1]);
//    }

    public String getCategory() {
        return category;
    }

    public int getEmergencyRoom() {
        return emergencyRoom;
    }

    public String getName() {
        return name;
    }

    public String getSubdivision() {
        return subdivision;

    }
}
