package com.dextra.burguerfy.model;

public class EggDecorator implements IngredientsDecorator {

    private Food basicFood;

    public EggDecorator (Food basicFood){
        this.basicFood  = basicFood;

    }
    @Override
    public String description() {
        return null;
    }

    @Override
    public Double price() {
        return basicFood.price() + 0.80;
    }
}
