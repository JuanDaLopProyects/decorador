
import impl.CuentaAhorro;
import patronesdediseñodecorador.ICuentaBancaria;
import model.Cuenta;
import patronesdediseñodecorador.BlindajeDecorador;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
public class App {
    public static void main(String []args){
        Cuenta c =new Cuenta (1, "uninpahu");
        ICuentaBancaria cuenta =new CuentaAhorro();
        ICuentaBancaria cuentaBlindada =new BlindajeDecorador(cuenta);
        
        //cuenta.abrirCuenta(c)
        cuentaBlindada.abrirCuenta(c);
    }
    
}
