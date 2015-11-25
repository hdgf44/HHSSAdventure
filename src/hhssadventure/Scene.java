package hhssadventure;

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author millg1278
 */
public class Scene {

    private boolean frontBlocked;
    private String picture;
    private String desc;
    private String direction;
    private String nextLocation;
    private String nextDirection;

    public Scene(Scanner input) { 
        direction = input.next();
        picture = input.next();
        String nextScene = input.next();
        desc = nextLocation;
        if(nextScene == "true"){
            frontBlocked = true;
            input.nextLine();
        }else{
            nextLocation = input.next();
            nextDirection = input.nextLine();
        }
    }

    public String getDirection() {
        return nextDirection;
    }

    public String getDescription() {
        return desc;
    }
    
    public String getCurrentDirection(){
        return direction;
    }
    
    public String getPicture(){
        return picture;
    }

    public boolean frontBlocked() {
        return frontBlocked;
    }
}
