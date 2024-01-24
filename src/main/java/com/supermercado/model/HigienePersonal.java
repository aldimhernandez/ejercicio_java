package com.supermercado.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase para los productos de higiene personal
 * Hereda de la clase padre Productos
 */
@Getter
@Setter
public class HigienePersonal extends Producto {

    private float contenido;

    /**
     * Constructor de la clase HigienePersonal
     * @param nombre nombre del producto (hereda de Productos)
     * @param precio precio del producto (hereda de Productos)
     * @param contenido contenido. Atributo propio de Higiene Personal. Almacena la cantidad del contenido del producto.
     */
    public HigienePersonal(String nombre, float precio, float contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    /**
     * Método sobrescrito toString()
     * @return el nombre, el contenido y el precio de las instancias de la clase HigienePersonal.
     */
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " /// Contenido: " + this.contenido + " /// Precio: $" + this.precio;
    }
}
