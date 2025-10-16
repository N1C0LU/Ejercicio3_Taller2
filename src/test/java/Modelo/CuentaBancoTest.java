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
public class CuentaBancoTest {
    @Test
    public void testConsignar() {
        System.out.println("Prueba del método Consignar()");
        CuentaBanco cuenta = new CuentaBanco(1, "Nicolás", 15, 10, 2025, 1000);
        cuenta.Consignar(500);
        assertEquals(1500, cuenta.saldo, 0.01);
    }

    @Test
    public void testRetirarConSaldoSuficiente() {
        System.out.println("Prueba del método Retirar() con saldo suficiente");
        CuentaBanco cuenta = new CuentaBanco(1, "Nicolás", 15, 10, 2025, 1000);
        cuenta.retirar(400);
        assertEquals(600, cuenta.saldo, 0.01);
    }

    @Test
    public void testRetirarSinSaldoSuficiente() {
        System.out.println("Prueba del método Retirar() sin saldo suficiente");
        CuentaBanco cuenta = new CuentaBanco(1, "Nicolás", 15, 10, 2025, 100);
        cuenta.retirar(500);
        assertEquals(100, cuenta.saldo, 0.01);
    }
    
    @Test
    public void testClienteConCuentaAhorros() {
        System.out.println("Prueba de integración: Cliente con cuenta de Ahorros");
        Ahorros cuenta = new Ahorros(1001, "Nicolás", 15, 10, 2025, 2000);
        Cliente cliente = new Cliente("Nicolás", 1010, cuenta);
        cuenta.Consignar(500);
        cuenta.retirar(1000);
        assertEquals(1500, cuenta.saldo, 0.01);
    }

    @Test
    public void testClienteConCuentaCorrienteYSobregiro() {
        System.out.println("Prueba de integración: Cliente con cuenta Corriente y uso de sobregiro");
        Corriente cuenta = new Corriente(1002, "Nicolás", 15, 10, 2025, 1000, -5000);
        Cliente cliente = new Cliente("Nicolás", 1011, cuenta);
        cuenta.retirar(4000);
        assertEquals(-3000, cuenta.saldo, 0.01);
        cuenta.Consignar(2000);
        assertEquals(-1000, cuenta.saldo, 0.01);
    }
}


    
