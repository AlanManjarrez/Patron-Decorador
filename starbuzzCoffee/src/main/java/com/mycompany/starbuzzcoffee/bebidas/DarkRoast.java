/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffee.bebidas;

/**
 * Clase que representa una bebida específica llamada DarkRoast. Extiende de la
 * clase abstracta Beverage y proporciona una implementación concreta del método
 * getCost.
 *
 * @author Jose Alan Manjarrez Ontiveros 228982
 */
public class DarkRoast extends Beverage {

    /**
     * Constructor de la clase DarkRoast. Inicializa la descripción de la
     * bebida.
     */
    public DarkRoast() {
        description = "Se trata de una mezcla especial de granos de Latinoamérica y Asia/Pacífico, con un tostado intenso que produce un café dulce, aromático y acaramelado.";
    }

    /**
     * Retorna el costo de la bebida DarkRoast.
     *
     * @return el costo de la bebida como un valor Double (45.00).
     */
    @Override
    public double getCost() {
        return 45.00;
    }

}
