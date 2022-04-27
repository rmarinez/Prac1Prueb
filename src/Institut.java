import java.util.ArrayList;

public class Institut {

    ArrayList<Persona> estudiants = new ArrayList<>();
    ArrayList<Persona> professors = new ArrayList<>();
    ArrayList<Persona> ProfessorsSubstituts = new ArrayList<>();


    //atributo
    private String nom;


    //metodo
    public String getNom(){
        return nom;
    }

    public Institut(String nom){
        this.nom = nom;
    }

    public void afegirProfe(Professor profe){
        professors.add(profe);
    }

    public void afegirEstudiant(Estudiant estudiant){
        estudiants.add(estudiant);
    }




    public void imprimirInformacio(){
        System.out.println(getNom()+". Llista de persones:");

        for (Persona professor : professors){
            System.out.println(professor.obtenirDades()); //Error al estar de tipo void el obtenirDades();
        }
    }
}
