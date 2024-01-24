package com.supermercado.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase productos. Clase de la cual heredan las clases hijas: Bebidas, Vegetales e HigienePersonal.
 * Esta clase implementa la interfaz comparable {@link java.lang.Comparable}
 */
@Getter
@Setter
public abstract class Producto implements Comparable<Producto> {

    protected String nombre;
    protected float precio;

    /**
     * Constructor de la clase Productos
     * @param nombre nombre del producto
     * @param precio precio del producto
     */
    Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Se sobrescribe el método compareTo() de la interfaz comparable {@link java.lang.Comparable}
     * para ordenar un array de objetos de tipo <Productos> según el atributo precio
     * para luego poder extraer el producto de mayor precio y el de menor precio con la clase {@link java.util.Collections}
     * @param ArrayList<Products> lista de productos a comparar por precio
     * @return devuelve los productos ordenados por precio
     */
    @Override
    public int compareTo(Producto o) {
        return (int) (this.precio - o.getPrecio());
    }

    /**
     * Se sobrescribe el método toString() de manera abstracta para que cada clase hija
     * lo ajuste a sus necesidades
     */
    @Override
    public abstract String toString();
}
