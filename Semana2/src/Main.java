public class Main {
    public static void main(String[] args) {
        // Paso 6: Crear dos objetos diferentes
        Producto producto1 = new Producto();
        Producto producto2 = new Producto();

        // Paso 7: Asignar valores
        producto1.nombre = "Mouse";
        producto1.precio = 20.0;
        producto1.categoria = "Tecnología";

        producto2.nombre = "Curso Java";
        producto2.precio = 75.0;
        producto2.categoria = "Educación";

        // Paso 8: Ejecutar los métodos para el producto 1
        System.out.println(">>> PRODUCTO 1 <<<");
        producto1.mostrarInformacion();
        producto1.mostrarCategoria();

        // Ejecutar métodos para el producto 2
        System.out.println("\n>>> PRODUCTO 2 <<<");
        producto2.mostrarInformacion();
        producto2.mostrarCategoria();

        // Paso 9: Modificar solo un objeto
        System.out.println("\n--- Modificando precio del Producto 1 ---");
        producto1.precio = 25.0;

        // Comprobación
        System.out.println("Precio Producto 1: $" + producto1.precio);
        System.out.println("Precio Producto 2: $" + producto2.precio);
        // Explicación: El producto 2 no cambia porque cada objeto almacena su propio espacio en memoria.
    }
}