/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;


import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author lamon
 */
public class HHSSAdventure {
    
    private UserInterface gui;
    

    public HHSSAdventure() {
        FileReader file = null;
        try {
             file = new FileReader("images/pics.txt");   
        } catch (Exception e) {
            e.printStackTrace();
        }
        Scanner input = new Scanner(file);
        
        gui = new UserInterface(this);
        gui.setVisible(true);
    }
    
    public void SetScene(){
        
    }
    
    public void nextDescription(){
     
    }
    
    public void buttonForward(){
        
    }
    
    public void buttonLeft(){
        
    }
    
    public void buttonRight(){
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HHSSAdventure f = new HHSSAdventure();
       
        
    }
}
   
