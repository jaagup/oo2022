public class Program {
    public static void main(String[] args) {
        Veekeedukann v1 = new Veekeedukann();
        v1.lylitameSisse(300, 18.0);
        System.out.println(v1.veekeedukanniTemperatuur());
        v1.lisameVettJuurde(1000, 0);
        System.out.println(v1.veekeedukanniTemperatuur());
        v1.lylitameSisse(20, v1.temperatuur);

        System.out.println("Peale valamist" + v1.veekeedukanniTemperatuur());
    }
}
