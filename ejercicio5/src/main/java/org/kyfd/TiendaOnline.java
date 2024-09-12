package org.kyfd;

import java.util.ArrayList;
import java.util.List;

class Pedido {
    private int idPedido;
    private List<String> productos;
    private boolean procesado;

    public Pedido(int idPedido) {
        this.idPedido = idPedido;
        this.productos = new ArrayList<>();
        this.procesado = false;
    }

    // Metodo para agregar un producto al pedido
    public void agregarProducto(String producto) {
        productos.add(producto);
    }

    // Metodo para cambiar el estado del pedido
    public void cambiarEstado(boolean nuevoEstado) {
        this.procesado = nuevoEstado;
    }

    // Metodo para mostrar la información del pedido
    public void mostrarPedido() {
        System.out.println("ID del Pedido: " + idPedido);
        System.out.println("Productos: " + productos);
        System.out.println("Estado: " + (procesado ? "Procesado" : "No procesado"));
        System.out.println();
    }
}

public class TiendaOnline {
    private static List<Pedido> pedidos = new ArrayList<>();

    // metodo para crear un nuevo pedido
    public static Pedido crearPedido(int idPedido) {
        Pedido nuevoPedido = new Pedido(idPedido);
        pedidos.add(nuevoPedido);
        return nuevoPedido;
    }

    // metodo para mostrar todos los pedidos y el estado actual
    public static void mostrarTodosLosPedidos() {
        for (Pedido pedido : pedidos) {
            pedido.mostrarPedido();
        }
    }

    public static void main(String[] args) {
        Pedido pedido1 = crearPedido(1);
        pedido1.agregarProducto("Laptop");
        pedido1.agregarProducto("Mouse");

        Pedido pedido2 = crearPedido(2);
        pedido2.agregarProducto("Teclado");

        pedido1.cambiarEstado(true);
        pedido2.cambiarEstado(false);

        mostrarTodosLosPedidos();
    }
}
