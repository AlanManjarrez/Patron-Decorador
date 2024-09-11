/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffee.bebidas.condimentos;

import com.mycompany.starbuzzcoffee.bebidas.Beverage;

/**
 * Clase que representa el condimento de leche que puede añadirse a una bebida.
 * Extiende de la clase abstracta Condiment y añade el costo adicional de la
 * leche a la bebida base.
 *
 * El condimento de leche añade una descripción adicional y un costo extra de
 * 5.00 a la bebida.
 *
 * @author Jose Alan Manjarrez Ontiveros 228982
 */
public class Milk extends Condiment {

    /**
     * Constructor que inicializa el condimento de leche y establece la bebida
     * base.
     *
     * @param beverage la bebida a la que se le añadirá la leche.
     */
    public Milk(Beverage beverage) {
        super(beverage);
        description = "Leche entera";
    }

    /**
     * Retorna el costo total de la bebida con el condimento de leche añadido.
     *
     * @return el costo de la bebida base más 5.00 por la leche.
     */
    @Override
    public double getCost() {
        return beverage.getCost() + 5.00;
    }

}
