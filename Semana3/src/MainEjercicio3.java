public class MainEjercicio3 {
    public static void main(String[] args) {
        // Consultar contador antes de crear objetos
        System.out.println("Total antes de crear objetos: " + ProductoConConstructor.getTotalCreados());

        // Crear al menos tres objetos utilizando el constructor
        ProductoConConstructor producto1 = new ProductoConConstructor("Mouse", 20.0, "Tecnología");
        ProductoConConstructor producto2 = new ProductoConConstructor("Teclado", 45.0, "Tecnología");
        ProductoConConstructor producto3 = new ProductoConConstructor("Monitor", 180.0, "Tecnología");

        // Consultar contador después de crearlos
        System.out.println("Total después de crear objetos: " + ProductoConConstructor.getTotalCreados());

        // Comprobación del desafío adicional (IDs automáticos)
        System.out.println("\n--- Listado con IDs Automáticos ---");
        System.out.println("Objeto " + producto1.getId() + " → ID " + producto1.getId() + " | " + producto1.getNombre() + " | $" + producto1.getPrecio());
        System.out.println("Objeto " + producto2.getId() + " → ID " + producto2.getId() + " | " + producto2.getNombre() + " | $" + producto2.getPrecio());
        System.out.println("Objeto " + producto3.getId() + " → ID " + producto3.getId() + " | " + producto3.getNombre() + " | $" + producto3.getPrecio());
    }
}