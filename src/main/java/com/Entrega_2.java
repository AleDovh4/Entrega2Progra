
package com;

import Graficos.Sesion;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Entrega_2 {

    public static void main(String[] args) throws IOException, FileNotFoundException, CsvValidationException {
        
        String ruta= "C:\\Users\\alexa\\OneDrive\\Documentos\\NetBeansProjects\\Entrega_2\\personas.txt";
        Persona listaPersonas= new Persona();
        listaPersonas.leerDatostxt(ruta);
        listaPersonas.mostrarDatos();
        
        ruta="C:\\Users\\alexa\\OneDrive\\Documentos\\NetBeansProjects\\Entrega_2\\asd.csv";
        
        Usuario users =new Usuario();
        users.leerDatoscsv(ruta);
        users.mostrarDatos();
        
        
    }
}
