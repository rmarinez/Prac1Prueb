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

    public void canviarSou(int sou){
        this.sou = sou;
    }

    public void obtenirDades(){
        System.out.println("Profe amb sou: "+ getSou());
    }
}
