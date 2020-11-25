package com.codedifferently.walkthrough.vendingmachine.inventory;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ChipsTest {

    @Test
    public void constructorTest() {
        // Given
        Chips chips = new Chips("Potato Chips", 0.75);

        // When
        String expected = "Potato Chips 0.75";
        String actual = chips.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void messageTest() {
        // Given
        Chips chips = new Chips();

        // When
        String expected = "It's literally a bag of air";
        String actual = chips.message();

        // Then
        Assert.assertEquals(expected, actual);
    }
}