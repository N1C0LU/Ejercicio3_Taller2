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
public class CorrienteTest {
    @Test
    public void testRetiroConSaldoPositivo() {
        System.out.println("Prueba del método Retirar() en cuenta Corriente con saldo positivo");
        Corriente cuenta = new Corriente(1, "Nicolás", 15, 10, 2025, 5000, -100000);
        cuenta.retirar(3000);
        assertEquals(2000, cuenta.saldo, 0.01);
    }

    @Test
    public void testRetiroConSobregiroPermitido() {
        System.out.println("Prueba del método Retirar() con uso de sobregiro");
        Corriente cuenta = new Corriente(1, "Nicolás", 15, 10, 2025, 1000, -100000);
        cuenta.retirar(2000);
        assertEquals(-1000, cuenta.saldo, 0.01);
    }

    @Test
    public void testRetiroQueSuperaSobregiro() {
        System.out.println("Prueba del método Retirar() que excede el sobregiro permitido");
        Corriente cuenta = new Corriente(1, "Nicolás", 15, 10, 2025, 1000, -1000);
        cuenta.retirar(3000);
        assertTrue(cuenta.saldo >= -1000);
    }
}
