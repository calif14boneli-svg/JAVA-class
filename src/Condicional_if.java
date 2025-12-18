
public class Condicional_if {

    public static void main(String[] args) {

        int edad = 18;
        int edad2 = 20;

        if (edad >= 18) {
            System.out.println("eres mayor de edad");
        } else {
            System.out.println("No eres mayor de edad");
        }
        
        if(edad2 >=24) {
            System.out.println("Estas en la base 2");
        } else if (edad2 >=30 & edad2>10) {
            System.out.println( "Estaras en espera");
        }
    }}