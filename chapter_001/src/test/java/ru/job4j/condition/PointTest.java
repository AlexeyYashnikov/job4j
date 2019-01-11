package ru.job4j.calculator;

import org.junit.Test;
import ru.job4j.condition.Point;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * PointTest.
 * @author Alex Yashnikov
 * @version $Id$
 * @since 0.1
 */

public class PointTest {
    /**
     * Test of distanceTo method.
     */
    @Test
    public void distanceTo() {
        Point a = new Point(8, 7);
        Point b = new Point(4, 2);
        double result = a.distanceTo(b);
        assertThat(result, closeTo(6.4, 0.1));
    }
}
