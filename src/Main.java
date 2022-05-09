import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws Exception {
//        Institut ins = new Institut("La Guineueta");
//        Professor profe1 = new Professor("Marc");
//        profe1.assignarDni("1234");
//        ins.afegirProfe(profe1);
//
//        Estudiant estudiant1 = new Estudiant();
//        estudiant1.canviarNom("Joan");
//        estudiant1.assignarDni("6666");
//        estudiant1.posarNota(7.5);
//        ins.afegirEstudiant(estudiant1);
//
//        ins.imprimirInformacio();

                Institut ins = new Institut("La Guineueta");

                Professor profe1 = new Professor();
                profe1.canviarNom("Marc");
                profe1.assignarDni("324234");
                ins.afegirPersona(profe1);
                profe1.assignarSou(20);



        ProfessorSubstitut profe2 = new ProfessorSubstitut();
                profe2.canviarNom("Laura");
                profe2.assignarDni("8888");
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                Date dataInici = new Date(2021, 11, 1);
                Date dataFi = new Date(2022, 6, 30);
                profe2.assignarSubstitucio(dataInici, dataFi);
                ins.afegirPersona(profe2);
                profe2.assignarSou(200);


        Estudiant estudiant1 = new Estudiant();
                estudiant1.canviarNom("Joan");
                estudiant1.assignarDni("6666");
                estudiant1.posarNota(9);
                estudiant1.posarNota(3);
                estudiant1.posarNota(7);

        ins.afegirPersona(estudiant1);

                ins.imprimirInformacio();


                System.out.println("");
                //provocar excepciones
                System.out.println("//provocar excepciones//");
                profe1.assignarSou(-100);
                profe2.assignarDni("231321651");
                estudiant1.posarNota(12);
                profe1.canviarNom(null);
                profe2.canviarNom(null);
                estudiant1.canviarNom(null);
                System.out.println("");

        ins.imprimirInformacio();



    }
        }


