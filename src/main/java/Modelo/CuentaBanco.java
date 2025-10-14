/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Nicolas Castaño
 */
public class CuentaBanco {
    int numeroCuenta;
    String nombreDueño;
    int dia;
    int mes;
    int año;
    double saldo;
    
    public CuentaBanco (int numeroCuenta, String nombreDueño, int dia, int mes, int año, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.nombreDueño = nombreDueño;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.saldo = 0;
        }
    
    public String DatosCuenta (){
        return "Numero de cuenta" +numeroCuenta+ "Nombre del propietario"+nombreDueño+ "Fecha de apertura"+dia+"/"+mes+"/"+año;    
    }
    
    public void Consignar(double valor){
        saldo += valor;
    }
    
    public void retirar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente. No se puede retirar.");
        }
    }
    
    @Override
    public String toString(){
        return DatosCuenta();
    }
}
    
   
              
     

