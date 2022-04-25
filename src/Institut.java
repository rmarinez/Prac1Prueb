public class Institut {
    //atributo
    private String nom;

    //metodo
    public String getNom(){
        return nom;
    }

    public void Institut(String nom){
        this.nom = nom;
    }

    public void imprimirInformacio(){
        System.out.println(getNom()+". Llista de persones:");
    }
}
