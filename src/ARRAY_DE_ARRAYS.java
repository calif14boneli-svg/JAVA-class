import java.util.Scanner;

public class ARRAY_DE_ARRAYS {
    public static void main(String[] args) {
        //En Java, una matriz NO es una tabla, sino: Un array de arrays

//EJERCICIO PRACTICO 1:
        int[][] numero = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("fila 1 x columna 1 = " + numero[0][0]); // 1
        System.out.println( "fila 2 x columna 3 = " +  numero[1][2]); // 6

//EJERCICIO 2 (ADD BUCLE-FOR)

        int [][] cantidades = {
                {10, 20, 80 },{50, 70, 60},{40,30,90}
        };
         for (int f=0; f<cantidades.length; f++){
             for(int k=0; k<cantidades.length; k++){
                 System.out.print(cantidades[f][k]+ " ");
             }
             System.out.println(" ");
         }


         //length: cumple la funcion de escanear la matriz de la fila y columna

//EJERCICIO 3 (SCANNER):
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[2][2];

        // Llenar matriz
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Ingrese número [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Mostrar matriz
        System.out.println("\nMatriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }




    //  EJERCICIO 4

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese cantidad de alumnos: ");
        int alumnos = entrada.nextInt();

        System.out.print("Ingrese cantidad de cursos: ");
        int cursos = entrada.nextInt();

        int[][] notas = new int[alumnos][cursos];

        // 1. INGRESAR NOTAS
        for (int i = 0; i < alumnos; i++) {
            System.out.println("\nAlumno " + (i + 1));
            for (int j = 0; j < cursos; j++) {
                System.out.print("Nota curso " + (j + 1) + ": ");
                notas[i][j] = entrada.nextInt();
            }
        }

        // 2. PROMEDIO POR ALUMNO
        System.out.println("\n--- Promedio por alumno ---");
        double mejorPromedio = 0;
        int mejorAlumno = 0;

        for (int i = 0; i < alumnos; i++) {
            int suma = 0;
            for (int j = 0; j < cursos; j++) {
                suma += notas[i][j];
            }
            double promedio = (double) suma / cursos;
            System.out.println("Alumno " + (i + 1) + ": " + promedio);

            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorAlumno = i;
            }
        }

        // 3. PROMEDIO POR CURSO
        System.out.println("\n--- Promedio por curso ---");
        for (int j = 0; j < cursos; j++) {
            int suma = 0;
            for (int i = 0; i < alumnos; i++) {
                suma += notas[i][j];
            }
            double promedio = (double) suma / alumnos;
            System.out.println("Curso " + (j + 1) + ": " + promedio);
        }

        // 4. MEJOR ALUMNO
        System.out.println("\nEl alumno con mejor promedio es el Alumno "
                + (mejorAlumno + 1) + " con " + mejorPromedio);








    }
}
