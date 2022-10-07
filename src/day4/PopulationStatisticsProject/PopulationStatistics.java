package day4.PopulationStatisticsProject;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationStatistics {

//    public void readByLine(String filename) throws IOException {
//        //BufferedReader의 매개변수에는 파일이름을 읽어들일 수 있는
//        // 객체(FileReader)만 들어올 수 있다
//        BufferedReader reader = new BufferedReader(
//                new FileReader(filename));
//        String str = "";
//        while((str = reader.readLine()) != null) {
////            System.out.println(str);
//            PopulationMove pm = parse(str);
//        }
//        reader.close();
//    }

    //위의 메소드를 리스트에 데이터를 넣어주기 위한 메소드로 바꾸어준다
    // (리스트를 생성하고 거기에 데이터를 넣어줌)
    public List<PopulationMove> readByLine(String filename) throws IOException {
        List<PopulationMove> pml = new ArrayList<>();
        //BufferedReader의 매개변수에는 파일이름을 읽어들일 수 있는
        // 객체(FileReader)만 들어올 수 있다
        BufferedReader reader = new BufferedReader(
                new FileReader(filename));
        String str = "";
        while((str = reader.readLine()) != null) {
//            System.out.println(str);
            PopulationMove pm = parse(str);
            pml.add(pm);
        }
        reader.close();
        return pml;
    }

    // 2. "," 을 기준으로 데이터를 분리해주는 메소드
    public PopulationMove parse(String data) {
        //분리해서 배열에 넣기
        //배열에 들어가면서 data값이 string으로 바뀐다 -> 위에 생성자 오버로딩해줘야함
        String[] SidoData = data.split(",");
        //return new PopulationMove(sidoData[6],sidoData[0]);
        //원하는 값만 추출한 데이터를 from_to파일로 새로 생성해주었다-> 필요한 정보인덱스 0,1
        return new PopulationMove(SidoData[0], SidoData[1]);

    }

    //파일을 생성하는 메소드
    public void createAFile(String filename) throws IOException {
        File file = new File(filename);
        file.createNewFile();
        //파일을 생성할 때 어떤 방식으로든 예외처리는 해줘야함
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
    //생성된 파일에 내용을 write해주는 메소드
    //List<String>을 지정한 파일에 write
    public void write(List<String> strs, String filename) {
        File file = new File(filename);
        //파일에 내용을 작성해줄 때에도 반드시 예외처리를 해주어야 한다
        try {
            //BufferedWriter와 FileWriter를 사용하여 작성할 객체 생성
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for(String str: strs) {
                writer.write(str);
            }
            writer.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    //1 키 만들기
    //2 map에서 키에 해당하는 밸류가 없으면 1 대입
    //3 map에서 키에 해당하는 밸류가 있으면 +1
    //4 리턴
    //전입,전출의 횟수를 세서 map에 넣어주는 메소드
    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {
        Map<String, Integer> moveCntMap = new HashMap<>();
        for(PopulationMove pm : pml) {
            String key = pm.getFromSido()+","+pm.getToSido();
            if(moveCntMap.get(key) == null) {
                moveCntMap.put(key, 1);
            } else{
                moveCntMap.put(key, moveCntMap.get(key)+1);
            }
        }
        return  moveCntMap;
    }

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido()+","+populationMove.getToSido()+"\n";
    }

    public static void main(String[] args) throws IOException {
        String address = "/Users/leesuujeen/Downloads/2021_인구관련연간자료_20220927_66125.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        PopulationStatistics populationStatistics2 = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readByLine(address);
        List<PopulationMove> pml2 = populationStatistics.readByLine(address);

//        List<String> strings = new ArrayList<>();
//        strings.add("11,11");
//        for (PopulationMove pm : pml) {
//            String fromTo = populationStatistics.fromToString(pm);
//            strings.add(fromTo);
//        }
//        populationStatistics.write(strings, "./from_to.txt");
//
//        for (PopulationMove pm : pml) {
//            System.out.printf("전입:%s, 전출:%s\n", pm.getFromSido(), pm.getToSido());
//        }

        Map<String, Integer> map = populationStatistics2.getMoveCntMap(pml2);
        String targetFilename = "for_heatmap.txt";
        populationStatistics2.createAFile(targetFilename);
        List<String> cntResult = new ArrayList<>();
        for (String key : map.keySet()) {
            String[] fromto = key.split("\\,");
            String s = String.format("[%s, %s, %d]\n",fromto[0],fromto[1],map.get(key));
            cntResult.add(s);
            //System.out.printf("key : %s value : %d\n",key, map.get(key));
        }
        populationStatistics2.write(cntResult, targetFilename);
    }


}
