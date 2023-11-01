
package com;

import Graficos.Sesion;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Entrega_2 {

    
    
    public static void main(String[] args) throws IOException, FileNotFoundException, CsvValidationException {
        
        
        Sesion abrir = new Sesion();
        abrir.iniciarPrograma();
        
        Persona personita = new Persona();
        personita.leerDatostxt("C:\\Users\\alexa\\OneDrive\\Documentos\\NetBeansProjects\\Entrega_2\\personas.txt");
        Menu menu = new Menu();
        
        
        menu.respuestasOpciones(personita);
        System.out.println("Finalizado");
    }
}
