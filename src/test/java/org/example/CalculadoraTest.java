package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    Calculadora c = new Calculadora();
    @Test
    public void TestSumaPositivos(){
        assertEquals(10, c.Suma(5,5));
    }

    @Test
    public void TestSumaNegativos(){
        assertEquals(0, c.Suma(5,-5));
    }

    @Test
    public void TestRestaPositivos(){
        assertEquals(1, c.Resta(6,5));
    }

    @Test
    public void TestRestaNegativos(){
        assertEquals(-11, c.Resta(-6,5));
    }

    @Test
    public void TestMultiplicacionPositivos(){
        assertEquals(30, c.Multiplicacion(6,5));
    }
    @Test
    public void TestMultiplicacionNegativos(){
        assertEquals(-30, c.Multiplicacion(-6,5));
    }
    @Test
    public void TestMultiplicacionPorCero(){
        assertEquals(0, c.Multiplicacion(80,0));
    }

    @Test
    public void TestDivisionPositivos(){
        assertEquals(2, c.Division(10,5));
    }

    @Test
    public void TestDivisionNegativos(){
        assertEquals(-2, c.Division(-10,5));
    }
    @Test
    public void TestDivisionPorCero(){
        assertEquals(0, c.Division(10,0));
    }
}
