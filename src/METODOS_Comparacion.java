import java.util.Scanner;

public class METODOS_Comparacion {
    public static void main(String[] args) {

       String palabra1, palabra2;

        Scanner entrada = new Scanner(System.in);

        //ingreso de datos:
        System.out.println("Ingrese primera palabra" );
        palabra1= entrada.next();
        System.out.println("Ingrese 2da palabra" );
        palabra2 = entrada.next();

    //METODO equals, sirve para comparar textos de forma exacta

        if (palabra1.equals(palabra2)) {
            System.out.println(palabra1 + " es igual a " + palabra2);
        } else {
            System.out.println(palabra1 + " NO es igual a " + palabra2);
        }

    //METODO equalsIgnoreCase, sirve para comparar de forma semi-exacta

        if (palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println (palabra1 + " es igual a " + palabra2 + "\n" + "Sin tomar en cuanta las mayusculas" );
        }else {
            System.out.println( palabra1 + " NO es igual a " + palabra2 + "\n" + "Sin tomar en cuanta las mayusculas" );
        }

    //METODO compareTo, sirve para comparar cant. d caracteres:

        if (palabra1.compareTo(palabra2)==0){
            System.out.println(palabra1 + " tiene las mismas letras que: " + palabra2);
        }else {
            if (palabra1.compareTo(palabra2) > 0) {
                System.out.println(palabra1 + " tiene mas letras que: " + palabra2);
            } else {
                System.out.println(palabra1 + " tiene menos letras que: " + palabra2);

    //METODO charAt, saber el caracter( 1 letra) de una palabra:

    char caracter = palabra1.charAt(2);
                System.out.println("segunda letra de: " + palabra1 + "es :" + caracter );




            }
        }


        //https://www.youtube.com/watch?v=wCp3IS0Iz_0&list=PL2Z95CSZ1N4GD4wqgXMiujfSVuG2xBP9P&index=24
        //https://www.youtube.com/watch?v=5-54SUblLzw&list=PL2Z95CSZ1N4GD4wqgXMiujfSVuG2xBP9P&index=2%205 (2da parte)













    }
}
