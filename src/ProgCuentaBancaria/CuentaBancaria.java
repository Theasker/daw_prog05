package ProgCuentaBancaria;

/**
 *
 * @author theasker
 */
public class CuentaBancaria {
  private String titular;
  private String cuenta;
  private double saldo;

  public CuentaBancaria(String titular, String cuenta) {
    this.titular = titular;
    this.cuenta = cuenta;
  }

  public String getTitular() {
    return titular;
  }

  public String getCuenta() {
    return cuenta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
  
  /**
   * Módulo para el cálculo de los dígitos de control.
   */
  public static String obtenerDigitosControl(String cuenta){
    String digitos = "00";
    
    
    return digitos;
  }
}
