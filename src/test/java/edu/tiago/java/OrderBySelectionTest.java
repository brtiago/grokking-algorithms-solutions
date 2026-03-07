package edu.tiago.java;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderBySelectionTest {

    @Test
    public void testSelectionSort() {

        // Arrange
        List<Integer> input = Arrays.asList(64, 25, 12, 22, 11);
        List<Integer> expected = Arrays.asList(11, 12, 22, 25, 64);

        // Act
        List<Integer> result = OrderBySelection.selectionSort(new ArrayList<>(input));

        // Assert
        assertEquals(expected, result);
    }
}