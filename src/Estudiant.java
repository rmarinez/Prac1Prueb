import java.util.ArrayList;
import java.util.Collections;

public class Estudiant extends Persona {
    ArrayList<Double> notas = new ArrayList<>();

    //atributo
    private double notaMinima;
    private double notaMaxima;
    private double mediana;

    //metodo

    public double getNotaMinima() {
        notaMinima = Collections.min(notas);
        return notaMinima;
    }

    public double getNotaMaxima() {
        notaMaxima = Collections.max(notas);
        return notaMaxima;
    }

    public double getMediana() {
        double sumaCont = 0;

        for (double i: notas){
            sumaCont +=i;
        }

        mediana = sumaCont / notas.size();
        return mediana;
    }



    public void posarNota(double nota){
        try {
            if (nota >= 0 && nota <= 10){
                notas.add(nota);
            }
            else{
                System.out.print("nota no valida");
            }
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
    }

    public String obtenirDades(){

        try {
            if (this.getDni() != null && this.getNom() != null){
                return  "Persona amb nom:" + getNom() + "  i DNI: " + getDni () + " Estudiant amb nota " + notas + " més baixa: " +  getNotaMinima() + " i nota més alta " + getNotaMaxima() + " la mitjana és de " + getMediana();
            }
            else{
                return "dni o nombre son de tipo nulo";
            }
        }catch (Exception e){
            return e.getMessage();
        }

    }
}
