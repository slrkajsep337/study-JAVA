package Algorithm.StarPrac;

public class StarPrac03 {

    public String pyramid(int n) {
        String star = "";

        for(int i=0; i<n; i++) {
            for (int p=n-i; p>0; p--) {
                star += " ";
            }
            for(int j=0; j<(2*i)+1; j++) {
                star += "*";
            }
            star += "\n";
        }
        return star;
    }


    public static void main(String[] args) {
        StarPrac03 sp = new StarPrac03();
        String rst = sp.pyramid(4);

        System.out.println(rst);

    }
}
