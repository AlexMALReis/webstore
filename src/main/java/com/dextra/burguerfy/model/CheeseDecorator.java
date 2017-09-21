package com.dextra.burguerfy.model;

public class CheeseDecorator implements IngredientsDecorator {

    private Food basicFood;

    public CheeseDecorator (Food basicFood){
        this.basicFood = basicFood;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public Double price() {
        return 1.5;
    }
}
