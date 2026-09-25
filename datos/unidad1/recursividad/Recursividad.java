package datos.unidad1.recursividad;

public class Recursividad {

    public static void saludo(int total, String nombre) {
        if (total <= 0) {
            return;
        } else {
            System.out.println("Hola  " + nombre);
            saludo(total - 1, nombre);
        }
    }

    public static void cuentaRegresiva(int numero) {
        if (numero <= 0) {
            return;
        } else {
            System.out.println(numero);
            cuentaRegresiva(numero - 1);
        }
    }

    public static int sumaRecursiva(int[] datos, int tam) {
        if (tam <= 0) {
            return 0;
        } else {
            return datos[tam - 1] + sumaRecursiva(datos, tam - 1);
        }
    }

    /**
     * Funcion que realiza suma recursiva de un arreglo
     * Fecha: 25 Septiembre
     * Autor: Yaneli Sanchez Cardenas
     */
    public static void main(String[] args) {
        int[] data = {3, 4, 5, 6, 7, 8};
        System.out.println(sumaRecursiva(data, data.length));
    }
}