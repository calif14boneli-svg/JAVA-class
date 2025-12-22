public class break_continue_en_BUCLE {
    public static void main(String[] args) {
        //BREAK Y CONTINUE EN BUCLES

        //Ejemplo BREAK: // Sale del bucle cuando i es igual a 6

        System.out.println("===EJEMPLO BREAK===");
        
        for (int i = 1; i <= 10; i++) {
            
            if (i == 6) {break;} System.out.println(i);
       
        }

        //Ejemplo CONTINUE: Salta la iteración cuando i es par
        System.out.println("===EJEMPLO CONTINUE===");
        
        for (int i = 1; i <= 10; i++) {
            
            if (i % 2 == 0) {continue;} System.out.println(i);
        }
    
    
    }
}
