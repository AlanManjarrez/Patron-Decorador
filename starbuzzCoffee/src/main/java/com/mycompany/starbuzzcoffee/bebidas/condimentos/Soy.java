/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffee.bebidas.condimentos;

import com.mycompany.starbuzzcoffee.bebidas.Beverage;

/**
 * Clase que representa el condimento de leche de soya que puede añadirse a una
 * bebida. Extiende de la clase abstracta Condiment y añade el costo adicional
 * de la leche de soya a la bebida base.
 *
 * El condimento de leche de soya añade una descripción adicional y un costo
 * extra de 10.00 a la bebida.
 *
 * @author Jose Alan Manjarrez Ontiveros 228982
 */
public class Soy extends Condiment {

    /**
     * Constructor que inicializa el condimento de leche de soya y establece la
     * bebida base.
     *
     * @param beverage la bebida a la que se le añadirá la leche de soya.
     */
    public Soy(Beverage beverage) {
        super(beverage);
        description = "Leche de soya";
    }

    /**
     * Constructor que inicializa el condimento de leche de soya y establece la
     * bebida base.
     *
     * @param beverage la bebida a la que se le añadirá la leche de soya.
     */
    @Override
    public double getCost() {
        return beverage.getCost() + 10.00;
    }

}
