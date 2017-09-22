package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTestPrototype {

    @Test
    public void testSum() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.sum(-3,-3);
        assertEquals(-6, sum);
        sum = calculator.sum(2,-3);
        assertEquals(-1, sum);
        sum = calculator.sum(1,3);
        assertEquals(4, sum);
        sum = calculator.sum(-3,3);
        assertEquals(0, sum);
    }

    @Test
    public void testSub() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sub = calculator.subtract(-3,-3);
        assertEquals(0, sub);
        sub = calculator.subtract(2,-3);
        assertEquals(5, sub);
        sub = calculator.subtract(1,3);
        assertEquals(-2, sub);
        sub = calculator.subtract(-3,3);
        assertEquals(-6, sub);
    }

    @Test
    public void testMultiply() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int mul = calculator.multiply(6,3);
        assertEquals(18, mul);
        mul = calculator.multiply(2,-3);
        assertEquals(-6, mul);
        mul = calculator.multiply(-5,8);
        assertEquals(-40, mul);
        mul = calculator.multiply(-6,-4);
        assertEquals(24, mul);
    }

    @Test
    public void testDivisionEven() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(6,3);
        assertEquals(2, sum);
    }

    @Test
    public void testDivisionOdd() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(7,3);
        assertEquals(2, sum);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(3,0);
    }

    @Test
    public void testDivision() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int div = calculator.divide(7,3);
        assertEquals(2, div);
        div = calculator.divide(-8,4);
        assertEquals(-2, div);
        div = calculator.divide(13,-4);
        assertEquals(-3, div);
        div = calculator.divide(-10,-3);
        assertEquals(3, div);
        div = calculator.divide(0,-3);
        assertEquals(0, div);
    }
}