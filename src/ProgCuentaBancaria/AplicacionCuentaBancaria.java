package ProgCuentaBancaria;

/**
 * Clase con el main
 * desde la que llamaremos a todas las demás
 */

/**
 *
 * @author Mauricio Segura Ariño
 */
public class AplicacionCuentaBancaria {
  
  static CuentaBancaria cuenta;
  static Solicitud pide;
  public static void main(String[] args){
    // Instancio la clase para solicitar de teclado
    pide = new Solicitud();
    
    // Instancio la clase de operaciones
    cuenta = new CuentaBancaria(pide.PedirTitular(),pide.PedirCuenta());
    
    
  }
}
