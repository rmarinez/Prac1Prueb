public class Estudiant extends Persona {

    //atributo
    private float nota;

    //metodo

    public float getNota(){
        return nota;
    }

    public void PosarNota(int nota){
        this.nota = nota;
    }

    public void obtenirDades(){
        System.out.println("ESTUDIANT amb nota: "+ getNota());
    }
}
