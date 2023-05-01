/*
 * Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
 */
package Servicios;

import entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in);

    public Cadena crearFrase() {

        System.out.println("ingrese frase");
        String frase = leer.next();

        return new Cadena(frase);

    }

    public void mostrarVocales(Cadena c) {
        int voc = 0;
        for (int i = 0; i < c.getLongitud(); i++) {

            if (c.getFrase().substring(i, i + 1).equalsIgnoreCase("a") || c.getFrase().substring(i, i + 1).equalsIgnoreCase("e") || c.getFrase().substring(i, i + 1).equalsIgnoreCase("i") || c.getFrase().substring(i, i + 1).equalsIgnoreCase("o") || c.getFrase().substring(i, i + 1).equalsIgnoreCase("u")) {
                voc += 1;

            }

        }

        System.out.println("la cantidad de vocales ingresadas es de " + voc);
    }

    public void VecesRepetida(Cadena c) {
        int cont=0;
        System.out.println("ingrese una letra y le diremos cuantas veces se repite en la frase");
        String frase2 = leer.next();
        for (int i = 0; i < c.getLongitud(); i++) {

            String fraseRep = c.getFrase().substring(i, i+1);
            if (fraseRep.equalsIgnoreCase(frase2)) {cont+=1;
            }
        }
        System.out.println(cont);

    }

    public void FraseInvertido(Cadena c) {
        for (int i = c.getLongitud(); i > 0; i--) {

            System.out.print(c.getFrase().substring(i - 1, i));

        }

        System.out.println("");
    }

    public void compararLongitud(Cadena c) {
        System.out.println("ingrese una segunda frase para comparar con la frase 1");
        String frase2 = leer.next();
        if (c.getLongitud() == frase2.length()) {
            System.out.println("son iguals");

        } else {
            System.out.println("no capo");
        }

    }

    public void unirFrase(Cadena c) {
        System.out.println("ingrese una segunda frase para unir con la primera");
        String frase2 = leer.next();
        System.out.println(c.getFrase().concat(frase2));
    }

    public void reemplazarFrase(Cadena c) {
        System.out.println("ingre simbolo para reemplaza por a la letra ");
        String simbolo = leer.next();

        String recorrido = c.getFrase().replace("a", simbolo);
        System.out.println(recorrido);

    }
    public boolean contiene(Cadena c){
        System.out.println("ingrese una letra para saber si esta o no es su frase");
        String letra=leer.next();
        
    return c.getFrase().contains(letra) ;
    }
}
