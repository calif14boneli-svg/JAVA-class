import java.util.ArrayList;
import java.util.Scanner;

public class ARRAYLIST {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Pedro");
        nombres.add("Maria");

        System.out.println("Cuales son los nombres de la lista: " + nombres);

        //tamaño o la cantidad que hay en la lista:
        System.out.println("En la lista de nombres hay: " + nombres.size() + " nombres");

        //GET: como puse 0, se imprimira de quien esta 1ero en la lista:
        System.out.println(nombres.get(2));

        //SET: Sirve para MODIFICAR un valor que ya existe en una posición.
        nombres.set(0,"Rosario");
        System.out.println(nombres);

        //REMOVE:
        nombres.remove(2);
        System.out.println(nombres);




        //PROBLEMA 1: Agregar nombres a una lista
        //Pedir 3 nombres al usuario, guardarlos en un ArrayList y mostrarlos.


        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres1 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese un nombre: ");
            nombres1.add(sc.nextLine());
        }

        System.out.println("\nNombres ingresados:");
        for (String nombre0 : nombres1) {
            System.out.println(nombre0);
        }



        //PROBLEMA 2: CON SCANNER, Modificar un nombre (SET)
        //Pedir 3 nombres, luego:
        //pedir una posición
        //pedir un nuevo nombre
        //reemplazar el nombre en esa posición

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> nombres2 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese nombre " + i + ": ");
            nombres2.add(entrada.nextLine());
        }

        System.out.print("\nIngrese posición a modificar (0 a 2): ");
        int pos = entrada.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.print("Ingrese nuevo nombre: ");
        String nuevo = entrada.nextLine();

        nombres2.set(pos, nuevo);

        System.out.println("Lista actualizada: " + nombres2);
    }
}

//INCOMPLETO