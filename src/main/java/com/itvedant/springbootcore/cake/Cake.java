package com.itvedant.springbootcore.cake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cake {
    //Cake object is dependent on the Flavor object
    Flavor flavor;
    Cream cream;

    //Constructor based injection
    //When the object of the Cake is getting created
    //this constructor will be called and the object
    //of the class Flavor will be injected automatically
    Cake(Flavor flavor){
        this.flavor = flavor;
        System.out.println("\nCake Object Created\n");
        flavor.getFlavor();
    }

    //Setter based injection
    //When the object of the Cake is getting created 
    //this setter method will be called and the object
    //of the class Cream will be injected automatically
    @Autowired
    public void setCream(Cream cream){
        this.cream = cream;
        cream.getName();
    }
}
