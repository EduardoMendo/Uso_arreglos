package models;

public class inventory {
    private final product[] productos;  // Arreglo de productos
    private int numProductos;      // Contador para la cantidad actual de productos

    public inventory(int tamaño) {
        productos = new product[tamaño];  // Inicializa el arreglo con un tamaño fijo
        numProductos = 0;
    }

    // Metodo para agregar un producto
    public void agregarProducto(product producto) {
        if (numProductos < productos.length) {
            productos[numProductos] = producto;
            numProductos++;
            System.out.println("Producto agregado: " + producto.getNombre());
        } else {
            System.out.println("Inventario lleno, no se puede agregar más productos.");
        }
    }

    // Metodo para mostrar el inventario completo
    public void mostrarInventario() {
        if (numProductos == 0) {
            System.out.println("El inventario está vacío.");
        } else {
            for (int i = 0; i < numProductos; i++) {
                System.out.println(productos[i]);
            }
        }
    }

    // Metodo para actualizar la cantidad de un producto por nombre
    public void actualizarCantidad(String nombre, int nuevaCantidad) {
        for (int i = 0; i < numProductos; i++) {
            if (productos[i].getNombre().equalsIgnoreCase(nombre)) {
                productos[i].setCantidad(nuevaCantidad);
                System.out.println("Cantidad actualizada para " + nombre);
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }
}