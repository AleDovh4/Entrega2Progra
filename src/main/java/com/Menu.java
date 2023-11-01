/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import java.util.Scanner;

/**
 *
 * @author Judi
 */
public class Menu {
    
    public void desplegarMenu()
    {
        System.out.println("1. Agregar Voluntario Nuevo o Integrantes de Familia ");
        System.out.println("2. Mostrar Listado de Voluntarios o Integrantes de familia ");
        System.out.println("3. Eliminar Voluntario o Integrantes de Familia ");
        System.out.println("4. Modificar Voluntario o Integrantes de Familia");
        System.out.println("0. Para terminar el programa.");
        System.out.println("Ingrese su opcion: ");
    }
    
    public void respuestasOpciones(Persona personita)
    {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
            desplegarMenu();
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcion)
            {
                case 0:
                    System.out.println("Saliendo del programa....");
                    break;
                case 1:
                {
                    do{
                        System.out.println("Ingrese 1 para Agregar Voluntarios o 2 para Agregar Integrantes de familia. Ingrese 3 para salir al menu principal");
                        opcion = entrada.nextInt();
                        
                        if(opcion == 3)
                            break;
                        else if(opcion == 1 || opcion == 2)
                        {
                            personita.agregarPersona(opcion);
                            opcion = 3;
                        }
                        else
                        {
                            System.out.println("Opcion no valida");
                        }
                    }while(opcion != 3);
                    break;
                }
                case 2:
                {
                    System.out.println("Ingrese 1 para Mostrar Voluntarios o 2 para Mostrar Integrantes de familia. Ingrese 3 para salir al menu principal");
                    opcion = entrada.nextInt();

                    do{
                        
                        if(opcion == 3)
                            break;
                        if(opcion == 1)
                        {
                            personita.mostrarDatos(personita.getVoluntarios());
                            opcion = 3;
                        }
                        else if (opcion == 2)
                        {
                            personita.mostrarDatos(personita.getFamiliares());
                            opcion = 3;
                        }
                    }while(opcion != 3);
                    break;
                } 
                case 3:
                {
                    do{
                        System.out.println("Ingrese 1 para Eliminar un Voluntario o 2 para Eliminar un Integrantes de familia. Ingrese 3 para salir al menu principal");
                        opcion = entrada.nextInt();
                        if(opcion == 3)
                            break;
                        if(opcion == 1)
                        {
                            personita.eliminarPersona(personita, 1);
                            opcion =3;
                        }
                        else if (opcion == 2)
                        {
                            personita.eliminarPersona(personita, 'a');
                            opcion =3;
                        }
                    }while(opcion != 3);
                    break;
                }
                case 4:
                {
                    do{
                        System.out.println("Ingrese 1 para Modificar un Voluntario o 2 para Modificar un Integrantes de Familia. Ingrese 3 para salir al menu principal");
                        opcion = entrada.nextInt();
                        if(opcion == 3)
                            break;
                        if(opcion == 1)
                        {
                            personita.modificarPersona(personita.getVoluntarios());
                            opcion=3;
                        }
                        else if (opcion == 2)
                        {
                            personita.modificarPersona(personita.getFamiliares());
                            opcion=3;
                        }
                    }while(opcion != 3);
                    break;
                }
                default:
                {
                    System.out.println("Opcion Invalida, intente de nuevo.");
                    break;
                }
            }
            
        }while(opcion != 0);
      
    }
}
