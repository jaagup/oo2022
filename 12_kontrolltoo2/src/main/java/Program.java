import java.io.IOException;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) throws IOException {
        Toiduaine ta1 = new Toiduaine("Kartul", 0.15, 0.16, 0.32);
        Toiduaine ta2 = new Toiduaine("Porgand", 0.12, 0.15, 0.15);
        Toiduaine ta3 = new Toiduaine("Sing", 0.13, 0.12, 0.3);
        Toiduaine ta4 = new Toiduaine("Majonees", 0.17, 0.11, 0.4);
        Toiduaine ta5 = new Toiduaine("Hernes", 0.12, 0.15, 0.15);
        Toiduaine ta6 = new Toiduaine("Munad", 0.12, 0.15, 0.15);
        Toiduaine ta7 = new Toiduaine("Soolased kurgid", 0.12, 0.15, 0.15);
        Toiduaine ta8 = new Toiduaine("Sool", 0.12, 0.15, 0.15);
        Toiduaine ta9 = new Toiduaine("Pipar", 0.12, 0.15, 0.15);
        Toiduaine ta10 = new Toiduaine("Sibul", 0.12, 0.15, 0.15);

        ArrayList<Toidukomponendid> tka = new ArrayList<>();


        tka.add(new Toidukomponendid(ta1, 120.0));
        tka.add(new Toidukomponendid(ta2, 300.0));
        tka.add(new Toidukomponendid(ta3, 290.0));
        tka.add(new Toidukomponendid(ta4, 140.0));
        tka.add(new Toidukomponendid(ta5, 120.0));
        tka.add(new Toidukomponendid(ta6, 100.0));
        tka.add(new Toidukomponendid(ta7, 100.0));
        tka.add(new Toidukomponendid(ta8, 5.0));
        tka.add(new Toidukomponendid(ta9, 1.0));
        tka.add(new Toidukomponendid(ta10, 10.0));


//        ToidudeStat ts1 = new ToidudeStat("Olivie", tka);

//        ArrayList<Toidukomponendid> tka1 = new ArrayList<>();

        Retsept re = new Retsept("Olivje", tka);
        System.out.println(re.toiduaineteVajadus(5000.0));
    }
}
