public class Condicional_if_OR {
    public static void main(String[] args) {

    //OR
        boolean Domingo = true;
        boolean Vacaciones = false, feriado = false;

        if (Domingo == true || Vacaciones == true || feriado == true) {
            System.out.println("ACCESO DENEGADO EN LA EMPRESA");
        } else {
            System.out.println("ACCESO PERMITIDO");
        }

    //NOT
        System.out.println("===MONITOREO DEL SISTEMA===");

        var enlinea = true;

        //el signo de exclamacion funciona como negacion
        if (!enlinea){
            System.out.println("Sistema fuera de Linea");
        }else{
            System.out.println("Sistema en Linea");
        }






    }

}
