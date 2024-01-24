package com.supermercado;

import java.util.ArrayList;
import java.util.Collections;

import com.supermercado.model.Bebida;
import com.supermercado.model.HigienePersonal;
import com.supermercado.model.Producto;
import com.supermercado.model.Vegetal;

/**
 * Función ppal del programa que muestra la lista de productos del supermercado de barrio.
 * @return generarListaProductos
 * @return imprimirInventario
 * @author <maria.hernandez@connectis.tech>
 */
public class Main {

    public static ArrayList<Producto> productosSuper = new ArrayList<>();

    public static void main(String[] args) {
        generarListaProductos();
        imprimirInventario();
    }

    /**
     * Carga los productos en la lista de productos
     */
    public static void generarListaProductos() {
        Producto cocaCola = new Bebida("Coca-Cola", 18, 1.5f);
        Producto cocaColaZero = new Bebida("Coca-Cola Zero", 20, 1.5f);
        Producto shampooSedal = new HigienePersonal("Shampoo Sedal", 19, 500);
        Producto frutillas = new Vegetal("Frutillas", 64, "kilo");

        productosSuper.add(cocaCola);
        productosSuper.add(cocaColaZero);
        productosSuper.add(shampooSedal);
        productosSuper.add(frutillas);
    }

    /**
     * Recorre la lista, y por cada elemento
     * imprime los detalles del producto utilizando el método
     * sobrescrito toString()
     */
    public static void imprimirListaProductos() {
        productosSuper.forEach(producto -> {
            System.out.println(producto.toString());
        });
    }

    /**
     * Utilizando la clase {@link java.util.Collections} y los métodos max y min
     * se imprimen los productos de mayor y menor precio.
     */
    public static void imprimirPrecioMaxMin() {
        System.out.println("Producto más caro: " + Collections.max(productosSuper).getNombre());
        System.out.println("Producto más barato: " + Collections.min(productosSuper).getNombre());
    }

    /**
     * Unifica los métodos que imprimen la lista de productos
     * y el filtro por precio mayor y menor
     */
    public static void imprimirInventario() {
        imprimirListaProductos();
        System.out.println("=============================");
        imprimirPrecioMaxMin();
    }
}