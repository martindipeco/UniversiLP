/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulpejemplo;

import java.util.List;
import ulpejemplo.accesoDatos.EstudianteData;
import ulpejemplo.accesoDatos.InscripcionData;
import ulpejemplo.entidades.Estudiante;

/**
 *
 * @author marti
 */
public class ULPejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        InscripcionData inscriData = new InscripcionData();
        
        //inscriData.borrarInscripcionMateriaEstudiante(5, 2);
        
        //inscriData.actualizarNota(1, 2, 7);
        
        List<Estudiante> estuds = inscriData.obtenerEstudiantePorMateria(2);
        
        for(Estudiante aux : estuds)
        {
            System.out.println("el estudiante " + aux.getApellido() + ", " + aux.getNombre() +  " está inscripto en la materia");
        }
    }
    
    
}
