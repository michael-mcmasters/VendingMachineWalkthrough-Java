package com.codedifferently.walkthrough.vendingmachine.inventory;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CandyTest {

    @Test
    public void constructorTest() {
        // Given
        Candy candy = new Candy("Pop Rocks", 0.25);

        // When
        String expected = "Pop Rocks 0.25";
        String actual = candy.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void messageTest() {
        // Given
        Candy candy = new Candy();

        // When
        String expected = "It's like a man-made vegetable from heaven";
        String actual = candy.message();

        // Then
        Assert.assertEquals(expected, actual);
    }

}