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
public class ClienteTest {
    @Test
    public void testCreacionCliente() {
        CuentaBanco cuenta = new Ahorros(10, "Nicolás", 15, 10, 2025, 5000);
        Cliente cliente = new Cliente("Nicolás", 12345, cuenta);
        assertEquals("Nicolás", cliente.getNombre());
        assertEquals(12345, cliente.getId());
        assertEquals("Ahorros", cliente.getCuenta().getTipoCuenta());
    }
    
}
