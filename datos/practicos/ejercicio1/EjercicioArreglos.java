package datos.practicos.ejercicio1;

public class EjercicioArreglos {

    public static void main(String[] args) {
        // Semilla con mi matrícula 1225100375 (Mi último dígito X es 5)
        int X = 5; 

        System.out.println("====== FASE 1: UNIDIMENSIONAL ======");
        fase1Unidimensional(X);

        System.out.println("\n====== FASE 2: BIDIMENSIONAL ======");
        fase2Bidimensional(X);

        System.out.println("\n====== FASE 3: TRIDIMENSIONAL ======");
        fase3Tridimensional(X);
    }

    // FASE 1: UNIDIMENSIONAL
    public static void fase1Unidimensional(int X) {
        int[] temperaturas = {12, -3, 4, 8, -1, X, 15, 2};

        double sumaPositivos = 0;
        int contadorPositivos = 0;

        System.out.print("Índices con temperaturas bajo cero: ");
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > 0) {
                sumaPositivos += temperaturas[i];
                contadorPositivos++;
            } else if (temperaturas[i] < 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        if (contadorPositivos > 0) {
            double promedio = sumaPositivos / contadorPositivos;
            System.out.println("Promedio de temperaturas positivas: " + promedio);
        } else {
            System.out.println("No hay temperaturas positivas.");
        }

        /*
         * Tarea 1.2 - Mis respuestas conceptuales:
         * 
         * 1. ¿Por qué en Java un arreglo unidimensional no puede cambiar de tamaño?
         * Mi respuesta: Porque cuando creamos un arreglo, Java le aparta un bloque continuo fijo en la memoria RAM. 
         * Como ese espacio ya queda reservado desde el inicio, no podemos modificar su tamaño de la nada durante 
         * la ejecución ya que la memoria continua de al lado podría estar ocupada.
         * 
         * 2. ¿Qué ocurre internamente en memoria al acceder a temperaturas[8]?
         * Mi respuesta: El programa truena y lanza un error de tipo 'ArrayIndexOutOfBoundsException'. 
         * Esto pasa porque como el arreglo tiene 8 elementos, sus casillas van del índice 0 al 7. Al pedir 
         * la posición 8, intentamos leer una casilla de memoria fuera del límite que le asignamos.
         */
    }

    // FASE 2: BIDIMENSIONAL
    public static void fase2Bidimensional(int X) {
        int[][] inventario = {
            {10, 20, 15, 5},
            {8, (X + 5), 12, 30},
            {25, 14, 0, 18},
            {2, 9, 11, 40}
        };

        // Suma por fila (total de stock por cada sucursal)
        for (int i = 0; i < inventario.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < inventario[i].length; j++) {
                sumaFila += inventario[i][j];
            }
            System.out.println("Total stock Sucursal " + (i + 1) + ": " + sumaFila);
        }

        // Mostrar los elementos de la diagonal principal
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < inventario.length; i++) {
            System.out.print(inventario[i][i] + " ");
        }
        System.out.println();

        /*
         * Tarea 2.2 - Mis respuestas conceptuales:
         * 
         * Diferencia entre un arreglo bidimensional regular y un arreglo dentado (jagged array):
         * Mi respuesta: En una matriz o arreglo regular, todas las filas tienen exactamente la misma cantidad 
         * de columnas (como una tabla parejita). En cambio, en un arreglo dentado cada fila puede tener una 
         * longitud distinta, lo que nos ayuda a no desperdiciar espacios de memoria en filas más cortas.
         */
    }

    // FASE 3: TRIDIMENSIONAL
    public static void fase3Tridimensional(int X) {
        int[][][] ocupacion = new int[2][3][3];

        // Llenar la matriz 3D con la regla: Edificio + Piso + Pasillo + X
        for (int e = 0; e < 2; e++) {
            for (int p = 0; p < 3; p++) {
                for (int pas = 0; pas < 3; pas++) {
                    ocupacion[e][p][pas] = e + p + pas + X;
                }
            }
        }

        // Imprimir coordenadas [e][p][p] que tengan un valor par
        System.out.println("Coordenadas [e][p][p] con valor par:");
        for (int e = 0; e < 2; e++) {
            for (int p = 0; p < 3; p++) {
                int valor = ocupacion[e][p][p];
                if (valor % 2 == 0) {
                    System.out.println("Coordenada [" + e + "][" + p + "][" + p + "] = " + valor);
                }
            }
        }

        /*
         * Tarea 3.3 - Análisis personal:
         * 
         * Problemas de un arreglo 3D gigantesco comparado con Programación Orientada a Objetos:
         * Mi respuesta: 
         * 1. Desperdicio de memoria: Si reservamos una matriz gigante de [100][50][50], creamos 250,000 casillas 
         *    en la RAM de golpe, y si la mayoría están vacías se desperdicia mucho espacio.
         * 2. Dificultad para mantener el código: Guiarse solo por números de índices como matriz[10][2][4] es 
         *    muy confuso y fácil de equivocar. Es mejor usar POO y colecciones para crear clases como Edificio o Piso, 
         *    lo cual hace el programa más claro, organizado y fácil de escalar.
         */
    }
}