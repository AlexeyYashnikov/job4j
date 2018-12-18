package ru.job4j.converter;
/**
 * Class Converter
 * @author Alex Yashnikov.
 * @since 2018-12-18.
 * @version 0.1
 */
public class Converter {
    /**
     * Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return евро.
     */
    public int rubleToEuro(int value) {
        return value = value / 70;
    }
    /**
     * Конвертируем рубли в доллары.
     *
     * @param value рубли.
     * @return доллары.
     */
    public int rubleToDollar(int value) {
        return value = value / 60;
    }
    /**
     * Конвертируем евро в рубли.
     *
     * @param value евро.
     * @return рубли.
     */
    public int euroToRuble(int value) {
        return value = value * 70;
    }
    /**
     * Конвертируем доллары в рубли.
     *
     * @param value доллары.
     * @return рубли.
     */
    public int dollarToRuble(int value) {
        return value = value * 60;
    }
}