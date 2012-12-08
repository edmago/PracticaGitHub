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
}
