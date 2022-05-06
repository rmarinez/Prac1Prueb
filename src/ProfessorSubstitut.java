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
        try {
            if (this.getDni() != null && this.getNom() != null){
                return "Persona amb nom: " + getNom() + " i DNI: " + getDni() + " (PROFE amb sou: " +  getSou() + ", del " + dataInici.getDate() + "/" + dataInici.getMonth() + "/" + dataInici.getYear()  + " al " + dataFi.getDate() + "/" + dataFi.getMonth() + "/" + dataFi.getYear()  +")\n";
            }
            else{
                return "dni o nombre son de tipo nulo";
            }
        }catch (Exception e){
            return e.getMessage();
        }
    }

}
