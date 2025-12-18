//CONSTANTE: hace que el  TipoDato que tiene la palabra "final" al inicio, prevalezca
//y ya no pueda existir otro NombreVariable

public class VariableConstantes {
    public static void main(String[] args) {

       int valor=50;
        System.out.println(valor);

        valor=300;
        System.out.println(valor);


final  int valor0 = 30;
        System.out.println(valor0);
        //aparece en error porque no se puede repetir el NombreVariable


    }
}

