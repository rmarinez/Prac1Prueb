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

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void assignarDni(String dni){
        try {
            if (this.getDni() != null){
                System.out.println("Ya tiene un dni asignado");
            }
            else{
                setDni(dni);
            }
        }catch (Exception e){
            System.out.print(e.getMessage());
        }

    }

    public String obtenirDades(){
        try {
            if (this.getDni() != null && this.getNom() != null){
                return "Persona amb nom:  "+getNom()+"i DNI: " + getDni();
            }
            else{
                return "dni o nombre son de tipo nulo";
            }
        }catch (Exception e){
            return e.getMessage();
        }
    }
}
