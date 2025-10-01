package org.example;
import org.junit.jupitor.api.Test;
import static org.junit.jupitor.api.Assertions.*;

public class CalculatorTest {

    //"happy path" example
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10,5);
        assertEquals(5, result);
    }

    //edge case example
    @Test
    public void testFail(){
        Calculator calculator = new Calculator();
        int result = calculator.subtract(12,6);
        assertEquals(2,result, "12 - 6 should equal 6");
    }

}
