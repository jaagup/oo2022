package Loomine;

public class Proov2 {
    public static void main(String[] args) {
        PaarideLoendur1<Integer> p1=new PaarideLoendur1<>();
        p1.lisa(2);
        p1.lisa(3);
        p1.lisa(2);
        p1.lisa(3);
        System.out.println(p1.loendur);
    }
}
