package Algorithm.StarPrac;

public class StarPrac05 {

    public void square(int n, int m) {
        for (int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        StarPrac05 sp = new StarPrac05();
        sp.square(4, 5);


    }
}
