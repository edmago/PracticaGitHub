/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

/**
 *
 * @author Ing. Claudia Nieto
 */
public class tipoOperacion {
    String descripcion;
    Long idTipoOperacion;
    int tipo;
    static int indiceTO = 0;
    
    public void addTipoOperacion(long id, int tipoop, String descrip)
    {              
        tipo = tipoop;         
        idTipoOperacion = id;
        descripcion = descrip;
        indiceTO++;
    }    
    
}
