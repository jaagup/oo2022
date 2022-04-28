public class program {
    public static void main(String[] args) {
        OppijateKodutooHunnik okh = new OppijateKodutooHunnik();

        Opetaja Jaagup = new Opetaja("Jaagup", "Kippar", "374684651324");
        Oppija Andres = new Oppija("Andres", "Sikka", "398348725873");
        Oppija Mari = new Oppija("Mari", "Maasikas", "49812312839024");


        Andres.lisaKodutoo("5 + 5 = 10", "Liida 5 + 5");
        Andres.hindaKodutoo(Jaagup, 5);
        okh.lisaOppijat(Andres);

        Andres.lisaKodutoo("154 + 123 = ei tea", "Liida 154 + 123");
        Andres.hindaKodutoo(Jaagup, 2);
        okh.lisaOppijat(Andres);

        Andres.lisaKodutoo("1 + 1 = ei oska", "Liida 154 + 123");
        Andres.hindaKodutoo(Jaagup, 0);
        okh.lisaOppijat(Andres);

        Mari.lisaKodutoo("123 + 123 = 246", "Liida 123 + 123");
        Mari.hindaKodutoo(Jaagup, 5);
        okh.lisaOppijat(Mari);

        Mari.lisaKodutoo("50 + 50 = 100", "Liida 50 + 50");
        Mari.hindaKodutoo(Jaagup, 5);
        okh.lisaOppijat(Mari);

//        okh.kedaOtsin = "398348725873";
//        okh.kodutoodeYlevaade();
        Jaagup.kodutoodeYlevaade();
    }
}
