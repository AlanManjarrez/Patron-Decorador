/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffee.bebidas;

/**
 * Clase que representa una bebida específica llamada HouseBlend. Extiende de la
 * clase abstracta Beverage y proporciona una implementación concreta del método
 * getCost.
 *
 * @author Jose Alan Manjarrez Ontiveros 228982
 */
public class HouseBlend extends Beverage {

    /**
     * Constructor de la clase HouseBlend. Inicializa la descripción de la
     * bebida.
     */
    public HouseBlend() {
        description = "Una mezcla de finos granos de café latinoamericanos tostados hasta adquirir un brillante color castaño oscuro.";
    }

    /**
     * Retorna el costo de la bebida HouseBlend.
     *
     * @return el costo de la bebida como un valor Double (38.00).
     */
    @Override
    public double getCost() {
        return 38.00;
    }

}
