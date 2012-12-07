/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Unet
 */
public class cliente {
    Long idCliente;
    String nombreCliente;
    static int indiceCli = 0;
    
    public void createCliente(long idcli) throws IOException
    {
        idCliente = idcli;
        InputStreamReader  lector_entrada = new InputStreamReader(System.in);
        BufferedReader  buffer = new BufferedReader(lector_entrada); 
        System.out.println("Introduzca el nombre del Cliente: ");
        String nombre = buffer.readLine();
        nombreCliente = nombre;
        indiceCli++;
    }    
    public Long getClienteId()
    {
        return (idCliente);
    }

    public String getClienteNom()
    {
        return (nombreCliente);
    }
}
