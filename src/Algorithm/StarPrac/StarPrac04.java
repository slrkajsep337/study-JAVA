package Algorithm.StarPrac;

public class StarPrac04 {

    public void square(int n) {
        for (int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        StarPrac04 sp = new StarPrac04();
        sp.square(4);



    }
}
