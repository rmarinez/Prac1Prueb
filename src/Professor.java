public class Professor extends Persona {
    //atributo
    private int sou;

    //metodo
    public int getSou(){
        return sou;
    }

    public Professor(String nom){
        this.setNom(nom);
    }

    public Professor(){

    }

    public void canviarSou(int sou){
        this.sou = sou;
    }

    public String obtenirDades(){
        return "Persona amb nom: " + getNom() + "  i DNI: " + getDni () + " PROFE amb sou: " +  getSou();
    }
}
