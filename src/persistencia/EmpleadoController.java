/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Empleado;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author D_Soft_02
 */
public class EmpleadoController {
    
    EmpleadoJpaController emJPA = new EmpleadoJpaController();
    
    //Método para crear un empleado
    public void crearEmpleado(Empleado empleado){
        try {
            emJPA.create(empleado);
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarEmpleado(int id){
        try {
            emJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(EmpleadoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
