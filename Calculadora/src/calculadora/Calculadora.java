/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author arman
 */
public class Calculadora {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner sc = new Scanner(System.in);
                String opcion;
                boolean comprobar = false;
                int Num1;
                int Num2;
                int resultado;
                
                do{
                  menu();
                  opcion = sc.nextLine();
                  switch(opcion){
                    case "1":
                        System.out.println("Ingrese primer numero: \n");
                        Num1 = Integer.parseInt(sc.nextLine());
                        System.out.println("Ingrese segundo numero: \n");
                        Num2 = Integer.parseInt(sc.nextLine());
                        resultado = sumar(Num1, Num2);
                        System.out.println(resultado);
                        
                        break;
                   case "2":
                        System.out.println("Ingrese primer numero: \n");
                        Num1 = Integer.parseInt(sc.nextLine());
                        System.out.println("Ingrese segundo numero: \n");
                        Num2 = Integer.parseInt(sc.nextLine());
                        resultado = restar(Num1, Num2);
                        System.out.println(resultado);
                        
                        break;
                    case "3":
                        System.out.println("Ingrese primer numero: \n");
                        Num1 = Integer.parseInt(sc.nextLine());
                        System.out.println("Ingrese segundo numero: \n");
                        Num2 = Integer.parseInt(sc.nextLine());
                        resultado = multiplicar(Num1, Num2);
                        System.out.println(resultado);
                        
                        break;
                    case "4":
                        System.out.println("Ingrese primer numero: \n");
                        Num1 = Integer.parseInt(sc.nextLine());
                        System.out.println("Ingrese segundo numero: \n");
                        Num2 = Integer.parseInt(sc.nextLine());
                        resultado = dividir(Num1, Num2);
                        System.out.println(resultado);
                        
                        break;
                    case "5":
                        comprobar = true;
                        
                        break;
                }
                  
        
    }while(comprobar != true);{
        
    }
   
}
  
                



        
    
    
    public static int sumar(int num1, int num2){
        int resultado;
        resultado = num1 + num2;
        return resultado;
    }
    
    public static int restar(int num1, int num2){
        int resultado;
        resultado = num1 - num2;
        return resultado;
    }
    public static int dividir(int num1, int num2){
        int resultado;
        resultado = num1 / num2;
        return resultado;
    }
    public static int multiplicar(int num1, int num2){
        int resultado;
        resultado = num1 * num2;
        return resultado;
    }
    public static void menu(){
        System.out.println("Calculadora ");
        System.out.println("Elegir operación: ");
        System.out.println("1) Sumar ");
        System.out.println("2) Restar ");
        System.out.println("3) Multiplicar ");
        System.out.println("4) Dividir ");
        System.out.println("5) Salir ");
        
        System.out.println("Opcion: ");
    }
}
