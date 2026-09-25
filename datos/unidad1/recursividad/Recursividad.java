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
/**
*Funcion que realiza cuenta regresiva de acuerdo a un
*valor entero
*Fecha: 25 Septiembre
*Autor: Yaneli Sanchez Cardenas
*/

	public static void cuentaRegresiva(int n) {
	if(n < 0) {
		return;
	}else{
		System.out.println(n);
		cuentaRegresiva(n-1);
	}
}

    public static void main(String[ ] args) {
        //saludo(10, "Yaneli" , 100);
    	cuentaRegresiva(100);
	}
}