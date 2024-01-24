package com.supermercado.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase para los productos de tipo Vegetal
 * Hereda de la clase Productos
 */
@Getter
@Setter
public class Vegetal extends Producto {

    private String unidadVenta;

    /**
     * Constructor de la clase Vegetales
     * @param nombre nombre del producto (hereda de Productos)
     * @param precio nombre del producto (hereda de Productos)
     * @param unidadVenta almacena la unidad de venta de los vegetales. Propia de la clase Vegetales.
     */
    public Vegetal(String nombre, float precio, String unidadVenta) {
        super(nombre, precio);
        this.unidadVenta = unidadVenta;
    }

    /**
     * Método sobrescrito toString()
     * @return devuelve el nombre, el precio y las unidades de ventas de las
     *         instancias de la clase Vegetales.
     */
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " /// Precio: $" + this.precio + " /// Unidad de venta: " + this.unidadVenta;
    }
}
