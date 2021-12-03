package EquipoLimonEstructura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ARBOLESyo.arbolbinario.ArbolBinario;

public class ControlEmpleados {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     public static ArbolBinario listaTrabajador = new ArbolBinario();
/**
 * Método main para la ejecución del programa
 * @param args
 * @throws IOException
 */
    public static void main(String[] args) throws IOException {
        boolean control = true;
        do {
            menu();
            int a = Integer.parseInt(br.readLine());
            switch (a) {
            case 1:
                insertarEmpleado();
                break;
            case 2:
                eliminar();
                break;
            case 3:
                System.out.println("•••••••••••••••••••••••••\nID\tNombre   Apellidos\t Edad   Genero  Sueldo \tPuesto");
                // listaTrabajador.imprimirLista();
                System.out.println("•••••••••••••••••••••••••");
                break;
            case 4:
                // listaTrabajador.imprimirLista();
                // listaTrabajador.bubble();
                // listaTrabajador.imprimirLista();
                break;
            case 5:
                ModificarInfo();
                break;
                case 6:
                System.out.println("-----------------------------\nSEE YOU LATER (∪.∪ )...zzz");
                control = false;
                break;
            case 123:
                // insercionrapida();
                break;
            default:
                System.out.println("Ingrese una opción valida. ");
                break;
            }
        } while (control);

    }
    /**
     * Método para modificar la información del empleado a travez de su ID
     */
    private static void ModificarInfo() throws IOException{
        boolean control = true;
        do {
            System.out.println("---------------------------");
            // listaTrabajador.imprimirLista();
            System.out.println("---------------------------\n\n\tIngrese el id del trabajador que desea modificar su información:");
            String id = br.readLine();
            // System.out.println("••••••••••••••••••••\n Información actual de: "+
                // listaTrabajador.buscarPorID(id)+
                // "\nID\tNombre   Apellidos\t Edad   Genero  Sueldo \tPuesto"+
                // "\n"+listaTrabajador.informacionUnitTrabajador(id)+
                // "\n ¿Qué desea hacer?"+
                // "\n1)Modificar TODA la información.\n2) Seleccinar el campo a modificar\n3)CANCELAR");
                int a = Integer.parseInt(br.readLine());

                switch (a) {
                case 1:
                System.out.println("Ingrese el nombre: ");
                String nombre = br.readLine();
                System.out.println("Ingrese apellido paterno: ");
                String apellidoPaterno = br.readLine();
                System.out.println("Ingrese apellido materno: ");
                String apellidoMaterno = br.readLine();
                System.out.println("Ingrese el puesto del trabajador: ");
                String puesto = br.readLine();
                System.out.println("Ingrese la edad: ");
                int edad = Integer.parseInt(br.readLine());
                System.out.println("Ingrese el genero: ");
                String genero = br.readLine();
                System.out.println("Asigne un sueldo: ");
                double sueldo = Double.parseDouble(br.readLine());
                //int i = listaTrabajador.recorrer();   
                // listaTrabajador.reemplazar(id,
                        // new Trabajador(nombre, apellidoPaterno, apellidoMaterno, edad, genero, id, sueldo, puesto));
                        System.out.println("¡Listo!\n");
                    break;
                case 2:
                System.out.println("¿Qué campo le gustaría modificar?\n1)Nombre\n2)Apellido paterno\n3)Apellido materno\n4)Edad\n5)Genero\n6)Puesto\n7)Sueldo");
                    int c = Integer.parseInt(br.readLine());
                    String dato;
                    switch (c) {
                        case 1:
                            //Nombre
                            System.out.println("Ingrese el nuevo nombre: ");
                            dato = br.readLine();
                            // listaTrabajador.reemplazar(id, dato, c);
                            System.out.println("Cambio efectuado");
                            break;
                        case 2:
                            //Apellido Paterno
                            System.out.println("Ingrese el nuevo apellido paterno: ");
                            dato = br.readLine();
                            // listaTrabajador.reemplazar(id, dato, c);
                            System.out.println("Cambio efectuado");
                            break;
                        case 3:
                            //Apellido Materno
                            System.out.println("Ingrese el nuevo apellido materno: ");
                            dato = br.readLine();
                            // listaTrabajador.reemplazar(id, dato, c);
                            System.out.println("Cambio efectuado");
                            break;
                        case 4:
                            //Edad
                            System.out.println("Ingrese la edad:");
                            dato = br.readLine();
                            // listaTrabajador.reemplazar(id, dato, c);
                            System.out.println("Cambio efectuado");
                            break;
                        case 5:
                            //Genero
                            System.out.println("Ingrese el nuevo genero: ");
                            dato = br.readLine();
                            // listaTrabajador.reemplazar(id, dato, c);
                            System.out.println("Cambio efectuado");
                            break;
                        case 6:
                            //Puesto
                            System.out.println("Ingrese el nuevo puesto: ");
                            dato = br.readLine();
                            // listaTrabajador.reemplazar(id, dato, c);
                            System.out.println("Cambio efectuado");
                            break;
                        case 7:
                            //Sueldo
                            System.out.println("Ingrese el nuevo sueldo: ");
                            dato = br.readLine();
                            // listaTrabajador.reemplazar(id, dato, c);
                            System.out.println("Cambio efectuado");
                        break;
                        default:
                        System.out.println("Ingrese una opción valida");
                            break;
                    }
                    break;
                case 3:
                System.out.println("Acción cancelada");
                    control = false;
                    break;
                default:
                System.out.println("Ingrese una opción valida");
                    break;
            }
            System.out.println("•••••••••••••••••••••••••\n\n¿Desea modificar la información de algún otro? (Si o No)");
            boolean control1= true; 
            do {
            String respuesta = br.readLine();
                switch (respuesta) {
                    case "Si":
                        control1 = false;
                        control = true;
                        break;
                case "No":
                    control1= false;
                    control = false;
                    System.out.println("•••••••••••••••••••••••••");
                break;
                    default:
                    System.out.println("Ingrese una opción valida.");
                    control1= true;
                        break;
                }
            } while (control1);
        } while (control);
}

//     private static void insercionrapida() {
//     listaTrabajador.insertarAlInicio(
//                 new Trabajador("Andres", "Gonzalez", "Martinez", 19, "Masculino", "12345",2000000.0, "CEO"));
//     listaTrabajador.insertarAlInicio(
//                 new Trabajador("Samuel", "Gonzalez", "Martinez", 33, "Masculino", "1233", 30000.0, "CEO"));
//     listaTrabajador.insertarAlInicio(
//                 new Trabajador("Alfonso", "Gonzalez", "Martinez", 32, "Masculino", "1232", 40000.0, "CEO"));
//     listaTrabajador.insertarFinal(
//                 new Trabajador("Josue", "Gonzalez", "Martinez", 26, "Masculino", "1231", 20000.0, "CEO"));
//                 System.out.println("Inserción rapida hecha. \nCantidad de trabajadores insertada: "+listaTrabajador.recorrer()+"\n-----------------------------");
// }
    /**
     * Método que muestra un menu en la terminal.
     */
    private static void menu() {
        System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬BIENVENIDA A SU TERMINAL DE CONTROL DE EMPLEADOS▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n¿Qué desea hacer?");
        System.out.println(
                "1)Dar de alta\n2)Dar de baja\n3)Consultar empleado\n4)Consultar empleado (por orden de ID)\n5)Modificar información de empleado.\n6)SALIR");
    }
    /**
     * Método para regitrar un empleado en el árbol binario
     */
    private static void insertarEmpleado() throws IOException {
        boolean control=false;
        do{

        System.out.println("Ingrese el nombre: ");
        String nombre = br.readLine();
        System.out.println("Ingrese apellido paterno: ");
        String apellidoPaterno = br.readLine();
        System.out.println("Ingrese apellido materno: ");
        String apellidoMaterno = br.readLine();
        System.out.println("Ingrese el puesto del trabajador: ");
        String puesto = br.readLine();
        System.out.println("Ingrese la edad: ");
        int edad = Integer.parseInt(br.readLine());
        System.out.println("Ingrese el genero: ");
        String genero = br.readLine();
        System.out.println("Asigne un sueldo: ");
        double sueldo = Double.parseDouble(br.readLine());

        // listaTrabajador.insertarAlInicio(
                // new Trabajador(nombre, apellidoPaterno, apellidoMaterno, edad, genero, String.valueOf(((int)System.currentTimeMillis())).substring(0, 4), sueldo, puesto));
                System.out.println("¡Listo!\n¿Desea dar de alta otro trabajador? (Si/No)");
                String a = br.readLine();
                if(a.equals("Si") || a.equals("si")){
                    control = true;
                    System.out.println("-----------------------------");
                }else if(a.equals("No") || a.equals("no")){
                    control = false;
                }
        }while(control);
        System.out.println("Aquí hice un cambio");
    }
    
    /**
     * Método para eliminar un trabajador por medio de su id.
     */
    private static void eliminar() throws IOException{
        boolean control= true;
        do {
            // listaTrabajador.imprimirLista();
        System.out.println("\tIngrese el id del trabajador que desea dar de baja: ");
        String id = br.readLine();
        // System.out.println("¿Está seguro que quiere eliminar a "+listaTrabajador.buscarPorID(id)+"? (Si o No)");
        String respuesta = br.readLine();
        if(respuesta.length()>2){
            System.out.println("Use solo la cantidad de caracteres necesarios.");
        }
        switch (respuesta) {
            case "Si":
            System.out.println("•••••••••••••••••••••••••");
            // listaTrabajador.eliminar(id);
            System.out.println("Trabajador dado de baja");
            // listaTrabajador.imprimirLista();
            System.out.println("•••••••••••••••••••••••••\n\n¿Desea dar de baja algún otro? (Si o No)");
            boolean control1= true; 
            do {
            respuesta = br.readLine();
                switch (respuesta) {
                    case "Si":
                        control1 = false;
                        control = true;
                        break;
                case "No":
                    control1= false;
                    control = false;
                break;
                    default:
                    System.out.println("Ingrese una opción valida.");
                    control1= true;
                    br.readLine();
                        break;
                }
            } while (control1);
                break;
            case "No":
            System.out.println("ACCION CANCELADA\n-----------------------------");
            control = true;
            break;
            default:
            System.out.println("Ingrese una opción valida.");
            br.readLine();
                break;
        }    
        } while (control);
    }

}
