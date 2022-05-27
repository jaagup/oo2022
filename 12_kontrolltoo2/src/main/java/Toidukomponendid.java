public class Toidukomponendid{//; <T extends Toiduaine>{
    Toiduaine td;
    Double kogus; // grammides

    public Toidukomponendid(Toiduaine td, Double kogus) {
        this.td = td;
        this.kogus = kogus;
    }

    public Double rasvuKoguseArvutamine(){
        return Math.round((td.getRasvadP() * kogus) * 100.0)/ 100.0;
    }
    public Double valkudeKoguseArvutamine(){
        return Math.round((td.getValgudP() * kogus) * 100.0)/ 100.0;
    }
    public Double sysivesikuteKoguseArvutamine(){
        return Math.round((td.getSysivesikudP() * kogus) * 100.0)/ 100.0;
    }

    public Double getKogus() {
        return kogus;
    }

    public void setKogus(Double kogus) {
        this.kogus = kogus;
    }
}
