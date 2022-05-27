public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Jook jook1 = new Jook("Coca cola", 1.30, 949.0);
        Jook jook2 = new Jook("Viin", 15.99, 949.0);
        Jook jook3 = new Jook("Vesi", 0.50, 997.0);

        Joogipudel joogipudel1 = new Joogipudel(1.0, "Plastik", 0.10, null);
        Joogipudel joogipudel2 = new Joogipudel(1.0, "Plastik", 0.10, jook1);
        // System.out.println(joogipudel2.joogiMassJoogiPudel());
        Joogivaat joogivaat1 = new Joogivaat(512.0, joogipudel1);

        System.out.println(joogivaat1.getRuumala());
        for (int i = 0; i < 512; i++){
            joogivaat1.taidaPudel();
            System.out.println(joogivaat1.getRuumala());
        }
    }   
}
