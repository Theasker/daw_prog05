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
    cuenta = new CuentaBancaria(pide.pedirTitular(),pide.pedirCuenta());
    int opcion = 0;
    do{
      opcion = pide.menu(); // Mostramos el menu
      switch (opcion){
        case 0:
          break;
        case 1:
            
          break;
        case 2:
            
          break;
        case 3:
            
          break;
        case 4:
            
          break;
        case 5:
            
          break;
        case 6:
            System.out.println("El dígito de control es: "+cuenta.obtenerDigitosControl(cuenta.getCuenta()));
          break;
        case 7:
            
          break;
        case 8:
            
          break;
        case 9:
            
          break;
        default:
          System.out.println("Introduzca un valor entre 0 y 9");
      }
      
    }while(opcion != 0);
  }
}
