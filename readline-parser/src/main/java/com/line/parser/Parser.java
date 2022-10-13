package com.line.parser;

//인터페이스를 선언해놓고 T에 들어가는 타입의 객체마다에 맞는 implements클래스들을 구현해준다
//e.g.) Hospital 객체 - HospitalParser 인터페이스
public interface Parser<T> {
    //T 타입으로 인터페이스를 선언해주기
    //파일은 String 타입이라는 사실이 변하지 않음 -> String타입 선언
    //하지만 그 파일의 종류는 병원데이터, 공공기관데이터등.. -> 오브젝트T타입 선언
    T parse(String str);
}
