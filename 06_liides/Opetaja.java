import java.util.ArrayList;
import java.util.List;

public class Opetaja implements IKodutoodeYlevaade{
    public String nimi;
    public String pNimi;
    public String iK;

    List<String> koodutoodeYlevaade = new ArrayList<>();

    public Opetaja(String nimi, String pNimi, String iK){
        this.nimi = nimi;
        this.pNimi = pNimi;
        this.iK = iK;
    }

    @Override
    public void kodutoodeYlevaade() {
        System.out.println("Õpetaja pandud hinned: ");
        for(Integer i = 0; i<= koodutoodeYlevaade.size()-1; i++){
            System.out.println(koodutoodeYlevaade.get(i));
            System.out.println("-------------------------------------------\n");
        }
    }
}
