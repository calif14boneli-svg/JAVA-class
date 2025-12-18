public class casting {
public static void main(String[] args) {
    //CASTING: conversion de tipos de datos

    //Tipos de datos primitivos:
    //byte, short, int, long, float, double, char, boolean
    ////Tipos de datos NO primitivos:
    //String

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

    //TUTORIAL: https://youtu.be/Le5vzBQDgwM?list=PL2Z95CSZ1N4GD4wqgXMiujfSVuG2xBP9P
    
    
    
    //Texto a entero 
    String textoNumero = "1234";
    System.out.println("textoNumero: " + textoNumero);  

    int numeroDesdeTexto = Integer.parseInt(textoNumero);
    System.out.println("numeroDesdeTexto: " + numeroDesdeTexto);


    //Entero a texto
    int entero = 30;
    String enteroTexto = String.valueOf(entero);
    System.out.println("textoEdad: " + enteroTexto);


}
}
