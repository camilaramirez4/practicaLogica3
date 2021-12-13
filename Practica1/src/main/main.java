/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author cami0
 */
public class main {
    
    public static void main(String[] args) {
        
        boolean ejecucion = true;
        
        //Menú para que el usuario elija que opción desea ejecutar, se repetirá hasta que elija salir del programa (opción 3)
        while (ejecucion == true){
            System.out.println(" _____________________________________________________________________");
            System.out.println("| Desarrollado por:...                                                |");
            System.out.println("| Seleccione una opción (número entero entre 1 y 3):                  |");
            System.out.println("| 1. OPERAR CON POLINOMIOS                                            |");
            System.out.println("| 2. OPERAR CON MATRICES                                              |");
            System.out.println("| 3. SALIR                                                            |");
            System.out.println("|_____________________________________________________________________|");
            
            Scanner leer = new Scanner(System.in);
            int opcion = leer. nextInt();
            
            //La opción 1 es para el punto 1 de la práctica
            if(opcion == 1){
                
                System.out.println("Ejemplo de la forma en la cual debe ingresar su polinomio:");
                System.out.println("52x^2 + 25x^1 + 65x^0");
                //Se le pregunta al usuario cuantos polinomios desea ingresar
                System.out.println("¿Cuántos polinomios desea ingresar?");
                int numeroPolinomios = leer.nextInt();
                //Creo un arreglo donde guardo los polinomios que van a ser ingresados por consola en forma de String
                String [] polinomiosString = new String [numeroPolinomios + 1];
                //Creo un arreglo del mismo tamaño que polinomiosString donde voy a guardar los polinomios en vector forma 2 (ya en forma de números)
                int [] polinomios = new int [numeroPolinomios + 1];
                int i = 1;
                //Para que se le pida al usuario ingresar cada uno de los polinomios hasta que llegue a numeroPolinomios que fue el número de polinomios que él dijo que iba a ingresar
                while (i <= numeroPolinomios){
                    polinomiosString[i] = leer.nextLine();
                    System.out.println("Ingrese el " + i + " polinomio:");
                    i++;
                } //Hace falta lograr que el programa espere a que el usuario ingrese el ultimo polinomio para mostrar el siguiente menu
                //Falta convertir el arreglo de String en vector forma 2 y almacenar esta información en el arreglo "polinomios" (hacer el metodo toArray en la clase PolinomioVectorF2)
                
                //Menú para que el usuario elija que operación desea hacer con los polinomios que ingresó
                boolean ejecucion1 = true;
                
                while(ejecucion1 == true){
                    System.out.println(" _____________________________________________________________________");
                    System.out.println("| Seleccione una opción (número entero entre 1 y 6):                  |");
                    System.out.println("| 1. MOSTRAR TODOS LOS POLINOMIOS INGRESADOS                          |");
                    System.out.println("| 2. MOSTRAR EL POLINOMIO i                                           |");
                    System.out.println("| 3. MULTIPLICAR DOS POLINOMIOS                                       |");
                    System.out.println("| 4. DIVIDIR DOS POLINOMIOS                                           |");
                    System.out.println("| 5. EVALUAR EL POLINOMIO i                                           |");
                    System.out.println("| 6. REGRESAR AL MENÚ PRINCIPAL                                       |");
                    System.out.println("|_____________________________________________________________________|");
            
                    int opcion1 = leer. nextInt();
                     //La opción 1 es para mostrar en la consola todos los polinomios que el usuario ingresó
                    if(opcion1 == 1){
                    } //La opción 2 le pide al usuario el número i (que es la posición en el arreglo de polinomios) del polinomio que desea ver en consola
                    else if (opcion1 == 2){
                    } //La opción 3 le permite al usuario multiplicar dos polinomios A y B y almacena el resultado en un nuevo polinomio C, el cual muestra en consola
                    else if (opcion1 == 3){
                        String polA = leer.nextLine();
                        System.out.println("Ingrese el polinomio A:");
                        String polB = leer.nextLine();
                        System.out.println("Ingrese el polinomio B:");
                    } //La opción 4 Le permite al usuario dividir dos polinomios A y B y almacena el resultado en un nuevo polinomio C, el cual muestra en consola
                    else if (opcion1 == 4){
                    } //La opción 5 le pregunta al usuario cúal polinomio (i) desea evaluar y el valor de x que desea reemplazar en el polinomio y muestra el resultado en consola
                    else if (opcion1 == 5){
                    } //La opción  6 finaliza la ejecución de el menú de la opción 1 y regresa al menú principal
                    else if (opcion1 == 6){
                        System.out.println("Se ha salido con éxito");
                        ejecucion1 = false;
                    } //El usuario ingresó un número diferente de 1,2 o 3
                    else {
                        System.out.println("La opción seleccionada es incorrecta (Solo se admiten números enteros entre 1 y 6)");
                    }
                }
                
            } //La opción 2 es para el punto 2 de la práctica
            else if (opcion == 2){
                System.out.println("Opcion 2");
            } //La opción 3 es para finalizar la ejecución del programa y no mostrar más el menú
            else if (opcion == 3){
                System.out.println("Se ha salido con éxito");
                ejecucion = false;
            } //El usuario ingresó un número diferente de 1,2 o 3
            else{
                System.out.println("La opción seleccionada es incorrecta (Solo se admiten números enteros entre 1 y 3)");
            }
        }
    }
}
