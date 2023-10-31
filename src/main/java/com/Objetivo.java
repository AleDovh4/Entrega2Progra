
package com;

import java.util.Date;


public class Objetivo {
    private Date fechaInicio;
    private Date fechaFinalizado;
    private Persona coordinador;
    private Casa casaObjetivo;
    private Persona listaAsignados;

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizado() {
        return fechaFinalizado;
    }

    public void setFechaFinalizado(Date fechaFinalizado) {
        this.fechaFinalizado = fechaFinalizado;
    }

    public Persona getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(Persona coordinador) {
        this.coordinador = coordinador;
    }

    public Casa getCasaObjetivo() {
        return casaObjetivo;
    }

    public void setCasaObjetivo(Casa casaObjetivo) {
        this.casaObjetivo = casaObjetivo;
    }

    public Persona getListaAsignados() {
        return listaAsignados;
    }

    public void setListaAsignados(Persona listaAsignados) {
        this.listaAsignados = listaAsignados;
    }

  

}
