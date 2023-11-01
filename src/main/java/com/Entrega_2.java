
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
        personita.leerDatostxt("C:\\Users\\Judi\\OneDrive\\Documentos\\NetBeansProjects\\Entrega2Progra\\personas.txt");
        Menu menu = new Menu();
        
        
        menu.respuestasOpciones(personita);
    }
}
