package day4.PopulationStatisticsProject;

//우리가 받아온 데이터 파일에서 원하는 값만 추출하는 메소드
public class PopulationMove {

    //private으로 변수선언
    private int fromSido;
    private int toSido;

    //1. constructor 추가 - fromSido, toSido를 받아서 멤버변수에 넣는 기능
    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    //3. 위에 int로 선언된 멤버변수들이 배열에들어가면서 string이 되어서 다시 int로 오버로딩해준다
    public PopulationMove(String fromSido, String toSido) {
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
    }

    //private에 접근할 수 있도록 getter생성
    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }

}
