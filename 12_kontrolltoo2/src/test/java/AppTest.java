import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest {

    @Test public void andmeteTest(){
        Assertions.assertEquals(0.0, new Toidukomponendid(new Toiduaine("Kartul", 0.15, 0.1, 0.3), 0.0).rasvuKoguseArvutamine());
        Assertions.assertEquals(10.0, new Toidukomponendid(new Toiduaine("Kartul", 0.15, 0.1, 0.3), 100.0).rasvuKoguseArvutamine());
        Assertions.assertEquals(17.0, new Toidukomponendid(new Toiduaine("Kartul", 0.15, 0.1, 0.3), 100.0).rasvuKoguseArvutamine());
//        Assertions.assertEquals(10.0, new Toidukomponendid(new Toiduaine("Kartul", 0.12, 0.15, 0.57), 100.0).sysivesikuteKoguseArvutamine());

    }
}
