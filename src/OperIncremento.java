public class OperIncremento {
    public static void main(String[] args) {

        int valor1 = 10;
        System.out.println("Valor original: "+valor1);

        //INCREMENTO postfijo
        valor1++;
        System.out.println("valor incrementado "+valor1);

        //Incrementando prefijo
        ++valor1;
        System.out.println("valor incrementado "+valor1);

        //solo funciona aumentar asi con postfijo
         valor1+=5;
        System.out.println("Valor increm. en 5: " + valor1);


        //DECREMENTO postfijo
        valor1--;
        System.out.println("valor decremento "+valor1);

        //Decremento prefijo
        --valor1;
        System.out.println("valor decremento "+valor1);

        valor1-=5;
        System.out.println("Valor decrem. en 5: " + valor1);
    }
}
