package Algorithm.StarPrac;

public class StarPrac06 {

    public void square(int n) {
        for (int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i==0 || i==n-1) {
                    System.out.print("*");
                } else {
                    if(j==0 || j==n-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        StarPrac06 sp = new StarPrac06();
        sp.square(5);
    }
}
