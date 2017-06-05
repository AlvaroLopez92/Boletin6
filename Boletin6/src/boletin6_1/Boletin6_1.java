/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_1;

/**
 *
 * @author alvar
 */
public class Boletin6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conta conta1=new Conta();
        System.out.println("Introduce el nombre del propietario de la cuenta");
        System.out.println("Introduce el numero de la cuenta");
        System.out.println("Introduce el saldo de la cuenta");
        Conta conta2=new Conta();
        System.out.println("Introduce el nombre del titular de la cuenta");
        System.out.println("Introduce el numero de la cuenta");
        System.out.println("Introduce el saldo de la cuenta");
        System.out.println("El saldo de la cuenta 1 es "+conta1.getSaldo());
        System.out.println("El saldo de la cuenta 2 es "+conta2.getSaldo());
        System.out.println("Introduce el saldo a transferir");
        System.out.println("El nuevo saldo de la cuenta 1 es "+conta1.getSaldo()+"\nEl nuevo saldo de la cuenta 2 es "+conta2.getSaldo());
    }
        
}

