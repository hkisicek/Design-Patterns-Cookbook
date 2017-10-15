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
public class Device {
    
    private String name;
    private int type;
    private float sort;
    private int min_value;
    private int max_value;
    private String comment;
    
    public Device(String name, int type, float sort, int min_value, int max_value, String comment){
        
        this.name=name;
        this.type=type;
        this.sort=sort;
        this.min_value=min_value;
        this.max_value=max_value;
        this.comment=comment;
    }
    
    @Override
    public String toString(){
        return "named:"+name+ "type" + type +"is initialised"; 
    }
}
