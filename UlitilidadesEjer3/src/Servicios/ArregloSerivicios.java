/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

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
public class ArregloSerivicios {

    public double[] inicializarA(double a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }

        return a;
    }

    public void Mostrar(double a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("[" + a[i] + "]");
        }
        System.out.println("");
    }

    public double[] Ordenar(double a[]) {
        Arrays.sort(a);
        double c[] = new double[a.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[a.length - 1 - i];
            

        }
//        for (int i = 0; i < c.length; i++) {
//            a[i] = c[i];
//            System.out.print("[" + a[i] + "]");
//
//        }
//        for (int i = 0; i <a.length; i++) {
//            a[i]=a[a.length-1-i];
            
        
        return Arrays.copyOf(c, a.length);
    }

    public double[] inicializarB(double a[], double b[]) {
        for (int i = 0; i < 9; i++) {
            b[i] = a[i];

        }

        Arrays.fill(b, 10, 20, 0.5);

        return b;
    }
}
