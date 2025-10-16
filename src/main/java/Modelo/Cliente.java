/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Nicolas Castaño
 */
public class Cliente {
    private String nombre;
    private CuentaBanco tipo;
    private int id;
    
    public Cliente(String nombre, int id, CuentaBanco tipo) {
        this.nombre = nombre;
        this.id = id;
        this.tipo = tipo;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getId(){
        return id;
    }
    
    public CuentaBanco getCuenta() {
        return tipo;
    }
    
    public String toString() {
        return "Cliente: " + nombre + "\nIdentificación: " + id + "\nTipo de cuenta:" + tipo.getTipoCuenta()+ "\nDatos de la cuenta: "+tipo.DatosCuenta();
    }

}
