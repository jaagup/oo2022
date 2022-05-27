import java.util.ArrayList;

public class Retsept {
    // Lähtume 1000g
    String nimetus;
    ArrayList<Toidukomponendid> toidukomponendidStandartList;
    Double kaal = 0.0;

    public Retsept(String nimetus, ArrayList<Toidukomponendid> toidukomponendidStandartList) {
        this.nimetus = nimetus;
        this.toidukomponendidStandartList = toidukomponendidStandartList;
        for (int i = 0; i < toidukomponendidStandartList.size(); i++){
            kaal += toidukomponendidStandartList.get(i).getKogus();
        }
        System.out.println("Alg kaal - "+kaal+"g");
    }

    public String toiduaineteVajadus(Double omaKaal) {
        String uusToiduaineteKogus = "";
        Double koef = 0.0;
        koef = omaKaal / kaal;
        Double kokkuKaalProov = 0.0;
        for (int i = 0; i < toidukomponendidStandartList.size(); i++){
        Double uusKaal = koef*toidukomponendidStandartList.get(i).kogus;
            uusToiduaineteKogus += "Ingridient: " + toidukomponendidStandartList.get(i).td.getNimetus()+" " + Math.round(uusKaal *100.00)/100.00 + "g" + "\n";
            kokkuKaalProov += uusKaal;
        }
        uusToiduaineteKogus += "Uuuskaal: " + Math.round(kokkuKaalProov *100.00)/100.00 + "g";
        return uusToiduaineteKogus;
    }
}
