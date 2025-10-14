/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas Castaño
 */
public class Corriente extends CuentaBanco {
    double cupoSobregiro = -100000;
    
    public Corriente (int numeroCuenta, String nombreDueño, int dia, int mes, int año, double saldo, double cupoSobregiro){
        super(numeroCuenta, nombreDueño, dia, mes, año, saldo); 
        this.cupoSobregiro = cupoSobregiro;
    }
    
    @Override
    public void retirar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else if (saldo - valor >= cupoSobregiro) {
            saldo -= valor;
            JOptionPane.showMessageDialog(null,"Se ha realizado su retiro con sobregiro. Saldo actual: $" + saldo);
            } else {
                JOptionPane.showMessageDialog(null, "No tienes más cupo de sobregiro");
        } 
    }
    
    public double getCupoSobregiro() {
        return cupoSobregiro;
    }

    @Override
    public String DatosCuenta() {
        return super.DatosCuenta() + "  Cupo de sobregiro: $" + cupoSobregiro;
        }
}

