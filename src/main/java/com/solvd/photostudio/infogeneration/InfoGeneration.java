package com.solvd.photostudio.infogeneration;

import com.solvd.photostudio.agency.ModelingAgency;
import com.solvd.photostudio.contacts.Contact;
import com.solvd.photostudio.customers.Customer;
import com.solvd.photostudio.employees.Photographer;
import com.solvd.photostudio.enums.SceneMode;
import com.solvd.photostudio.enums.Style;
import com.solvd.photostudio.equipments.Equipments;
import com.solvd.photostudio.equipments.PhotoCamera;
import com.solvd.photostudio.exceptions.WrongAgeException;
import com.solvd.photostudio.exceptions.WrongPhoneNumberException;
import com.solvd.photostudio.interfaces.IByeMessage;
import com.solvd.photostudio.photoShoot.AdditionalServices;
import com.solvd.photostudio.photoShoot.InteriorItems;
import com.solvd.photostudio.photoShoot.Studio;
import com.solvd.photostudio.photoShoot.StudioType;
import com.solvd.photostudio.reflections.ReflectionAdmin;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class InfoGeneration {

    private static final Logger logger = LogManager.getLogger(InfoGeneration.class.getName());
    private static final String path = "src/main/resources/customer.txt";

    static public LinkedList<Studio> GenerationStudioInfo() {
        StudioType studioType_1 = new StudioType(1, "black", Style.CASUAL.getValue());
        StudioType studioType_2 = new StudioType(2, "red", Style.LIGHT.getValue());
        StudioType studioType_3 = new StudioType(1, "green", Style.FOREST.getValue());
        StudioType studioType_4 = new StudioType(3, "white", Style.WEDDING.getValue());
        LinkedList<StudioType> studioType = new LinkedList<>();
        studioType.add(studioType_1);
        studioType.add(studioType_2);
        studioType.add(studioType_3);
        studioType.add(studioType_4);
        //logger.info("Studio Type: " + studioType);

        InteriorItems interiorItems_1 = new InteriorItems(true, false, true, false);
        InteriorItems interiorItems_2 = new InteriorItems(false, true, true, true);
        InteriorItems interiorItems_3 = new InteriorItems(true, true, true, false);
        InteriorItems interiorItems_4 = new InteriorItems(false, true, true, false);

        LinkedList<InteriorItems> interiorItems = new LinkedList<>();
        interiorItems.add(interiorItems_1);
        interiorItems.add(interiorItems_2);
        interiorItems.add(interiorItems_3);
        interiorItems.add(interiorItems_4);
        //logger.info("Interior Items: " + interiorItems);

        AdditionalServices additionalServices_1 = new AdditionalServices(true, true, false, false, false);
        AdditionalServices additionalServices_2 = new AdditionalServices(false, false, true, false, false);
        AdditionalServices additionalServices_3 = new AdditionalServices(true, true, false, true, true);
        Stack<AdditionalServices> additionalServices = new Stack<>();
        additionalServices.add(additionalServices_1);
        additionalServices.add(additionalServices_2);
        additionalServices.add(additionalServices_3);
        //logger.info("Additional Services: " + additionalServices);

        Studio studio_1 = new Studio(1, studioType.get(1), 50, interiorItems.get(0), additionalServices.get(0));
        Studio studio_2 = new Studio(2, studioType.get(2), 40, interiorItems.get(3), additionalServices.get(1));
        Studio studio_3 = new Studio(3, studioType.get(1), 100, interiorItems.get(0), additionalServices.get(0));
        Studio studio_4 = new Studio(4, studioType.get(0), 250, interiorItems.get(1), additionalServices.get(0));
        Studio studio_5 = new Studio(5, studioType.get(2), 80, interiorItems.get(2), additionalServices.get(1));
        Studio studio_6 = new Studio(6, studioType.get(3), 30, interiorItems.get(2), additionalServices.get(2));
        LinkedList<Studio> studios = new LinkedList<>();
        studios.add(studio_1);
        studios.add(studio_2);
        studios.add(studio_3);
        studios.add(studio_4);
        studios.add(studio_5);
        studios.add(studio_6);
        return studios;
    }

    static public LinkedList<Photographer> GenerationPhotographerInfo() {
        PhotoCamera photoCamera = new PhotoCamera("compact", "RAW", "sRGB", "Auto", SceneMode.CHILD);
        PhotoCamera photoCamera_1 = new PhotoCamera("bridge ", "L", "sRGB", "Auto", SceneMode.FLOWERS);
        PhotoCamera photoCamera_2 = new PhotoCamera("action", "M", "RGB", "Auto", SceneMode.PORTRAIT);
        PhotoCamera photoCamera_3 = new PhotoCamera("film ", "S1", "sRGB", "Auto", SceneMode.SPORTS);
        ArrayList<PhotoCamera> photoCameras = new ArrayList<>();
        photoCameras.add(photoCamera);
        photoCameras.add(photoCamera_1);
        photoCameras.add(photoCamera_2);
        photoCameras.add(photoCamera_3);
        // logger.info( photoCameras);

        Equipments equipment = new Equipments(true, photoCameras.get(0));
        Equipments equipment_1 = new Equipments(false, photoCameras.get(1));
        Equipments equipment_2 = new Equipments(true, photoCameras.get(3));
        Equipments equipment_3 = new Equipments(false, photoCameras.get(2));
        ArrayList<Equipments> equipments = new ArrayList<>();
        equipments.add(equipment);
        equipments.add(equipment_1);
        equipments.add(equipment_2);
        equipments.add(equipment_3);
        // logger.info( equipments);

        Photographer photographer_1 = new Photographer("Nastya", "Serova", "+380987656543", 50, equipments.get(0), 50, 15);
        Photographer photographer_2 = new Photographer("Maria", "Veronova", "+380987656543", 31, equipments.get(3), 30, 5);
        Photographer photographer_3 = new Photographer("Masha", "Deloba", "+380981116543", 55, equipments.get(1), 90, 25);
        Photographer photographer_4 = new Photographer("Sergei", "Bolkun", "+380981656543", 41, equipments.get(2), 80, 10);
        LinkedList<Photographer> photographers = new LinkedList<>();
        photographers.add(photographer_1);
        photographers.add(photographer_2);
        photographers.add(photographer_3);
        photographers.add(photographer_4);
        return photographers;
    }

    static public void PhotographerInfo() {
        LinkedList<Photographer> p = GenerationPhotographerInfo();
        for (Photographer photographer : p) logger.info(photographer + "\n");


    }

    static public void CustomerInfo() {
        ArrayList<Customer> c = GenerationCustomerInfo();
        for (Customer customer : c) logger.info(customer + "\n");
    }

    static public void StudioInfo() {
        LinkedList<Studio> p = GenerationStudioInfo();
        for (Studio studio : p) logger.info(studio + "\n");
    }

    static public void ModelingAgencyInfo() {
        ArrayList<ModelingAgency> modelingAgencies = GenerationModelingAgencyInfo();


        logger.info("Opened Modeling Agencies:");
        modelingAgencies.stream()
                .filter(ModelingAgency::isOpen)
                .forEach(System.out::println);
        logger.info("Closed Modeling Agencies:");
        modelingAgencies.stream()
                .filter(str -> !str.isOpen())
                .forEach(System.out::println);
    }


    static public ArrayList<ModelingAgency> GenerationModelingAgencyInfo() {
        ModelingAgency modelingAgency_1 = new ModelingAgency("Cool", "+380984542332", true);
        ModelingAgency modelingAgency_2 = new ModelingAgency("Beautiful", "+380985251213", false);

        ArrayList<ModelingAgency> modelingAgencies = new ArrayList<>();
        modelingAgencies.add(modelingAgency_1);
        modelingAgencies.add(modelingAgency_2);

        return modelingAgencies;
    }


    static public ArrayList<Contact> GenerationContactInfo() {
        Contact contact_1 = new Contact("Kyiv", "kyivphotostudio@gmail.com", "+380984542332");
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(contact_1);
        return contacts;
    }

    static public ArrayList<Customer> GenerationCustomerInfo() {
        Customer customer_1 = new Customer("Ivanna", "Ivanova", "+380984542332", 20, true);
        Customer customer_2 = new Customer("Petro", "Petrov", "+380985251213", 24, false);
        Customer customer_3 = new Customer("Kolya", "Tuvak", "+380984452332", 30, true);
        Customer customer_4 = new Customer("Diana", "Koval", "+380985222213", 21, true);
        Customer customer_5 = new Customer("Nastya", "Myronova", "+380984111332", 26, true);
        Customer customer_6 = new Customer("Marina", "Savchuk", "+380985287613", 23, true);
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(customer_1);
        customers.add(customer_2);
        customers.add(customer_3);
        customers.add(customer_4);
        customers.add(customer_5);
        customers.add(customer_6);
        return customers;
    }

    static public void Greetings() throws NoSuchFieldException, IllegalAccessException {
        boolean enter = true;
        int input;
        logger.info("Hello!");
        do {
            logger.info("\nEnter to log in\n" +
                    "1 -> as customer;\n" +
                    "2 -> as admin.\n");
            Scanner input_ = new Scanner(System.in);

            if (input_.hasNextInt()) {
                input = input_.nextInt();
                if (input == 1 || input == 2) {
                    switch (input) {
                        case 1: {
                            User();
                            break;
                        }
                        case 2: {
                            Admin();
                            break;
                        }
                        default: {
                            enter = false;
                        }
                    }
                }
            } else {
                enter = false;
            }
        }
        while (!enter);
    }

    public static void AdminChoose() throws NoSuchFieldException, IllegalAccessException, IOException {
        int number;
        do {
            Scanner number_ = new Scanner(System.in);
            logger.info("\nEnter:\n" +
                    "1 -> show;\n" +
                    "2 -> find;\n" +
                    "3 -> last purchase;\n" +
                    "0 <- exit;\n"
            );
            if (number_.hasNextInt()) {
                number = number_.nextInt();

                switch (number) {
                    case 1: {
                        Show();
                        break;
                    }
                    case 2: {
                        FindInfo();
                        break;
                    }
                    case 3: {
                        logger.info(FileUtils.readFileToString(new File(path), "UTF-8"));
                        break;
                    }
                    case 0: {
                        Greetings();
                        break;
                    }
                }
            } else {
                number = 1;
            }
        }
        while (number != 0);
    }

    public static void Admin() throws IllegalAccessException, NoSuchFieldException {
        boolean admin = false;

        do {
            Scanner login_ = new Scanner(System.in);
            logger.info("\nlogin:");
            String login = login_.next();
            Scanner password_ = new Scanner(System.in);
            logger.info("\npassword:");
            String password = password_.next();

            if (login.contains(ReflectionAdmin.getAdminLogin()) &&
                    password.contains(ReflectionAdmin.getAdminPassword())) {
                admin = true;
                try {
                    AdminChoose();
                } catch (Exception ex) {
                    logger.error(ex.getMessage());
                }
            } else {
                logger.error("Incorrect login or password!");
            }
        }
        while (!admin);
    }

    static public void User() {
        int number, age = 0, index = 0;
        String customerNote = "";
        String purchase = "";
        boolean sameCustomer = false;
        boolean phone = true;
        boolean customerAge = true;
        String phoneNumber = null;
        Customer customer_now;

        Scanner name_ = new Scanner(System.in);
        logger.info("\nEnter your name:");
        String name = name_.next();
        Scanner surname_ = new Scanner(System.in);
        logger.info("\nEnter your surname:");
        String surname = surname_.next();
        final File file = new File(path);
        for (int i = 0; i < GenerationCustomerInfo().size(); i++) {
            if (GenerationCustomerInfo().get(i).getName().equals(name) &&
                    GenerationCustomerInfo().get(i).getSurname().equals(surname)) {
                sameCustomer = true;
                index = i;
            }
        }

        if (!sameCustomer) {
            logger.info("\nWe need to add some information about you!");
            do {
                Scanner phoneNumber_ = new Scanner(System.in);
                logger.info("Enter your phone number(format 0987671616):");
                try {
                    phoneNumber = phoneNumber_.next();
                    if (!phoneNumber.matches("[-+]?\\d+") && phoneNumber.length() != 10) {
                        throw new WrongPhoneNumberException();
                    } else {
                        phone = false;
                    }
                } catch (WrongPhoneNumberException ex) {
                    logger.info(ex.getMessage());
                }
            }
            while (phone);
            do {
                Scanner age_ = new Scanner(System.in);
                logger.info("\nEnter your age:");
                try {
                    if (age_.hasNextInt()) {
                        age = age_.nextInt();
                        if (age < 18 || age > 100) {
                            throw new WrongAgeException();
                        } else {
                            customerAge = false;
                        }
                    }
                } catch (WrongAgeException e) {
                    logger.info(e.getMessage());
                }
            }
            while (customerAge);
            customer_now = new Customer(name, surname, phoneNumber, age, false);
        } else {
            customer_now = GenerationCustomerInfo().get(index);
        }
        try {
            do {
                Scanner number_ = new Scanner(System.in);
                logger.info("\n" + customer_now.getName() + " " + customer_now.getSurname() +
                        ", Enter:\n" +
                        "1 -> to rent a photographer;\n" +
                        "2 -> to rent a studio;\n" +
                        "3 -> to buy a photo shoot;\n" +
                        "4 -> to have a call back;\n" +
                        "5 -> to enter notes;\n" +
                        "0 <- exit."
                );
                if (number_.hasNextInt()) {
                    number = number_.nextInt();

                    switch (number) {
                        case 1: {
                            purchase = customer_now + "\nRented " +
                                    customer_now.rentPhotographer() + "\n";
                            FileUtils.writeStringToFile(file, purchase + "\n" +
                                    customerNote, "ISO-8859-1");

                            break;
                        }
                        case 2: {
                            purchase = customer_now + "\nRented studio number " +
                                    customer_now.rentStudio();
                            FileUtils.writeStringToFile(file, purchase + "\n" + customerNote,
                                    "ISO-8859-1");

                            break;
                        }
                        case 3: {
                            purchase = customer_now + "\n" + customer_now.photoShoot();
                            FileUtils.writeStringToFile(file, purchase +
                                    "\n" + customerNote, "ISO-8859-1");

                            break;
                        }
                        case 4: {
                            customer_now.callBack(customer_now);
                            break;
                        }
                        case 5: {
                            Scanner note_ = new Scanner(System.in);
                            logger.info("\nEnter your note:");
                            String note = note_.nextLine();
                            if (StringUtils.isEmpty(note)) {
                                logger.info("Empty note");
                            } else {
                                logger.info("Your note: " + StringUtils.normalizeSpace(note));
                                FileUtils.writeStringToFile(file, purchase + "\nNoted: " +
                                        StringUtils.normalizeSpace(note), "ISO-8859-1");
                                customerNote = "\nNoted: " + StringUtils.normalizeSpace(note);
                            }
                            break;
                        }
                        case 0: {
                            //Lambda Expression
                            IByeMessage bye = () -> "\nThank you!";
                            logger.info(bye.bye());
                            Studio.show("We do not work on Wednesdays");
                            Greetings();
                            break;
                        }
                    }
                } else {
                    number = 1;
                }
            }
            while (number != 0);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
    }

    public static void Show() {
        int number = 0;
        try {
            do {
                Scanner number_ = new Scanner(System.in);
                logger.info("\nTo show:\n" +
                        "1 -> customers;\n" +
                        "2 -> studios;\n" +
                        "3 -> photographers;\n" +
                        "4 -> modeling Agencies;\n" +
                        "0 <- back;\n"
                );
                if (number_.hasNextInt()) {
                    number = number_.nextInt();

                    switch (number) {
                        case 1: {
                            CustomerInfo();
                            break;
                        }
                        case 2: {
                            StudioInfo();
                            break;
                        }
                        case 3: {
                            PhotographerInfo();
                            break;
                        }
                        case 4: {
                            ModelingAgencyInfo();
                            break;
                        }
                        case 0: {
                            AdminChoose();
                            break;
                        }
                    }
                }
            }
            while (number != 0);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
    }

    public static void FindInfo() {
        int number = 0;
        boolean find = false;
        try {
            do {
                Scanner number_ = new Scanner(System.in);
                logger.info("\nTo find:\n" +
                        "1 -> customers;\n" +
                        "2 -> studios;\n" +
                        "3 -> photographers;\n" +
                        "4 -> Modeling Agencies;\n" +
                        "0 <- back;\n"
                );
                if (number_.hasNextInt()) {
                    number = number_.nextInt();

                    switch (number) {
                        case 1: {
                            Scanner surname_ = new Scanner(System.in);
                            logger.info("\nEnter customer`s surname:\n"
                            );
                            String surname = surname_.next();
                            for (int i = 0; i < GenerationCustomerInfo().size(); i++) {
                                if (GenerationCustomerInfo().get(i).getSurname().equals(surname)) {
                                    Customer customer = GenerationCustomerInfo().get(i);
                                    logger.info(customer);
                                    find = true;
                                }
                            }
                            if (!find) {
                                logger.info("There is no such customer!");
                            }
                            find = false;
                            break;
                        }
                        case 2: {
                            Scanner studioNumber_ = new Scanner(System.in);
                            logger.info("\nEnter studio number:\n"
                            );
                            if (studioNumber_.hasNextInt()) {
                                int StudioNumber = studioNumber_.nextInt();
                                for (int i = 0; i < GenerationCustomerInfo().size(); i++) {
                                    if (GenerationStudioInfo().get(i).getStudioNumber() == StudioNumber) {
                                        Studio studio = GenerationStudioInfo().get(i);
                                        logger.info(studio);
                                        find = true;
                                    }
                                }
                                if (!find) {
                                    logger.info("There is no such studio!");
                                }
                            } else {
                                logger.info("There is no such studio!");

                            }
                            find = false;
                            break;
                        }
                        case 3: {
                            Scanner surname_ = new Scanner(System.in);
                            logger.info("\nEnter photographer`s surname:\n"
                            );
                            String surname = surname_.next();
                            for (int i = 0; i < GenerationPhotographerInfo().size(); i++) {
                                if (GenerationPhotographerInfo().get(i).getSurname().equals(surname)) {
                                    Photographer photographer = GenerationPhotographerInfo().get(i);
                                    logger.info(photographer);
                                    find = true;
                                }
                            }
                            if (!find) {
                                logger.info("There is no such photographer!");
                            }
                            find = false;
                            break;
                        }
                        case 4: {
                            Scanner agencyName_ = new Scanner(System.in);
                            logger.info("\nEnter Modeling Agency`s name:\n"
                            );
                            String agencyName = agencyName_.next();
                            ArrayList<ModelingAgency> modelingAgencies = GenerationModelingAgencyInfo();
                            boolean answer = modelingAgencies.stream().anyMatch(str ->
                                    str.getAgencyName().contains(agencyName));
                            if (answer) {

                                for (ModelingAgency modelingAgency : modelingAgencies)
                                    if (modelingAgency.getAgencyName().equals(agencyName)) {
                                        if (modelingAgency.isOpen()) {
                                            logger.info("Modeling Agency is open!)");
                                        } else {
                                            logger.info("Modeling Agency is closed!(");
                                        }
                                    }
                            } else {
                                logger.warn("There is no such Modeling Agency!");
                            }
                            break;
                        }
                        case 0: {
                            AdminChoose();
                            break;
                        }
                    }
                }
            }
            while (number != 0);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
    }
}
