/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffee.bebidas.condimentos;

import com.mycompany.starbuzzcoffee.bebidas.Beverage;

/**
 * Clase que representa el condimento de chocolate que puede añadirse a una bebida.
 * Extiende de la clase abstracta Condiment y añade el costo adicional del chocolate
 * a la bebida base.
 * 
 * El condimento de chocolate añade una descripción adicional y un costo extra de 15.00
 * a la bebida.
 * 
 * @author Jose Alan Manjarrez Ontiveros 228982
 */
public class Chocolate extends Condiment{
    
     /**
     * Constructor que inicializa el condimento de chocolate y establece la bebida base.
     * 
     * @param beverage la bebida a la que se le añadirá el chocolate.
     */
    public Chocolate(Beverage beverage) {
        super(beverage);
        description = "Chocolate con azucar";
    }
    
    /**
     * Retorna el costo total de la bebida con el condimento de chocolate añadido.
     * 
     * @return el costo de la bebida base más 15.00 por el chocolate.
     */
    @Override
    public double getCost() {
        return beverage.getCost() + 15.00;
    }
    
}
