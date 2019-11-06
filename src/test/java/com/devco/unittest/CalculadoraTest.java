package com.devco.unittest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;
import org.mockito.Spy;

@RunWith(JUnit4.class)
public class CalculadoraTest {

    @Spy
    Calculadora calculadora = Mockito.spy(new Calculadora());

    @Test
    public void cuandoIngresa5EntoncesRetornaV() {
        Mockito.when(calculadora.construirRomano(Mockito.any(Integer.class))).thenReturn("V");
        String respuesta = calculadora.calcular(5);
        Assert.assertEquals(respuesta, "V");
    }

    @Test
    public void cuandoIngresaNumeroDistintoA5EntoncesRetornaI() {
        Mockito.when(calculadora.construirRomano(Mockito.any(Integer.class))).thenReturn("I");
        String respuesta = calculadora.calcular(6);
        Assert.assertEquals(respuesta, "I");
    }

    @Test
    public void cuandoIngresaNumeroDistintoA5EntoncesRetornaIConstruirRomano() {
        String respuesta = calculadora.construirRomano(6);
        Assert.assertEquals(respuesta, "I");
    }

    @Test
    public void cuandoIngresa5EntoncesRetornaVConstruirRomano() {
        String respuesta = calculadora.construirRomano(5);
        Assert.assertEquals(respuesta, "V");
    }
}
