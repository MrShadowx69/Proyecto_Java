
package com.mycompany.proyectoprogra;

import javax.swing.JOptionPane;


public class ProyectoProgra {

    public static void main(String[] args) {
        
        //una inicialización dinamica...
        JOptionPane.showMessageDialog(null, "Bienvenidos al sistema del hotel Escaleras al paraíso!!","BIENVENIDOS!!",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Precione la tecla enter para continuar ;) ");
       
        boolean bucle = true;
        do {
            //El nombre de loggeo es: Admin
            //La contraceña de loggeo es: Ufidelitas
             usuario_Logueo user=new usuario_Logueo();
        // Datos de usuario de prueba
        String usuarioRegistrado = user.nombre;
        String contrasenaRegistrada = user.contrasenia;

        // Solicitar nombre de usuario y contraseña utilizando JOptionPane
        String nombreUsuario = JOptionPane.showInputDialog(null, "Nombre de usuario:","MENÚ DE LOGGEO!!",JOptionPane.INFORMATION_MESSAGE);
        String contrasena = JOptionPane.showInputDialog(null, "Contraseña:","MENÚ DE LOGGEO!!",JOptionPane.INFORMATION_MESSAGE);

        // Verificar credenciales
        if (nombreUsuario.equals(usuarioRegistrado) && contrasena.equals(contrasenaRegistrada)) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso. ¡Bienvenido!");
            bucle=false;
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas. Inténtalo de nuevo...");
            
        }
    
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------            
        } while (bucle);
       

        boolean ciclo = true;
        String eleccion;

        do {
         //menú de opciones principal...
            eleccion = JOptionPane.showInputDialog(null, "Seleccione la opción de su preferencia: "
                    + "\n\n1 - Módulo de empleado"
                    + "\n2 - Módulo de clientes"
                    + "\n3 - Módulo de Proveedores y Empresas Asociadas"
                    + "\n4 - Módulo de Productos"
                    + "\n5 - Módulo de Ventas"
                    + "\n6 - Salir del programa\n", "MENÚ PRINCIPAL", JOptionPane.INFORMATION_MESSAGE);

            switch (eleccion) {
                case "1":
                    //modulo empleados.
                    Modulo_Empleado moduloEmpleados = new Modulo_Empleado(2);

        int opcion1;
        do {
            String opcionStr = JOptionPane.showInputDialog(
                    "Menú de Opciones del Empleado:\n" +
                    "1. Agregar Empleado\n" +
                    "2. Actualizar Empleado\n" +
                    "3. Eliminar Empleado\n" +
                    "4. Mostrar Empleados\n" +
                    "5. Salir\n" +
                    "Ingrese el número de la opción que desea realizar:"
            );

            opcion1 = Integer.parseInt(opcionStr);

            switch (opcion1) {
                case 1:
                    //seccion de agregado de nuevo empleado
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                    String cedula = JOptionPane.showInputDialog("Ingrese la cédula del empleado:");
                    String salarioStr = JOptionPane.showInputDialog("Ingrese el salario del empleado:");
                    double salario = Double.parseDouble(salarioStr);
                    String puesto = JOptionPane.showInputDialog("Ingrese el puesto del empleado:");
                    Empleados nuevoEmpleado = new Empleados(nombre, cedula, salario, puesto);
                    moduloEmpleados.agregarEmpleado(nuevoEmpleado);
                    break;
                case 2:
                    // Ejemplo de cómo actualizar un empleado
                    String cedulaEmpleadoActualizar = JOptionPane.showInputDialog("Ingrese la cédula del empleado que desea actualizar:");
                    if (cedulaEmpleadoActualizar != null) {//el null lo que hace es una compararacion de que si el usuario dejo la cedula en blanco mas adelante se mandara un mensaje de error.
                    String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del empleado:");
                    String nuevoSalarioStr = JOptionPane.showInputDialog("Ingrese el nuevo salario del empleado:");
                    double nuevoSalario = Double.parseDouble(nuevoSalarioStr);
                    String nuevoPuesto = JOptionPane.showInputDialog("Ingrese el nuevo puesto del empleado:");
                    moduloEmpleados.actualizarEmpleado(cedulaEmpleadoActualizar, nuevoNombre, nuevoSalario, nuevoPuesto);
                    }
                    break;
                 
                   
                case 3:
                 // Ejemplo de cómo eliminar un empleado
                 String cedulaEmpleadoEliminar = JOptionPane.showInputDialog("Ingrese la cédula del empleado que desea eliminar:");
                 if (cedulaEmpleadoEliminar != null) {
                 moduloEmpleados.eliminarEmpleado(cedulaEmpleadoEliminar);
                    }
                    break;
                case 4:
                    //metodo para mostrar los empleados disponibles en el sistema...
                    moduloEmpleados.mostrarEmpleados();
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del apartado empleados...");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente nuevamente.");
                    break;
                    }
                } while (opcion1 != 5);
                //fin del switch de empleados.
  //---------------------------------------------------------------------------------------------------------------------------------------      
                    break;
                case "2":
                    //modulo clientes
                    Modulo_Clientes moduloClientes = new Modulo_Clientes(2);
                    int opcion2;
                    
                    do {
                        String opcionStr = JOptionPane.showInputDialog(
                    "Menú de Opciones del Cliente:\n" +
                    "1. Agregar Cliente Nuevo\n" +
                    "2. Actualizar Info Cliente\n" +
                    "3. Mostrar Empleados\n" +
                    "4. Salir\n" +
                    "Ingrese el número de la opción que desea realizar:"
                     );
                    opcion2 = Integer.parseInt(opcionStr); 
                    
                    switch (opcion2) {
                    case 1:
                        //Seccion de agregado de clientes.
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del Cliente: ");
                        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del Cliente: ");
                        String direccion= JOptionPane.showInputDialog("Ingrese la Dirección del Cliente: ");
                        int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del Cliente: "));
                        String correo=JOptionPane.showInputDialog("Ingrese el correo del Cliente: ");
                        Clientes nuevoCliente = new Clientes(nombre, cedula, direccion, numero, correo );
                        moduloClientes.agregarClientes(nuevoCliente);
                        break;
                    case 2:
                        //opcion para actualizar un cliente.
                        String cedulaClienteActualizar = JOptionPane.showInputDialog("Ingrese la cédula del Cliente que desea actualizar:");
                        if (cedulaClienteActualizar != null) {
                             String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nombre del Cliente: ");
                             String nuevaDireccion= JOptionPane.showInputDialog("Ingrese la Dirección del Cliente: ");
                             int nuevoNumero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del Cliente: "));
                             String nuevoCorreo=JOptionPane.showInputDialog("Ingrese el correo del Cliente: ");
                            moduloClientes.actualizarCliente( cedulaClienteActualizar,nuevoNombre, nuevaDireccion, nuevoNumero, nuevoCorreo);
                        }
                        break;
        
                    case 3:
                        //opcion para mostrar la lista de los clientes que hay en el hotel.
                        moduloClientes.mostrarListaClientes();
                         break;
       
                    case 4:
                        //opcion de salida del apartado de clientes.
                        JOptionPane.showMessageDialog(null,"Saliendo del apartado clientes...");
                         break;
       
                    default:
                         JOptionPane.showMessageDialog(null, "Opción inválida. Intente nuevamente.");
                         break;
                   }
                        
                    } while (opcion2!=4);
                     //fin del switch de clientes
//------------------------------------------------------------------------------------------------------------------------------------------------------                    
                    break;
                case "3":
                    //modulo proveedores y empresas.
                     Modulo_Proveedor_EmpresasAsociadas proveedores = new Modulo_Proveedor_EmpresasAsociadas(); // Inicializacion de la clase
                     proveedores.MENU();
 //------------------------------------------------------------------------------------------------------------------------------------------------------                  
                    break;
                case "4":
                //modulo productos    
                    Modulo_Productos moduloProductos = new Modulo_Productos(5, 5);
                    
                      int opcion4;
                    do {
                        String opcionStr = JOptionPane.showInputDialog(
                        "Menú de Opciones de los productos:\n" +
                        "1. Agregar Habitación\n" +
                        "2. Agregar Servicio \n" +
                        "3. Reservar Habitación\n" + 
                        "4. Mostrar Habitaciones\n" +        
                        "5. Mostrar Habitaciones reservadas y las disponibles\n" +
                        "6. Mostrar los Servicios disponibles\n" +
                        "7. Salir\n" +      
                        "Ingrese el número de la opción que desea realizar:"
                       );

                     opcion4 = Integer.parseInt(opcionStr);
                     switch (opcion4) {
                         //opcion para agregar habitaciones para los clientes
                case 1:
                    int numeroHabitacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la habitación:"));
                    String tipoHabitacion = JOptionPane.showInputDialog("Ingrese el tipo de la habitación:");
                    double precioHabitacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la habitación:"));
                    moduloProductos.agregarHabitacion(new Habitacion(numeroHabitacion, tipoHabitacion, precioHabitacion));
                    break;
                    //opcion para agregar nuevos servicios para los clientes
                case 2:
                    String nombreServicio = JOptionPane.showInputDialog("Ingrese el nombre del servicio:");
                    String codigoServicio = JOptionPane.showInputDialog("Ingrese el código del servicio:");
                    String descripcionServicio = JOptionPane.showInputDialog("Ingrese la descripción del servicio:");
                    double precioServicio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del servicio:"));
                    moduloProductos.agregarServicio(new Servicio(nombreServicio, codigoServicio, descripcionServicio, precioServicio));
                    
                    break;
                 
                    //opcion que nos va a permitir la reservacion de las habitaciones que agreguemos segun el numero
                case 3:
                    int numeroHabitacionReserva = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la habitación a reservar:"));
                    moduloProductos.reservarHabitacion(numeroHabitacionReserva);
                  
                    break;
                    //opcion para mostrar las habitaciones que hay dentro del sistema del hotel
                case 4:
                    moduloProductos.mostrarHabitaciones();
                  
                    break;
                    //opcion que nos permite saber cuales habitaciones estan reservadas y cuales no
                case 5:
                    moduloProductos.mostrarEstadoHabitaciones();
                    
                    
                    break;
                    //opcion en la cual nos muestra los servicios los cuales contiene el hotel en total de los que agreguemos.
                case 6:
                    moduloProductos.mostrarServicios();
                    
                    break;
                   //opcion de salida del menú productos. 
                case 7:
                    JOptionPane.showMessageDialog(null, "Saliendo del apartado productos...");
                    
                    break;    
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente nuevamente.");
                    break;
                    }
                } while (opcion4 != 7);
                    
//---------------------------------------------------------------------------------------------------------------------------------------                      
                    break;
                case "5":
                    //modulo ventas.
              
        Modulo_Ventas moduloVentas = new Modulo_Ventas(5);

        int opcion5;
        do {
            opcion5 = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENU:\n" +
                    "1. Agregar Venta\n" +
                    "2. información Ventas\n" +
                    "3. Consultar Venta especifica\n" +        
                    "4. Actualizar Venta\n" +
                    "5. Eliminar Venta\n" +
                    "6. Salir"));

            switch (opcion5) {
                //opcion para agregar una venta al sistema.
                case 1:
                    int numeroVenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de venta:"));
                    double montoFacturado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto facturado"));
                    String producto = JOptionPane.showInputDialog("Ingrese el producto:");
                    String metodoPago = JOptionPane.showInputDialog("Ingrese el metodo de pago:");
                    String infoVendedor = JOptionPane.showInputDialog("Ingrese la informacion del vendedor:");
                    String infoComprador= JOptionPane.showInputDialog("Ingrese la informacion del comprador:");
                    String fechaVenta= JOptionPane.showInputDialog("Ingrese la fecha en la que se vendio este producto:");
                    Ventas nuevaVenta = new Ventas(numeroVenta,montoFacturado,producto,metodoPago, infoVendedor,infoComprador,fechaVenta);
                    moduloVentas.agregarVenta(nuevaVenta);
                    break;
                    
                case 2:
                    //opcion para consultar las ventas que hay en el sistema.
                    moduloVentas.consultarVentas();
                  
                    break;
                case 3:
                    //opcion para consultar una venta en especifica mediante el numero de venta.
                    int numeroVentaConsultar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de venta a consultar:"));
                    moduloVentas.consultarVentaEspecifica(numeroVentaConsultar);
                   
                    break;
                case 4:
                    //opcion de actualizar una venta mediante el numero de venta.
                    int numeroVentaActualizar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de venta a actualizar:"));
                    double nuevoMontoFacturado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo monto facturado"));
                    String nuevoProducto = JOptionPane.showInputDialog("Ingrese el nuevo producto:");
                    String nuevoMetodoPago = JOptionPane.showInputDialog("Ingrese el nuevo metodo de pago:");
                    String nuevaInfoComprador= JOptionPane.showInputDialog("Ingrese la nueva informacion del comprador:");
                    String nuevaInfoVendedor = JOptionPane.showInputDialog("Ingrese la nueva informacion del vendedor:"); 
                    String nuevaFechaVenta= JOptionPane.showInputDialog("Ingrese la nueva fecha:");
                    moduloVentas.actualizarVenta(numeroVentaActualizar, nuevoMontoFacturado, nuevoProducto, nuevoMetodoPago, nuevaInfoComprador, nuevaInfoVendedor, nuevaFechaVenta);
                    break;
                    
                case 5:
                    //opcion para eliminar una venta mediante el numero de venta.
                    int numeroVentaEliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de venta a eliminar:"));
                    moduloVentas.eliminarVenta(numeroVentaEliminar);
                
                    break;
                case 6:
                    //salir...
                    JOptionPane.showMessageDialog(null, "Saliendo del apartado ventas ...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                    break;
                    }
                 } while (opcion5 != 6);
                
                    break; 
                    
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                    
                case "6":
                    // Salir
                    ciclo = false;
                    JOptionPane.showMessageDialog(null, "cerrando sesion...!!!");
                    
            }

        } while (ciclo);
    }
}
//fin del main