public class Joogivaat {
    Double ruumala;
    Joogipudel joogipudel;


    public Joogivaat(Double ruumala, Joogipudel joogipudel) {
        this.ruumala = ruumala;
        this.joogipudel = joogipudel;
    }


    public void taidaPudel(){
        if(this.ruumala == 0.0){
            this.ruumala = 0.0;
        } else if(this.ruumala < joogipudel.getMaht()){
            this.ruumala-=this.ruumala;
        } else{
            this.ruumala-= joogipudel.maht;
        } 
    }

    public Double getRuumala() {
        return Math.round(this.ruumala*100.00)/100.0;
    }

    public void setRuumala(Double ruumala) {
        this.ruumala = ruumala;
    }

    public Joogipudel getJoogipudel() {
        return this.joogipudel;
    }

    public void setJoogipudel(Joogipudel joogipudel) {
        this.joogipudel = joogipudel;
    }
    


}

