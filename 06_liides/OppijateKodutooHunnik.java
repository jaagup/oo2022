import java.util.ArrayList;
import java.util.List;

public class OppijateKodutooHunnik implements IKodutoodeYlevaade{
    public List<Oppija> oppija = new ArrayList<>();
    public List<String> oppijaInfo = new ArrayList<>();

    public String kedaOtsin;
    public void lisaOppijat(Oppija o){
        oppija.add(o);
        oppijaInfo.add(o.toString());
    }

    @Override
    public void kodutoodeYlevaade() {
        for (Integer i = 0; i <= oppija.size()-1; i++) {
            if(oppija.get(i).iK == kedaOtsin){
                System.out.println(oppijaInfo.get(i));
                System.out.println("-------------------------------------------\n");
            }
        }
    }
}
