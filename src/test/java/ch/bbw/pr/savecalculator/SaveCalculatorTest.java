package ch.bbw.pr.savecalculator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static  org.junit.Assert.assertFalse;
import org.junit.Test;

public class SaveCalculatorTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

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

    //Testfälle zu Addition
    @Test
    public void addition() {
        int value1 = 10;
        int value2 = 20;
    }
}
