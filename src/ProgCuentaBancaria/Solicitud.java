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
  public String PedirTitular(){
    System.out.println("Introduce el nombre del titular de la cuenta:");
    String titular = leer.next();
    return titular;
  }

  /**
   * Método para solicitar el número de cuenta.
   */
  public String PedirCuenta(){
    System.out.println("Introduce el Código de la Cuenta (20 dígitos numéricos):");
    String cuenta = leer.next();
    return cuenta;
  }
  
  /**
   * Método para mostrar el menú de opciones 
   * y solicitar la opción a elegir
   */
  public int Menu(){
    System.out.println("  menu de opciones  ");
    System.out.println("--------------------");
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
