/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in);
    public Persona crearPersona(){
        System.out.println("ingrese nombre");
    String nombre=leer.next();
    Date FechaNacimiento=new Date();
        System.out.println("ingrese dia de nacimiento");
    FechaNacimiento.setDate(leer.nextInt());
        System.out.println("ingrese mes de nacimiento");
        FechaNacimiento.setMonth(leer.nextInt()-1);
        System.out.println(" ingrese año de nacimiento");
        FechaNacimiento.setYear(leer.nextInt()-1900);
        
    
    
    return new Persona(nombre, FechaNacimiento);}
    
    public int calcularEdad(Persona p){
        Date FechaActual =new Date();
        
        int EdadActual=FechaActual.getYear()-p.getFechaNacimiento().getYear();
        
    return EdadActual;
    }
    public boolean menorQue(Persona p,int edad){
        boolean res;
        if (calcularEdad(p)<edad) {res=true;
            
        }else res=false;

        
    return res ;
    }
    public void mostrarPersona(Persona p){
        System.out.println(p.getNombre());
        System.out.println(p.getFechaNacimiento().toString());
    
    }
}
