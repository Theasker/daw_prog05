package ProgCuentaBancaria;

import java.util.Scanner;

/**
 * Clase donde se hacen las peticiones por teclado
 */

public class Solicitud {
  Scanner leer = new Scanner(System.in);

  /**
   * Método para solicitar el titular de la cuenta
   */
  public String pedirTitular(){
    String titular = "x";
    do{
      System.out.println("Introduce el nombre del titular de la cuenta (5-50):");
      titular = leer.next();
    }while ((titular.length() < 5) || (titular.length() > 50));
    return titular;
  }

  /**
   * Método para solicitar el número de cuenta.
   */
  public String pedirCuenta(){
    boolean comprueba = false;
    String cuenta = "x";
    do{
      System.out.println("Introduce el Código de la Cuenta (20 dígitos numéricos):");
      cuenta = leer.next();
      // Comprobamos si se han introducido el número de dígitos correcto
      // y si estos sin enteros
      if (cuenta.length() != 20){ // la cuenta no tiene 20 digitos
        System.out.println("No hay 20 dígitos");
        comprueba = false;
      }else{ // la cuenta si tiene 20 digitos
        // comprobamos si lo introducido son enteros
        comprueba = this.sonEnteros(cuenta);
        if (comprueba == false){ // No son enteros
          System.out.println("Hay que introducir digitos");
        }
      }
    }while (comprueba == false);
    return cuenta;
  }
  
  /**
   * Método que comprueba que una cadena está compuesta por números enteros
   */
  public boolean sonEnteros(String cadena){
    
    for (int x = 0;x < cadena.length();x++){
      try{
         Integer.parseInt(cadena.substring(x, x+1));
      }catch(NumberFormatException e){
        System.out.println(cadena.substring(x, x+1)+" no es un entero");
        return false;
      } 
    }
    return true;
  }
  
  
  /**
   * Método para mostrar el menú de opciones 
   * y solicitar la opción a elegir
   */
  public int menu(){
    System.out.println("Opciones de la Cuenta Bancaria");
    System.out.println("==============================");
    System.out.println("1 - Ver el número de cuenta completo");
    System.out.println("2 - Ver el titular de la cuenta");
    System.out.println("3 - Ver el código de la entidad");
    System.out.println("4 - Ver el código de la oficina");
    System.out.println("5 - Ver el número de la cuenta");
    System.out.println("6 - Ver los dígitos de control de la cuenta");
    System.out.println("7 - Realizar un ingreso");
    System.out.println("8 - Retirar efectivo");
    System.out.println("9 - Consultar saldo");
    System.out.println("0 - Salir de la aplicación");
    System.out.println("--------------------");
    System.out.println("  Introduce una opción:");
    int opcion = leer.nextInt();
    return opcion;
  }
}
