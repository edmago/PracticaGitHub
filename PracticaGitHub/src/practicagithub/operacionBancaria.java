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
    public void createOperacionBancaria(long idOper, Long idCli, String clave, int tipoOpB, Long idCuen, float monto, cuentaBancaria cuentaB[])
    {
        float chk;
        int oper=0;
        if(tipoOpB==1 || tipoOpB==3)
        {
            chk = cuenta.checkSaldo(monto, idCuen, cuentaB);
            if(chk>0)
            {    
               System.out.println("Monto"+(monto*(-1)));
                oper=cuenta.actSaldo((monto*(-1)), idCuen, cuentaB);
            }
            else
            {
                System.out.println("Saldo Insuficiente");
            }
        }   
        if(tipoOpB==2)
        {
            oper=cuenta.actSaldo(monto, idCuen, cuentaB);
            chk =cuenta.checkSaldo(monto, idCuen, cuentaB);
            System.out.println("Saldo "+chk);
        }
        if(oper==1)
        {
            this.claveOperacion = clave;
            this.idOperacion = idOper;
            indiceOb ++;
        }                  
    }

    static public void retiroCajero()
    {
        String msjs[]  = new String[6];
        String msj;
        System.out.print("\n");
        System.out.println("   \033[31m#--------------------------------#");
        String tit = "   \033[31m|         \033[31mRetiro por Cajero      |\n";
        System.out.format("\033[34m%18s",tit);
        System.out.println("   \033[31m#--------------------------------#");
        msjs[0] = "   |    1.-  50          2.- 100    |";
        msjs[1] = "\n";
        msjs[2] = "   \033[31m|    3.- 200          4.- 300    |";
        msjs[3] = "\n";
        msjs[4] = "   \033[31m|    5.- 400          6.- 500    |";
        msjs[5] = "\n";
        System.out.format("\033[31m%35s%35s%35s%35s%35s%35s",msjs[0],msjs[1],msjs[2],msjs[3],msjs[4],msjs[5]);
        System.out.println("   \033[31m#--------------------------------#");
        System.out.println("\n     Seleccione el Monto a Retirar\n");
    }
    
}
