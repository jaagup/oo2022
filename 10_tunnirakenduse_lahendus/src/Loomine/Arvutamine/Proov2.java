package Loomine.Arvutamine;

public class Proov2 {
    public static void main(String[] args) {
        Arvutaja<String, String> a = new Puhverdaja<String, String>(new Esitaheleidja());
        System.out.println(a.f("Tere"));
        System.out.println(a.f("Tere"));
        System.out.println(a.f("Kere"));
        System.out.println(((Puhverdaja)a).puhver);
    }
}
