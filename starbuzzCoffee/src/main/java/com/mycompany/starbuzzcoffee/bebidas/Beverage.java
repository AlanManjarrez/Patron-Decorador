/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffee.bebidas;

/**
 * Clase abstracta que representa una bebida en el sistema. Esta clase define
 * una plantilla para las bebidas, incluyendo un método para obtener la
 * descripción de la bebida y otro para obtener su costo.
 *
 * @author Jose Alan Manjarrez Ontiveros 228982
 */
public abstract class Beverage {

    /**
     * Descripción de la bebida.
     */
    protected String description;

    /**
     * Obtiene la descripción de la bebida.
     *
     * @return una cadena que contiene la descripción de la bebida.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Método abstracto que debe ser implementado por las subclases para obtener el costo de la bebida.
     * 
     * @return el costo de la bebida como un valor Double.
     */
    public abstract double getCost();

}
