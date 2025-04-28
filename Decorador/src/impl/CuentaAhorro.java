/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impl;

import patronesdediseñodecorador.ICuentaBancaria;
import model.Cuenta;

/**
 *
 * @author Estudiantes
 */
public class CuentaAhorro implements ICuentaBancaria {

    @Override
    public void abrirCuenta(Cuenta c) {
        System.out.println( "-----------------");
                System.out.println( "se abrio una cuenta de ahorros");
        System.out.println( "CLIENTE"+c.getCliente());

    }

    
    
    
}
