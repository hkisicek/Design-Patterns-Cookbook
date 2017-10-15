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
public class SmartPhone {
    
    private float screenSize;
    private int resolution;
    private int batteryLife;
    private int ram;
    private float cameraPixel;
    private float storage;
    private float price;
    
    public SmartPhone(){
    }
    
    public float getScreenSize(){
        return screenSize;
    }
    
    public int getResolution(){
        return resolution;
    }
    
    public int getBatteryLife(){
        return batteryLife;
    }
    
    public int getRam(){
        return ram;
    }
    
    public float getCameraPixel(){
        return cameraPixel;
    }
    
    public float getStorage(){
        return storage;
    }
    
    public float getPrice(){
        return price;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setCameraPixel(float cameraPixel) {
        this.cameraPixel = cameraPixel;
    }

    public void setStorage(float storage) {
        this.storage = storage;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
