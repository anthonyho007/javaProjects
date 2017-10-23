package com.company;

import java.util.Iterator;
import java.util.List;

public class GuitarTest {
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        Guitar targetGuitar = new Guitar("", 0, new GuitarSpec(Builder.FENDER,"Strato",Type.ELECTRIC, Wood.MAPLE, Wood.MAPLE, 12));
        List matchingResult = inventory.search(targetGuitar);
        if (!matchingResult.isEmpty()){
            System.out.println("You might like the following guitars ...");
            for(Iterator i = matchingResult.iterator(); i.hasNext();){
                Guitar guitar = (Guitar) i.next();
                System.out.println("Guitar : "+ guitar.getSpecs().getType() + " " + guitar.getSpecs().getModel() + " " + guitar.getPrice());
            }
        }
        else {
            System.out.println("Sorry, we cant find the guitar you want");
        }
    }

    private static void initializeInventory(Inventory inventory){
        inventory.addGuitar("ABS123", 1499, new GuitarSpec(Builder.FENDER, "Strato", Type.ELECTRIC, Wood.MAPLE, Wood.MAPLE, 12));
        inventory.addGuitar("ABS321", 1000, new GuitarSpec(Builder.FENDER, "Strato", Type.ELECTRIC, Wood.MAPLE, Wood.MAPLE, 12));
    }
}
