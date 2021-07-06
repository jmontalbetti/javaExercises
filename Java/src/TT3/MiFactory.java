package TT3;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.io.*;

public class MiFactory {

    public static ISorter getInstance() throws Exception {
        FileReader reader = new FileReader("//Users//jmontalbetti//BootCamp//out//production//BootCamp//TT3//MiFactory.properties");
        Properties properties = new Properties();
        properties.load(reader);
        Class sorterClass = Class.forName(properties.getProperty("sorter"));
        ISorter objSorter = (ISorter) sorterClass.getDeclaredConstructor().newInstance();
        return objSorter;
    }
}
