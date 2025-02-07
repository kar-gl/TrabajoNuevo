/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.proyectonuevo.tester;

import ec.edu.espoch.proyectonuevo.vista.Principal;



/**
 *
 * @author SO-LAB1-PC14
 */
public class TesterVista {

    private Principal principal;

    public TesterVista(Principal principal) {
        this.principal = principal;
    }

    public void prueba() {
        System.out.println("Titulo:"+principal.getTitulo());
        System.out.println("Descripcion:"+principal.getDescripcion());
        System.out.println("Estado:"+principal.getEstado());
       
    }
    

}
