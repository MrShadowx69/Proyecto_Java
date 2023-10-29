
package com.mycompany.proyectoprogra;

import javax.swing.JOptionPane;


public class Modulo_Proveedor_EmpresasAsociadas {
    
         //MENU de la opcion proveedores
    public void MENU (){
    AddRemLook moduloEmpresa = new AddRemLook(10);
    AddRemLookTransporte moduloTransporte = new AddRemLookTransporte(10);//
    AddRemLookGuias moduloGuias = new AddRemLookGuias(10);
    AddRemLookInventario moduloInventario = new AddRemLookInventario(10);
    int  opciones;
    int opcionesEmpresa;
    int opcionesTransporte;
    int opcionesGuiasTuristicos;
    int opcionesInventario;
    do {
        opciones =Integer.parseInt( JOptionPane.showInputDialog(null, 
                                        "1- Empresas \n"
                                        + "2- Transportes \n"
                                        + "3- Guias turisticos\n"
                                        + "4- Inventario de Cocina y Toxicos\n"
                                        +"5 Salir", "Proovedores y Empresas Asociadas",JOptionPane.PLAIN_MESSAGE));
                         switch (opciones) {
                             case 1:
                                 //Lista de empleados
                                 do {                                     
                                 opcionesEmpresa =Integer.parseInt( JOptionPane.showInputDialog(null, 
                                        "1- Empresas Asociadas\n"
                                        + "2- Añadir Empresas\n"
                                        + "3- Borrar Empresas\n"
                                        + "4- Actualizar informacion\n"
                                        +"5- Salir"));
                                 
                                     switch (opcionesEmpresa) {
                                         case 1:
                                             moduloEmpresa.mostrarEmpresas();
                                             break; 
                                         case 2:
                                             String Nombre=JOptionPane.showInputDialog("Digite el nombre de la empresa");
                                             String TypeProducto=JOptionPane.showInputDialog("Que tipo de producto");
                                             int Numero= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la empresa"));
                                             String Correo=JOptionPane.showInputDialog("Digite el correo de la empresa");
                                             String Contacto=JOptionPane.showInputDialog("Digite el nombre de la persona a contactar");
                                             Empresa info = new Empresa(Nombre,TypeProducto,Numero,Correo,Contacto);
                                             moduloEmpresa.AddEmpresa(info);
                                             break;
                                         case 3:
                                             String NomEmpresa =  JOptionPane.showInputDialog("Digite el nombre de la Empresa a eliminar");
                                             if (NomEmpresa != null) {
                                                 moduloEmpresa.deleteEmpresa(NomEmpresa);
                                                 break;
                                             }//Fin del IF
                                         case 4: 
                                             String NombreUpdate = JOptionPane.showInputDialog("Digite el nombre de la empresa que deseas modificar");
                                             moduloEmpresa.update(NombreUpdate);
                                             break;
                                         case 5:
                                             //Salir de la opcion
                                             break;
                                     }//Fin del Switch
      
                                   } while (opcionesEmpresa != 5);//Fin del Do While del Case 1 (Empresas Asociadas)
                                break;
//-----------------------------------------------------------------------------------------------------------------------------------------------------
                             case 2:
                                 //Transportes
                                 do{
                                        opcionesTransporte =Integer.parseInt( JOptionPane.showInputDialog(null, 
                                        "1- Ver Destinos \n"
                                        + "2- Añadir destino\n"
                                        + "3- Borrar destino\n"
                                        + "4- Actualizar destino \n"
                                        +"5- Salir"));
                                        switch (opcionesTransporte) {
                                         case 1:
                                             moduloTransporte.mostrarDestinos();
                                             break;
                                         case 2:
                                             String Compañia = JOptionPane.showInputDialog("Digite el nombre de la empresa de transporte");
                                             String Conductor = JOptionPane.showInputDialog("Digite el nombre del conductor");
                                             int NumBus = Integer.parseInt(JOptionPane.showInputDialog("Dijite el numero de bus"));
                                             String Destino = JOptionPane.showInputDialog("Digite el destino");
                                             String SizeBuses = JOptionPane.showInputDialog("Digite el tamaño del vehiculo\n"+"Grande\n"+"Mediano\n"+"Buseta\n"+"Taxi");
                                             Transportes info = new Transportes (Compañia,Conductor,NumBus,Destino,SizeBuses);
                                             moduloTransporte.AddDestino(info);
                                             break;
                                         case 3:
                                             String Nombre = JOptionPane.showInputDialog("Digite el nombre del destino a Eliminar");
                                             moduloTransporte.deleteDestino(Nombre);
                                             break;
                                         case 4:    
                                             String NombreDestino = JOptionPane.showInputDialog("Digite el nombre del destino a modifiacar");
                                             moduloTransporte.Modificar(NombreDestino);
                                             break;
                                     }//Fin del Switch
                                 }while (opcionesTransporte != 5);//Fin del Do While de Case 2 (TRANSPORTES)
                                 break;
//-----------------------------------------------------------------------------------------------------------------------------------------------------    
                             
                             case 3:
                                 //Guias turisticos 
                                 do {                                     
                                     opcionesGuiasTuristicos =Integer.parseInt( JOptionPane.showInputDialog(null, 
                                        "1- Ver Guias \n"
                                        + "2- Añadir Guia turistico\n"
                                        + "3- Borrar Guia turistico\n"
                                        + "4- Actualizar info \n"
                                        +"5- Salir"));
                                     switch (opcionesGuiasTuristicos) {
                                         case 1:
                                             moduloGuias.MostrarGuias();
                                             break;
                                         case 2:
                                             String Nombre = JOptionPane.showInputDialog("Digite el nombre del guia turistico");
                                             int AnosDeXP =Integer.parseInt(JOptionPane.showInputDialog("Digite Los años de experiencia")); 
                                             String[] ArregloIdiomas = new String[3]; // Creacion del arreglo para preguntar solo 3 veces los idiomas 
                                             for (int i = 0; i < 3; i++) {
                                                 String idioma =JOptionPane.showInputDialog("Digite el idioma #"+(i+1)+"\nDeja en blanco para salir");
                                                 if (idioma.isEmpty()) {
                                                     break;
                                                 }//Fin del IF
                                                 ArregloIdiomas[i] = idioma;
                                             }//Fin del FOR
                                             if (ArregloIdiomas[2] != null) {
                                                 JOptionPane.showMessageDialog(null,"Limite de idiomas es de 3");
                                             }//Fin del IF de advertencia si se pasa de 3
                                             int codigoID = GuiasTuristicos.NumID();
                                             GuiasTuristicos info = new GuiasTuristicos(codigoID,Nombre,ArregloIdiomas,AnosDeXP);
                                             moduloGuias.AddGuias(info);
                                             break;
                                         case 3:
                                             int DeleteID = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del Guia que desea borrar"));
                                             moduloGuias.Delete(DeleteID);
                                             break;
                                         case 4:
                                             int updateID = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del Guia que desea borrar"));
                                             moduloGuias.update(updateID);
                                             break;
                                       //case 5: Salir
                                         
                                     }//Fin del Switch 
                                 } while (opcionesGuiasTuristicos != 5); //Fin del Do While del Case 3 (Guias Turisticos)
                                 break;
//-----------------------------------------------------------------------------------------------------------------------------------------------------
                             
                             case 4:
                                 //Iventario Cocina y Toxicos
                                 do {
                                        OpcionesInvent[] OpcionesInv = OpcionesInvent.values();
                                        opcionesInventario =Integer.parseInt( JOptionPane.showInputDialog(null, 
                                        "Ingrese la opción:\n"+
                                        "1- Mostrar productos\n" +
                                        "2- Agregar producto\n" +
                                        "3- Modificar producto\n" +
                                        "4- Eliminar producto\n" +
                                        "5 Salir"));
                                        switch (opcionesInventario) {
                                         case 1:
                                             OpcionesInvent optionsShow = (OpcionesInvent) JOptionPane.showInputDialog(null, "Selecciona una opcion", "Mostrar Inventario", JOptionPane.PLAIN_MESSAGE,null, OpcionesInv, OpcionesInv[0]);
                                             if (optionsShow.equals(optionsShow.Cocina)) {
                                                moduloInventario.ShowC();
                                             }//Fin de la opcion para elegir "Ver los productios de toxicos"
                                             else if (optionsShow.equals(optionsShow.Toxico)) {
                                                moduloInventario.ShowT();
                                             }//Fin de la opcion para elegir "Ver los productios de toxicos"
                                             break;
                                         case 2:
                                              OpcionesInvent options = (OpcionesInvent) JOptionPane.showInputDialog(null, "Selecciona una opcion", "Agregar Producto", JOptionPane.PLAIN_MESSAGE,null, OpcionesInv, OpcionesInv[0]);
                                              String Nombre = JOptionPane.showInputDialog("Dijite el Nombre del Producto");
                                              InventarioCocinaTox infoInventario = new InventarioCocinaTox(options,Nombre);
                                             if (options.equals(options.Cocina)) {                                               
                                                 moduloInventario.AddC(infoInventario);
                                             }//Fin del IF
                                             else if (options.equals(options.Toxico)) {
                                                 moduloInventario.AddT(infoInventario);
                                             }//Fin del Elif
                                             break;
                                         case 3:
                                             OpcionesInvent optionsUpdate = (OpcionesInvent) JOptionPane.showInputDialog(null, "Selecciona una opcion", "Actualizar Producto", JOptionPane.PLAIN_MESSAGE,null, OpcionesInv, OpcionesInv[0]);
                                             if (optionsUpdate.equals(optionsUpdate.Cocina)) {
                                             String NombreUpdateC = JOptionPane.showInputDialog("Dijite el Nombre del Producto");
                                             moduloInventario.updateCocina(NombreUpdateC);   
                                             }//Fin del IF
                                             else if (optionsUpdate.equals(optionsUpdate.Toxico)) {
                                             String NombreUpdateT = JOptionPane.showInputDialog("Dijite el Nombre del Producto");
                                             moduloInventario.updateToxico(NombreUpdateT);
                                             }//Fin del Elif
                                             break;
                                         case 4:
                                             OpcionesInvent optionsDelete = (OpcionesInvent) JOptionPane.showInputDialog(null, "Selecciona una opcion", "Eliminar Producto", JOptionPane.PLAIN_MESSAGE,null, OpcionesInv, OpcionesInv[0]);
                                             if (optionsDelete.equals(optionsDelete.Cocina)) {
                                             String NombreDeleteC = JOptionPane.showInputDialog("Dijite el Nombre del Producto");
                                             moduloInventario.deleteEmpresaC(NombreDeleteC);
                                             }//Fin del IF
                                             else if (optionsDelete.equals(optionsDelete.Toxico)) {
                                             String NombreDeleteT = JOptionPane.showInputDialog("Dijite el Nombre del Producto");
                                             moduloInventario.deleteEmpresaT(NombreDeleteT);
                                             }//Fin del Elif
                                             break;
                                     }//Fin del Switch
                                 } while (opcionesInventario !=5);
                                 break;
                         }//Fin del switch 

                    }while( opciones!=5 );
    }//fin del MENU
}//Fin de la clase  

    

