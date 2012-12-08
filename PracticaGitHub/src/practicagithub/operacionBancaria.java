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
    
    
    public void createOperacionBancaria(Long idCli, String clave, Long tipoOp, Long idCuen, float monto)
    {
        int chk =0;
        chk = cuenta.checkSaldo(monto, idCli, idCuen);
        if (chk == 1)
        {
            this.claveOperacion = clave;
            this.idOperacion = indiceOb + 1;
            indiceOb ++;
            cuenta.actSaldo(monto, idCli, idCuen);
        }

        
    }
    
}
