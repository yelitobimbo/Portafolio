package datos.unidad1.genericos;

// Clase abstracta genérica con el parámetro T
public abstract class Producto<T> {
    private String nombre;
    private double precio;
    private T extra; 
// Información adicional genérica

// Constructor
    public Producto(String nombre, double precio, T extra) {
        this.nombre = nombre;
        this.precio = precio;
        this.extra = extra;
    }



public String getNombre() {
        return nombre;
    }

public double getPrecio() {
        return precio;
    }

public T getExtra() {
        return extra;
    }

    public abstract void mostrarDetalles();
}