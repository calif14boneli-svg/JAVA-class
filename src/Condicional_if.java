
public class Condicional_if {

    public static void main(String[] args) {

        int edad = 18;
        int km = 100;
        
    //si.. 
        if (edad >= 18) {
            System.out.println("eres mayor de edad");
        } 
    //entonces..    
        else {
            System.out.println("No eres mayor de edad");
        }
        



    //si...    
    if (km >=100) {
        System.out.println("El vehiculo tiene mas de un año");
    }   

    //entonces si...
    else if (50 >= km && km < 100) {
        System.out.println("El vehiculo esta semi nuevo");
    }

    //de lo contrario...
    else{
        System.out.println("El vehiculo es nuevo");
    
    }
}
}