/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidadesejer6;

import Entidad.Curso;
import Servicios.CursoServicio;

/**
 *
 * @author Usuario
 */
public class UtilidadesEjer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CursoServicio cs=new CursoServicio();
//       Curso c =new Curso();
//       
//       Curso f=cs.crearCurso(c);
//        cs.mostrar(f);
//       cs.calcularGanancias(f);
       // de la otra forma
       Curso c=cs.crearCurso();
       cs.mostrar(c);
       cs.calcularGanancias(c);
    }
    
}
