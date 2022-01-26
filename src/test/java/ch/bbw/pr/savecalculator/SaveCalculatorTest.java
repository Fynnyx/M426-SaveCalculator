package ch.bbw.pr.savecalculator;
import org.junit.Test;

import javax.naming.PartialResultException;

import static org.junit.Assert.*;

public class SaveCalculatorTest {

    // Addition -------------------------------------------
    @Test
    public void summeAddTwoPositivesTrue() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertEquals(30, testee.summe(value1, value2));
    }

    @Test
    public void summeAddTwoPositivesFalse() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertNotEquals(40, testee.summe(value1, value2));
    }

    @Test
    public void summeAddPositiveaAndNegative() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = -10;
        int value2 = 20;
        assertEquals(10, testee.summe(value1, value2));
    }

    @Test
    public void summeAddTwoNegatives() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = -20;
        int value2 = -25;
        assertEquals(-45, testee.summe(value1, value2));
    }

    @Test
    public void summeAddTwoZero() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 0;
        int value2 = 0;
        assertEquals(0, testee.summe(value1, value2));
    }

    @Test(expected = ArithmeticException.class)
    public void summeAddTwoMAX() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = Integer.MAX_VALUE;
        int value2 = Integer.MAX_VALUE;
        testee.summe(value1, value2);
    }

    @Test(expected = ArithmeticException.class)
    public void summeAddTwoMIN() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = Integer.MIN_VALUE;
        int value2 = Integer.MIN_VALUE;
        testee.summe(value1, value2);
    }

    @Test
    public void summeAddMAXAndMIN() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = Integer.MAX_VALUE;
        int value2 = Integer.MIN_VALUE;
        testee.summe(value1, value2);
    }


    // Subtraktion -------------------------------------------
    @Test
    public void subtraktionTrue() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 5;
        assertTrue(testee.subtraktion(value1, value2) == 5);
    }

    @Test
    public void subtraktionFalse() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 500;
        int value2 = 200;
        assertFalse(testee.subtraktion(value1, value2) == 1000);
    }

    // grösser als MAX_VALUE kann nicht getestet werden.
//    @Test(expected = ArithmeticException.class)
//    public void subtraktionMax() {
//        SaveCalculator testee = new SaveCalculator();
//        int value1 = 2147483650;
//        int value2 = 1;
//        testee.subtraktion(value1, value2);
//    }

    @Test(expected = ArithmeticException.class)
    public void subtraktionMin() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = Integer.MIN_VALUE;
        int value2 = 1;
        testee.subtraktion(value1, value2);
    }


    // Division -------------------------------------------

    @Test
    public void divisionTrue() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 5;
        assertTrue(testee.division(value1, value2) == 2);
    }

    @Test
    public void divisionFalse() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 500;
        int value2 = 5;
        assertFalse(testee.division(value1, value2) == 300);
    }

    @Test(expected = ArithmeticException.class)
    public void divisionNull() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 0;
        testee.division(value1, value2);

    }


    // Multiplikation -------------------------------------------
    @Test
    public void multiplikationTrue() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 500;
        int value2 = 10;
        assertTrue( testee.multiplikation(value1, value2) == 5000);
    }

    @Test
    public void multipluikationFalse() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 100;
        int value2 = 2;
        assertFalse(testee.division(value1, value2) == 10);
    }
}
