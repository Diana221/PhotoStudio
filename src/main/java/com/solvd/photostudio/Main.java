package com.solvd.photostudio;

import com.solvd.photostudio.customers.Customer;
import com.solvd.photostudio.employees.Visagiste;
import com.solvd.photostudio.photoShoot.AdditionalServices;
import com.solvd.photostudio.photoShoot.InteriorItems;
import com.solvd.photostudio.photoShoot.Studio;
import com.solvd.photostudio.photoShoot.StudioType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {

        StudioType studioType_1 = new StudioType(1, "black", "casual");
        StudioType studioType_2 = new StudioType(1, "red", "wer");
        HashSet<StudioType> studioType = new HashSet<>();
        studioType.add(studioType_1);
        studioType.add(studioType_2);
        //logger.info("Studio Type: " + studioType);

        InteriorItems interiorItems_1 = new InteriorItems(true, false, true, false);
        InteriorItems interiorItems_2 = new InteriorItems(false, true, true, true);
        LinkedList<InteriorItems> interiorItems = new LinkedList<>();
        interiorItems.add(interiorItems_1);
        interiorItems.add(interiorItems_2);
        //logger.info("Interior Items: " + interiorItems);

        AdditionalServices additionalServices_1 = new AdditionalServices(true, true, false, false, false);
        AdditionalServices additionalServices_2 = new AdditionalServices(false, true, true, false, false);
        AdditionalServices additionalServices_3 = new AdditionalServices(true, true, false, true, true);
        Stack<AdditionalServices> additionalServices = new Stack<>();
        additionalServices.add(additionalServices_1);
        additionalServices.add(additionalServices_2);
        //logger.info("Additional Services: " + additionalServices);

        Customer customer_1 = new Customer("Ivanna", "Ivanova", "+380984542332", 20, true);
        Customer customer_2 = new Customer("Petro", "Petrov", "+380985251213", 20, false);
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(customer_1);
        customers.add(customer_2);
        //logger.info("Customers: " + customers);

        Studio studio_1 = new Studio(1, studioType, 250, interiorItems, additionalServices);
        Studio studio_2 = new Studio(2, studioType, 450, interiorItems, additionalServices);
        LinkedList<Studio> studios = new LinkedList<>();
        studios.add(studio_1);
        studios.add(studio_2);
        //logger.info("Studios: " + studios);

        HashMap<String, Integer> photoShoot = new HashMap<>();
        photoShoot.put(customers.get(0).getName(), studios.get(1).getStudioNumber());
        photoShoot.put(customers.get(1).getName(), studios.get(1).getStudioNumber());
        logger.info(photoShoot);

        Studio.show(500);
        Studio.show("2 photographers, 3 visagistes");

//        customer_1.info();
//        logger.info(customer_1.toString());
//        logger.info(customer_2.toString());
//        customer_1.rentPhotographer();
//        customer_1.rentStudio();
//        customer_1.callBack();
//        customer_1.photoShoot();

    }
}
