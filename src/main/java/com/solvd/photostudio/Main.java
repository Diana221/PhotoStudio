package com.solvd.photostudio;

import com.solvd.photostudio.customers.Customer;
import com.solvd.photostudio.photoShoot.AdditionalServices;
import com.solvd.photostudio.photoShoot.InteriorItems;
import com.solvd.photostudio.photoShoot.Studio;
import com.solvd.photostudio.photoShoot.StudioType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {

        logger.info("Info log message");
        logger.error("Did it again!");

        Studio[] studio = new Studio[5];
        StudioType studioType = new StudioType(1, "black", "casual");
        InteriorItems interiorItems = new InteriorItems(true, true, true, false);
        AdditionalServices additionalServices = new AdditionalServices(true, true, false, false, false);

        studio[0] = new Studio(1, studioType, 250, interiorItems, additionalServices);
        studio[1] = new Studio(2, studioType, 450, interiorItems, additionalServices);
        Customer p1 = new Customer("Ivanna", "Ivanova", "+380984542332", 20, true);
        Customer p2 = new Customer("Petro", "Petrov", "+380985251213", 20, false);

        ///  p1.info();
        //logger.info(p1.toString());
        // logger.info(p2.toString());
        //  p1.rentPhotographer();
        //  p1.rentStudio();
       // p1.callBack();
        //p1.photoShoot(studio);
    }
}
