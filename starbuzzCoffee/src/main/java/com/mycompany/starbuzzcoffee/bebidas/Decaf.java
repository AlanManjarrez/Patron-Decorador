/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffee.bebidas;

/**
 * Clase que representa una bebida específica llamada Decaf (descafeinado).
 * Extiende de la clase abstracta Beverage y proporciona una implementación
 * concreta del método getCost.
 * 
 * @author Jose Alan Manjarrez Ontiveros 228982
 */
public class Decaf extends Beverage {
    
    /**
     * Constructor de la clase Decaf. Inicializa la descripción de la bebida.
     */
    public Decaf() {
        description = "Descafeinado intenso con notas caramelizadas, este café es la esencia de nuestros lattes.";
    }
    
    /**
     * Retorna el costo de la bebida Decaf.
     * 
     * @return el costo de la bebida como un valor double (30.00).
     */
    @Override
    public double getCost() {
        return 30.00;
    }

}
