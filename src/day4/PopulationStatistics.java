package day4;

import java.io.*;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationStatistics {
    public void readByChar(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);

        String fileContents = "";
        while (fileContents.length() < 1_000_000) {
            char c = (char) fileReader.read();
            fileContents += c;
            System.out.println(fileContents);
        }
        System.out.println(fileContents);
    }

//    public List<PopulationMove> readByLine(String filename) throws IOException {
//
//        List<PopulationMove> pml = new ArrayList<>();
//        BufferedReader reader = new BufferedReader(
//                new FileReader(filename));
//
//        String str = "";
//        while((str = reader.readLine()) != null) {
////            System.out.println(str);
//            PopulationMove pm = PopulationMoveParse(str);
//            pml.add(pm);
//        }
//        reader.close();
//        return pml;
//    }

    public List<PopulationMove> readFileByLineV2(String filename) throws IOException {

        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader br = new BufferedReader(
                new FileReader(filename));
        String str = "";
        //String을 PopulationMove로 파싱하여 pml에 add
        while ((str = br.readLine()) != null) {
            pml.add(parse(str));
        }
        br.close();
        return pml;
    }

    public PopulationMove parse(String data) {

//        String[] arr = data.split(",");
//        return new PopulationMove(arr[0], arr[6]);
        String[] splittedLine = data.split(",");
        return new PopulationMove(splittedLine[0], splittedLine[1]);//from, to
    }


    //data에서 시도를 찾아 Map에 저장하는 메소드
    public void setMapsByLine(String filename, PopulationMoveMap populationMoveMap) {
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)) {
            String line;
            for (int i = 0; i < 10; i++) {
                line = br.readLine();
                populationMoveMap.save(parse(line));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void createAFile(String filename) throws IOException {
        File file = new File(filename);
        file.createNewFile();
    }

    //List<String>을 지정한 파일에 write
    public void write(List<String> strs, String filename) {
        File file = new File(filename);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for(String str: strs) {
                writer.write(str);
            }
            writer.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido()+","+populationMove.getToSido()+"\n";
    }

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



    public static void main(String[] args) throws IOException {
        String address = "/Users/leesuujeen/Downloads/2021_인구관련연간자료_20220927_66125.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        PopulationStatistics populationStatistics2 = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readFileByLineV2(address);
        List<PopulationMove> pml2 = populationStatistics.readFileByLineV2(address);

//        List<String> strings = new ArrayList<>();
//        strings.add("11,11");
//        for (PopulationMove pm : pml) {
//            String fromTo = populationStatistics.fromToString(pm);
//            strings.add(fromTo);
//        }
//        populationStatistics.write(strings, "./from_to.txt");

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
