package ec.edu.ups.tdd.calculator;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ICalculatorTest {

    @Test
    public void given_two_integers_when_addition_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.addition(2,3)).thenReturn(5);

        assertEquals(5, c.addition(2,3));
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok(){
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.subtraction(5,2)).thenReturn(3);

        assertEquals(3, c.subtraction(5,2));
    }

    @Test
    public void given_two_integers_when_division_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.division(6, 2)).thenReturn(3);

        assertEquals(3, c.division(6, 2));
    }

    @Test
    public void given_two_integers_when_multiplication_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.multiplication(5, 2)).thenReturn(10);

        assertEquals(10, c.multiplication(5, 2));
    }
}