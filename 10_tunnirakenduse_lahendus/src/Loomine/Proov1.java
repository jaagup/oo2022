package Loomine;

public class Proov1 {
    public static void main(String[] args) {
//        SamaTyypiPaar<Integer> asukoht=new SamaTyypiPaar<>();
//        asukoht.esimene=7;
//        asukoht.teine = 4;
//        System.out.println(asukoht.esimene);
//        System.out.println(asukoht); //tostring

        // Looge objekt inimese ees- ja perekonnanime tarbeks. Käivitage ja katsetage
        EPnimi<String> nimed = new EPnimi<>();
        nimed.eNimi = "Andres";
        nimed.pNimi = "Sikka";
        System.out.println(nimed);
    }
}
