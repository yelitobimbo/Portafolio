public class MainGenericos {
    public static void main(String[] args) {
        Producto<?>[] inventario = new Producto<?>[4];

        inventario[0] = new Libro("Cien años de soledad", 350.0, 450);
        inventario[1] = new Electronico("Laptop", 15000.0, "2 años");
        inventario[2] = new Libro("El Principito", 180.0, 96);
        inventario[3] = new Electronico("Smartphone", 8000.0, "1 año");

        for (Producto<?> p : inventario) {
            p.mostrarDetalles();
            System.out.println("-------------------");
        }
    }
}
