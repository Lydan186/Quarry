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
 * @author james
 */
public class ProyectProcedures {

    static Scanner scanner = new Scanner(System.in);
    static Scanner scannertwo = new Scanner(System.in);
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
  /*
    Este metodo se encarga de mostrar los productos disponibles
     */
    public static void Product() {
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
    public int MenuLogin() {
        int opcion = 0;
        System.out.println("____________________________________");
        System.out.println("1-Registrar Cliente");
        System.out.println("2- dehabilitar solicitudes");
        System.out.println("3-ver todos los datos");
        System.out.println("4-Registrar Solicitudes");
        System.out.println("6-Registrarse");
        System.out.println("7-volver a ingresar");
        System.out.println("____________________________________");
        opcion = scanner.nextInt();
        return opcion;
    }
/*
    Este metodo se encarga de dar un menu a la hora de elegir si se desea
    registrar un cliente persona o uno de empresa, asi mismo trae opciones para
    visualizar si se desean ver los datos de un cliente persona o un cliente
    empresa.
     */
    public int selectCustomer() {
        int opcion = 0;
        System.out.println("Bienvendo");

        System.out.println("1 si desea registar una persona");
        System.out.println("2 si desea registrar una empresa");
        System.out.println("3 Ver datos de persona");
        System.out.println("4 Ver datos de empresa");
        opcion = scanner.nextInt();
        return opcion;
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
        registrationUsername = scannertwo.nextLine();
        System.out.println("Digite el contraseña a registrar");
        registrationUserp = scannertwo.nextLine();

        System.out.println("Digite su nombre");
        registrationName = scannertwo.nextLine();
        System.out.println("Digite su direccion");
        registrationAdress = scannertwo.nextLine();
        System.out.println("Digite su telefono");
        registrationPhone = scannertwo.nextLine();
        System.out.println("Digite su DNI");
        registrationDni = scannertwo.nextLine();

        return new User(registrationUsername, registrationUserp, registrationName, registrationAdress, registrationPhone, registrationDni);

       
    }

    /*
    En este metodo hace el login del sistema, pidiendo el usuario y la
    contraseña del usuario.
     */
    

    public User requestLogin() {

        String registrationUsername;
        String registrationUserp;
        String registrationName;
        System.out.println("----------------------------");
        System.out.println("Bienvenido al login :D");
        System.out.println("----------------------------");
        System.out.println("Porfavor Digite su usuario");
        registrationUsername = scannertwo.nextLine();
        System.out.println("Porfavor Digite su contraseña");
        registrationUserp = scannertwo.nextLine();

        return new User(registrationUsername, registrationUserp);
    }
 /*
    En este metodo se elije el producto para la solicitud utilizando el numero 
    del producto, 
     */
    public Product requestProduct() {
        verifier = false;
        String idProduct = null;
        String productNames = null;
        String productMaterial = null;
        Product();
        seeProducts();
        do {
            System.out.println("digite el numero de producto a escojer");
            int selectProduct = scanner.nextInt();

            if ((selectProduct < 5)) {
                if ((selectProduct > 0)) {
                    if (allProduct[selectProduct - 1] != null) {
                        idProduct = allProduct[selectProduct - 1].toProductId();
                        productNames = allProduct[selectProduct - 1].toName();
                        productMaterial = allProduct[selectProduct - 1].toMaterial();

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
        String personName = scannertwo.nextLine();
        System.out.println("Digite su cedula a registrar");
        String personDni = scannertwo.nextLine();
        System.out.println("Digite su telefono a registrar");
        String personPhone = scannertwo.nextLine();
        System.out.println("Digite la direccion a registrar");
        String personAdress = scannertwo.nextLine();
        return new Applicant(personName, personDni, personPhone, personAdress);

    }
 /*
    Este metodo hace el registro de los datos correspondientes de un cliente 
    empresa
     */
    public Applicant businesRegister() {

        System.out.println("Digite la empresa a registar");
        String businesName = scannertwo.nextLine();
        System.out.println("Digite el CIF de la empresa");
        String busisnesCif = scannertwo.nextLine();
        System.out.println("Digite su telefono a registrar");
        String personPhone = scannertwo.nextLine();
        System.out.println("Digite la direccion a registrar");
        String businesAdress = scannertwo.nextLine();
        return new Applicant(businesName, busisnesCif, personPhone, businesAdress, null);

    }
 /*
        Este metodo se encarga de asignar la solicitud a un cliente persona o a
    un cliente empresa, cuando se le asigne la solicitud a alguno de los dos
    se deben de introducir los datos faltantes.
     */
    public Applicant registerCustomer() {
        verifier = false;

        String name = null;
        String idCostumer = null;
        String cif = null;
        String phone = null;
        String addres = null;
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
                        System.out.println("digite el nombre de la persona que desea asignar la solicitud");
                        String nameP = scannertwo.nextLine();

                        for (int i = 0; i < registerPerson.length; i++) {
                            if (registerPerson[i] != null) {
                                if (nameP.equals(registerPerson[i].getName())) {
                                    name = registerPerson[i].getName();
                                    idCostumer = registerPerson[i].getIdCostumer();
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
                        System.out.println("digite el nombre de la empresa que desea asignar la solicitud");
                        String nameB = scannertwo.nextLine();

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
        String numRequest = scannertwo.nextLine();

      
        Date requestDate = new Date();

        return new Request(requestProduct(), registerCustomer(), requestDate, "En Tramite", vehicleRegister(), numRequest);
    }
    public int countName = 0;
 /*
    Este metodo se encarga de verificar que el usuario haya verificado bien 
    los datos de nombre de usuario y la contraseña y si es correcta entonces
    que de la bienvenida al sistema
     */
    public void Login() {
        verifier = false;
        registerUser[0] = new User("1", "1", "James", "Alamedas", "61506639", "604800142");

        do {

            User requestL = requestLogin();

            for (int i = 0; i < registerUser.length; i++) {
                if (registerUser[i] != null) {

                    if (requestL.toStrin().equals(registerUser[i].toStrin())) {
                        System.out.println("Se ha igresado correctamente");
                        System.out.println("Bienvenido " + registerUser[i].getName());
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

        String nameDriver;
        String license;
        String phone;
        String dniDriver;
        String Addres;

        System.out.println("Nombre del conductor");
        nameDriver = scannertwo.nextLine();
        System.out.println("licencia del conductor");
        license = scannertwo.nextLine();
        System.out.println("Direccion de casa del conductor");
        Addres = scannertwo.nextLine();
        System.out.println("telefono celular");
        phone = scannertwo.nextLine();
        System.out.println("DNI");
        dniDriver = scannertwo.nextLine();

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
        String tuition = scannertwo.nextLine();

        System.out.println("Digite la cantidad de toneladas que desea comparar");
        double tonsLoaded = scanner.nextInt();

        System.out.println("Digite la fecha de entrada del vehiculo en el siguiente formato (\"dd-MM-YYYY\")");
        try {
            String selectEntryT = scannertwo.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-YYYY");
            entryDate = format.parse(selectEntryT);
        } catch (Exception i) {
            System.err.println("No digito la fecha correctamente");
        }

        System.out.println("Digite la fecha de salida en el siguiente formato (\"dd-MM-YYYY\")");

        try {
            String selectDepartureD = scannertwo.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-YYYY");
            departureDate = format.parse(selectDepartureD);
        } catch (Exception i) {
            System.err.println("No se ha podido convertir la fecha");
            
            
            
            
        }
        
             System.out.println("Digite la hora de entrada en el siguiente formato (HH:MM:SS)");
          try {
            String selectEntry = scannertwo.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("HH:MM:SS");
            entryTime = format.parse(selectEntry);
        } catch (Exception i) {
            System.err.println("No digito la fecha correctamente");
            
            
            
            
        }  
          System.out.println("Digite lahora de salida en el siguiente formato (HH:MM:SS)");
        
          try {
            String selectDepartureT = scannertwo.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("HH:MM:SS");
            departureTime = format.parse(selectDepartureT);
        } catch (Exception i) {
            System.err.println("No digito la fecha correctamente");
        }
        
        
        
        
        
        return new Vehicle(entryDate, tuition, departureDate, tonsLoaded, driverRegister(),entryTime,departureTime);
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
        Product();

        for (int i = 0; i < allProduct.length; i++) {

            System.out.println("_________________________________________________");

            System.out.println("Producto N(" + (i + 1) + ")");
            if (allProduct[i] != null) {

                System.out.println("codigo de producto " + allProduct[i].getIdProduct());
                System.out.println("nombre del producto " + allProduct[i].getProductName());
                System.out.println("tipo de material " + allProduct[i].getProductMaterial());

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
      public void seeRegisterV() {
        System.out.println("__________________________________________");
        System.out.println("vehiculos registrados");
        for (int i = 0; i < registerRequest.length; i++) {
            if (registerRequest[i] != null) {
                System.out.println("Este vehiculo esta asignado a la solicicitud de "+registerRequest[i].getApplicant().getName());
                System.out.println("Conductor "+registerRequest[i].getVehicle().getDriver());
                System.out.println("fecha de entrada "+registerRequest[i].getVehicle().getEntryDate());
                System.out.println("fecha de salida"+registerRequest[i].getVehicle().getDepartureDate());
                System.out.println("hora de entrada del vehiculo"+registerRequest[i].getVehicle().getEntryTime());
                System.out.println("hora de salida del vehiculo"+registerRequest[i].getVehicle().getDepartureTime());
           
           
                        

            }
        }

        System.out.println("__________________________________________");
    }
    
    /**
     * sirve para explotar los cuadrantes y asi disminuir toneladas *
     */
    public double spaceQuadrant[] = {4, 40, 400, 4000, 40000, 80, 800, 8000, 800000, 0,};

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

            System.out.println(spaceQuadrant[i]);

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
                    System.out.println("_____________________________________________________________________");
                    System.out.println("el numero de solicitud es " + registerRequest[i].getNumRequest());
                    System.out.println("el nombre del cliente es " + registerRequest[i].getApplicant().getName());

                    if (registerRequest[i].getApplicant().getCIF() != null) {
                        System.out.println("El cif de la empresa es " + registerRequest[i].getApplicant().getCIF());
                    }
                    if (registerRequest[i].getApplicant().getIdCostumer() != null) {
                        System.out.println("La identificacion del cliente es " + registerRequest[i].getApplicant().getIdCostumer());
                    }

                    System.out.println("la fecha en que fue tramitada la solicitud es " + registerRequest[i].getDate());
                    System.out.println("_____________________________________________________________________");

                }
            }

        }

        disableRequest();

        return new Request();
    }
/*
    Este metodo se encarga de seleccionar la solicitud a cancelar y retornar el material al cuadrante
     */
    public Request disableRequest() {

        verifier = false;
        do {
            System.out.println("Digite el numero de solicitud que desea cancelar");
            String selectId = scannertwo.nextLine();

            for (int i = 0; i < registerRequest.length; i++) {
                if (registerRequest[i] != (null)) {
                    if (selectId.equalsIgnoreCase(registerRequest[i].getNumRequest())) {
                        spaceQuadrant[9] = spaceQuadrant[9] + registerRequest[i].getVehicle().getTonsLoaded();

                        registerRequest[i].setState("Deshabilitado");
                        System.out.println("la solicitud ha sido dehabilitada exitosamente");

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
                    explodeQuadrant(registerRequest[i].getVehicle().getTonsLoaded());
                    System.out.println("___________________________________________________");
                    Date dates = new Date();
                    System.out.println("Los cuadrantes correspondientes explotaron el " + dates);
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
 con este metodo permite salir al usuario del programa por medio de una serie de condicionales
 **/
    public boolean exitLogin() {

        boolean exitProgram = true;
        boolean exitAll;
        do {
            exitAll = true;

            System.out.println("¿Desea salir del programa?");
            System.out.println("____________________________");
            System.out.println("digite si/no: ");
            String exit = scannertwo.nextLine();
            if (exit.equalsIgnoreCase("si")) {

                exitAll = false;
                System.out.println("ha salido correctamente del programa");
                System.out.println("Gracias " + registerUser[countName].getName() + " por usar Sibajas Quarry");

                exitProgram = false;

            } else {

                if ((exit.equalsIgnoreCase("no"))) {
                    System.out.println("Bienvenido nuevamente " + registerUser[countName].getName());
                    System.out.println("Selecione a continuación la operacion que desea realizar:  ");
                    exitProgram = false;

                } else {
                    System.out.println("Digite correctamente su opción");
                    exitProgram = true;
                }
            }
        } while (exitProgram == true);

        return (exitAll);

    }
    
    
    
    
    

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

    public Billing billingCustomer() {
        System.out.println("Digite el numero de factura");
        String numBilling = scannertwo.nextLine();
        Date billingDate = new Date();
        return new Billing(billingDate, numBilling, request);
    }

    public Billing callBillingP() {
        seeRBillingP();
        customerBilling();
        String idRequest = customerBilling();
        for (int i = 0; i < registerBilling.length; i++) {
            if (registerBilling != null) {
                if (registerBilling[i].getRequest().getNumRequest().equals(idRequest)) {
                    System.out.println(registerBilling[i].toString());
                }
            }
        }
        return new Billing();

    }

    public String customerBilling() {

        System.out.println("solicitud a facturar");
        verifier = false;
        String idRequest;
        do {

            System.out.println("digite el num de solicitud a facturar");
            idRequest = scannertwo.nextLine();
            for (int i = 0; i < registerRequest.length; i++) {
                if ((registerRequest[i] != (null)) && (registerRequest[i].getApplicant().getIdCostumer() != null)) {
                    if (idRequest.equalsIgnoreCase(registerRequest[i].getNumRequest())) {
                        registerRequest[i].setState("Tramitado");

                        verifier = true;
                    }
                }
            }
        } while (verifier == false);
        billingPerson(idRequest);
        return idRequest;

    }

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
