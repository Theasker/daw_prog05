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
    // Inicializamos las variables para las operaciones
    int d1 = 0;
    int d2 = 0;
    int cont;
    // Guardamos en un array los multiplicadores
    int[] multiplica ={1,2,4,8,5,10,9,7,3,6};
    // Sumamos cada dígito de entidad y oficina (d1), 
    // por la misma posición del array multiplica
    // nos saltamos las 2 primeras posiciones del multiplicador
    for (cont = 0;cont < (multiplica.length - 2);cont++){
      d1 += multiplica[cont+2] * Integer.parseInt(cuenta.substring(cont, cont+1));
    }
    // Sumamos cada digito del nº cta. por 
    // la misma posición del array multiplica
    for (cont = 0;cont < multiplica.length;cont++){
      d2 += multiplica[cont] * Integer.parseInt(cuenta.substring((cont+10),(cont+10+1)));
    }
    // Restamos a 11 el resto de la división entre el valor obtenido y el número 11
    d1=11-(d1%11);
    d2=11-(d2%11);
    // Si el resto es 10 el dígito es 1 y si es 11 es 0
    d1 = (d1==11) ? 0 : (d1==10) ? 1 : d1;
    d2 = (d2==11) ? 0 : (d2==10) ? 1 : d2;
    // Convertimos los varloes enteros a String para mandarlo
    String digitos = String.valueOf(d1)+String.valueOf(d2);
    return digitos;
  }
}