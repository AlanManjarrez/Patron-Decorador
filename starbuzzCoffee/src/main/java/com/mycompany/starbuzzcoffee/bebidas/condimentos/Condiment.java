/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffee.bebidas.condimentos;

import com.mycompany.starbuzzcoffee.bebidas.Beverage;

/**
 * Clase abstracta que representa un condimento que puede añadirse a una bebida.
 * Extiende de la clase Beverage y actúa como un decorador, añadiendo
 * comportamiento adicional (como el costo o la descripción) a las bebidas.
 *
 * Esta clase sigue el patrón de diseño Decorator, donde los objetos de tipo
 * Beverage pueden tener condimentos que modifican su descripción y costo.
 *
 * @author Jose Alan Manjarrez Ontiveros 228982
 */
public abstract class Condiment extends Beverage {

    /**
     * La bebida a la que se añadirá el condimento.
     */
    protected Beverage beverage;

    /**
     * Constructor que asigna la bebida base a la que se le añadirá el
     * condimento.
     *
     * @param beverage la bebida base.
     */
    public Condiment(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Devuelve la descripción de la bebida con el condimento añadido.
     *
     * @return la descripción de la bebida original más la descripción del
     * condimento.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Condimento: " + description;
    }

    /**
     * Método abstracto que debe ser implementado por las subclases para
     * calcular el costo de la bebida con el condimento añadido.
     *
     * @return el costo de la bebida con el condimento.
     */
    @Override
    public abstract double getCost();

}
