/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.starbuzzcoffee.bebidas.Beverage;
import com.mycompany.starbuzzcoffee.bebidas.DarkRoast;
import com.mycompany.starbuzzcoffee.bebidas.Decaf;
import com.mycompany.starbuzzcoffee.bebidas.Expresso;
import com.mycompany.starbuzzcoffee.bebidas.HouseBlend;
import com.mycompany.starbuzzcoffee.bebidas.condimentos.Chocolate;
import com.mycompany.starbuzzcoffee.bebidas.condimentos.Milk;
import com.mycompany.starbuzzcoffee.bebidas.condimentos.Soy;
import com.mycompany.starbuzzcoffee.bebidas.condimentos.WhippedCream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jose Alan Manjarrez Ontiveros 228982
 */
public class TestStarbuzzCoffee {

    public TestStarbuzzCoffee() {
    }

    @Test
    public void testEspressoCost() {
        Beverage beverage = new Expresso();
        assertEquals(36.00, beverage.getCost(), 0.01);
    }

    @Test
    public void testHouseBlendCostWithMilk() {
        Beverage beverage = new HouseBlend();
        beverage = new Milk(beverage);
        assertEquals(43.00, beverage.getCost(), 0.01);
    }

    @Test
    public void testDarkRoastCostWithSoyAndChocolate() {
        Beverage beverage = new DarkRoast();
        beverage = new Soy(beverage);
        beverage = new Chocolate(beverage);
        assertEquals(70.00, beverage.getCost(), 0.01);
    }

    @Test
    public void testDecafCostWithWhippedCream() {
        Beverage beverage = new Decaf();
        beverage = new WhippedCream(beverage);
        assertEquals(55.00, beverage.getCost(), 0.01);
    }

    @Test
    public void testEspressoDescriptionWithMilkAndWhippedCream() {
        Beverage beverage = new Expresso();
        beverage = new Milk(beverage);
        beverage = new WhippedCream(beverage);
        assertEquals("Café preparado forzando el agua caliente a través de granos de café tostados finamente, Condimento: Leche entera, Condimento: Crema batida", beverage.getDescription());
    }

    @Test
    public void testDecafDescriptionWithWhippedCream() {
        Beverage beverage = new Decaf();
        beverage = new WhippedCream(beverage);
        assertEquals("Descafeinado intenso con notas caramelizadas, este café es la esencia de nuestros lattes., Condimento: Crema batida", beverage.getDescription());
    }

    @Test
    public void testHouseBlendDescriptionWithAllCondiments() {
        Beverage beverage = new HouseBlend();
        beverage = new Milk(beverage);
        beverage = new Soy(beverage);
        beverage = new Chocolate(beverage);
        beverage = new WhippedCream(beverage);
        assertEquals("Una mezcla de finos granos de café latinoamericanos tostados hasta adquirir un brillante color castaño oscuro."
                + ", Condimento: Leche entera, Condimento: Leche de soya, Condimento: Chocolate con azucar, Condimento: Crema batida", beverage.getDescription());
    }

    @Test
    public void testDarkRoastDescriptionWithNoCondiments() {
        Beverage beverage = new DarkRoast();
        assertEquals("Se trata de una mezcla especial de granos de Latinoamérica y Asia/Pacífico, con un tostado intenso que produce un café dulce, aromático y acaramelado."
                + "", beverage.getDescription());
    }
}
