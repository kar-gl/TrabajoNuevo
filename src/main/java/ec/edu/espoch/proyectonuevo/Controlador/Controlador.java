/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.proyectonuevo.Controlador;

import ec.edu.espoch.proyectonuevo.vista.Principal;



/**
 *
 * @author TAMMY
 */
public class Controlador {
    private Principal principal;
    private TesterControlador gestorTarea;
    //Cuando hagas conexion con el modelo --> quita los /// de la linea 17
    //private GestorTarea gestorTarea;

    public Controlador(Principal proyectonuevo) {
        this.principal = proyectonuevo;
         //Cambia el constructor de la clase modelo
        this.gestorTarea = new TesterControlador();
    }
 

    public void agregarTarea() {

        try {
            if (this.principal != null) {
                Tarea objTarea = new Tarea();
                objTarea.setTitulo(this.principal.getTitulo());
                objTarea.setDescripcion(this.principal.getDescripcion());
                objTarea.setEstado(this.principal.getEstado());
                gestorTarea.prueba(objTarea);

            } else {
                principal.error("Completa los datos!");
            }
        } catch (Exception e) {
            principal.error("Consulta al ing Pedro");
            //Subirrrr
        }
    }
}

