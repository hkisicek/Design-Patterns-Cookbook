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
interface CarBuilder {
    Car build();
    
    CarBuilder setColor(final String color);
    
    CarBuilder setWheels(final int wheels);
}
