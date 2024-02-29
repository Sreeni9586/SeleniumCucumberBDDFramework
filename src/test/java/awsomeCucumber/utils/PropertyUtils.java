package awsomeCucumber.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

    public static Properties propertyloader(String filePath){
        Properties properties = new Properties();

        try {
            // Creates a FileReader
            FileReader file = new FileReader(filePath);

            // Creates a BufferedReader
            BufferedReader reader = new BufferedReader(file);

            try{
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to load Properties file" + filePath);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Properties file not find at"+filePath);
        }
        return properties;

    }
}
