package org.efmb;

import models.product;
import models.inventory;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inventory inventario = new inventory(10);

        // Ejemplo de uso
        inventario.agregarProducto(new product("Manzanas", 5, 100));
        inventario.agregarProducto(new product("Naranjas", 6, 150));

        // Mostrar inventario
        inventario.mostrarInventario();

        // Actualizar cantidad
        System.out.println("Ingrese el nombre del producto para actualizar:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la nueva cantidad:");
        int cantidad = scanner.nextInt();

        inventario.actualizarCantidad(nombre, cantidad);

        // Mostrar inventario actualizado
        inventario.mostrarInventario();

        scanner.close();
    }
}
