package com.dextra.burguerfy.model;

public class BaconDecorator implements IngredientsDecorator {

    private Food basicFood;

    public BaconDecorator (Food basicFood){
        this.basicFood = basicFood;

    }
    @Override
    public String description() {
        return null;
    }

    @Override
    public Double price() {
        return basicFood.price() + 2.0;
    }
}
