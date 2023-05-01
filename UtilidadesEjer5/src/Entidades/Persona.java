/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre;
    private Date FechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date FechaNacimiento) {
        this.nombre = nombre;
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }
    
}
