/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesdediseñodecorador;

import model.Cuenta;

/**
 *
 * @author Estudiantes
 */
public class BlindajeDecorador extends CuentaDecorador{

    public BlindajeDecorador(ICuentaBancaria cuentaDecorada) {
        super(cuentaDecorada);
    }

    @Override
    public void abrirCuenta(Cuenta c) {
        cuentaDecorada.abrirCuenta(c);
        agregarBlindaje(c);
        
    }

    public void agregarBlindaje(Cuenta c) {
        System.out.println("se agrego blindaje a la cuenta del cliente" + c.getCliente());
    }
    
}
