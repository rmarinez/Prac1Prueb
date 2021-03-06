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

    public void setSou(int sou) {
        this.sou = sou;
    }

    public Professor(){

    }

    public void assignarSou(int sou){
        try {
            if (sou > 3000 || sou < 0){
                throw new Exception("Sueldo incorrecto");
            }
            else {
                setSou(sou);
            }
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
    }

    public void canviarSou(int sou){
        this.sou = sou;
    }

    public String obtenirDades(){
        try {
            if (this.getDni() != null && this.getNom() != null){
                return "Persona amb nom: " + getNom() + "  i DNI: " + getDni () + " PROFE amb sou: " +  getSou();
            }
            else{
                throw new Exception("dni o nombre son de tipo nulo");
            }
        }catch (Exception e){
            return e.getMessage();
        }


    }
}
