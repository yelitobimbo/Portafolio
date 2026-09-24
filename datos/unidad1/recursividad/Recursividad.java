package  datos.unidad1.recursividad;
public class Recursividad {

    public static void saludo(int total, String nombre) {
        if (total <= 0) //Condicion base
  	return;
           else{ //Condicion recursiva o repetitiva
	    System.out.println("Hola  " + nombre);
            saludo(total - 1, nombre);
        }
    }

    public static void main(String[ ] args) {
        saludo(10, "Yaneli");
    }
}