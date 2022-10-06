package day3.collection.MapPrac;

import java.util.HashMap;

//데이터 수가 굉장히 많을때 list는 속도가 느릴 수 있다. map을 사용하면 key값을 이용하여 시간을 단축시킬 수 있음
public class MapExercise {
    public static void main(String[] args) {
        //map은 treemap 과 hash map이 있음. 대부분의 경우 hash map이 더 빠른 속도
        //해시맵 생성, (key, value)
        HashMap<String, String> map = new HashMap<>();
        //생성된 맵에 (key, value)값 넣기
        map.put("이수진", "https://github.com/slrkajsep337/JavaStudy");
        map.put("강동연", "https://github.com/dongyeon-0822/java-project-exercise");
        map.put("강수빈", "https://github.com/kang-subin/Java");
        map.put("고관운",	"https://github.com/KoKwanwun/LikeLion.git");
        map.put("고현석",	"https://github.com/lcomment/likelion-practice");
        map.put("김건우",	"https://github.com/KimGunWoo9595/Lion_Java_Pratice");
        map.put("김기헌",	"https://github.com/KimKiheon/LikeLion");
        map.put("김나영",	"https://github.com/kny3037/java-exercise");
        map.put("김도현",	"https://github.com/KimDohyoun79/remote_Lion.git");
        map.put("김미지",	"https://github.com/kimkimj/create-repo1");
        map.put("김민경",	"https://github.com/mingry2/intellij-git-exercise1");
        map.put("김민지",	"https://github.com/Min-ji99/intelliJ-git-exercies");
        map.put("김상호",	"https://github.com/sangho527/Like_Lion_Java");
        map.put("김솔배",	"https://github.com/ReadnThink/Like_lion.git");
        map.put("김예진",	"https://github.com/yejinstar/git_exercise_push");
        map.put("김응준",	"https://github.com/dmdwns2/java-git-init");
        map.put("김재근",	"https://github.com/Geuun/Java_Algorithm");
        map.put("김정현",	"https://github.com/O-sulloc/LikelionJava");
        map.put("김준호",	"https://github.com/chordpli/likelion_course");
        map.put("김지수",	"https://github.com/strongcookdas/java.git");
        map.put("김지영",	"https://github.com/Kim-Ji-Yeong/Java-exercise");
        map.put("김진아",	"https://github.com/k0605ja/git-test");
        map.put("김하늘",	"https://github.com/pigeon2gugu/like-lion-2/tree/main/src/class_221005");
        map.put("김희정",	"https://github.com/hj-k66/git_exercise_2");
        map.put("박기문",	"https://github.com/moomineee/JavaEx/tree/main/src/lion");
        map.put("박수진",	"https://github.com/sujin-park0607/java-project-exercise");
        map.put("박은빈",	"https://github.com/joypeb/java-project-push-test");
        map.put("박정훈",	"https://github.com/pi22-a/https://github.com/pi22-a/like_a_lion.git.git");
        map.put("박제민",	"https://github.com/JemJem70/Algolism/tree/master/src");
        map.put("박태근",	"https://github.com/BearCrying/Git_Excercise/tree/main/src");
        map.put("조국현",	"https://github.com/h5000n/like_lion_study");
        map.put("조문주",	"https://github.com/mooonju/java-exercise");
        map.put("조예지",	"https://github.com/coastby/java-project");
        map.put("조윤재",	"https://github.com/Yunjaejo/Java-playground");

//        System.out.println(map.get("이수진"));


        int alphabet[] = new int[26];

        for(String key: map.keySet()) {
//            System.out.println(key+","+map.get(key));
            System.out.println(key+"학생의 주소에서");
            String s1 = map.get(key).toLowerCase();
            for (int i = 0; i < s1.length(); i++) {
                if (97<=s1.charAt(i) && s1.charAt(i)<=122) {
                    int index = s1.charAt(i) - (int) 'a';   //(int)'a'로 int형으로 형변환 한 a를 뺀 값을 index에 알파벳의 위치로 저장한다.
                    alphabet[index]++;
                }
                //else { continue; }
            }
            for (int i = 0; i < alphabet.length; i++) {
                if (alphabet[i] != 0) {                            //alphabet[i]!=0이라는 의미는 개수가 0개가 아닌 알파벳만 출력한다는 것을 의미한다.
                    System.out.print("'" + (char) (i + 97) + "'" + "는" + (alphabet[i]) + "개 있습니다.");
                }
            }
            System.out.println();
        }

    }
}
