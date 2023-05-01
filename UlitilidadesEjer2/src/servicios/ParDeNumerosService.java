package servicios;

import entidades.ParDeNumeros;
import java.util.Scanner;

/**
 * Realizar una clase llamada ParDeNumeros que tenga como atributos dos números
 * reales con los cuales se realizarán diferentes operaciones matemáticas. La
 * clase debe tener un constructor vacío, getters y setters. En el constructor
 * vacío se usará el Math.random para generar los dos números. Crear una clase
 * ParDeNumerosService, en el paquete Servicios, que deberá además implementar
 * los siguientes métodos: Método mostrarValores que muestra cuáles son los dos
 * números guardados. Método devolverMayor para retornar cuál de los dos
 * atributos tiene el mayor valor Método calcularPotencia para calcular la
 * potencia del mayor valor de la clase elevado al menor número. Previamente se
 * deben redondear ambos valores. Método calculaRaiz, para calcular la raíz
 * cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se
 * debe obtener el valor absoluto del número.
 *
 *
 * @author Usuario
 */
public class ParDeNumerosService {

    Scanner leer = new Scanner(System.in);

    public void MostrarValores(ParDeNumeros p) {
        System.out.println(p.getNum1());
        System.out.println(p.getNum2());

    }

    public void MayorValor(ParDeNumeros p) {
        System.out.println("el de mayor valor es " + Math.max(p.getNum1(), p.getNum2()));
    }

    public void CalcularPotencia(ParDeNumeros p) {
        int numMax = Math.round(Math.max(p.getNum1(), p.getNum2()));
        int numMin = Math.round(Math.min(p.getNum1(), p.getNum2()));
        double resultado = Math.pow(numMax, numMin);
        System.out.println("resultado es " + resultado);
    }

    public void Raiz(ParDeNumeros p) {
        
        double numMin = Math.min(p.getNum1(), p.getNum2());
        Math.abs(numMin);
        System.out.println(Math.sqrt(numMin));
        

    }
}
