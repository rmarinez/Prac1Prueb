import java.util.Date;

public class ProfessorSubstitut extends Professor{
    private Date dataInici;
    private Date dataFi;



    public Date getDataInici(){
        return dataInici;
    }


    public Date getDataFi(){
        return dataFi;
    }



    public void assignarSubstitucio(Date dataInici, Date dataFi){
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }


    public String obtenirDades(){
        return "Persona amb nom: " + getNom() + " i DNI: " + getDni() + " (PROFE amb sou: " +  getSou() + ", del " + dataInici.getDate() + "/" + dataInici.getMonth() + "/" + dataInici.getYear()  + " al " + dataFi.getDate() + "/" + dataFi.getMonth() + "/" + dataFi.getYear()  +")\n";
    }

}
