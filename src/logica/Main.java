/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Date;
import persistencia.EmpleadoController;

/**
 *
 * @author D_Soft_02
 */
public class Main {
    public static void main(String[] args) {
        //Empleado nuevo
        Empleado emp = new Empleado(1, "Ivan", "Bemberg", new Date("06/10/1990"));
        
        //Creamos un objeto de tipo controller para acceder a los controladores
        EmpleadoController control = new EmpleadoController();
        
        control.crearEmpleado(emp);
        
    }
}
