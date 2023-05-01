/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulitilidadesejer3;

import Servicios.ArregloSerivicios;
import java.util.Arrays;

/**
 * Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo
 * B de 20 números reales. Crear la clase ArregloService, en el paquete
 * servicio, con los siguientes métodos: Método inicializarA recibe un arreglo
 * por parámetro y lo inicializa con números aleatorios. Método mostrar recibe
 * un arreglo por parámetro y lo muestra por pantalla. Método ordenar recibe un
 * arreglo por parámetro y lo ordena de mayor a menor. Método inicializarB copia
 * los primeros 10 números del arreglo A en el arreglo B. Luego llenar las
 * últimas 10 posiciones del arreglo B con 0.5. En el Main nuevamente:
 * inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
 *
 * @author Usuario
 */
public class UlitilidadesEjer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double ArregloA[] = new double[50];
        double ArregloB[] = new double[20];
        double ArregloC[]=new double[50];
        ArregloSerivicios as = new ArregloSerivicios();
        as.inicializarA(ArregloA);
        System.out.println("arreglo A normal");
        as.Mostrar(ArregloA);
        
        System.out.println("arreglo A de mayor a menor");
         ArregloA=as.Ordenar(ArregloA);
        System.out.println("");
         as.Mostrar(ArregloA);
        System.out.println("FIIIIIIIIIIIIN");
       as.inicializarB(ArregloA, ArregloB);
        System.out.println("♂♂☺☺☺");
        as.Mostrar(ArregloB);

    }

}
