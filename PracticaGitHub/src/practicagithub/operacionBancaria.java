/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

import java.util.Date;

/**
 *
 * @author UNET
 */
public class operacionBancaria {
    String  claveOperacion ;
    Date    fechaOperacion = new Date();
    Long    idOperacion;
    cuentaBancaria cuenta = new cuentaBancaria();
    tipoOperacion  tipo  = new tipoOperacion();
    float   montoOp;
    static int indiceOb = 0;        
    public void createOperacionBancaria(long idOper, Long idCli, String clave, int tipoOpB,String opB, Long idCuen, float monto, cuentaBancaria cuentaB[])
    {
        float chk;
        int oper=0;
        if(tipoOpB==1 || tipoOpB==3)
        {
            chk = cuenta.checkSaldo(monto, idCuen, cuentaB);
            if(chk>0)
            {                  
                oper=cuenta.actSaldo((monto*(-1)), idCuen, cuentaB);
            }
            else
            {
                System.out.println("\n\033[31mSaldo Insuficiente");
            }
        }   
        if(tipoOpB==2)
        {
            oper=cuenta.actSaldo(monto, idCuen, cuentaB);
            //chk =cuenta.checkSaldo(monto, idCuen, cuentaB);            
        }
        if(oper==1)
        {
            this.claveOperacion = clave;
            this.idOperacion = idOper;
            cuenta.idCuentaBancaria=idCuen;  
            cuenta.objCliente.idCliente=idCli;
            tipo.idTipoOperacion=Long.parseLong(opB);
            this.montoOp = monto;
            indiceOb ++;
            System.out.println("\n\033[31mOperación Bancaria Registrada");
        }                  
    }
    
    static public void retiroCajero()
    {
        String msjs[]  = new String[6];
        String msj;
        System.out.print("\n");
        System.out.println("   \033[31m#---------------------------------#");
        String tit = "   \033[31m|         \033[31mRetiro por Cajero       |\n";
        System.out.format("\033[34m%18s",tit);
        System.out.println("   \033[31m#---------------------------------#");
        msjs[0] = "   |    1.-  50      2.- 100         |";
        msjs[1] = "\n";
        msjs[2] = "   \033[31m|    3.- 200      4.- 300         |";
        msjs[3] = "\n";
        msjs[4] = "   \033[31m|    5.- 400      6.- Otro Monto  |";
        msjs[5] = "\n";
        System.out.format("\033[31m%35s%35s%35s%35s%35s%35s",msjs[0],msjs[1],msjs[2],msjs[3],msjs[4],msjs[5]);
        System.out.println("   \033[31m#---------------------------------#");
        System.out.println("\n\033[34mSeleccione el Monto a Retirar\n");
    }
    public void ConsultarOperacionesBancarias(Long idCli, Long idCuen, cuentaBancaria cuentaB[],operacionBancaria OpeBanc[])
    {
        String msjs[]  = new String[6];
        String msj;
        msjs[0] = "Fecha";
        msjs[1] = "Tipo de Operación";
        msjs[2] = "Monto";
        System.out.print("\n");        
        for(int i=0; i<indiceOb; i++)
        {            
            if(i==0)
            {
                String tit = "   \033[31m         \033[31mOperaciones Bancarias de la Cuenta "+OpeBanc[i].cuenta.idCuentaBancaria+"\n";
                System.out.format("\033[34m%18s",tit);
                System.out.println("   \033[31m#--------------------------------------------------------------------------------------------------------#");
                System.out.format("\033[31m%35s%35s%35s",msjs[0],msjs[1],msjs[2]);
                System.out.format("\n");  
                System.out.println("   \033[31m|--------------------------------------------------------------------------------------------------------|");              
            }                        
            if(OpeBanc[i].cuenta.objCliente.idCliente.equals(idCli) && OpeBanc[i].cuenta.idCuentaBancaria.equals(idCuen))
            {
                System.out.format("   \033[39m%1s%35s%35s%32s%1s","\033[31m|\033[39m",OpeBanc[i].fechaOperacion,OpeBanc[i].tipo.idTipoOperacion,OpeBanc[i].montoOp,"\033[31m  |");
                System.out.format("\n");                                
            }
        }
        System.out.println("   \033[31m#--------------------------------------------------------------------------------------------------------#");              
   
    }
}
