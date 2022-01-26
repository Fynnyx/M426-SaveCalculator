package ch.bbw.pr.savecalculator;
import org.junit.Test;

import javax.naming.PartialResultException;

import static org.junit.Assert.*;

public class SaveCalculatorTest {

    public static final double DELTA = 1e-15;

    // Addition -------------------------------------------
    @Test
    public void summeAddTwoPositivesTrue() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertEquals(30, calc.summe(value1, value2));
    }

    @Test
    public void summeAddTwoPositivesFalse() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertNotEquals(40, calc.summe(value1, value2));
    }

    @Test
    public void summeAddPositiveaAndNegative() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = -10;
        int value2 = 20;
        assertEquals(10, calc.summe(value1, value2));
    }

    @Test
    public void summeAddTwoNegatives() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = -20;
        int value2 = -25;
        assertEquals(-45, calc.summe(value1, value2));
    }

    @Test
    public void summeAddTwoZero() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = 0;
        int value2 = 0;
        assertEquals(0, calc.summe(value1, value2));
    }

    @Test(expected = ArithmeticException.class)
    public void summeAddTwoMAX() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = Integer.MAX_VALUE;
        int value2 = Integer.MAX_VALUE;
        calc.summe(value1, value2);
    }

    @Test(expected = ArithmeticException.class)
    public void summeAddTwoMIN() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = Integer.MIN_VALUE;
        int value2 = Integer.MIN_VALUE;
        calc.summe(value1, value2);
    }

    @Test
    public void summeAddMAXAndMIN() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = Integer.MAX_VALUE;
        int value2 = Integer.MIN_VALUE;
        calc.summe(value1, value2);
    }


    // Subtraktion -------------------------------------------
    @Test
    public void subtraktionTwoPositivesTrue() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertEquals(-10, calc.subtraktion(value1, value2));
    }

    @Test
    public void subtraktionTwoPositivesFalse() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertNotEquals(-20, calc.subtraktion(value1, value2));
    }

    @Test
    public void subtraktionPositiveAndNegative() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = -10;
        int value2 = 20;
        assertEquals(-30, calc.subtraktion(value1, value2));
    }

    @Test
    public void subtraktionTwoNegatives() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = -20;
        int value2 = -25;
        assertEquals(5, calc.subtraktion(value1, value2));
    }

    @Test
    public void subtraktionTwoZero() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = 0;
        int value2 = 0;
        assertEquals(0, calc.subtraktion(value1, value2));
    }

    @Test
    public void subtraktionTwoMAX() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = Integer.MAX_VALUE;
        int value2 = Integer.MAX_VALUE;
        assertEquals(0, calc.subtraktion(value1, value2));
    }

    @Test
    public void subtraktionTwoMIN() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = Integer.MIN_VALUE;
        int value2 = Integer.MIN_VALUE;
        assertEquals(0, calc.subtraktion(value1, value2));
    }

    @Test(expected = ArithmeticException.class)
    public void subtraktionMAXAndMIN() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = Integer.MAX_VALUE;
        int value2 = Integer.MIN_VALUE;
        calc.subtraktion(value1, value2);
    }


    // Division -------------------------------------------
    @Test
    public void divisionTwoPositivesTrue() {
        SaveCalculator calc = new SaveCalculator();
        double value1 = 20;
        double value2 = 2;
        assertEquals(10, calc.division(value1, value2), DELTA);
    }

    @Test
    public void divisionTwoPositivesFalse() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = 2;
        int value2 = 20;
        assertNotEquals(20, calc.division(value1, value2));
    }

    @Test
    public void divisionPositiveAndNegative() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = 50;
        int value2 = -2;
        assertEquals(-25, calc.division(value1, value2), DELTA);
    }

    @Test
    public void divisionTwoNegatives() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = -40;
        int value2 = -2;
        assertEquals(20, calc.division(value1, value2), DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void divisionTwoZero() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = 0;
        int value2 = 0;
        assertEquals(0, calc.division(value1, value2));
    }

    @Test
    public void divisionTwoMAX() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = Integer.MAX_VALUE;
        int value2 = Integer.MAX_VALUE;
        assertEquals(1, calc.division(value1, value2), DELTA);
    }

    @Test
    public void divisionTwoMIN() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = Integer.MIN_VALUE;
        int value2 = Integer.MIN_VALUE;
        assertEquals(1, calc.division(value1, value2), DELTA);
    }

    @Test
    public void divisionMAXAndMIN() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = Integer.MAX_VALUE;
        int value2 = Integer.MIN_VALUE;
        assertNotEquals(0, calc.division(value1, value2));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithZero() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = 10;
        int value2 = 0;
        calc.division(value1, value2);

    }


    // Multiplikation -------------------------------------------
    @Test
    public void multiplikationTrue() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = 500;
        int value2 = 10;
        assertTrue( calc.multiplikation(value1, value2) == 5000);
    }

    @Test
    public void multipluikationFalse() {
        SaveCalculator calc = new SaveCalculator();
        int value1 = 100;
        int value2 = 2;
        assertFalse(calc.division(value1, value2) == 10);
    }
}
