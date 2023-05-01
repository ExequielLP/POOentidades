/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CursoServicio {
    Scanner leer = new Scanner(System.in);
    
    public String[] cargarAlumno(){
       String[] alumno=new String[5];
        for (int i = 0; i <alumno.length; i++) {
            System.out.println("ingrese nombre de alumnos o ponga null si no hay mas");
            alumno[i]=leer.next();
        }
    
    
    return alumno;}
    
    public Curso crearCurso(){
//        System.out.println("ingrese nombre del curso");
//        c.setNombreCurso(leer.next());
//        System.out.println("ingrese cantidad de horas por dia trabaja");
//        c.setCantidadPorHora(leer.nextInt());
//        System.out.println("ingrese cantidad de dias por semana");
//        c.setCantidadDiasPorSemana(leer.nextInt());
//          System.out.println("turno tarde o mañana");
//          c.setTurno(leer.next());
//        System.out.println("ingrese precio por hora");
//        c.setPrecioPorHora(leer.nextDouble());
//        c.setAlumno(cargarAlumno());
        System.out.println("ingrese nombre del curso");
        String nombreCurso=leer.next();
       
        System.out.println("ingrese cantidad de horas por dia trabaja");
       int cantidadHorasPorDia=leer.nextInt();
        System.out.println("ingrese cantidad de dias por semana");
        int cantidadDiasPorSemana=leer.nextInt();
        
        System.out.println("turno tarde o mañana");
        String turno=leer.next();
        System.out.println("ingrese precio por hora");
        double precioPorHora=leer.nextInt();
       
    
    return new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora, cargarAlumno()) ;
}
//   return c; }
    public void mostrar(Curso c){
        System.out.println(c.getNombreCurso());
        System.out.println(c.getCantidadPorHora());
        System.out.println(c.getCantidadDiasPorSemana());
        System.out.println(c.getTurno());
        System.out.println(c.getPrecioPorHora());
        for (int i = 0; i <c.getAlumno().length; i++) {
            System.out.println(c.getAlumno()[i]);
        }
    
    }
    public void calcularGanancias(Curso c){
        int cont=0;
        int res=5;
        for (int i = 0; i <c.getAlumno().length; i++) {
            if (c.getAlumno()[i].equalsIgnoreCase("null")) {  cont+=1;
                res=res-cont;
            }
        }
    double resultado=res*c.getCantidadPorHora()*c.getPrecioPorHora()*c.getCantidadDiasPorSemana();
        System.out.println(resultado);
    }
}
