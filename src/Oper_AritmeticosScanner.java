import java.util.Scanner;

public class Oper_AritmeticosScanner {
    public static void main(String[] args) {

        int valor1, valor2, resultado;

    Scanner entrada =new Scanner(System.in);

        System.out.println("Ingresa el valor 1: ");
    valor1= entrada.nextInt();

        System.out.println("Ingrese el valor 2: ");
    valor2= entrada.nextInt();

    //SUMA:
        resultado = valor1 + valor2;
        System.out.println("La suma fue: " + resultado);
        System.out.println(valor1 + valor2);

        //RESTA:
        resultado = valor1 - valor2;
        System.out.println("Resta: "+ resultado);

        //RESIDUO:
        resultado = valor1 % valor2;
        System.out.println("Residuo: "+ resultado);


    }
}
