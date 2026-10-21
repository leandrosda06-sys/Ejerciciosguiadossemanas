public class MainEjercicio2 {
    public static void main(String[] args) {
        ProductoEncapsulado producto1 = new ProductoEncapsulado();

        // Asignación usando setters
        producto1.setNombre("Mouse");
        producto1.setPrecio(20.0);
        producto1.setCategoria("Tecnología");

        // Lectura usando getters
        System.out.println("--- Datos del Producto ---");
        System.out.println("Nombre: " + producto1.getNombre());
        System.out.println("Precio: $" + producto1.getPrecio());
        System.out.println("Categoría: " + producto1.getCategoria());

        // Prueba con un dato incorrecto (Precio negativo)
        System.out.println("\nIntentando asignar un precio negativo (-100):");
        producto1.setPrecio(-100);

        System.out.println("Precio actual (se mantiene sin cambios): $" + producto1.getPrecio());
    }
}