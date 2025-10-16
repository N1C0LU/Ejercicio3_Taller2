/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;

import Modelo.Ahorros;
import Modelo.Cliente;
import Modelo.Corriente;
import Modelo.CuentaBanco;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas Castaño
 */
public class main {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su número de identificación:"));
        
        String[] tipos = {"Ahorros", "Corriente"};
        String menuTipos = """
                Tipos de cuenta: 
                1. Ahorros
                2. Corriente
                """;

        int opcionTipo = Integer.parseInt(JOptionPane.showInputDialog(menuTipos + "\nSeleccione el tipo de cuenta:"));
        String tipoSeleccionado;

        if (opcionTipo == 1) {
            tipoSeleccionado = tipos[0];
        } else if (opcionTipo == 2) {
            tipoSeleccionado = tipos[1]; 
        } else {
            JOptionPane.showMessageDialog(null, "Opción inválida. Se creará una cuenta de Ahorros por defecto.");
            tipoSeleccionado = tipos[0];
        }

        JOptionPane.showMessageDialog(null, "Ha seleccionado una cuenta de tipo: " + tipoSeleccionado);
        
        int numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta:"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Día de apertura:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes de apertura:"));
        int año = Integer.parseInt(JOptionPane.showInputDialog("Año de apertura:"));
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo inicial:"));
        
        CuentaBanco cuenta;
        if (tipoSeleccionado.equals("Ahorros")) {
            cuenta = new Ahorros(numeroCuenta, nombre, dia, mes, año, saldo);
        } else {
            cuenta = new Corriente(numeroCuenta, nombre, dia, mes, año, saldo, -100000);
        }
        
        Cliente cliente = new Cliente(nombre, id, cuenta);

        boolean salir = false;
        
        do {
            String opcion = JOptionPane.showInputDialog("""
                                                        
                    MENÚ PRINCIPAL:
                    1. Consignar dinero
                    2. Retirar dinero
                    3. Ver resumen de datos
                    4. Salir
                    
                    Ingrese una opción:
                    """);

            switch (opcion) {
                case "1" -> {
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a consignar:"));
                    cuenta.Consignar(valor);
                    JOptionPane.showMessageDialog(null, "Consignación exitosa. Nuevo saldo: $" + valor);
                }
                case "2" -> {
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a retirar:"));
                    cuenta.retirar(valor);
                }
                case "3" -> {
                    JOptionPane.showMessageDialog(null, cliente.toString());
                }
                case "4" -> {
                    salir = true;
                    JOptionPane.showMessageDialog(null, "Gracias por usar el Banco. ¡Hasta luego!");
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
                }
            }
        } while (!salir);
    }
}
