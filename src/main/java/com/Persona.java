
package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Persona {
    private String nombre;
    private String apellido;
    private String rut;
    private int edad;
    private double telefono;
    private String mail;
    private String direccion;
    private String comuna;
    private String region;
    private String profesion;
    private String debilidad;
    private boolean asignado;
    private String tipo;
    private ArrayList<Persona>Personas;
   
    public Persona(String nombreApellido, String rut, int edad, double telefono, String mail, String direccion, String comuna, String region, String profesion, String debilidad, boolean asignado, String tipo) {
        String[] aux = nombreApellido.split(" ");
        this.nombre = aux[0];
        this.apellido = aux[1];
        this.rut = rut;
        this.edad = edad;
        this.telefono = telefono;
        this.mail = mail;
        this.direccion = direccion;
        this.comuna = comuna;
        this.region = region;
        this.profesion = profesion;
        this.debilidad = debilidad;
        this.asignado = asignado;
        this.tipo = tipo;
    }
    public Persona()
    {
        this.nombre = "None";
        this.apellido = "None";
        this.rut = "None";
        this.edad = 0;
        this.telefono = 0;
        this.mail = "None";
        this.direccion = "None";
        this.comuna = "None";
        this.region = "None";
        this.profesion = "None";
        this.debilidad = "None";
        this.asignado = false;
        this.tipo = "None";
    }
    
    
    
    // parse a int y boolean
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public boolean isAsignado() {
        return asignado;
    }

    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Persona> getPersonas() {
        return Personas;
    }

    public void setPersonas(ArrayList<Persona> Personas) {
        this.Personas = Personas;
    }
    
    public void leerDatostxt(String ruta) throws FileNotFoundException, IOException
    {
        this.Personas = new ArrayList<Persona>();
        File file = new File(ruta);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String  st;
        String[] aux;
        while((st = br.readLine()) != null)
        {
            aux = st.split(", ");
            Persona personita = new Persona( aux[0], aux[1],Integer.parseInt(aux[2]),Double.parseDouble(aux[3]),aux[4],aux[5],aux[6],aux[7],aux[8],aux[9],Boolean.parseBoolean(aux[10]),aux[11]);
            Personas.add(personita);
        }   
    }
    public void mostrarDatos()
    {
        for(int i = 0; i<Personas.size();i++)
        {
            System.out.println(Personas.get(i).getNombre());
        }
    }
}