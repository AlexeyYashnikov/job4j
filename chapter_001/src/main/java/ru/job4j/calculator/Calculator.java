package ru.job4j.calculator;

/**
 * Class Calculator
 * @author Alex Yashnikov.
 * @since 2018-12-18.
 * @version 0.1
 */

public class Calculator {
    private double result;
    /**
     * Add method.
     * @param args - arguments.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     * Subtract method.
     * @param args - arguments.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }
    /**
     * Multiple method.
     * @param args - arguments.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }
    /**
     * Divide method.
     * @param args - arguments.
     */
    public void divide(double first, double second) {
        this.result = first / second;
    }
    /**
     * getResult method.
     * @param args - arguments.
     * @return result of add or subtract or multiple or divide.    
     */
    public double getResult() {
        return this.result;
    }
}