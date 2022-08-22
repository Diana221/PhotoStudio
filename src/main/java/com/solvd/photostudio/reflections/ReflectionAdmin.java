package com.solvd.photostudio.reflections;

import com.solvd.photostudio.Main;
import com.solvd.photostudio.photoShoot.Admin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;

public class ReflectionAdmin extends Admin {

    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static String getAdminLogin() throws NoSuchFieldException, IllegalAccessException {
        ReflectionAdmin reflectionAdmin = new ReflectionAdmin();
        Field isOpen = reflectionAdmin.getClass().getSuperclass().getDeclaredField("login");
        isOpen.setAccessible(true);
        return (String) isOpen.get(reflectionAdmin);
    }

    public static String getAdminPassword() throws NoSuchFieldException, IllegalAccessException {
        ReflectionAdmin reflectionAdmin = new ReflectionAdmin();
        Field isOpen = reflectionAdmin.getClass().getSuperclass().getDeclaredField("password");
        isOpen.setAccessible(true);
        return (String) isOpen.get(reflectionAdmin);
    }
}
