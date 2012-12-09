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
    String claveOperacion = "";
    static int indiceCli = 0;
    
    public void createCliente(cliente vecCliente [], long idcli) throws IOException
    {
        idCliente = idcli;
        InputStreamReader  lector_entrada = new InputStreamReader(System.in);
        BufferedReader  buffer = new BufferedReader(lector_entrada); 
        if(getListClientesById(vecCliente,idcli)==0)
        {
            System.out.println("\n\033[34mIntroduzca el nombre del Cliente: ");
            String nombre = buffer.readLine();
            nombreCliente = nombre;
            while(!"0000".equals(claveOperacion) && claveOperacion.length()!=4)
            {
             System.out.println("\n\033[34mIntroduzca clave para operaciones: ");
             claveOperacion = buffer.readLine();
            }
            indiceCli++;
            System.out.println("\n\033[31mCliente Agregado");
        }
    }    
    public int getListClientesById(cliente vecCliente [],long id)
    {
        for(int i=0 ; i<indiceCli; i++)
        {
            if(vecCliente[i].idCliente==id)
            {
                System.out.println("Cliente existe");
                return 1;
                }
                }
        return 0;

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
