package Loomine;

public class Proov3 {
    public static void main(String[] args) {
        PaarideLoendur1<Character> p1 = new PaarideLoendur1<>();
        String lause = "Kaval ants ja vanapagana saapad vanapagana laekas";
        for (int i = 0; i < lause.length(); i++) {
            p1.lisa(lause.charAt(i));
        }
        System.out.println(p1.loendur);

    }
}
