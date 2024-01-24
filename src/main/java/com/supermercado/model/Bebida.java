package com.supermercado.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase Bebidas.
 * Hereda atributos y métodos de su clase padre, Productos.
 */
@Getter
@Setter
public class Bebida extends Producto {
    private float litros;

    /**
     * Constructor de la clase Bebidas
     * @param nombre nombre del producto (hereda de Productos)
     * @param precio precio del producto (hereda de Productos)
     * @param litros almacena el contenido en litros del producto de tipo bebida.
     *               Atributo propio de la clase Bebidas.
     */
    public Bebida(String nombre, float precio, float litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    /**
     * Método sobrescrito toString()
     * @return devuelve el nombre, la cantidad de litros y el precio de las
     *         instancias de la clase Bebidas.
     */
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " /// Litros: " + this.litros + " /// Precio: $" + this.precio;
    }
}
