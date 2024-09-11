/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffee.bebidas.condimentos;

import com.mycompany.starbuzzcoffee.bebidas.Beverage;

/**
 * Clase que representa el condimento de crema batida que puede añadirse a una
 * bebida. Extiende de la clase abstracta Condiment y añade el costo adicional
 * de la crema batida a la bebida base.
 *
 * El condimento de crema batida añade una descripción adicional y un costo
 * extra de 25.00 a la bebida.
 *
 * @author Jose Alan Manjarrez Ontiveros 228982
 */
public class WhippedCream extends Condiment {

    /**
     * Constructor que inicializa el condimento de crema batida y establece la
     * bebida base.
     *
     * @param beverage la bebida a la que se le añadirá la crema batida.
     */
    public WhippedCream(Beverage beverage) {
        super(beverage);
        description = "Crema batida";
    }

    /**
     * Retorna el costo total de la bebida con el condimento de crema batida
     * añadido.
     *
     * @return el costo de la bebida base más 25.00 por la crema batida.
     */
    @Override
    public double getCost() {
        return beverage.getCost() + 25.00;
    }

}
