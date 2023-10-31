
package com;

import java.util.ArrayList;


public class Albergue {
    private ArrayList<Persona>listaFamilias;
    private int capacidad;
    private double telefono;
    private Persona listaVoluntarios;
    private Persona coordinador;
    private String direccion;

    public ArrayList<Persona> getListaFamilias() {
        return listaFamilias;
    }

    public void setListaFamilias(ArrayList<Persona> listaFamilias) {
        this.listaFamilias = listaFamilias;
    }

    public Persona getListaVoluntarios() {
        return listaVoluntarios;
    }

    public void setListaVoluntarios(Persona listaVoluntarios) {
        this.listaVoluntarios = listaVoluntarios;
    }
 

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

    public Persona getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(Persona coordinador) {
        this.coordinador = coordinador;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}