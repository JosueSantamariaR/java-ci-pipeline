import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator cal =new Calculator();
    @Test
    public void suma() {

        assertEquals(10, cal.suma(2,8),0);
        assertEquals(16, cal.suma(10,6),0);
    }

    @Test
    public void resta() {
        assertEquals(4, cal.resta(10,6),0);
        assertEquals(7, cal.resta(14,7),0);
    }

    @Test
    public void multi() {
        assertEquals(22, cal.multi(11,2),0);
        assertEquals(15, cal.multi(5,3),0);
    }

    @Test
    public void div() {
        assertEquals(8,cal.div(64,8),0);
        assertEquals(2,cal.div(6,3),0);
        assertEquals(0,cal.div(29,0),0);
    }
}