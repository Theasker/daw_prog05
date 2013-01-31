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
    //cuenta = new CuentaBancaria(pide.pedirTitular(),pide.pedirCuenta());
    cuenta = new CuentaBancaria("Mauri","12345678061234567890");
    int opcion = 0;
    
    do{
      opcion = pide.menu(); // Mostramos el menu
      switch (opcion){
        case 0:
          break;
        case 1:
          
          System.out.println(cuenta.verCuenta());
          break;
        case 2:
          System.out.println("El titular de la cuenta es "+cuenta.getTitular());
          break;
        case 3:
          System.out.println("El código de entidad es "+cuenta.verEntidad());
          break;
        case 4:
          System.out.println("El código de oficina es "+cuenta.verOficina());
          break;
        case 5:
          System.out.println("Los 10 dígitos de la cuenta son "+cuenta.verDigitosCuenta());
          break;
        case 6:
            System.out.println("El dígito de control es: "+CuentaBancaria.obtenerDigitosControl(cuenta.getCuenta()));
          break;
        case 7:
            
          break;
        case 8:
            
          break;
        case 9:
            
          break;
        default:
          System.out.println("Introduzca un valor entre 0 y 10");
      }
      
    }while(opcion != 0);
  }
}
