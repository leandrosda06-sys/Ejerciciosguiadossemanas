public class MainEjercicio2 {
    public static void main(String[] args) {
        // Creación del objeto
        ProductoEncapsulado prod = new ProductoEncapsulado();

        // Asignación de datos utilizando Setters
        prod.setNombre("Teclado Mecánico");
        prod.setPrecio(45.0);
        prod.setCategoria("Tecnología");

        // Intento de asignación de un valor no válido (Prueba de seguridad/encapsulamiento)
        System.out.println("Intento de asignar precio negativo:");
        prod.setPrecio(-10.0); // Debería mostrar un mensaje de error sin modificar el precio actual

        // Lectura de datos utilizando Getters
        System.out.println("\nLectura con getters:");
        System.out.println("Nombre: " + prod.getNombre());
        System.out.println("Precio actual: $" + prod.getPrecio());
        System.out.println("Categoría: " + prod.getCategoria());
    }
}