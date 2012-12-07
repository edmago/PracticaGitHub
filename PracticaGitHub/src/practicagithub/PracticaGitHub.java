/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Unet
 */
public class PracticaGitHub {

    public static cliente[] clienteGlobal;
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clienteGlobal = new cliente[200];
        int indiceCliente = 0;
        
        String opcionmod="0",opcionMenu1="0";
        
        try{
            while(!opcionmod.equals("4"))
            {
                System.out.println("    \033[34mMenú Principal\n");
                System.out.println("    \033[34m1.- \033[39mMódulo Administrativo");
                System.out.println("    \033[34m2.- \033[39mMódulo Cliente");
                System.out.println("    \033[34m3.- \033[39mReportes");
                System.out.println("    \033[34m4.- \033[39mSalir\n");
                InputStreamReader  lector_entrada = new InputStreamReader(System.in);
                BufferedReader  buffer = new BufferedReader(lector_entrada);
                System.out.println("\033[34mIngrese el número de la opción del módulo que desea utilizar: ");
                opcionmod = buffer.readLine();
                
                switch(Integer.parseInt(opcionmod))
                {
                    case 1:
                    {
                       while(!opcionMenu1.equals("5"))
                        {    
                            System.out.println("\n\n        \033[31mMódulo Administrativo\n");
                            System.out.println("        \033[31m1.- \033[39mAgregar Tipo de Cuenta");
                            System.out.println("        \033[31m2.- \033[39mAgregar Tipo de Operación");
                            System.out.println("        \033[31m3.- \033[39mAgregar Cliente");                        
                            System.out.println("        \033[31m4.- \033[39mCrear cuenta Bancaria");
                            System.out.println("        \033[31m5.- \033[39mRegresar al menú anterior");
                            System.out.println("        \033[31m6.- \033[39mSalir");
                            InputStreamReader  lector_entrada2 = new InputStreamReader(System.in);
                            BufferedReader  buffer2 = new BufferedReader(lector_entrada2);
                            System.out.println("\n\033[34mIngrese el número de la opción del menú que desea utilizar: ");
                            opcionMenu1 = buffer2.readLine();
                         
                            switch(Integer.parseInt(opcionMenu1))
                            {
                                case 1:     
                                {
                                    System.out.println("\n\033[31mTipo de Cuenta Insertado");
                                    break;                                                                             
                                }
                                case 2:
                                {
                                    System.out.println("\n\033[31mTipo de Operadción Insertado");
                                    break;                                                                                                                       
                                }
                                case 3:
                                {                                                                                                            
                                    InputStreamReader lector_entrada3 = new InputStreamReader(System.in);
                                    BufferedReader buffer3 = new BufferedReader(lector_entrada3);
                                    System.out.println("Ingrese el Id del Cliente: ");
                                    long idCliente = Long.parseLong(buffer3.readLine());
                                    clienteGlobal[cliente.indiceCli]= new cliente();
                                    clienteGlobal[cliente.indiceCli].createCliente(idCliente);
                                    System.out.println("Agregando Cliente");
                                    break;
                                }
                                case 4:
                                {
                                    System.out.println("\n\033[31mCuenta bancaria registrada");
                                    break;
                                }
                                case 5:
                                {                                   
                                    break;
                                }
                                case 6:
                                {
                                    System.exit(0);
                                }                               
                            }//fin del switch 2 
                        }//fin del while resp2  
                        break;   
                    }
                 }
            }
            
        }catch(Exception e)
        {
            
            }
        }
    }
