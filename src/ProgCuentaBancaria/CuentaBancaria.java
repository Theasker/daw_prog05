package ProgCuentaBancaria;

/**
 * Clase con que realiza todas las operaciones solicitadas en el menú
 * @author theasker
 */
public class CuentaBancaria {
  private String titular;
  private String cuenta;
  private double saldo;
  private boolean correcto = false;

  /**
   * Constructor que rellena las variables titular y cuenta
   * @param titular Es el titular de la cuenta
   * @param cuenta Los 20 dígitos de cuenta
   */
  public CuentaBancaria(String titular, String cta) throws Exception {
    // Comparación de objetos (Strings) con .equeals
    if(this.obtenerDigitosControl(cta).equals(cta.substring(8,10))){
      this.titular = titular;
      this.cuenta = cta;
      this.saldo = 0;
    }else{
      System.out.println("No es una cuenta correcta");
      
    }
  }

  /**
   * Método que devuelve el titular de la cuenta
   * @return titular 
   */
  public String getTitular() {
    return titular;
  }

  /**
   * Método get que devuelve el número de cuenta solamente
   * @return cuenta
   */
  public String getCuenta() {
    return cuenta;
  }
  
  /**
   * Método get que devuelve el número de cuenta bonito
   * @return cta (1234-5648-90-123456789
   */
  public String verCuenta() {
    String cta;
    cta = "El número de cuenta es: ";
    cta += this.cuenta.substring(0, 4)+"-";
    cta += this.cuenta.substring(4, 8)+"-";
    cta += this.obtenerDigitosControl(this.cuenta) +"-";
    cta += this.cuenta.substring(10, 20);
    return cta;
  }

  /**
   * Método get que devuelve el número de la entidad
   * @return dígitos de cuenta
   */
  public String verEntidad(){
    return this.getCuenta().substring(0,4);
  }
  
  /**
   * Método get que devuelve el número de la oficina
   * @return dígitos de oficina
   */
  public String verOficina(){
    return this.getCuenta().substring(4,8);
  }
  
  /**
   * Método get que devuelve los 10 dígitos de la cuenta
   * @return 10 número de cuenta
   */
  public String verDigitosCuenta(){   
    return this.getCuenta().substring(10,20);
  }
  
  /**
   * Método que ingresa una cantidad en cuenta
   * @param cantidad Cantidad a ingresar
   */
  public void ingresar(double cantidad){
    this.saldo = this.saldo + cantidad;
  }
  
  /**
   * Método que retira una cantidad de la cuenta controlando 
   * que no se intente sacar más cantidad de la que hay
   * @param cantidad Cantidad a retirr
   */
  public void retirar(double cantidad){
    if (cantidad > this.saldo){
      System.out.println("No se puede retirar más dinero del que tienes");
    }else{
      this.saldo = this.saldo - cantidad;
    }    
  }
  
  /**
   * Método get que devuelve el saldo de la cuenta
   * @return saldo Saldo pendiente en la cuenta
   */
  public double getSaldo() {
    return saldo;
  }
  
  /**
   * Módulo para el cálculo de los dígitos de control.
   * @param cuenta
   * @return 
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