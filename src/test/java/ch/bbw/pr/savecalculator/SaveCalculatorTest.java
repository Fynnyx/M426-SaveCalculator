package ch.bbw.pr.savecalculator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static  org.junit.Assert.assertFalse;
import org.junit.Test;

public class SaveCalculatorTest {

    // Addition -------------------------------------------
    @Test
    public void summeTrue() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.summe(value1, value2) == 30);
    }

    @Test
    public void summeFalse() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertFalse(testee.summe(value1, value2) == 40);
    }

    @Test(expected = ArithmeticException.class)
    public void summeMax() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = Integer.MAX_VALUE;
        int value2 = 1;
        testee.summe(value1, value2);

    }

    // kleiner als MIN_VALUE nicht möglich zu testen.
//    @Test(expected = ArithmeticException.class)
//    public void summeMin() {
//        SaveCalculator testee = new SaveCalculator();
//        int value1 = -2147483650;
//        int value2 = 1;
//        testee.summe(value1, value2);
//    }


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
        assertTrue(testee.multiplikation(value1, value2) == 5000);
    }

    @Test
    public void multipluikationFalse() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 100;
        int value2 = 2;
        assertFalse(testee.division(value1, value2) == 10);
    }

}
