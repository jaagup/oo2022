public class Joogipudel {
    Double maht;
    String pudeliTyyp;
    Double pudeliMass;
    Double taaraMaksumus;
    Jook jook;

    // 1,4 г/см³ == 1400 кг/м³ - пластик
    // 2,7 г/см³ == 2700 кг/м³ - алюминий

    public Joogipudel(Double maht, String pudeliTyyp, Double taaraMaksumus, Jook jook){
        this.maht = maht;
        this.pudeliTyyp = pudeliTyyp;
        this.pudeliMass = maht/1000;
        this.taaraMaksumus = taaraMaksumus;
        this.jook = jook;
    }

    public String joogiMassJoogiPudel(){
        Double joogiMass = Math.round((pudeliMass * jook.tihedus)*100.0)/100.00;

        return "Pudeli ja joogi Mass kokku: " + joogiMass + "kg";
    }

    public Double getMaht(){
        return this.maht;
    }
    
}