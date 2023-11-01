
package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


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
    private ArrayList<Persona>voluntarios;
    private ArrayList<Persona>familiares;
   
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
        this.voluntarios = new ArrayList<Persona>();
        this.familiares = new ArrayList<Persona>();
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

    public ArrayList<Persona> getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(ArrayList<Persona> voluntarios) {
        this.voluntarios = voluntarios;
    }

    public ArrayList<Persona> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(ArrayList<Persona> familiares) {
        this.familiares = familiares;
    }
    
    public void leerDatostxt(String ruta) throws FileNotFoundException, IOException
    {
        File file = new File(ruta);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String  st;
        String[] aux;
        while((st = br.readLine()) != null)
        {
            aux = st.split(", ");
            Persona personita = new Persona( aux[0], aux[1],Integer.parseInt(aux[2]),Double.parseDouble(aux[3]),aux[4],aux[5],aux[6],aux[7],aux[8],aux[9],Boolean.parseBoolean(aux[10]),aux[11]);
            if(personita.getTipo().equals("Voluntario"))
            {
                voluntarios.add(personita);
            }
            else
            {
                familiares.add(personita);
            }
        }   
    }
    
    public void agregarPersona(int opcion)
    {
        Scanner entrada = new Scanner(System.in);
        Persona nuevaP= new Persona();
        System.out.println("Ingrese el nombre: ");
        nuevaP.setNombre(entrada.nextLine());
        System.out.println("Ingrese el apellido: ");
        nuevaP.setApellido(entrada.nextLine());
        System.out.println("Ingrese rut: ");
        nuevaP.setRut(entrada.nextLine());
        System.out.println("Ingrese la edad: ");
        nuevaP.setEdad(entrada.nextInt());
        entrada.nextLine();
        System.out.println("Ingrese el numero de telefono: ");
        nuevaP.setTelefono(entrada.nextDouble());
        entrada.nextLine();
        System.out.println("Ingrese el correo: ");
        nuevaP.setMail(entrada.nextLine());
        System.out.println("Direccion: ");
        nuevaP.setDireccion(entrada.nextLine());
        System.out.println("Comuna: ");
        nuevaP.setComuna(entrada.nextLine());
        System.out.println("Region: ");
        nuevaP.setRegion(entrada.nextLine());
        switch (opcion) {
            case 1:
                System.out.println("Profesion o algo en lo que es bueno: ");
                nuevaP.setProfesion(entrada.nextLine());
                System.out.println("Lo que no puede/quiere hacer: ");
                nuevaP.setDebilidad(entrada.nextLine());
                nuevaP.setAsignado(false);
                nuevaP.setTipo("Voluntario");
                voluntarios.add(nuevaP);
                break;
            case 2:
                nuevaP.setProfesion("null");
                nuevaP.setDebilidad("null");
                nuevaP.setAsignado(false);
                nuevaP.setTipo("Familiar");
                familiares.add(nuevaP);
                break;
            default:
                return;
        }
    }
    
    public void mostrarDatos(ArrayList<Persona>listaPersonas)
    {
        if(!listaPersonas.isEmpty())
        {
            for(int i=0; i< listaPersonas.size();i++)
            {
                System.out.println("Nombre: "+ listaPersonas.get(i).getNombre()+" "+listaPersonas.get(i).getApellido());
                System.out.println("Rut: "+ listaPersonas.get(i).getRut());
                System.out.println("Edad: "+ listaPersonas.get(i).getEdad());
                System.out.println("Correo Electronico: "+listaPersonas.get(i).getMail());
                System.out.println("Region: "+listaPersonas.get(i).getRegion() +"|| Comuna: "+listaPersonas.get(i).getComuna()+"||Direccion: "+listaPersonas.get(i).getDireccion());
                System.out.println("");
            }
        }
    }
    
    public void eliminarPersona(Persona lista, int opcion)
    {
        ArrayList<Persona>listaPersonas= lista.getVoluntarios();
        if(listaPersonas.isEmpty())
        {
            System.out.println("Imposible de eliminar lista vacia");
            return;
        }
        Scanner entrada = new Scanner(System.in);
        
        String rut;
        System.out.println("Ingrese el Rut de la persona a eliminar");
        rut= entrada.nextLine();
        
        for(int i = 0; i < listaPersonas.size(); i++)
        {
            if(listaPersonas.get(i).getRut().equals(rut))
            {
                listaPersonas.remove(i);
                break;
            }
        }
        System.out.println("Eliminado con Exito");    
    }
    
     public void eliminarPersona(Persona lista, char opcion)
    {
        ArrayList<Persona>listaPersonas= lista.getFamiliares();
        if(listaPersonas.isEmpty())
        {
            System.out.println("Imposible de eliminar lista vacia");
            return;
        }
        Scanner entrada = new Scanner(System.in);
        
        String Rut;
        System.out.println("Ingrese el Rut de la persona a eliminar");
        Rut= entrada.nextLine();
        
        for(int i = 0; i < listaPersonas.size(); i++)
        {
            if(listaPersonas.get(i).getRut().equals(Rut))
            {
                listaPersonas.remove(i);
                break;
            }
        }
        System.out.println("Eliminado con Exito");
    }
    
    public void modificarPersona(Persona lista, int opcion)
    {
        ArrayList<Persona>listaPersonas= lista.getVoluntarios();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el rut de la persona");
        String rutEntrada = entrada.nextLine();
        String entry;
        
        for(int i = 0; i < listaPersonas.size(); i++)
        {
            if(listaPersonas.get(i).getRut().equals(rutEntrada))
            {
                do
                {
                System.out.println(listaPersonas.get(i).getNombre());
                System.out.println(listaPersonas.get(i).getRut());
                System.out.println(rutEntrada);
                System.out.println("Que desea modificar:)");
                System.out.println("1)Nombre 2)Apellido 3)Rut 4)Edad 5)Telefono");
                System.out.println("6)Mail 7)Direccion 8)Comuna 9)Region");
                System.out.println("10)Profesion 11)Debilidad 0)SALIR");
                opcion= entrada.nextInt();
                entrada.nextLine();
                if(opcion==0)
                    break;
                switch(opcion)
                {
                    case 0:
                    {
                        break;
                    }
                    case 1:
                    {
                        System.out.println("Ingrese el nombre modificado: ");
                        entry= entrada.nextLine();
                        listaPersonas.get(i).setNombre(entry);
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Ingrese el apellido modificado: ");
                        entry= entrada.nextLine();
                        listaPersonas.get(i).setApellido(entry);
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Ingrese el Rut modificado: ");
                        entry= entrada.nextLine();
                        listaPersonas.get(i).setRut(entry);
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Ingrese la edad modificada:");
                        int entry2 = entrada.nextInt();
                        entrada.nextLine();
                        listaPersonas.get(i).setEdad(entry2);
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Ingrese el Telefono modificado:");
                        double entry3 = entrada.nextDouble();
                        entrada.nextLine();
                        listaPersonas.get(i).setTelefono(entry3);
                        break;
                    }
                    case 6:
                    {
                        System.out.println("Ingrese el Mail modificado: ");
                        entry= entrada.nextLine();
                        listaPersonas.get(i).setMail(entry);
                        break;
                    }
                    case 7:
                    {
                        System.out.println("Ingrese la direccion modificada: ");
                        entry= entrada.nextLine();
                        listaPersonas.get(i).setDireccion(entry);
                        break;
                    }
                    case 8:
                    {
                        System.out.println("Ingrese la comuna modificada: ");
                        entry= entrada.nextLine();
                        listaPersonas.get(i).setComuna(entry);
                        break;
                    }
                    case 9:
                    {
                        System.out.println("Ingrese la Region modificada: ");
                        entry= entrada.nextLine();
                        listaPersonas.get(i).setRegion(entry);
                        break;
                    }
                    case 10:
                    {
                        System.out.println("Ingrese la profesion modificada: ");
                        entry= entrada.nextLine();
                        listaPersonas.get(i).setProfesion(entry);
                        break;
                    }
                    case 11:
                    {
                        System.out.println("Ingrese la debilidad modificada: ");
                        entry= entrada.nextLine();
                        listaPersonas.get(i).setDebilidad(entry);
                        break;
                    }
                    default:
                        System.out.println("Opcion No Valida");
                        break;
                }
                }while(opcion!=0);
            }
        }
    }
    public void modificarPersona(Persona lista, char alternativa)
    {
        ArrayList<Persona>listaPersonas= lista.getVoluntarios();
        int opcion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el rut de la persona");
        String rutEntrada = entrada.nextLine();
        String entry;
        
        for(int i = 0; i < listaPersonas.size(); i++)
        {
            if(listaPersonas.get(i).getRut().equals(rutEntrada))
            {
                do
                {
                    System.out.println("Que desea modificar:)");
                    System.out.println("1)Nombre 2)Apellido 3)Rut 4)Edad 5)Telefono");
                    System.out.println("6)Mail 7)Direccion 8)Comuna 9)Region");
                    System.out.println("10)Profesion 11)Debilidad 0)SALIR");
                    opcion= entrada.nextInt();
                    entrada.nextLine();
                    if(opcion==0)
                        break;
                    switch(opcion)
                    {
                        case 0:
                        {
                            break;
                        }
                        case 1:
                        {
                            System.out.println("Ingrese el nombre modificado: ");
                            entry= entrada.nextLine();
                            listaPersonas.get(i).setNombre(entry);
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Ingrese el apellido modificado: ");
                            entry= entrada.nextLine();
                            listaPersonas.get(i).setApellido(entry);
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Ingrese el Rut modificado: ");
                            entry= entrada.nextLine();
                            listaPersonas.get(i).setRut(entry);
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Ingrese la edad modificada:");
                            int entry2 = entrada.nextInt();
                            entrada.nextLine();
                            listaPersonas.get(i).setEdad(entry2);
                            break;
                        }
                        case 5:
                        {
                            System.out.println("Ingrese el Telefono modificado:");
                            double entry3 = entrada.nextDouble();
                            entrada.nextLine();
                            listaPersonas.get(i).setTelefono(entry3);
                            break;
                        }
                        case 6:
                        {
                            System.out.println("Ingrese el Mail modificado: ");
                            entry= entrada.nextLine();
                            listaPersonas.get(i).setMail(entry);
                            break;
                        }
                        case 7:
                        {
                            System.out.println("Ingrese la direccion modificada: ");
                            entry= entrada.nextLine();
                            listaPersonas.get(i).setDireccion(entry);
                            break;
                        }
                        case 8:
                        {
                            System.out.println("Ingrese la comuna modificada: ");
                            entry= entrada.nextLine();
                            listaPersonas.get(i).setComuna(entry);
                            break;
                        }
                        case 9:
                        {
                            System.out.println("Ingrese la Region modificada: ");
                            entry= entrada.nextLine();
                            listaPersonas.get(i).setRegion(entry);
                            break;
                        }
                        case 10:
                        {
                            System.out.println("Ingrese la profesion modificada: ");
                            entry= entrada.nextLine();
                            listaPersonas.get(i).setProfesion(entry);
                            break;
                        }
                        case 11:
                        {
                            System.out.println("Ingrese la debilidad modificada: ");
                            entry= entrada.nextLine();
                            listaPersonas.get(i).setDebilidad(entry);
                            break;
                        }
                        default:
                            System.out.println("Opcion No Valida");
                            break;
                    }
                }while(opcion!=0);
            }
        }
    }
    
}