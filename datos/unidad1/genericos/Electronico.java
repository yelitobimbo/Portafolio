

public class Electronico extends Producto<String>{
    public Electronico(String nombre, Double precio, String garantia){
        super(nombre, precio, garantia);
    }

    public void mostrarDetalles() {
        String datos= "Nombre: " + super.getNombre() +
                      "\nPrecio: " + super.getPrecio() +
                      "\nGarantía: " + super.getExtra();

        System.out.println(datos);
    }
}