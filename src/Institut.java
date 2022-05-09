import java.util.ArrayList;

public class Institut {

    ArrayList<Persona> personas = new ArrayList<>();



    //atributo
    private String nom;


    //metodo
    public String getNom(){
        return nom;
    }

    public Institut(String nom){
        this.nom = nom;
    }

    public void afegirPersona(Persona persona){
        personas.add(persona);
    }


    public void imprimirInformacio(){
        System.out.println(getNom()+". Llista de persones:");

        for (Persona persona : personas){
            System.out.println(persona.obtenirDades());
        }

    }
}
