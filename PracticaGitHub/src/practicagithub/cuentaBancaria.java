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
    int existe = 0;
    float saldo;
    
    public void createCuentaBancaria(long idCuen, String nro, long idCli, cliente vecCliente [], tipoCuenta tipoC[]) throws IOException
    {
        
        if(tipoCuenta.indice==0)
        {
            System.out.println("\nNo existen tipos de Cuenta. Debe existir al menos un tipo para crear una Cuenta Bancaria");
        }
        else
            {
            vecCliente[cliente.indiceCli] = new cliente();
            vecCliente[cliente.indiceCli].createCliente(vecCliente,idCli);  
            objCliente.idCliente = idCli;
            this.idCuentaBancaria = idCuen;
            this.numeroCuenta = nro;
            tipoCuenta.getListCuentas(tipoC);

             while(existe==0)
             {
              try{
               System.out.println("\n\033[34mSeleccione el Tipo de Cuenta:");
                InputStreamReader  lector_entrada = new InputStreamReader(System.in);
                BufferedReader  buffer = new BufferedReader(lector_entrada); 
                String tipoCu;
                tipoCu = buffer.readLine();
                 existe = tipoCuenta.getTipoCuentaById(tipoC,Long.parseLong(tipoCu));    
                   if(existe==1)
                      {
                       this.tipo.idTipocuenta = Long.parseLong(tipoCu);
                      }
                   else
                      {
                       System.out.println("         \033[31mOpcion incorrecta. Debe debe seleccionar un tipo del listado anterior.");  
                      }
                 }    
            catch(NumberFormatException e)
            {
                System.out.println("         \033[31mError en la selección. Debe introducir un numerico");
                existe = 0;
            }
          }
        
        indice++;
        System.out.println("\n\033[31mCuenta Bancaria Registrada");     
       }
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
        String msj;               
        String tit = "      Listado de Cuentas\n\n";
        System.out.format("\033[31m%18s",tit);
        System.out.println("   \033[31m#------------------------------------------------------------#");
        msjs[0] = "    Id";
        msjs[1] = "               Num. Cuenta                        |";
        System.out.format("\033[31m%1s%10s%20s","   |",msjs[0],msjs[1]);
        System.out.println("\n   \033[31m|------------------------------------------------------------|");
        for (i=0 ; i < indice ; i++)
        {            
            if( vecCtas[i].objCliente.idCliente.equals(idCli))
             {                                                       
                 msj = String.format("%12s%20s",vecCtas[i].idCuentaBancaria, vecCtas[i].numeroCuenta);
                 System.out.println("   \033[31m|"+msj+"                            |");
                 
             }
        }
        System.out.println("   \033[31m#------------------------------------------------------------#");
    }
    
    public float checkSaldo(float monto, long idCuen, cuentaBancaria cuentaB[])           
    {
        for(int i=0;i<indice;i++)
        {
           if(cuentaB[i].idCuentaBancaria==idCuen && cuentaB[i].saldo>monto)
           {
               return cuentaB[i].saldo;
           }          
        }
        return 0;
    }
    public int actSaldo(float monto, Long idCuen, cuentaBancaria cuentaB[])
    {
        for(int i=0;i<indice;i++)
        {           
           if(cuentaB[i].idCuentaBancaria==idCuen)
           {               
               cuentaB[i].saldo=cuentaB[i].saldo+monto;               
               return 1;
           }          
        }
        return 0; 
    }
    public Long getClienteCuenta()
    {
        return(objCliente.idCliente);
    }
    
    public Long getDescTipoCta()
    {
        return(tipo.idTipocuenta);
    }
    
    public Date getFechaApertura()
    {
        return(fechaApertura);
    }

    public float getSaldo()
    {
        return(saldo);
    }
    
    public String getNroCuenta()
    {
        return(numeroCuenta);
    }
}
