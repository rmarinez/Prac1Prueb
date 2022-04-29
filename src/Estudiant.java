public class Estudiant extends Persona {

    //atributo
    private double nota;

    //metodo

    public double getNota(){
        return nota;
    }


    public void posarNota(double nota){
        this.nota = nota;
    }

    public String obtenirDades(){
        return  "Persona amb nom:" + getNom() + "  i DNI: " + getDni () + " Estudiant amb nota: " +  getNota();

    }
}
