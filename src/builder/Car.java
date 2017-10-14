/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author helena
 */
public class Car {
    private int wheels;
    private String color;
    
    public  Car(){
        
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(final String color){
        this.color=color;
    }
    
    public int getWheels(){
        return wheels;
    }
    
    public void setWheels(final int wheels){
        this.wheels=wheels;
    }
    
    @Override
    public String toString(){
        return "Car [wheels = " + wheels + ", color = " + color + "]";
    }
}
