package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author Alex Yashnikov
 * @version $Id$
 * @since 0.1
 */
public class CalculatorTest {
    /**
     * Test of Add method.
     */
    @Test
    public void whenAdd1Plus1Then2() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Test of Subtract method.
     */
    @Test
    public void whenSubtract5from7Then2() {
        Calculator calc = new Calculator();
        calc.subtract(7D, 5D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Test multiple method.
     */
    @Test
    public void whenMultiple4on7Then() {
        Calculator calc = new Calculator();
        calc.multiple(4D, 7D);
        double result = calc.getResult();
        double expected = 28D;
        assertThat(result, is(expected));
    }
    /**
     * Test divide method.
     */
    @Test
    public void whenDivide9On3Then() {
        Calculator calc = new Calculator();
        calc.divide(9D, 3D);
        double result = calc.getResult();
        double expected = 3D;
        assertThat(result, is(expected));
    }
}