/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
/**
 *
 * @author Unet
 */
public class cuentaBancaria {
    Date fechaApertura = new Date();
    Long idCuentaBancaria;
    String numeroCuenta;
    tipoCuenta tipo = new tipoCuenta();
    cliente objCliente = new cliente();
    static int indice = 0;
    long saldo;
    
    public void createCuentaBancaria(long idCuen, String nro, long idCli, cliente vecCliente [], tipoCuenta tipoC[]) throws IOException
    {
        
          vecCliente[cliente.indiceCli] = new cliente();
          vecCliente[cliente.indiceCli].createCliente(vecCliente,idCli);  
          objCliente.idCliente = idCli;
          this.idCuentaBancaria = idCuen;
          this.numeroCuenta = nro;
          tipoCuenta.getListCuentas(tipoC);
          System.out.println("\nSeleccione el Tipo de Cuenta");
          InputStreamReader  lector_entrada = new InputStreamReader(System.in);
          BufferedReader  buffer = new BufferedReader(lector_entrada); 
          String tipoCu;
          tipoCu = buffer.readLine();
          this.tipo.idTipocuenta = Long.parseLong(tipoCu);
          indice++;
    }
    
    /**
     *
     * @param idCli
     * @param vecCtas
     */
    public void getListCuentas (long idCli, cuentaBancaria vecCtas[])
    {
        int i;
        String msjs[]  = new String[3];
        String msj="";
        System.out.println("Get cuentas   " + indice);
        
        String tit = "      Listado de Cuentas\n\n";
        System.out.format("\033[31m%18s",tit);
        msjs[0] = "Id";
        msjs[1] = "Descripción";
        System.out.format("\033[31m%10s%25s",msjs[0],msjs[1]);  
        for (i=0 ; i < indice ; i++)
        {
            //System.out.println("Cliente   " + vecCtas[i].objCliente.idCliente + " -- Valor " + idCli); 
            if( vecCtas[i].objCliente.idCliente.equals(idCli))
             {
                 
                 System.out.print("\n");
                       
                 msj = String.format("%10s%25s",vecCtas[i].idCuentaBancaria, vecCtas[i].numeroCuenta);
                 System.out.println(msj);
                 
             }
        }
    }
}
