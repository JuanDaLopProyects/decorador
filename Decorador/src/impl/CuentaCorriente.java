/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impl;

import model.Cuenta;
import patronesdediseñodecorador.ICuentaBancaria;

/**
 *
 * @author Estudiantes
 */
public class CuentaCorriente implements ICuentaBancaria{
    @Override
    public void abrirCuenta (Cuenta c){
        System.out.println("-----------");
                System.out.println("se abrio la cuenta corriente");
                System.out.println("Cliente:" +c.getcliente);

    }
    
}
