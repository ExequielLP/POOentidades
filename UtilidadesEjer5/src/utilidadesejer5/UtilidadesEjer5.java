/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidadesejer5;

import Entidades.Persona;
import Servicios.PersonaService;

/**
 *
 * @author Usuario
 */
public class UtilidadesEjer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService ps =new PersonaService();
        Persona p1=ps.crearPersona();
        System.out.println(p1.getFechaNacimiento());
        ps.calcularEdad(p1);
        System.out.println("es meyor? "+ps.menorQue(p1, 40));
        ps.mostrarPersona(p1);
    }
    
}
