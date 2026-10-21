public class ProductoConConstructor {
    private int id; // Desafío adicional: identificador único
    private String nombre;
    private double precio;
    private String categoria;

    // Atributo estático compartido por toda la clase
    private static int contador = 0;

    // Constructor que inicializa los atributos e incrementa el contador
    public ProductoConConstructor(String nombre, double precio, String categoria) {
        contador++;
        this.id = contador; // Asigna el número del contador como ID automático
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    // Método estático para consultar el total de objetos creados
    public static int getTotalCreados() {
        return contador;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

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
        if (precio >= 0) {
            this.precio = precio;
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}