/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procedures;

import clases.Applicant;
import clases.Billing;
import clases.Product;
import clases.User;
import java.util.Scanner;
import clases.Driver;
import clases.Quadrant;
import clases.Request;
import clases.Vehicle;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * En esta clase se encuentran todos los procedimientos que tengan que ver con
 * el código, tanto el de ver los datos de los clientes, usuarios, productos,
 * vehiculos y solicitudes, además de donde se realizan los metodos para
 * registrar dichos datos
 *
 * @author Dylan
 * @author James
 */
public class ProyectProcedures {

    static Scanner scanner = new Scanner(System.in);
    static Scanner scannerTwo = new Scanner(System.in);
    static User registerUser[] = new User[10];
    static Applicant registerPerson[] = new Applicant[10];
    static Applicant registerBusines[] = new Applicant[10];
    static Billing registerBilling[] = new Billing[20];
    static User user = new User();
    public Request registerRequest[] = new Request[10];
    static Product allProduct[] = new Product[4];
    static Request request = new Request();
    static Product product = new Product();
    public boolean verifier = false;

    public void iCustomer() {

        System.out.println("Ayuda para usuario");
        System.out.println("______________________________________________________"
                + "______________________");
        System.out.println(" opcion 1 ");
        System.out.println("Aqui se encontrara lo necesario para "
                + "registrar un cliente");
        System.out.println("en esta opcion se puede registrar "
                + "un cliente persona o emopresa");
        System.out.println("tamibien ver los dantos del cliente sea"
                + " empresa o persona");
        System.out.println("_____________________________________"
                + "_______________________________________");
        System.out.println("opcion 2");
        System.out.println("se encontra las opciones para tramitar"
                + " una solicitud o dehabilitarla");
        System.out.println("tambien permite ver los productos"
                + " disponibles");
        System.out.println("______________________________________"
                + "______________________________________");
        System.out.println("opcion 3 ");
        System.out.println("Permite ver todas las solicitudes");
        System.out.println("permite ver tdods los vehiculos "
                + "registrados");
        System.out.println("permite ver tdods los vehiculos "
                + "registrados");
        System.out.println("tambien se encuentra el estado de "
                + "los cuadrantes");
        System.out.println("_____________________________________"
                + "_______________________________________");
        System.out.println("opcion 4");
        System.out.println("esta opcion permite registrarse como"
                + " super usuario");
        System.out.println("____________________________________"
                + "________________________________________");
        System.out.println("opcion 5");
        System.out.println("esta opcion tiene como fin volver a "
                + "ingresar con otro usuario");
        System.out.println("____________________________________"
                + "________________________________________");
        System.out.println("opcion 6");
        System.out.println("esta opcion tiene como fin salir del"
                + " programa");
        System.out.println("___________________________________"
                + "_________________________________________");

    }

    /*
    Este metodo se encarga de mostrar los productos disponibles
     */
    public static void product() {
        allProduct[0] = new Product("12", "Arena Economica", "Arena");
        allProduct[1] = new Product("23", "Graba", "Graba");
        allProduct[2] = new Product("34", "BarroPremium", "Barro");
        allProduct[3] = new Product("45", "Piedra cascajo", "piedra cascajo");

    }

    /*
    Este metodo se encarga de dar un menu en donde se encuentran
    las opciones que se desean hacer en el programa, lo hace con un dato 
    int opcion que al digitar una opcion lo retorna.
     */
    public int menuLogin() {
        int option = 0;
        System.out.println("____________________________________");
        System.out.println("1-Funciones tipo Cliente");
        System.out.println("2-Funciones tipo solicitud");
        System.out.println("3-ver todos los datos");
        System.out.println("4-Registrarse");
        System.out.println("5-volver a ingresar");
        System.out.println("6-Salir del sistema");
        System.out.println("7-Ayuda para usuario");
        System.out.println("____________________________________");
        option = scanner.nextInt();
        return option;
    }

    /*
    Este metodo se encarga de dar un menu a la hora de elegir si se desea
    registrar un cliente persona o uno de empresa, asi mismo trae opciones para
    visualizar si se desean ver los datos de un cliente persona o un cliente
    empresa.
     */
    public int selectCustomer() {
        int option = 0;
        System.out.println("Bienvendo");
        System.out.println("_______________________________________________");
        System.out.println("1 si desea registar una persona");
        System.out.println("2 si desea registrar una empresa");
        System.out.println("3 Ver datos de persona");
        System.out.println("4 Ver datos de empresa");
        System.out.println("_______________________________________________");
        option = scanner.nextInt();
        return option;
    }

    //register disable seeProducts
    public int selectFuctionI() {
        int option = 0;
        System.out.println("Bienvendo");
        System.out.println("_______________________________________________");
        System.out.println("1 si desea registar una Solicitud");
        System.out.println("2 si desea dehabilitar una Solicitud");
        System.out.println("3 si desea ver los productos");
        System.out.println("_______________________________________________");
        option = scanner.nextInt();
        return option;
    }

    public int seeInformation() {
        int option = 0;
        System.out.println("Datos del sistema");
        System.out.println("_______________________________________________");
        System.out.println("1 Ver datos de solicitudes ");
        System.out.println("2 Ver estado de los cuadrantes");
        System.out.println("3 Ver datos de vehiculos registrados ");
        System.out.println("4 Ver datos de super Usuario ");
        System.out.println("_______________________________________________");
        option = scanner.nextInt();
        return option;
    }

    /*
    En este metodo se hace el registro de los nuevos usuarios que se agregan
    al sistema, pidiendo el usuario y contraseña y los datos personales.
     */
    public User userRegister() {
        String registrationUsername;
        String registrationUserp;

        String registrationName;
        String registrationAdress;
        String registrationPhone;
        String registrationDni;

        System.out.println("_______________________________");
        System.out.println("Digite los datos requeridos");
        System.out.println("_______________________________");
        System.out.println("Digite usuario a registar");
        registrationUsername = scannerTwo.nextLine();
        System.out.println("Digite el contraseña a registrar");
        registrationUserp = scannerTwo.nextLine();

        System.out.println("Digite su nombre");
        registrationName = scannerTwo.nextLine();
        System.out.println("Digite su direccion");
        registrationAdress = scannerTwo.nextLine();
        System.out.println("Digite su telefono");
        registrationPhone = scannerTwo.nextLine();
        System.out.println("Digite su DNI");
        registrationDni = scannerTwo.nextLine();

        return new User(registrationUsername, registrationUserp,
                registrationName, registrationAdress, registrationPhone,
                registrationDni);

    }

    /*
    En este metodo hace el login del sistema, pidiendo el usuario y la
    contraseña del usuario.
     */
    public User requestLogin() {

        String registrationUsername;
        String registrationUserp;
        System.out.println("----------------------------");
        System.out.println("Bienvenido al login :D");
        System.out.println("----------------------------");
        System.out.println("Porfavor Digite su usuario");
        registrationUsername = scannerTwo.nextLine();
        System.out.println("Porfavor Digite su contraseña");
        registrationUserp = scannerTwo.nextLine();

        return new User(registrationUsername, registrationUserp);
    }

    /*
    En este metodo se elije el producto para la solicitud utilizando el numero 
    del producto, 
     */
    public Product requestProduct() {
        verifier = false;
        String idProduct = null;
        String productMaterial = null;
        String productNames = null;

        product();
        seeProducts();
        do {
            System.out.println("digite el numero de producto a escojer");
            int selectProduct = scanner.nextInt();

            if ((selectProduct < 5)) {
                if ((selectProduct > 0)) {
                    if (allProduct[selectProduct - 1] != null) {
                        idProduct = allProduct[selectProduct - 1].toProductId();
                        productNames = allProduct[selectProduct - 1].toName();
                        productMaterial = allProduct[selectProduct - 1]
                                .toMaterial();

                        verifier = true;
                    }
                } else {
                    System.out.println("digito un numero fuera de lo pedido");
                }

            }

        } while (verifier == false);

        return new Product(idProduct, productNames, productMaterial);
    }

    /*
    Este metodo hace verificar si el registro del usuario fue correcto.
     */
    public User registerUser() {
        for (int i = 0; i < registerUser.length; i++) {
            if (registerUser[i] == null) {
                registerUser[i] = userRegister();

                System.out.println("se ha registrado correctamente");
                break;
            } else {
            }
        }
        return (null);

    }

    /*
    Este metodo hace verificar si el registro del cliente empresa fue correcto
     */
    public Applicant registerCustomerB() {
        for (int i = 0; i < registerBusines.length; i++) {
            if (registerBusines[i] == null) {
                registerBusines[i] = businesRegister();
                System.out.println("se ha registrado correctamente");
                break;
            } else {
            }
        }
        return (null);

    }

    /*
    Este metodo hace verificar si el registro del cliente persona fue correcto
     */
    public Applicant registerCustomerP() {
        for (int i = 0; i < registerPerson.length; i++) {
            if (registerPerson[i] == null) {
                registerPerson[i] = personRegister();
                System.out.println("se ha registrado correctamente");
                break;
            } else {
            }
        }
        return (null);

    }

    /*
    Este metodo verifica si el registro de la solicitud se hizo correctamente
     */
    public Request registerRequest() {
        for (int i = 0; i < registerRequest.length; i++) {
            if (registerRequest[i] == null) {
                registerRequest[i] = requestRegister();
                System.out.println("se ha registrado correctamente");
                quadrantExplode();
                break;
            } else {
            }
        }
        return (null);

    }

    /*
    Este metodo hace el registro de un cliente persona, pidiendolo los datos
    correspondientes.
     */
    public Applicant personRegister() {

        System.out.println("Digite usuario a registar");
        String personName = scannerTwo.nextLine();
        System.out.println("Digite su cedula a registrar");
        String personDni = scannerTwo.nextLine();
        System.out.println("Digite su telefono a registrar");
        String personPhone = scannerTwo.nextLine();
        System.out.println("Digite la direccion a registrar");
        String personAdress = scannerTwo.nextLine();
        return new Applicant(personName, personDni, personPhone, personAdress);

    }

    /*
    Este metodo hace el registro de los datos correspondientes de un cliente 
    empresa
     */
    public Applicant businesRegister() {

        System.out.println("Digite la empresa a registar");
        String businesName = scannerTwo.nextLine();
        System.out.println("Digite el CIF de la empresa");
        String busisnesCif = scannerTwo.nextLine();
        System.out.println("Digite su telefono a registrar");
        String personPhone = scannerTwo.nextLine();
        System.out.println("Digite la direccion a registrar");
        String businesAdress = scannerTwo.nextLine();
        return new Applicant(businesName, busisnesCif, personPhone,
                businesAdress, null);

    }

    /*
        Este metodo se encarga de asignar la solicitud a un cliente persona o a
    un cliente empresa, cuando se le asigne la solicitud a alguno de los dos
    se deben de introducir los datos faltantes.
     */
    public Applicant registerCustomer() {
        verifier = false;
        String addres = null;
        String cif = null;
        String idCostumer = null;
        String name = null;
        String phone = null;

        int select = 0;
        do {

            System.out.println("Registro de solicitud");
            System.out.println("1) asignar a cliente persona");
            System.out.println("2)Asignar a cliente empresa");
            select = scanner.nextInt();
            if (select <= 0) {
                System.out.println("el numero es muy inferior");

            } else {
                if (select > 2) {
                    System.out.println("el numero es muy alto");

                } else {

                    verifier = true;

                }
            }

        } while (verifier == false);

        do {

            switch (select) {
                case 1:
                    seeCustomerP();
                    do {
                        System.out.println("digite el nombre de la persona que"
                                + " desea asignar la solicitud");
                        String nameP = scannerTwo.nextLine();

                        for (int i = 0; i < registerPerson.length; i++) {
                            if (registerPerson[i] != null) {
                                if (nameP.equals(registerPerson[i].getName())) {
                                    name = registerPerson[i].getName();
                                    idCostumer = registerPerson[i]
                                            .getIdCostumer();
                                    phone = registerPerson[i].getPhone();
                                    addres = registerPerson[i].getAddres();
                                    verifier = true;
                                    break;

                                }

                            }
                        }

                    } while (verifier == false);
                    break;
                case 2:
                    seeCustomerB();
                    do {
                        System.out.println("digite el nombre de la empresa que"
                                + " desea asignar la solicitud");
                        String nameB = scannerTwo.nextLine();

                        for (int i = 0; i < registerBusines.length; i++) {
                            if (nameB.equals(registerBusines[i].getName())) {
                                name = registerBusines[i].getName();
                                cif = registerBusines[i].getCIF();
                                phone = registerBusines[i].getPhone();
                                addres = registerBusines[i].getAddres();

                                verifier = true;
                                break;
                            }
                        }
                    } while (verifier == false);
                    break;
            }
            if (select == 2) {

            }
        } while (verifier == false);

        return new Applicant(name, cif, idCostumer, phone, addres, null);

    }

    /*
    En este metodo se encarga de brindarle la fecha a la solicitud en un 
    formato determinado
     */
    public Request requestRegister() {
        System.out.println("Digite el codigo de la solicitud");
        String numRequest = scannerTwo.nextLine();

        Date requestDate = new Date();

        return new Request(requestProduct(), registerCustomer(), requestDate,
                "En Tramite", vehicleRegister(), numRequest);
    }
    public int countName = 0;

    /*
    Este metodo se encarga de verificar que el usuario haya verificado bien 
    los datos de nombre de usuario y la contraseña y si es correcta entonces
    que de la bienvenida al sistema
     */
    public void login() {
        verifier = false;
        registerUser[0] = new User("admin", "admin123", "James", "Alamedas",
                "61506639",
                "604800142");

        do {

            User requestL = requestLogin();

            for (int i = 0; i < registerUser.length; i++) {
                if (registerUser[i] != null) {

                    if (requestL.toStrin().equals(registerUser[i].toStrin())) {
                        System.out.println("Se ha igresado correctamente");
                        System.out.println("Bienvenido " + registerUser[i]
                                .getName());
                        countName = i;

                        verifier = true;
                        break;
                    }
                }
            }
        } while (verifier == false);
    }

    /*
    En este metodo se encuentran los datos para introducir la informacion del
    conductor, además de retornar estos datos para guardarlos en un vector
     */
    public Driver driverRegister() {
        String Addres;
        String dniDriver;
        String license;
        String nameDriver;
        String phone;


        System.out.println("Nombre del conductor");
        nameDriver = scannerTwo.nextLine();
        System.out.println("licencia del conductor");
        license = scannerTwo.nextLine();
        System.out.println("Direccion de casa del conductor");
        Addres = scannerTwo.nextLine();
        System.out.println("telefono celular");
        phone = scannerTwo.nextLine();
        System.out.println("DNI");
        dniDriver = scannerTwo.nextLine();

        return new Driver(license, nameDriver, Addres, phone, dniDriver);

    }

    /*
    Este metodo se encarga del registro de los vehiculos, registrando la 
    matricula, las toneladas que cargo y las fechas cuando entra y cuando sale
     */
    public Vehicle vehicleRegister() {

        Date departureTime = null;
        Date entryTime = null;
        Date entryDate = null;
        Date departureDate = null;
        System.out.println("Digite la matricula del vehiculo");
        String tuition = scannerTwo.nextLine();

        System.out.println("Digite la cantidad de toneladas que desea"
                + " comparar");
        double tonsLoaded = scanner.nextInt();

        System.out.println("Digite la fecha de entrada del vehiculo en el"
                + " siguiente formato (\"dd-MM-YYYY\")");
        try {
            String selectEntryT = scannerTwo.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-YYYY");
            entryDate = format.parse(selectEntryT);
        } catch (Exception i) {
            System.err.println("No digito la fecha correctamente");
        }

        System.out.println("Digite la fecha de salida en el siguiente formato"
                + " (\"dd-MM-YYYY\")");

        try {
            String selectDepartureD = scannerTwo.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-YYYY");
            departureDate = format.parse(selectDepartureD);
        } catch (Exception i) {
            System.err.println("No se ha podido convertir la fecha");

        }

        System.out.println("Digite la hora de entrada en el siguiente formato"
                + " (HH:MM:SS)");
        try {
            String selectEntry = scannerTwo.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("HH:MM:SS");
            entryTime = format.parse(selectEntry);
        } catch (Exception i) {
            System.err.println("No digito la fecha correctamente");

        }
        System.out.println("Digite lahora de salida en el siguiente formato"
                + " (HH:MM:SS)");

        try {
            String selectDepartureT = scannerTwo.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("HH:MM:SS");
            departureTime = format.parse(selectDepartureT);
        } catch (Exception i) {
            System.err.println("No digito la fecha correctamente");
        }

        return new Vehicle(entryDate, tuition, departureDate, tonsLoaded,
                driverRegister(), entryTime, departureTime);
    }

    /*
    Este metodo se encarga de mostrar los clientes personas registrados
     */
    public void seeCustomerP() {
        System.out.println("__________________________________________");
        System.out.println("clientes persona registrados");
        for (int i = 0; i < registerPerson.length; i++) {
            if (registerPerson[i] != null) {
                System.out.println(registerPerson[i].toStrinP());
            }

        }

        System.out.println("__________________________________________");
    }

    /*
    Este metodo se encarga de mostrar los clientes empresas registrados
     */
    public void seeCustomerB() {

        System.out.println("Clentes empresa registrados");
        System.out.println("__________________________________________");
        for (int i = 0; i < registerBusines.length; i++) {
            if (registerBusines[i] != null) {
                System.out.println(registerBusines[i].toStrinB());
            }

        }
        System.out.println("__________________________________________");
    }

    /*
    Este metodo se encarga de mostrar los productos disponibles
     */
    public void seeProducts() {
        product();

        for (int i = 0; i < allProduct.length; i++) {

            System.out.println("___________________________________________"
                    + "______");

            System.out.println("Producto N(" + (i + 1) + ")");
            if (allProduct[i] != null) {

                System.out.println("codigo de producto " + allProduct[i]
                        .getIdProduct());
                System.out.println("nombre del producto " + allProduct[i]
                        .getProductName());
                System.out.println("tipo de material " + allProduct[i]
                        .getProductMaterial());

            }
        }
        System.out.println("________________________________________________");
    }

    /*
    Este metodo es el encargado de mostrar los datos de los super users
     */
    public void seeSuperUser() {

        for (int i = 0; i < registerUser.length; i++) {
            System.out.println("__________________________________________");
            System.out.println("Datos de super user");
            if (registerUser[i] != null) {
                System.out.println(registerUser[i].toString());

            }
        }
    }

    /*
    Este metodo se encarga de mostrar las solicitudes realizadas y toda la 
    informacion de ella
     */
    public void seeRequest() {

        for (int i = 0; i < registerRequest.length; i++) {
            System.out.println("__________________________________________");
            System.out.println("Datos del request");
            if (registerRequest[i] != null) {
                System.out.println(registerRequest[i].toString());

            }
        }

    }

    /*
    Este metodo se encarga de mostrar las facturas y toda la 
    informacion de ella
     */
    public void seeBillingP() {

        for (int i = 0; i < registerBilling.length; i++) {
            System.out.println("__________________________________________");
            System.out.println("la solicitud es ");
            if (registerBilling[i] != null) {
                System.out.println(registerBilling[i].toString());

            }
        }

    }

    /* estemetodo tiene como funcion ver el registro de vehiculos*/
    public void seeRegisterV() {
        System.out.println("__________________________________________");
        System.out.println("vehiculos registrados");
        for (int i = 0; i < registerRequest.length; i++) {
            if (registerRequest[i] != null) {
                System.out.println("Este vehiculo esta asignado a la "
                        + "solicicitud de " + registerRequest[i]
                                .getApplicant().getName());
                System.out.println("Conductor " + registerRequest[i]
                        .getVehicle().getDriver());
                System.out.println("fecha de entrada " + registerRequest[i]
                        .getVehicle().getEntryDate());
                System.out.println("fecha de salida" + registerRequest[i]
                        .getVehicle().getDepartureDate());
                System.out.println("hora de entrada del vehiculo"
                        + registerRequest[i].getVehicle().getEntryTime());
                System.out.println("hora de salida del vehiculo"
                        + registerRequest[i].getVehicle().getDepartureTime());

                System.out.println("toneladas a llevar" + registerRequest[i]
                        .getVehicle().getTonsLoaded());

                System.out.println("Matricula " + registerRequest[i]
                        .getVehicle().getTuition());

            }
        }

        System.out.println("__________________________________________");
    }

    /**
     * sirve para explotar los cuadrantes y asi disminuir toneladas *
     */
    public double spaceQuadrant[] = {4, 40, 400, 4000, 40000, 80, 800, 8000,
        800000, 0,};

    /* este metodo tiene como funcion explotar los cuadrantes*/
    public Quadrant explodeQuadrant(double tons) {
        double x = 0;

        for (int i = 0; i < spaceQuadrant.length; i++) {

            if ((spaceQuadrant[i] - tons) > 0) {
                spaceQuadrant[i] = spaceQuadrant[i] - tons;
                tons = 0;
            }
            if ((spaceQuadrant[i] - tons) < 0) {
                tons = tons - spaceQuadrant[i];
                spaceQuadrant[i] = 0;
            }
            if ((spaceQuadrant[i] - tons) == 0) {
                tons = 0;
                spaceQuadrant[i] = 0;
            }

            if (tons == 0) {
                break;
            }
        }
        if (tons < 0) {
            System.out.print("No queda mas espacios en la cantera");
        }

        return new Quadrant();

    }

    /*
    Este metodo se encarga de mostrar el estado de los cuadrantes
     */
    public void seeQuadrant() {

        for (int i = 0; i < spaceQuadrant.length; i++) {

            System.out.println("Cuadrante numero " + (i + 1) + ") "
                    + spaceQuadrant[i] + " toneladas");

        }
    }

    /*
    Este metodo se encarga de deshabilitar  las solicitudes realizadas 
     */
    public Request requestDisable() {

        // Request registerRequest[] = new Request[10];
        for (int i = 0; i < registerRequest.length; i++) {
            if (registerRequest[i] != null) {
                if (registerRequest[i].getState().equals("En Tramite")) {
                    System.out.println("________________________________"
                            + "_____________________________________");
                    System.out.println("el numero de solicitud es "
                            + registerRequest[i].getNumRequest());
                    System.out.println("el nombre del cliente es "
                            + registerRequest[i].getApplicant().getName());

                    if (registerRequest[i].getApplicant().getCIF() != null) {
                        System.out.println("El cif de la empresa es "
                                + registerRequest[i].getApplicant().getCIF());
                    }
                    if (registerRequest[i].getApplicant()
                            .getIdCostumer() != null) {
                        System.out.println("La identificacion del cliente es "
                                + registerRequest[i]
                                        .getApplicant().getIdCostumer());
                    }

                    System.out.println("la fecha en que fue tramitada la"
                            + " solicitud es " + registerRequest[i].getDate());
                    System.out.println("________________________________"
                            + "_____________________________________");

                }
            }

        }

        disableRequest();

        return new Request();
    }

    /*
    Este metodo se encarga de seleccionar la solicitud a cancelar y retornar el
    material al cuadrante
     */
    public Request disableRequest() {

        verifier = false;
        do {
            System.out.println("Digite el numero de solicitud que desea"
                    + " cancelar");
            String selectId = scannerTwo.nextLine();

            for (int i = 0; i < registerRequest.length; i++) {
                if (registerRequest[i] != (null)) {
                    if (selectId.equalsIgnoreCase(registerRequest[i]
                            .getNumRequest())) {
                        spaceQuadrant[9] = spaceQuadrant[9]
                                + registerRequest[i].getVehicle().getTonsLoaded();

                        registerRequest[i].setState("Deshabilitado");
                        System.out.println("la solicitud ha sido deshabilitada"
                                + " exitosamente");

                        verifier = true;
                    }

                }

            }
        } while (verifier == false);
        return new Request();

    }

    /*
    Este metodo se encarga de avisar y regular las explosiones de los cuadrantes
     */
    public Quadrant quadrantExplode() {

        if (seeStateQ() >= 3) {
            for (int i = 0; i < registerRequest.length; i++) {
                if (registerRequest[i] != null) {
                    explodeQuadrant(registerRequest[i]
                            .getVehicle().getTonsLoaded());
                    System.out.println("__________________________________"
                            + "_________________");
                    Date dates = new Date();
                    System.out.println("Los cuadrantes correspondientes "
                            + "explotaron el " + dates);
                    if (registerRequest[i].getState().equals("En Tramite")) {

                    }
                }

            }
        }

        return null;

    }

    /*
    Este metodo se encarga de mostrar el estado de las solicitudes y 
    retornar la cantidad total
     */
    public int seeStateQ() {
        int countRequest = 0;

        for (int i = 0; i < registerRequest.length; i++) {
            if (registerRequest[i] != null) {
                if (registerRequest[i].getState().equals("En Tramite")) {
                    countRequest++;

                }
            }

        }

        return countRequest;

    }

    /**
     * con este metodo permite salir al usuario del programa por medio de una
     * serie de condicionales
     *
     * @return retorna la salida del booleano del sistema.
     */
    public boolean exitLogin() {
        boolean exitAll;
        boolean exitProgram = true;
        
        do {
            exitAll = true;

            System.out.println("¿Desea salir del programa?");
            System.out.println("____________________________");
            System.out.println("digite si/no: ");
            String exit = scannerTwo.nextLine();
            if (exit.equalsIgnoreCase("si")) {

                exitAll = false;

                System.out.println("Gracias " + registerUser[countName]
                        .getName() + " por usar Sibajas Quarry");
                System.out.println("ha salido correctamente del programa");
                exitProgram = false;

            } else {

                if ((exit.equalsIgnoreCase("no"))) {
                    System.out.println("Bienvenido nuevamente "
                            + registerUser[countName].getName());
                    System.out.println("Selecione a continuación la"
                            + " operacion que desea realizar:  ");
                    exitProgram = false;

                } else {
                    System.out.println("Digite correctamente su opción");
                    exitProgram = true;
                }
            }
        } while (exitProgram == true);

        return (exitAll);

    }

    /* este caso tiene como funcion ver los clientes persona en tramite para
    facturar*/
    public Request seeRBillingP() {

        // Request registerRequest[] = new Request[10];
        for (int i = 0; i < registerRequest.length; i++) {
            if (registerRequest[i] != null) {
                if (registerRequest[i].getState().equals("En Tramite")) {
                    if ((registerRequest[i].getApplicant().getCIF() == null)) {
                        System.out.println(registerRequest[i].toString());
                    }
                }
            }

        }

        disableRequest();

        return new Request();
    }

    /* este metodo tiene como funcion alsignar los datos de factura y retornarlos*/
    public Billing billingCustomer() {
        System.out.println("Digite el numero de factura");
        String numBilling = scannerTwo.nextLine();
        Date billingDate = new Date();
        return new Billing(billingDate, numBilling, request);
    }

    /* este metodo tiene como funcion mostrar las facturas actuales*/
    public Billing callBillingP() {
        seeRBillingP();
        customerBilling();
        String idRequest = customerBilling();
        for (int i = 0; i < registerBilling.length; i++) {
            if (registerBilling != null) {
                if (registerBilling[i].getRequest().getNumRequest()
                        .equals(idRequest)) {
                    System.out.println(registerBilling[i].toString());
                }
            }
        }
        return new Billing();

    }

    /* este metodo tiene como duncion selkeccionar la factura que desea tramitar*/
    public String customerBilling() {

        System.out.println("solicitud a facturar");
        verifier = false;
        String idRequest;
        do {

            System.out.println("digite el num de solicitud a facturar");
            idRequest = scannerTwo.nextLine();
            for (int i = 0; i < registerRequest.length; i++) {
                if ((registerRequest[i] != (null)) && (registerRequest[i]
                        .getApplicant().getIdCostumer() != null)) {
                    if (idRequest.equalsIgnoreCase(registerRequest[i]
                            .getNumRequest())) {
                        registerRequest[i].setState("Tramitado");

                        verifier = true;
                    }
                }
            }
        } while (verifier == false);
        billingPerson(idRequest);
        return idRequest;

    }

    /* este metodo tiene como funcion almacenar el los datos de la factura
    en un arreglo*/
    public Billing billingPerson(String idRequest) {
        for (int i = 0; i < registerBilling.length; i++) {
            if (registerBilling[i] == null) {
                registerBilling[i] = billingCustomer();
                System.out.println("se incorporado una factura");
                break;
            } else {
            }
        }
        return (null);

    }

}
