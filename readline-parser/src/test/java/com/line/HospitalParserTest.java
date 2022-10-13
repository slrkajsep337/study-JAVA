package com.line;

import com.line.domain.Hospital;
import com.line.parser.HospitalParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HospitalParserTest {



    @Test
    void hospitalParsing() {
        HospitalParser hospitalParser = new HospitalParser();
        Hospital hospital1 = hospitalParser.parse("\"A1120837\",\"서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)\",\"C\",\"의원\",\"G099\",\"응급의료기관 이외\",\"2\",\"외과: 상시진료 내과는 당분간 휴진\",\"서울시 송파구 문정동 장지동 법조단지 위례 가락동 가락시장역 위치 삼성서울병원 외래교수 출신 구강외과 전문의 진료 진료과목 - 임플란트 치조골 뼈이식 수술 매복 사랑니 발치 턱관절 악관절 질환의 치료 교정 치료 및 기타 보존 보철(크라운 브릿지 인레이) 신경치료\",\"방이역 1번출구 바로옆 굿모닝 신한증권 뒷건물\",\"가산기대찬의원\",\"02-6267-2580\",\"02-920-5374\",\"1930\",\"1930\",\"1930\",\"1930\",\"1930\",\"1500\",\"1500\",\"1500\",\"0900\",\"0900\",\"0900\",\"0900\",\"0900\",\"0900\",\"1000\",\"1000\",\"085\",\"11\",\"126.88412249700781\",\"37.4803938036867\",\"2022-04-07 14:55:00.0\"");

        //id 파싱 테스트
//        Hospital hospital =hospitalParser.parse("\"A1106786\",\"서울특별시 송파구 동남로 208 (가락동)\",\"C\",\"의원\",\"G099\",\"응급의료기관 이외\",\"2\",\"토요일 첫째주 셋째주 휴진\",\"2005년 부터 진료 재활의학과전문의  전문물리치료 통증클리닉 척추교정치료 체외충격파 휜다리교정  목허리어깨무릎발 통증   디스크 퇴행성관절염\",\"극동아파트상가204호\",\"연세정소아과의원\",\"02-448-6436\",\"02-2227-7777\",\"1900\",\"1900\",\"1900\",\"1900\",\"1900\",\"1500\",\"1400\",\"1600\",\"0900\",\"0900\",\"0900\",\"0900\",\"0900\",\"0900\",\"1000\",\"0900\",\"057\",\"83\",\"127.13147131787721\",\"37.49579508152157\",\"2022-09-07 14:55:30.0\"");
//        Assertions.assertEquals("A1106786", hospital.getId());

        //주소가 잘 파싱되는지 테스트 추가
        Assertions.assertEquals("서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)", hospital1.getAddress());
//        Assertions.assertEquals("서울특별시 금천구", hospital1.getDistrict());
        Assertions.assertEquals(("서울특별시 금천구"),hospital1.getDistrict());
        Assertions.assertEquals("C", hospital1.getCategory());
        Assertions.assertEquals(2, hospital1.getEmergencyRoom());
        Assertions.assertEquals("가산기대찬의원", hospital1.getName());
        Assertions.assertEquals("의원", hospital1.getSubdivision());
    }


}