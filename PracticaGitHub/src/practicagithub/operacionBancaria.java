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
    
}
