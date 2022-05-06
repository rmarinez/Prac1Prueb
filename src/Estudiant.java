public class Estudiant extends Persona {

    //atributo
    private double nota;

    //metodo

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota(){
        return nota;
    }


    public void posarNota(double nota){
        try {
            if (nota >= 0 && nota <= 10){
                setNota(nota);
            }
            else{
                System.out.print("nota no valida");
            }
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
    }

    public String obtenirDades(){

        try {
            if (this.getDni() != null && this.getNom() != null){
                return  "Persona amb nom:" + getNom() + "  i DNI: " + getDni () + " Estudiant amb nota: " +  getNota();
            }
            else{
                return "dni o nombre son de tipo nulo";
            }
        }catch (Exception e){
            return e.getMessage();
        }

    }
}
