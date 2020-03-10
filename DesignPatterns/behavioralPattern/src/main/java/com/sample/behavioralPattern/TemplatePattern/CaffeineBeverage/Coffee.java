package com.sample.behavioralPattern;

public class Coffee extends CaffeineBeverage {

    private void addSugarAndMilk() {
        System.out.println("Adding Sugar And Milk");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

   
    protected void brew() {
        brewCoffeeGrinds();        
    }

    
    protected void addCondiments() {
        addSugarAndMilk();
    }


}