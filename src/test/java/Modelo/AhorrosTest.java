/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicolas Castaño
 */
public class AhorrosTest {
    @Test
    public void testRetiroConSaldo() {
        System.out.println("Prueba del método Retirar() en cuenta Ahorros con saldo suficiente");
        Ahorros cuenta = new Ahorros(1, "Nicolás", 15, 10, 2025, 2000);
        cuenta.retirar(1000);
        assertEquals(1000, cuenta.saldo, 0.01);
    }

    @Test
    public void testRetiroSinSaldo() {
        System.out.println("Prueba del método Retirar() en cuenta Ahorros sin saldo");
        Ahorros cuenta = new Ahorros(1, "Nicolás", 15, 10, 2025, 0);
        cuenta.retirar(500);
        assertEquals(0, cuenta.saldo, 0.01);
    }
}

