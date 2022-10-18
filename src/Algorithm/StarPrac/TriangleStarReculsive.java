package Algorithm.StarPrac;

public class TriangleStarReculsive {

    public void Count(int n) {
        if(n <= 0) return;
        Count(n-1);
        Triangle(n);
        System.out.println("");
    }
    public void Triangle(int n) {
        if(n <= 0) return;
        Triangle(n-1);
        System.out.print("*");
    }

    public static void main(String[] args) {

        TriangleStarReculsive tsr = new TriangleStarReculsive();
        tsr.Count(4);

    }
}
