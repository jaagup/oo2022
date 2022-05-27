import java.util.HashMap;

public class Proov2 {
    public static void main(String[] args) {
        HashMap<Integer, String> valvajad=new HashMap<>();
        valvajad.put(1, "Juku");
        valvajad.put(2, "Kati");
        valvajad.put(1, "Mati");
        System.out.println(valvajad);

        // Koostage map, kus võtmeks on eesnimi ning väärtuseks veerandihinne
        // Lisage paar väärtust
        // Trükkinge tulemused
        // Saage muutujasse kätte vaid eesnimed, kuvage need

        HashMap<String, Integer> skoorid=new HashMap<>();
        skoorid.put("Kati", 5);
        skoorid.put("Hanna", 5);
        skoorid.put("Priit", 4);
//        System.out.println(skoorid.get("Kati"));
        for (String skoor:skoorid.keySet()) {
            System.out.println(skoor);
        }


    }
}
