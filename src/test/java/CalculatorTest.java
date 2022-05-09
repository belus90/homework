import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void hasAdd(){
        assertEquals(25,calculator.add(10, 15));
    }

    @Test
    public void hasSubstract(){
        assertEquals(10, calculator.substract(20, 10));
    }

    @Test
    public void hasMultiply(){
        assertEquals(12, calculator.multiply(6,2));
    }
    @Test
    public void hasDivided(){
        assertEquals(10, calculator.divide(100, 10), 0.0);
    }
}
