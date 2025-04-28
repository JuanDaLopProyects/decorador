/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesdediseñodecorador;

/**
 *
 * @author Estudiantes
 */
public abstract class CuentaDecorador implements ICuentaBancaria {
protected ICuentaBancaria    cuentaDecorada;
public CuentaDecorador(ICuentaBancaria cuentaDecorada){
    this.cuentaDecorada = cuentaDecorada;
}
    
    
}
