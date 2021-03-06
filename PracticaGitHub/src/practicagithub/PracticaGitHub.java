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
    public static tipoCuenta[] tipoC;
    public static cuentaBancaria[] cuentaB;
    public static tipoOperacion [] tipoO;
    public static operacionBancaria [] OpeBanc;
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clienteGlobal = new cliente[200];
        tipoC = new tipoCuenta[200];
        cuentaB = new cuentaBancaria[500];
        tipoO =new tipoOperacion[200];
        OpeBanc = new operacionBancaria[1000];        
        String nroCuenta = "C000-";
        String opcionmod = "0";
        int indiceTipoC = 0;
        int indiceCuentaB = 0;
        int indiceTipoO = 0;
        int indiceOpeBanc = 0;
         
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
                                    InputStreamReader  lector_entrada2 = new InputStreamReader(System.in);
                                    BufferedReader  buffer2 = new BufferedReader(lector_entrada2);                  
                                    System.out.println("\n\033[34mIngrese la descripción del Tipo de Cuenta: "); 
                                    String descripcion = buffer2.readLine();
                                    tipoC[indiceTipoC]= new tipoCuenta();
                                    tipoCuenta.indice = indiceTipoC;
                                    tipoC[indiceTipoC].addTipoCuenta((indiceTipoC+1),descripcion);
                                    indiceTipoC++;
                                    System.out.println("\n\033[31mTipo de Cuenta Agregada");
                                    break;                                                                                                                 
                                }
                                case 2:
                                {    
                                    String tipoop;
                                    tipoop = "0";
                                    try{ 
                                        while(Integer.parseInt(tipoop)>3 || Integer.parseInt(tipoop)<1)
                                        {                                           
                                            System.out.println("\n   \033[31m#-----------------------------------------#");
                                            System.out.println("   \033[31m|       Opciones para Operaciones         |");
                                            System.out.println("   \033[31m|-----------------------------------------|");                                            
                                            System.out.println("   \033[31m|        1.- \033[39mRetiro                       \033[31m|");
                                            System.out.println("   \033[31m|        2.- \033[39mDepósito                     \033[31m|");
                                            System.out.println("   \033[31m|        3.- \033[39mRetiro por Cajero            \033[31m|");
                                            System.out.println("   \033[31m#-----------------------------------------#");
                                            System.out.println("\n\033[34mSeleccione la Opción para el Tipo de Operación a crear: ");
                                            tipoop = buffer.readLine();                                         
                                        }
                                        System.out.println("\n\033[34mIntroduzca la descripción del Tipo de Operación: ");                     
                                        String descrip = buffer.readLine();
                                        tipoO[indiceTipoO]= new tipoOperacion();                                                
                                        tipoOperacion.indiceTO = indiceTipoO;
                                        tipoO[indiceTipoO].addTipoOperacion((indiceTipoO+1),Integer.parseInt(tipoop),descrip);
                                        indiceTipoO++;
                                        System.out.println("\n\033[31mTipo de Operación Agregada");   
                                    }
                                    catch(NumberFormatException e)
                                    {
                                        System.out.println("\033[31mOpción de Tipo de Operación no Válida");
                                    }
                                                                    
                                    break;                                                                                                                       
                                }
                                case 3:
                                {                                                                                                            
                                    try
                                    {
                                    System.out.println("\n\033[34mIngrese el Id del Cliente: ");
                                    long idCliente = Long.parseLong(buffer.readLine());
                                    clienteGlobal[cliente.indiceCli]= new cliente();
                                    clienteGlobal[cliente.indiceCli].createCliente(clienteGlobal,idCliente);                                    
                                    }
                                    catch(NumberFormatException e)
                                    {
                                        System.out.println("        \033[31mDebe introducir un numerico");                                        
                                    }
                                    break;
                                }
                                case 4:
                                {
                                    try
                                    {
                                    InputStreamReader  lector_entrada2 = new InputStreamReader(System.in);
                                    BufferedReader  buffer2 = new BufferedReader(lector_entrada2);                  
                                    System.out.println("\n\033[34mIngrese el Id del Cliente: ");
                                    int indConca = indiceCuentaB + 1;
                                    nroCuenta = nroCuenta + indConca;
                                    int idCliente = Integer.parseInt(buffer2.readLine());
                                    cuentaB[indiceCuentaB]= new cuentaBancaria();
                                    cuentaB[indiceCuentaB].createCuentaBancaria((indiceCuentaB+1),nroCuenta,idCliente,clienteGlobal,tipoC);
                                    indiceCuentaB = cuentaBancaria.indice;
                                    }
                                    catch(NumberFormatException e)
                                    {
                                        System.out.println("        \033[31mDebe introducir un numerico");                                        
                                    }
                                    break;
                                }
                                case 5:
                                {                                   
                                    //Regresa al men{u anterior
                                    break;
                                }
                                case 6:
                                {
                                    //Salir
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
                            System.out.println("\n\033[34mIngrese el número de la opción del menú que desea utilizar: ");
                            opcionMenu2 = buffer.readLine();                       
                            switch(Integer.parseInt(opcionMenu2)) // Modulo Clientes
                            {
                                case 1: // Crea Cuenta Bancaria
                                {                                                                         
                                    InputStreamReader  lector_entrada2 = new InputStreamReader(System.in);
                                    BufferedReader  buffer2 = new BufferedReader(lector_entrada2);                  
                                    System.out.println("\n\033[34mIngrese el Id del Cliente: ");
                                    nroCuenta = nroCuenta + indiceCuentaB;
                                    int idCliente = Integer.parseInt(buffer2.readLine());
                                    cuentaB[indiceCuentaB]= new cuentaBancaria();
                                    cuentaB[indiceCuentaB].createCuentaBancaria((indiceCuentaB+1),nroCuenta,idCliente,clienteGlobal,tipoC);
                                    indiceCuentaB = cuentaBancaria.indice;                                    
                                    break;
                                }
                                case 2: // Realiza Operacion Bancaria
                                {
                                    System.out.println("\n\033[34mIngrese el Id del Cliente: ");
                                    String idCliente = buffer.readLine();
                                    //System.out.printnl(cuentaB[indiceCuentaB].objCliente.nombreCliente());
                                    int i, cli=-1;
                                    int bandclav=0;
                                    int tipoOpB;
                                    String clave = "";
                                    for (i = 0; i < cliente.indiceCli ; i++)
                                    {
                                        if(clienteGlobal[i].getClienteId()==Integer.parseInt(idCliente))
                                        {                                            
                                            System.out.println("\n\033[34mNombre del Cliente: "+clienteGlobal[i].nombreCliente);
                                            System.out.println("\n\033[34mIngrese la Clave de Operaciones Bancarias: ");
                                            clave = buffer.readLine();
                                            if(clienteGlobal[i].claveOperacion.equals(clave))
                                            {
                                                bandclav = 1;                                               
                                            }    
                                            cli= i;
                                        }                                       
                                    }
                                    
                                    if(cli==-1)
                                    {
                                        System.out.println("\n\033[31mCliente no Existe");
                                        break;
                                    }    
                                    if(bandclav==0)
                                    {
                                        System.out.println("\n\033[31mClave de Operaciones Incorrecta");
                                        break;
                                    }
                                    int exis=0;
                                    String cuenta;
                                    cuenta="";
                                    while(exis==0)
                                    {
                                        cuentaB[indiceCuentaB]= new cuentaBancaria();
                                        cuentaB[cuentaBancaria.indice].getListCuentas (Long.parseLong(idCliente), cuentaB);
                                        System.out.println("\n\033[34mSeleccione el Id de la Cuenta Bancaria a Utilizar: ");
                                        cuenta = buffer.readLine();
                                        exis=cuentaB[cuentaBancaria.indice].validarcuenta(cuentaB, Long.parseLong(cuenta));
                                        if(exis==0)
                                        {
                                            System.out.println("\n\033[31mOpción no Valida");
                                        }
                                    }
                                    int exisop;
                                    exisop=0;
                                    String opB;
                                    opB="";
                                    while(exisop==0)
                                    {
                                        tipoOperacion.getTipoOperacion(tipoO);
                                        System.out.println("\n\033[34mIngrese Tipo de Operación Bancaria a realizar: ");                                       
                                        opB = buffer.readLine();         
                                        exisop=tipoOperacion.validartipoOpe(tipoO, Long.parseLong(opB));
                                        if(exisop==0)
                                        {
                                              System.out.println("\n\033[31mOpción no Valida");
                                        }    
                                    }                                        
                                    tipoOpB = tipoOperacion.getTipoOp(Long.parseLong(opB), tipoO);  
                                    
                                    switch (tipoOpB) // Seleccion del Tipo de Operacion a Realizar
                                    {
                                        case 0:
                                        {
                                            System.out.println("\n\033[31mTipo de Operacion No Valido");
                                            break;
                                        }
                                        case 1: //Tipo Retiro
                                        {   
                                            System.out.println("\n\033[34mIngrese el monto de la Operación a realizar: ");
                                            String monto = buffer.readLine();
                                            OpeBanc[indiceOpeBanc] = new operacionBancaria();
                                            OpeBanc[indiceOpeBanc].createOperacionBancaria((indiceOpeBanc+1), Long.parseLong(idCliente), clave, tipoOpB,opB, tipoO, Long.parseLong(cuenta), Float.parseFloat(monto), cuentaB);
                                            indiceOpeBanc++;
                                            break;
                                        }
                                        case 2: //Tipo  Deposito
                                        { 
                                            System.out.println("\n\033[34mIngrese el monto de la Operación a realizar: ");
                                            String monto = buffer.readLine();
                                            OpeBanc[indiceOpeBanc] = new operacionBancaria();
                                            OpeBanc[indiceOpeBanc].createOperacionBancaria((indiceOpeBanc+1), Long.parseLong(idCliente), clave, tipoOpB,opB, tipoO, Long.parseLong(cuenta), Float.parseFloat(monto), cuentaB);
                                            indiceOpeBanc++;
                                            break;                                           
                                        }
                                        case 3: //Tipo Retiro Cajero
                                        {
                                            String monto;
                                            monto = operacionBancaria.retiroCajero();
                                            OpeBanc[indiceOpeBanc] = new operacionBancaria();
                                            OpeBanc[indiceOpeBanc].createOperacionBancaria((indiceOpeBanc+1), Long.parseLong(idCliente), clave, tipoOpB,opB, tipoO, Long.parseLong(cuenta), Float.parseFloat(monto), cuentaB);
                                            indiceOpeBanc++;
                                            break;
                                        }
                                    }

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
                            System.out.println("    \033[31m4.- \033[39mListado de Cuentas pot Tipo");
                            System.out.println("    \033[31m5.- \033[39mListado de Tipo de Operaciones");
                            System.out.println("    \033[31m6.- \033[39mListado de Tipo de Cuentas");                            
                            System.out.println("    \033[31m7.- \033[39mRegresar al menú anterior");
                            System.out.println("    \033[31m8.- \033[39mSalir");
                            System.out.println("\n\033[34mIngrese el número del Reporte que desea visualizar: ");
                            opcionMenu3 = buffer.readLine();
                            switch(Integer.parseInt(opcionMenu3))
                            {
                                case 1:
                                {
                                    int i;
                                    int impreso = 0;
                                    String DesCuenta = "";
                                    Long IdCliente;
                                    InputStreamReader  lector_entrada_idCli = new InputStreamReader(System.in);
                                    BufferedReader  buffer_idCli = new BufferedReader(lector_entrada_idCli);
                                    System.out.println("\033[34mIngrese el Id del Cliente a Consultar: ");
                                    IdCliente = Long.parseLong(buffer_idCli.readLine());
                                    for (i = 0; i < cliente.indiceCli ; i++)
                                    {
                                       if(IdCliente.compareTo(clienteGlobal[i].getClienteId()) == 0)
                                       {
                                           System.out.println("\033[31mId del Cliente    : "+ clienteGlobal[i].getClienteId());
                                           System.out.println("\033[31mNombre del Cliente: "+ clienteGlobal[i].getClienteNom());
                                           for (int j = 0; j < cuentaBancaria.indice; j++)
                                           {
                                               if (IdCliente.compareTo(cuentaB[j].getClienteCuenta()) == 0)
                                               {
                                                   if (impreso == 0)
                                                   {
                                                       System.out.println("   \033[31m#-------------------------------------------------------------------------------------#");
                                                       System.out.println("   \033[31m|Nro de Cuenta        Tipo Cuenta         Fecha Apertura                    Saldo     |");   
                                                       System.out.println("   \033[31m|-------------------------------------------------------------------------------------|");
                                                       impreso = 1;
                                                   }
                                                   for(int k=0;k<tipoCuenta.indice ;k++)
                                                   {
                                                       if(cuentaB[j].getDescTipoCta().compareTo(tipoC[k].getIdTipocuenta())==0)
                                                       {
                                                           DesCuenta = tipoC[k].getDescripcionTipoCta();
                                                       }
                                                   }
                                                   System.out.println("   \033[39m|"+String.format("%-15s",cuentaB[j].getNroCuenta()) + "        " + String.format("%-10s",DesCuenta) + "        " +String.format("%-15s",cuentaB[j].getFechaApertura()) + "        " + String.format("%-8s",cuentaB[j].getSaldo())+"|");
                                               }
                                           }
                                           System.out.println("   \033[31m#-------------------------------------------------------------------------------------#");
                                       }
                                    }
                                    break;
                                }
                                case 2:
                                {
                                    System.out.println("\n\033[34mIngrese el Id del Cliente: ");
                                    String idCliente = buffer.readLine();
                                    int i,cli;
                                    cli=-1;
                                    for (i = 0; i < cliente.indiceCli ; i++)
                                    {
                                        if(clienteGlobal[i].getClienteId()==Integer.parseInt(idCliente))
                                        {                                                                                        
                                            cli= i;
                                        }                                       
                                    }                                    
                                    if(cli==-1)
                                    {
                                        System.out.println("\n\033[31mCliente no Existe");
                                        break;
                                    }
                                    int exis=0;
                                    String cuenta;
                                    cuenta="";
                                    while(exis==0)
                                    {
                                        cuentaB[indiceCuentaB]= new cuentaBancaria();                                    
                                        cuentaB[cuentaBancaria.indice].getListCuentas(Long.parseLong(idCliente), cuentaB);
                                        System.out.println("\n\033[34mSeleccione el Id de la Cuenta Bancaria a la que desea ver las Operaciones Bancarias: ");
                                        cuenta = buffer.readLine();                                           
                                        exis=cuentaB[cuentaBancaria.indice].validarcuenta(cuentaB, Long.parseLong(cuenta));
                                        if(exis==0)
                                        {
                                            System.out.println("\n\033[31mOpción no Valida");
                                        }
                                    }
                                    OpeBanc[indiceOpeBanc] = new operacionBancaria();
                                    OpeBanc[indiceOpeBanc].ConsultarOperacionesBancarias(Long.parseLong(idCliente), Long.parseLong(cuenta), cuentaB, OpeBanc);
                                    break;
                                }
                                case 3:
                                {
                                    int i;
                                    int impreso = 0;
                                    for (i = 0; i < cliente.indiceCli ; i++)
                                    {
                                        if (impreso == 0)
                                        {
                                            System.out.println("   \033[31m#-----------------------------------------------------#");
                                            System.out.println("   \033[31m|        Id                        Cliente            |");   
                                            System.out.println("   \033[31m|-----------------------------------------------------|");
                                            impreso = 1;
                                        }
                                        System.out.println("   \033[39m|         "+String.format("%-12s",clienteGlobal[i].getClienteId()) + "       " +String.format("%-25s",clienteGlobal[i].getClienteNom())+"|");
                                    }
                                    System.out.println("   \033[31m#-----------------------------------------------------#");
                                    break;
                                }   
                                case 4:
                                {
                                    tipoCuenta.getListCuentas(tipoC);
                                    System.out.println("\n\033[34mSeleccione el Tipo de Cuenta que desea ver:");
                                    Long tipoCu;
                                    String DesCuenta= "";
                                    String NomCliente = "";
                                    int impreso = 0;
                                    tipoCu = Long.parseLong(buffer.readLine());                                    
                                    for(int i=0;i<cuentaBancaria.indice;i++)
                                    {
                                        if(tipoCu.compareTo(cuentaB[i].getDescTipoCta())==0)
                                        {
                                            for(int k=0;k<tipoCuenta.indice ;k++)
                                            {
                                               if(cuentaB[i].getDescTipoCta().compareTo(tipoC[k].getIdTipocuenta())==0)
                                               {
                                                  DesCuenta = tipoC[k].getDescripcionTipoCta();
                                               }
                                            }
                                            for(int j=0;j<cliente.indiceCli;j++)
                                            {
                                               if(cuentaB[i].getClienteCuenta().compareTo(clienteGlobal[j].getClienteId())==0)
                                               {
                                                  NomCliente = clienteGlobal[j].getClienteNom();
                                               }
                                            
                                            }
                                            if(impreso==0)
                                            {
                                                System.out.println("   \033[31m#-----------------------------------------------------------------------------------------------------------------#");
                                                System.out.println("   \033[31m|Nro de Cuenta        Tipo Cuenta         Fecha Apertura                        Saldo           Cliente           |");   
                                                System.out.println("   \033[31m|-----------------------------------------------------------------------------------------------------------------|");
                                               impreso = 1;
                                            }
                                            System.out.println("   \033[31m|\033[39m"+String.format("%-15s",cuentaB[i].getNroCuenta()) + "        " + String.format("%-10s",DesCuenta) + "        " +String.format("%-15s",cuentaB[i].getFechaApertura()) + "           " + String.format("%-11s",cuentaB[i].getSaldo())+ "    " + String.format("%-15s",NomCliente)+"\033[31m   |");
                                        }
                                    }
                                    System.out.println("   \033[31m#-----------------------------------------------------------------------------------------------------------------#");
                                    break;
                                }
                                case 5:
                                {
                                    tipoOperacion.getListTipoOperacion(tipoO);
                                    break;                                    
                                }
                                case 6:
                                {
                                    tipoCuenta.getListCuentas(tipoC);
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
