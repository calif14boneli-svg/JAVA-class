import java.util.ArrayList;

public class ARRAYLIST {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Pedro");

        System.out.println(nombres);
        //tamaño de la lista o la cantidad que tenemos:
        System.out.println(nombres.size());

        //GET: como puse 0, se imprimira de quien esta 1ero en la lista:
        System.out.println(nombres.get(0));

        //SET: Modificar un elemento
        System.out.println(nombres.set(1, "Carlos"));
    }
}

//INCOMPLETO