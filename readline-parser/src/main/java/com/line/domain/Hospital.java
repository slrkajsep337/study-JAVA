package com.line.domain;
//T타입에 들어갈 객체들을 domain 패키지에 넣어 정리한다

//Hospital 오브젝트 생성
//parser메소드로 추출한 필요한정보들을 Hospital객체에 넣는다
public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private int emergencyRoom;
    private String name;
    private String subdivision;
    //ctrl+n 으로 constructor 생성


    //constructor 생성
    public Hospital(String id, String address, String district, String category, int emergencyRoom, String name, String subdivision) {
        this.id = id;                           //0
        this.address = address;                 //1
        this.district = district;
//        this.setDistrict();          //1
        this.category = category;               //2
        this.emergencyRoom = emergencyRoom;     //6
        this.name = name;                       //10
        this.subdivision = subdivision;         //10
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
