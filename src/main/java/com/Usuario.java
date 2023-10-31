
package com;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import java.io.File;
import java.util.ArrayList;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Usuario {
    
    private String Usuario;
    private String Clave; 
    private boolean Activo;
    private ArrayList<Usuario>usuarios;

    public Usuario(String Usuario, String Clave, boolean Activo) {
        this.Usuario = Usuario;
        this.Clave = Clave;
        this.Activo = Activo;
    }
    public Usuario()
    {
        this.usuarios= new ArrayList<Usuario>();
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    
    public void leerDatoscsv(String ruta) throws FileNotFoundException, IOException, CsvValidationException
    {
        
        File file = new File(ruta);
        FileReader reader = new FileReader(file);
        CSVParser parser = new CSVParserBuilder().withSeparator(';').build(); 
        CSVReader csvReader = new CSVReaderBuilder(reader).withCSVParser(parser).build();
        String[] nextRecord;
        while ((nextRecord = csvReader.readNext()) != null)
        {
            usuarios.add(new Usuario(nextRecord[0], nextRecord[1],Boolean.valueOf(nextRecord[2]) ));
        }
        
    }
    
    public void mostrarDatos()
    {
        for(int i = 0; i< usuarios.size();i++)
        {
            System.out.println(usuarios.get(i).getUsuario());
        }
    }
    
    public boolean confirmarUsuario(String nombre, String contra)
    {
        for(int i = 0; i < usuarios.size(); i++)
        {
            if(usuarios.get(i).getUsuario().equals(nombre) && usuarios.get(i).getClave().equals(contra))
                return true;
        }
        return false;
    }
    
}
