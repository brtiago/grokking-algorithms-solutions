package edu.tiago.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuscaBinariaTest {

    @Test
    public void testBuscaBinaria() {

        // Arrange
        int[] input = {1,3,5,7,9};
        int target = 3;
        int expected = 1;

        // Act
        int result = BuscaBinaria.find(input, target);

        // Assert
        assertEquals(expected, result);
    }

}