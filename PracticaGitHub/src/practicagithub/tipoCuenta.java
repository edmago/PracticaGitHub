/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

/**
 *
 * @author UNET
 */
public class tipoCuenta {
    String descripcion;
    Long idTipocuenta;
    static int indice = 0;
    
    public void addTipoCuenta(long id, String descrip)
    {
        descripcion = descrip;
        idTipocuenta = id;
        indice++;
    }
    
    /**
     *
     * @param tipoC
     */
    static public void getListCuentas(tipoCuenta tipoC[])
    {
        String msjs[]  = new String[2];
        String msj;
        System.out.print("\n");
        String tit = "\n      \033[31mListado de Tipo de Cuentas\n";
        System.out.format("\033[34m%18s",tit);
        msjs[0] = "Id";
        msjs[1] = "Descripción\n\n";
        System.out.format("\033[31m%10s%18s",msjs[0],msjs[1]);
        for(int i=0; i < indice; i++)
        {
            msj = String.format("%10s%18s",tipoC[i].idTipocuenta, tipoC[i].descripcion);
            System.out.println(msj);
        }        
    }
}
