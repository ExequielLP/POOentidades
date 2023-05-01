/*
 *  Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion Oracle

 */
package Servicios;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class FechaServicio {
    Scanner leer = new Scanner(System.in);
    public Date FechaNacimiento(){
        System.out.println("ingrese su dia de nacimiento");
        int dia=leer.nextInt();
        System.out.println("ingrese su mes de nacimiento");
        int mes=leer.nextInt();
        System.out.println("ingrese su año de nacimiento");
        int anio=leer.nextInt();
    
    
    return new Date(anio-1900, mes-1, dia);
}
    public Date FechaActual(){
    
    return new Date();
    }
    public int Diferencia(Date a,Date b){
        int resultado = a.getYear()-b.getYear();
        System.out.println("la diferencia es"+resultado);
    return resultado;
    }
    
}