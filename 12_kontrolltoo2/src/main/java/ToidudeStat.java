import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ToidudeStat {
    String nimetus;
    Toidukomponendid tk;
    ArrayList<Toidukomponendid> tka = new ArrayList<>();


    FileWriter fw = null;
    BufferedWriter bw = null;
    PrintWriter pw = null;


    public ToidudeStat(String nimetus, ArrayList<Toidukomponendid> alTk) throws IOException {
        this.nimetus = nimetus;
        this.tka = alTk;

        fw = new FileWriter("Reptseptid.txt", true);
        bw = new BufferedWriter(fw);
        pw = new PrintWriter(bw);

        System.out.println("Retsepti nimetus: " + nimetus);
        pw.println("Retsepti nimetus: " + nimetus);
        System.out.println("Ingridiendid:");
        pw.println("Ingridiendid: ");

        for (int i = 0; i < alTk.size(); i++){
            System.out.println("Nimetus: " + alTk.get(i).td.getNimetus());
            pw.println("Nimetus: " + alTk.get(i).td.getNimetus());
            System.out.println("Toiduaines kogus: " + alTk.get(i).kogus + "g");
            pw.println("Toiduaines kogus: " + alTk.get(i).kogus + "g" );
            System.out.println("Rasvade kogus: " + alTk.get(i).rasvuKoguseArvutamine() + "g");
            pw.println("Rasvade kogus: " + alTk.get(i).rasvuKoguseArvutamine() + "g");
            System.out.println("Valgude kogus: " + alTk.get(i).valkudeKoguseArvutamine() + "g");
            pw.println("Valgude kogus: " + alTk.get(i).valkudeKoguseArvutamine() + "g");
            System.out.println("Sysivesikute kogus: " + alTk.get(i).sysivesikuteKoguseArvutamine() + "g" + "\n");
            pw.println("Sysivesikute kogus: " + alTk.get(i).sysivesikuteKoguseArvutamine() + "g" + "\n");
//            pw.println("--------------------------------------------------------------------------------------------------");
        }

        pw.flush();
    }
}
