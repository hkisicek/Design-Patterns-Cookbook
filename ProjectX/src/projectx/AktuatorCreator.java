/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectx;

/**
 *
 * @author helena
 */
public class AktuatorCreator implements DeviceCreator {
    
    private Device device;
    
    public AktuatorCreator(String name, int type, float sort, int min_value, int max_value, String comment){
       this.device=new Device(name,type,sort,min_value,max_value,comment);
    }
    
    @Override
    public String initialiseDevice(){
        return "Aktuator is initialised";
    }
    
}
