package com.codedifferently.walkthrough.vendingmachine.inventory;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class DrinkTest {

    @Test
    public void constructorTest() {
        // Given
        Drink drink = new Drink("FizzBuzz", 1.25);

        // When
        String expected = "FizzBuzz 1.25";
        String actual = drink.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void messageTest() {
        // Given
        Drink drink = new Drink();

        // When
        String expected = "Gulp gulp. Gotta love that high fructose corn syrup";
        String actual = drink.message();

        // Then
        Assert.assertEquals(expected, actual);
    }

}