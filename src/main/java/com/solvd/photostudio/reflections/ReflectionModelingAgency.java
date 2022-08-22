package com.solvd.photostudio.reflections;

import com.solvd.photostudio.Main;
import com.solvd.photostudio.agency.ModelingAgency;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionModelingAgency extends ModelingAgency {
    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void getVariable() throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException,
            InvocationTargetException {
        ReflectionModelingAgency reflectionModelingAgency = new ReflectionModelingAgency();
        Field isOpen = reflectionModelingAgency.getClass().getSuperclass().getDeclaredField("isOpen");
        isOpen.setAccessible(true);
        reflectionModelingAgency.getMethod();
        logger.info("Modeling Agency is open: " + isOpen.get(reflectionModelingAgency));
    }

    public void getMethod() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ReflectionModelingAgency reflectionModelingAgency = new ReflectionModelingAgency();
        Method isClose = reflectionModelingAgency.getClass().getSuperclass().getDeclaredMethod("openOrClose");
        isClose.setAccessible(true);
        isClose.invoke(this, (Object[]) null);
    }
}
