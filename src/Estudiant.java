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

    public void obtenirDades(){
        System.out.println("ESTUDIANT amb nota: "+ getNota());
    }
}
