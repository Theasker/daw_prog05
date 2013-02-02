package ProgCuentaBancaria;

import java.io.IOException;
import java.util.InputMismatchException;

/**
 * Clase con el main desde las que llamamos a todas las demás
 * @author Mauricio Segura Ariño
 * @see http://daw.xtrweb.com/dokuwiki
 */
public class AplicacionCuentaBancaria {
  
  static CuentaBancaria cuenta;
  static Solicitud pide;

  public static void main(String[] args) throws Exception{
    // Instancio la clase para solicitar de teclado
    pide = new Solicitud();
    
    // Instancio la clase de operaciones
    cuenta = new CuentaBancaria(pide.pedirTitular(),pide.pedirCuenta());
    // opcion para las diferentes secciones del menú
    int opcion = 0;
    do{ // Se ejecuta hasa que introducimos un 0
      try{
        opcion = Integer.parseInt(pide.menu()); // Mostramos el menu
      }catch (NumberFormatException nfe){ 
        System.err.println("Sólo valores entre 0 y 9 carácteres no");
        opcion = 10;
      }
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
          cuenta.ingresar(pide.pedirCantidad());
          break;
        case 8:
          cuenta.retirar(pide.pedirCantidad());
          break;
        case 9:
          System.out.println("El saldo actual es de "+cuenta.getSaldo()+"€");
          break;
        default:
          System.out.println("Introduzca un valor entre 0 y 10");
      }
    }while(opcion != 0);
  }
}