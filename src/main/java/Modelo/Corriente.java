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
    private double cupoSobregiro;
    
    public Corriente (int numeroCuenta, String nombreDueño, int dia, int mes, int año, double saldo, double cupoSobregiro){
        super(numeroCuenta, nombreDueño, dia, mes, año, saldo); 
        this.cupoSobregiro = cupoSobregiro;
        this.tipoCuenta = "Corriente";
    }
    
    @Override
    public void retirar(double valor) {
        if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "El valor del retiro debe ser positivo.");
            return;
        }

        
        if (saldo >= valor) {
            saldo -= valor;
            JOptionPane.showMessageDialog(null,
                    "Retiro exitoso.\nSaldo actual: $" + saldo);
        }
        
        else if ((saldo - valor) >= -cupoSobregiro) {
            saldo -= valor;
            double usado = -saldo;
            double restante = cupoSobregiro - usado;
            JOptionPane.showMessageDialog(null,
                    "Retiro realizado con sobregiro.\nSaldo actual: $" + saldo +
                    "\nCupo restante: $" + restante);
        }
       
        else {
            JOptionPane.showMessageDialog(null,
                    "No tienes más cupo de sobregiro disponible.\nSaldo actual: $" + saldo);
        }
    }
    
    public double getCupoSobregiro() {
        return cupoSobregiro;
    }

    @Override
    public String DatosCuenta() {
        return super.DatosCuenta() + "  \nCupo de sobregiro: $" + cupoSobregiro;
        }
}

