/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quarry;

import clases.Applicant;
import java.util.Scanner;
import Procedures.ProyectProcedures;
import clases.User;
import clases.Driver;

/**
 * En esta clase se encuentra todos los metodos de la clase ProyectProcedures,
 * que hacen que el programa funcione.
 *
 * @author dilan
 *
 */
public class Quarry {

    static Applicant[] solicitantes[];

    static User[] usuarios[];
    static Scanner scanner = new Scanner(System.in);
    static User user = new User();
    static Driver driver = new Driver();
    static ProyectProcedures procedures = new ProyectProcedures();
    static int loginProyect;

    /**
     * Bueno, aqui se encuentran las opciones para los menus, donde se escogen
     * las opciones del sistema.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean exitAll = true;

        procedures.Login();
        do {
            /*
            este switch tiene como fucnion almacenar todo el conjunto de 
            opciones
   
             */
            switch (procedures.MenuLogin()) {
                /* este caso tiene como funcion almacenar los datos del registro de clientes*/
                case 1:

                    //Registro de clientes
                    switch (procedures.selectCustomer()) {
                        /* este caso tiene como funcion registrar cliente 
                        persona*/
                        case 1:
                            procedures.registerCustomerP();

                            break;
                        /* este caso tiene como funcion registrar cliente 
                            empresa*/
                        case 2:
                            procedures.registerCustomerB();

                            break;
                        /* este caso tiene como funcion ver los datos de 
                            cliente persona*/
                        case 3:

                            procedures.seeCustomerP();

                            break;
                        /* este caso tiene como funcion ver los datos de 
                            cliente empresa*/
                        case 4:
                            procedures.seeCustomerB();
                            break;
                    }
                    break;

                case 2:

                    //ver todos los datos
                    switch (procedures.selectFuctionI()) {
                        /* este caso tiene como funcion registrar solicitudes*/
                        case 1:
                            procedures.registerRequest();
                            break;
                        case 2:
                            /* este caso tiene como funcion deshabilitar las 
                            solicitudes*/
                            procedures.seeRequest();
                            procedures.disableRequest();
                            break;
                        /* este caso tiene como funcion ver los datos de 
                            los productos*/
                        case 3:
                            procedures.seeProducts();

                            break;
                    }
                    break;
                /* este caso tiene como funcion ver los datos de solicitud cuadrante,registro 
de personas, super usuario y cuadrante*/
                case 3:
                    switch (procedures.seeInformation()) {
                        case 1:
                            /* este caso tiene como funcion ver los datos de 
                            las solicitudes*/
                            procedures.seeRequest();

                            break;
                        case 2:
                            /* este caso tiene como funcion ver el estado del 
                            cuadrante*/
                            procedures.seeQuadrant();

                            break;
                        /* este caso tiene como funcion ver el registro de 
                            vehiculos*/
                        case 3:

                            procedures.seeRegisterV();

                            break;
                        /* este caso tiene como funcion ver los datos de 
                            los super usuarios*/
                        case 4:
                            procedures.seeSuperUser();

                            break;
                    }
                    break;
                /* este caso tiene como funcion regiustrarse como super user */
                case 4:

                    procedures.Login();
                    if (procedures.verifier == true) {
                        procedures.registerUser();
                    }

                    break;
                /* este caso tiene como funcion volver a ingrear al 
                    programa*/
                case 5:
                    System.out.println("desea iniciar seccion de nuevo");
                    procedures.Login();

                    break;
                /* este caso tiene como funcion salir del programa*/
                case 6:
                    Boolean exit = procedures.exitLogin();
                    exitAll = exit;
                    break;
                /* este caso tiene como funcion proporcioar ayuda 
                    al usuario*/
                case 7:

                    procedures.iCustomer();

                    break;
            }
        } while (exitAll == true);
    }

}
