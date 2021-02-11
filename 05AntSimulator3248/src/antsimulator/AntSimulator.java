/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antsimulator;

import ec.edu.espe.antsimulator.model.Area;

/**
 *
 * @author User
 */
public class AntSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Area area; //declaration
        Area area1;
        Area area2;
        
        area=new Area(); //instantiation-initialization        
        System.out.println("Area object -->" + area);
        
        area1=new Area(80, 100, 5, 5000, "area51", false);        
        System.out.println("Area1 object --> " + area1);
                
        area2 = new Area();        
        
        area2.setName("Area71");        
        System.out.println("Area2 object --> " + area2);
        
        area2.setHeight(50);
        System.out.println("Area2 object --> " + area2);
        
        area1.setBusy(true);
        System.out.println("Area1 object --> " + area1);
        
        int height; //variable declaration
        height=15; //initialization
        
        area.setHeight(10);
        area.setWidth(20);
                
        //FileManager.save("students.csv", "Yulliana Roman, 18, 15, 19, 17");
        //FileManager.find("students.csv", "Yulliana Roman, 15, 16, 18, 19");
        //FileManager.findAll("students.csv");
    }
    
}
