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
    
   static public int getTipoCuentaById(tipoCuenta vecTipoCuenta [],long id)
    {
        for(int i=0 ; i<indice; i++)
        {
            if(vecTipoCuenta[i].idTipocuenta==id)
            {
              return 1;
              }
        }
        return 0;

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
        System.out.println("   \033[31m#------------------------------#");
        msjs[0] = "\033[31m   |      Id";
        msjs[1] = "\033[31m       Descripción    |\n";
        System.out.format("\033[31m%10s%18s",msjs[0],msjs[1]);
        System.out.println("   \033[31m|------------------------------|");
        for(int i=0; i < indice; i++)
        {            
            msj = String.format("\033[31m%8s%18s",tipoC[i].idTipocuenta,tipoC[i].descripcion);            
            System.out.println("   |"+msj+"    |");
        }  
        System.out.println("   \033[31m#------------------------------#");
    }
    
    public String getDescripcionTipoCta()
    {
        return(descripcion);    
    }    
    
    public Long getIdTipocuenta()
    {
        return(idTipocuenta);
    }
}
