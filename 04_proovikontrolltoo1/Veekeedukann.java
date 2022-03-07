public class Veekeedukann {
    double temperatuur = 0.0;
    double veekeedukanniMahus = 2000.0;
    double valatudVeeMahus = 1000.0;
    double v6imsus = 1200.0;
    double mahusMisMeSaameSuurendadaKraadiV6rra = v6imsus / 4.19;
    double terveTeeKannuMuutmisAegKraadiV6rra = valatudVeeMahus / mahusMisMeSaameSuurendadaKraadiV6rra;

    public Veekeedukann() {

    }

    public String veekeedukanniTemperatuur(){
        if(this.temperatuur >= 80){
            return "Vee temperatuur ületab 80 kraadi -> " + temperatuur +"°C";
        } else{
            return "Vee temperatuur on alla 80 kraadi -> "  + temperatuur +"°C";
        }
    }

    public void lylitameSisse(double sek, double veeAlgTemperatuur){
        if((sek /terveTeeKannuMuutmisAegKraadiV6rra) + veeAlgTemperatuur > 100.0){
            this.temperatuur = 100.0;
        } else{
            this.temperatuur = (sek /terveTeeKannuMuutmisAegKraadiV6rra) + veeAlgTemperatuur;
        }
    }
    public void lisameVettJuurde(double lisaVett, double lisatudVeeTemperatuur){
        if(lisaVett <= (veekeedukanniMahus-valatudVeeMahus)){
            this.temperatuur =  (valatudVeeMahus*this.temperatuur + lisaVett*lisatudVeeTemperatuur)/(valatudVeeMahus+lisaVett);
        } else {
            System.out.println("Te ületasite veetekanni mahut!");
        }
    }

}
