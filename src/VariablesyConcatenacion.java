public class VariablesyConcatenacion {

    public static void main(String[] args) {

//VARIABLES
        //Guardan datos y contienen valores
        String texto="VARIABLE";
        System.out.println(texto);

        int entero = 25;
        double decimal = 25.4;
        String texto1 = "probando cualquier variable";
        boolean LaJirafaEsPequeña = false;
        char DeUnCaracter = 'A';

        System.out.println(entero);
        System.out.println(decimal);
        System.out.println(texto1);
        System.out.println(LaJirafaEsPequeña);
        System.out.println(DeUnCaracter);


 //CONCATENACION
    //unir 2 variables e una salida
        String texto2 ="\nCONCATENACION";
        System.out.println(texto2);

        String nombre= "homero";
        String apellido= "Simpson";
        System.out.println("Cual es su nombre y apellido: " + nombre + " " + apellido);


        String valor1= "clave erronea", valor2="vuelve a intentar";
        String reesultado= valor1 + " " + valor2;
        System.out.println( reesultado);

    //METODO P.O.O.
        System.out.println(valor1.concat(valor2));
    }
}
