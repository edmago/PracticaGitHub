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
        
        String opcionmod = "0";
        
        InputStreamReader  lector_entrada = new InputStreamReader(System.in);
        BufferedReader  buffer = new BufferedReader(lector_entrada);
        
        try{
            while(!opcionmod.equals("4"))
            {
                System.out.println("    \033[34mMenú Principal\n");
                System.out.println("    \033[34m1.- \033[39mMódulo Administrativo");
                System.out.println("    \033[34m2.- \033[39mMódulo Cliente");
                System.out.println("    \033[34m3.- \033[39mReportes");
                System.out.println("    \033[34m4.- \033[39mSalir\n");
                
                System.out.println("\033[34mIngrese el número de la opción del módulo que desea utilizar: ");
                
                opcionmod = buffer.readLine();
                
                switch(Integer.parseInt(opcionmod))
                {
                    case 1: //Menu del módulo administrativo
                    {
                      String opcionMenu1 = "0";  
                       while(!opcionMenu1.equals("5"))
                        {    
                            System.out.println("\n\n        \033[31mMódulo Administrativo\n");
                            System.out.println("        \033[31m1.- \033[39mAgregar Tipo de Cuenta");
                            System.out.println("        \033[31m2.- \033[39mAgregar Tipo de Operación");
                            System.out.println("        \033[31m3.- \033[39mAgregar Cliente");                        
                            System.out.println("        \033[31m4.- \033[39mCrear cuenta Bancaria");
                            System.out.println("        \033[31m5.- \033[39mRegresar al menú anterior");
                            System.out.println("        \033[31m6.- \033[39mSalir");
                            System.out.println("\n\033[34mIngrese el número de la opción del menú que desea utilizar: ");
                            opcionMenu1 = buffer.readLine();
                         
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
                                    System.out.println("Ingrese el Id del Cliente: ");
                                    long idCliente = Long.parseLong(buffer.readLine());
                                    clienteGlobal[cliente.indiceCli]= new cliente();
                                    clienteGlobal[cliente.indiceCli].createCliente(idCliente);
                                    System.out.println("Cliente agegado");
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
                    }//Fin del case 1 del menu principal 
                        
                   case 2: //Menu del módulo de Clientes
                    {
                     String opcionMenu2 = "0";     
                     while(!opcionMenu2.equals("3"))
                        {
                            System.out.println("\n\n        \033[31mMódulo Cliente\n");
                            System.out.println("        \033[31m1.- \033[39mCrear cuenta Bancaria");
                            System.out.println("        \033[31m2.- \033[39mOperación Bancaria");   
                            System.out.println("        \033[31m3.- \033[39mRegresar al menú anterior");
                            System.out.println("        \033[31m4.- \033[39mSalir");
                            System.out.println("\033[34mIngrese el número de la opción del menú que desea utilizar: ");
                            opcionMenu2 = buffer.readLine();                       
                            switch(Integer.parseInt(opcionMenu2))
                            {
                                case 1:     
                                {                                                                         
                                    System.out.println("Creando Cuenta Bancaria");
                                    break;
                                }
                                case 2:
                                {
                                    System.out.println("Operacion Bancaria");
                                    break; 
                                }    
                                case 3:
                                {                                   
                                    break; 
                                }    
                                case 4:
                                {
                                    System.exit(0);
                                }
                            }
                        }
                        break;
                   
                   }//Fin del Case3 del menu principal
                       
                   case 3: //Menu de Reportes
                    {
                       String opcionMenu3 = "0";
                       while(!opcionMenu3.equals("7"))
                        {
                            System.out.println("\n\n        \033[31mReportes\n");
                            System.out.println("    \033[31m1.- \033[39mConsulta de Usuario");
                            System.out.println("    \033[31m2.- \033[39mEstado de Cuenta");
                            System.out.println("    \033[31m3.- \033[39mListado de Usuarios");
                            System.out.println("    \033[31m4.- \033[39mListado de Cuentas");
                            System.out.println("    \033[31m5.- \033[39mListado de Tipo de Operaciones");
                            System.out.println("    \033[31m6.- \033[39mListado de Tipo de Cuentas");
                            System.out.println("    \033[31m7.- \033[39mRegresar al menú anterior");
                            System.out.println("    \033[31m8.- \033[39mSalir");
                            System.out.println("\033[34mIngrese el número del Reporte que desea visualizar: ");
                            opcionMenu3 = buffer.readLine();
                            switch(Integer.parseInt(opcionMenu3))
                            {
                                case 1:
                                {
                                    break;
                                }
                                case 3:
                                {
                                    break;
                                }                                
                                case 6:
                                {
                                    break;
                                }
                                case 7:
                                {
                                    break;
                                }
                                case 8:
                                {
                                    System.exit(0);
                                }                                
                            }//fin del switch case 3 del menu principal    
                        }//fin del while opcionMenu3
                        break;
                   }//Fin del Case3 del menu principal     
                 } //Fin del switch principal
            }//Fin del while principal
        }catch(Exception e)
        {
            
            }
        }
    }
