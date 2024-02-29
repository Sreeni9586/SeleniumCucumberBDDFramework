package awsomeCucumber.customType;

import awsomeCucumber.domainObjects.Product;
import io.cucumber.java.ParameterType;

public class CustomParameterType {

    @ParameterType(".*")
    public Product product(String name){

        return new Product(name.replace("\"",""));


    }
}
