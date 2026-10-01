

public class Libro extends Producto<Integer>{
    public Libro(String nombre, Double precio, Integer paginas){
        super(nombre, precio, paginas);
    }

    public void mostrarDetalles() {
        String datos= "Nombre: " + super.getNombre() +
                      "\nPrecio: " + super.getPrecio() +
                      "\nPáginas: " + super.getExtra();

        System.out.println(datos);
    }
}
