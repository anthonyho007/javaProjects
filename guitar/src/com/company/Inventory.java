package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;

    public Inventory(){
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec specs){
        Guitar guitar = new Guitar(serialNumber, price, specs);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for (Iterator i = guitars.iterator(); i.hasNext();){
            Guitar guitar = (Guitar)i.next();
            if ( guitar.getserialNumber().equals(serialNumber)){
                return  guitar;
            }
        }
        return null;
    }

    public List search(Guitar searchGuitar) {
        List<Guitar> result = new LinkedList<>();
        for( Iterator i = guitars.iterator(); i.hasNext();){
            Guitar guitar = (Guitar)i.next();
            if( guitar.getSpecs().matches(searchGuitar.getSpecs()))
                result.add(guitar);
        }
        return result;
    }
}
