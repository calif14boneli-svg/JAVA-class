import java.util.Scanner;

public class Condicional_Switch {
    public static void main(String[] args) {

        int DiaSemana;
        int Edad;
        String FrutasDeVerano;

        //EL SCANNER LO USO PARA LAS 3 VERSIONES DE SWITCH
        Scanner entrada = new Scanner(System.in);

        //IngresandoDatos
        System.out.println("Ingrese dia a consultar");
        DiaSemana = entrada.nextInt();

        //VERSION TRADICIONAL:
        switch (DiaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Martes");
                break;
            case 6:
                System.out.println("Miercoles");
                break;
            case 7:
                System.out.println("Jueves");
                break;
            default:
                System.out.println("Ingrese numero correcto");
                break;
        }

        //VERSION MODERNA:
        System.out.println("Ingresa tu edad y te dire que animal eres ");
        Edad = entrada.nextInt();

        switch (Edad) {

          case 1 -> System.out.println("Pollito");
          case 2 -> System.out.println("Jabali");
          case 3 -> System.out.println("Jirafa");
          case 4 -> System.out.println("Leon");
            default -> System.out.println("Solo puedes escoger del 1 al 4 , vuelve a intentarlo");

        }

        //VERSION MODERNA con STRING:
        System.out.println("Que puesto te gusta su fruta?");
        FrutasDeVerano = entrada.next();

        switch (FrutasDeVerano) {
            case "puesto 1" -> System.out.println("TE gusta la manzana entonces");
            case "puesto 2" -> System.out.println("Te gusta la pera entonces");
            case "puesto 3" -> System.out.println("Te gusta el mango entonces ");
            default -> System.out.println("Los demas puestos ya cerraron, solo estan del puesto 1 al 3");
        }


    }
}