/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Nicolas Castaño
 */
public class Corriente extends CuentaBanco {
    double cupoSobregiro;
    
    public Corriente (int numeroCuenta, String nombreDueño, int dia, int mes, int año, double saldo, double cupoSobregiro){
        super(numeroCuenta, nombreDueño, dia, mes, año, saldo); 
        this.cupoSobregiro = cupoSobregiro;
    }
    
}
