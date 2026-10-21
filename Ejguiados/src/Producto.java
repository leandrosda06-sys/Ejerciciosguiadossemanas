public class Producto {
    // Atributos privados de instancia
    private String nombre;
    private double precio;
    private String categoria;

    // Atributo estático (compartido por todos los objetos de la clase)
    private static int contador = 0;

    // Constructor para inicializar los atributos y contar los objetos creados
    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;

        // Incrementa el contador cada vez que se instancia un nuevo producto
        contador++;
    }

    // Método estático para consultar el total de objetos creados
    public static int getTotalCreados() {
        return contador;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}