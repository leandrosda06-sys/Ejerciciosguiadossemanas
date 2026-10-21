public class Main {
    public static void main(String[] args) {
        // 1. Verificar el contador antes de crear objetos (Esperado: 0)
        System.out.println("Total antes de crear objetos: " + Producto.getTotalCreados());

        // 2. Crear tres objetos diferentes utilizando el constructor
        Producto producto1 = new Producto("Mouse", 20.0, "Tecnología");
        Producto producto2 = new Producto("Teclado", 45.0, "Tecnología");
        Producto producto3 = new Producto("Monitor", 180.0, "Tecnología");

        // 3. Verificar el contador después de crearlos (Esperado: 3)
        System.out.println("Total después de crear tres objetos: " + Producto.getTotalCreados());

        // 4. Comprobar que cada objeto conserva sus propios datos
        System.out.println("\nDetalles del Producto 1:");
        System.out.println("- Nombre: " + producto1.getNombre());
        System.out.println("- Precio: $" + producto1.getPrecio());
        System.out.println("- Categoría: " + producto1.getCategoria());
    }
}