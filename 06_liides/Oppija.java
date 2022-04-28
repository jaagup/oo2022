import java.util.ArrayList;
import java.util.List;

public class Oppija{
    public String nimi;
    public String pNimi;
    public String iK;

    public String kodutoo;
    public String kodutooYlesanne;
    public Integer hinne = null;

    public Opetaja hindaja;


    public Oppija(String nimi, String pNimi, String iK){
        this.nimi = nimi;
        this.pNimi = pNimi;
        this.iK = iK;
    }

    public void lisaKodutoo(String kodutoo, String kodutooYlesanne){
        this.kodutoo = kodutoo;
        this.kodutooYlesanne = kodutooYlesanne;
    }

    public void hindaKodutoo(Opetaja ope, Integer hinne){
        this.hinne = hinne;
        this.hindaja = ope;
        ope.koodutoodeYlevaade.add(this.toString());
    }
    @Override
    public String toString(){
        return "Õppija nimi: " + this.nimi + "\n" + "Õppija perenimi: " + this.pNimi + "\n" + "Õppija isikukood: " + this.iK + "\n" + "Kodutoo ülesanne: " + this.kodutooYlesanne + "\n" + "Kodutöö vastus: " + this.kodutoo + "\n" + "Hinne: " + this.hinne + "\n" + "Hindaja: " + this.hindaja.nimi  + " " + this.hindaja.pNimi;
    }
}