public class Toiduaine{
    String nimetus;
    Double valgudP;
    Double rasvadP;
    Double sysivesikudP;

    public Toiduaine(String nimetus, Double valgudP, Double rasvadP, Double sysivesikudP) {
        this.nimetus = nimetus;
        if(valgudP > 100.0 ){
            System.out.println("Valgud rotsentuaalselt ei saa ületada 100%");
        } else {
            this.valgudP = valgudP;
        }

        if(rasvadP > 100.0){
            System.out.println("Rasvad protsentuaalselt ei saa ületada 100%");
        } else {
            this.rasvadP = rasvadP;
        }

        if(sysivesikudP > 100.0){
            System.out.println("Süsivesikud protsentuaalselt ei saa ületada 100%");
        } else {
            this.sysivesikudP = sysivesikudP;
        }
    }

    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public Double getValgudP() {
        return valgudP;
    }

    public void setValgudP(Double valgudP) {
        this.valgudP = valgudP;
    }

    public Double getRasvadP() {
        return rasvadP;
    }

    public void setRasvadP(Double rasvadP) {
        this.rasvadP = rasvadP;
    }

    public Double getSysivesikudP() {
        return sysivesikudP;
    }

    public void setSysivesikudP(Double sysivesikudP) {
        this.sysivesikudP = sysivesikudP;
    }
}
