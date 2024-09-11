/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffee.bebidas;

/**
 * Clase que representa una bebida específica llamada Expresso. Extiende de la
 * clase abstracta Beverage y proporciona una implementación concreta del método
 * getCost.
 *
 * @author Jose Alan Manjarrez Ontiveros 228982
 */
public class Expresso extends Beverage {

    /**
     * Constructor de la clase Expresso. Inicializa la descripción de la bebida.
     */
    public Expresso() {
        description = "Café preparado forzando el agua caliente a través de granos de café tostados finamente";
    }

    /**
     * Retorna el costo de la bebida Expresso.
     *
     * @return el costo de la bebida como un valor Double (36.00).
     */
    @Override
    public double getCost() {
        return 36.00;
    }

}
