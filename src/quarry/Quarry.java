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
 *En esta clase se encuentra todos los metodos de la clase ProyectProcedures, 
 * que hacen que el programa funcione.
 * @author dilan
 */
public class Quarry {

    static Applicant[] solicitantes[];

    static User[] usuarios[];
    static Scanner scanner = new Scanner(System.in);
    static User user = new User();
    static Driver driver = new Driver();
    static ProyectProcedures procedures = new ProyectProcedures();
    static int loginProyect;

    /**Bueno, aqui se encuentran las opciones para los menus, donde se 
     * escogen las opciones del sistema.
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean exitAll = true;

        procedures.Login();
        do {
            switch (procedures.MenuLogin()) {

                case 1:
                    //Registro de clientes
                    switch (procedures.selectCustomer()) {
                        case 1:
                            procedures.registerCustomerP();

                            break;
                        case 2:
                            procedures.registerCustomerB();

                            break;
                        case 3:

                            procedures.seeCustomerP();

                            break;
                        case 4:
                            procedures.seeCustomerB();
                            break;
                    }
                    break;

                case 2:

                    procedures.requestDisable();

                    break;

                case 3:
                    //ver todos los datos
                    switch (procedures.viewData()) {
                        case 1:
                            procedures.seeRequest();
                            break;
                        case 2:
                            procedures.seeSuperUser();
                            break;
                        case 3:
                            procedures.seeProducts();
                            break;
                        case 4:
                            procedures.seeQuadrant();
                            break;
                        case 5:
                            procedures.seeRegisterV();
                            break;
                        case 6:
                            procedures.seeBillingP();
                            break;
                    }

                    break;
                case 4:
                    procedures.registerRequest();

                    break;
                case 5:
                    procedures.callBillingP();

                    break;
                case 6:
                    procedures.Login();
                    if (procedures.verifier == true) {
                        procedures.registerUser();
                    }

                    break;
                case 7:
                    System.out.println("desea iniciar seccion de nuevo");
                    procedures.Login();

                    break;
                case 8:

                    Boolean exit = procedures.exitLogin();
                    exitAll = exit;
                    break;

            }

        } while (exitAll == true);
    }
}
