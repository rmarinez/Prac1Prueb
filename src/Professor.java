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
                System.out.println("Sueldo incorrecto");
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
        return "Persona amb nom: " + getNom() + "  i DNI: " + getDni () + " PROFE amb sou: " +  getSou();
    }
}
