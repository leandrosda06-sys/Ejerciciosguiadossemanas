public class Producto {
    // Atributos públicos (acceso desde cualquier parte)
    public String nombre;
    public double precio;

    // Atributo con acceso por defecto (package-private: accesible solo en el mismo paquete)
    String categoria;

    // Método público para mostrar información básica
    public void mostrarInformacion() {
        System.out.println("--- Información del Producto ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
    }

    // Método con acceso por defecto
    void mostrarCategoria() {
        System.out.println("Categoría: " + categoria);
    }

    // Desafío adicional: Método público para aplicar un descuento
    public void aplicarDescuento(double porcentaje) {
        this.precio = this.precio - (this.precio * (porcentaje / 100));
        System.out.println("Nuevo precio con " + porcentaje + "% de descuento: $" + this.precio);
    }
}