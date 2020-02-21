package com.kodilla.patterns2.decorator.pizza;
import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;
public class PizzaOrderTestSuite {
    @Test
    public void  testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        assertEquals(new BigDecimal(20),calculatedCost);
    }
    @Test
    public void testBasicPizzaOrderGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Order o simple pizza", description);
    }
    @Test
    public void  testPizzaOrderWithDoubleCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder= new DoubleCheesePizzaOrder(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        assertEquals(new BigDecimal(25),calculatedCost);
    }
    @Test
    public void testPizzaOrderWithDoubleCheeseGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder= new DoubleCheesePizzaOrder(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Order o simple pizza + double cheese", description);
    }
    @Test
    public void  testPizzaOrderWithDoubleCheeseAndAddGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder= new DoubleCheesePizzaOrder(theOrder);
        theOrder= new AdditionalIngredient(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        assertEquals(new BigDecimal(30),calculatedCost);
    }
    @Test
    public void testPizzaOrderWithDoubleCheeseAndAddGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder= new DoubleCheesePizzaOrder(theOrder);
        theOrder= new AdditionalIngredient(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Order o simple pizza + double cheese + additional ingredient", description);
    }
}
