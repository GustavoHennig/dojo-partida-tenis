package br.com.dbserver.dojo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldSumTwoNumbers() {
        Integer sum = new Calculator().sum(1, 2);
        assertEquals(3, sum, 0);
    }

    @Test
    public void shouldReturnZeroToEmptyList() {
        Integer sum = new Calculator().sum();
        assertEquals(0, sum, 0);
    }

}
