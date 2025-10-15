/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Nicolas Castaño
 */
public class Ahorros extends CuentaBanco {
    
    public Ahorros (int numeroCuenta, String nombreDueño, int dia, int mes, int año, double saldo){
        super(numeroCuenta, nombreDueño, dia, mes, año, saldo);
        this.tipoCuenta = "Ahorros";
    }
    
    
    
}
