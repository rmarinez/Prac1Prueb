public class Persona {

    //Atributos
    private String dni;
    private String nom;

    //metodos
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public void canviarNom(String nom){
        this.nom = nom;
    }

    public String getDni(){
        return dni;
    }

    public void assignarDni(String dni){
        this.dni = dni;
    }

    public String obtenirDades(){
        return "Persona amb nom:  "+getNom()+"i DNI: " + getDni();
    }






}
