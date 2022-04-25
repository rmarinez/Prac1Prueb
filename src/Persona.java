public class Persona {

    //Atributos
    private String dni;
    private String nom;

    //metodos
    public String getNom(){
        return nom;
    }

    public void canvairNom(String nom){
        this.nom = nom;
    }

    public String getDni(){
        return dni;
    }

    public void assignarDni(String dni){
        this.dni= dni;
    }

    public void obtenirDades(){
        System.out.println("Persona amb nom: "+getNom()+"i DNI: " + getDni());
    }






}
