package Algorithm.StarPrac;

public class StarPrac02 {

    private String shape = "*";

    public StarPrac02() {

    }
    public StarPrac02(String shape) {
        this.shape = shape;
    }

    private String star(int n) {
        String star="";

        for (int i=0; i<n; i++) {
            for(int j=n-i; j<n+1; j++) {
                star += this.shape;
            }
            star+="\n";
        }
        return star;
    }
    public static void main(String[] args) {

        StarPrac02 sp = new StarPrac02("#");
        String rst = sp.star(4);
        System.out.println(rst);

    }
}
