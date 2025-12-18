public class casting {
public static void main(String[] args) {
    //CASTING: conversion de tipos de datos
    //Tipos de datos primitivos:
    //byte, short, int, long, float, double, char, boolean

    //Entero a double
    int numeroEntero = 250;
    System.out.println("numeroEntero: " + numeroEntero);

    double numeroDecimal = numeroEntero;
    System.out.println("numeroDecimal: " + numeroDecimal);


    //Double a entero
    double otroDecimal = 99.99;
    System.out.println("otroDecimal: " + otroDecimal);

    int otroEntero = (int) otroDecimal; //casting explicito
    System.out.println("otroEntero: " + otroEntero);

    //TUTORIAL: https://www.youtube.com/watch?v=YJ8jJ1pVn1o&list=PL2Z95CSZ1N4GD4wqgXMiujfSVuG2xBP9P&index=10
    
    
    
    //Texto a entero 
    String textoNumero = "1234";
    System.out.println("textoNumero: " + textoNumero);  

    int numeroDesdeTexto = Integer.parseInt(textoNumero);
    System.out.println("numeroDesdeTexto: " + numeroDesdeTexto);


    //Entero a texto
    int edad = 30;
    String textoEdad = String.valueOf(edad);
    System.out.println("textoEdad: " + textoEdad);

}
}
