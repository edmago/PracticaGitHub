/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

/**
 *
 * @author Ing. Claudia Nieto
 */
public class tipoOperacion {
    String descripcion;
    Long idTipoOperacion;
    int tipo;
    static int indiceTO = 0;
    
    public void addTipoOperacion(long id, int tipoop, String descrip)
    {              
        tipo = tipoop;         
        idTipoOperacion = id;
        descripcion = descrip;
        indiceTO++;
    }    
    static public void getListTipoOperacion(tipoOperacion tipoO[])
    {
        String msjs[]  = new String[3];
        String msj="", tipodesc="";
        System.out.print("\n");
        String tit = "      Listado de Tipo de Operaciones\n\n";
        System.out.format("\033[31m%18s",tit);
        msjs[0] = "Id";
        msjs[1] = "Descripción";
        msjs[2] = "Tipo\n\n";        
        System.out.format("\033[31m%10s%25s%25s",msjs[0],msjs[1],msjs[2]);
        for(int i=0; i < indiceTO; i++)
        {
            if(tipoO[i].tipo==1)                
            {    tipodesc="Retiro";}
            if(tipoO[i].tipo==2)
            {    tipodesc="Depósito";}
            if(tipoO[i].tipo==3)
            {    tipodesc="Retiro Cajero";}
            msj = String.format("%10s%25s%25s",tipoO[i].idTipoOperacion, tipoO[i].descripcion,tipodesc);
            System.out.println(msj);
        }        
    }
    static public void getTipoOperacion(tipoOperacion tipoO[])
    {
        String msjs[]  = new String[3];
        String msj="", tipodesc="";
        System.out.print("\n");
        String tit = "      Tipo de Operaciones\n\n";
        System.out.format("\033[31m%18s",tit);        
        for(int i=0; i < indiceTO; i++)
        {            
            msj = String.format("%10s%25s",(i+1), tipoO[i].descripcion);
            System.out.println(msj);
        }        
    }
    
}
