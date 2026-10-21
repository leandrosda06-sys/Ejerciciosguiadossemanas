public class ProductoEncapsulado {
    // Atributos privados (encapsulados)
    private String nombre;
    private double precio;
    private String categoria;

    // Métodos Getter y Setter para el 'nombre'
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos Getter y Setter para el 'precio' con validación
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo.");
        }
    }

    // Métodos Getter y Setter para la 'categoria'
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Método para imprimir los detalles
    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Categoría: " + categoria);
    }
}