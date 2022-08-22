package com.solvd.photostudio;


import com.solvd.photostudio.infogeneration.InfoGeneration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.InvocationTargetException;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        InfoGeneration.Greetings();
       //ReflectionModelingAgency.getVariable();

    }
}
