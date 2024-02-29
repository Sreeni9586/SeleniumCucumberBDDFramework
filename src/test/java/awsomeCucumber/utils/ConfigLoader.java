package awsomeCucumber.utils;

import awsomeCucumber.constants.EnvType;

import java.util.Properties;

public class ConfigLoader {
    private final Properties properties;
    private static ConfigLoader configLoader;

    private ConfigLoader() {
       String environment = System.getProperty("env",String.valueOf(EnvType.APPSTAGE));
        switch (EnvType.valueOf(environment)){
            case PREPROD  -> properties = PropertyUtils.propertyloader("src/test/resources/PreProd_config.properties");
            case APPSTAGE -> properties = PropertyUtils.propertyloader("src/test/resources/AppStaging_config.properties");
            default -> throw new IllegalStateException("Invalid Env" +environment);

        }


    }

    public static ConfigLoader getInstance() {
        if (configLoader == null) {
            configLoader = new ConfigLoader();
        }
        return configLoader;
    }

    public String getBaseUrl() {
        String url = properties.getProperty("baseUrl");

        if (url != null) {
            return url;
        } else {
            throw new RuntimeException("baseURL Not found in the AppStaging_config.properties file");
        }

    }
}