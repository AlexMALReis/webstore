package com.dextra.burguerfy.model;

public class LettuceDecorator implements IngredientsDecorator {

    private Food basicFood;

    public LettuceDecorator ( Food basicFood){
        this.basicFood = basicFood;
    }
    @Override
    public String description() {
        return null;
    }

    @Override
    public Double price() {
        return basicFood.price() +  0.40;
    }
}
