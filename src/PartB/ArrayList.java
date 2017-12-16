/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PartB;
import PartB.*;
/**
 *
 * @author user
 */
public class ArrayList {
    private DeliverymanGS[] DMArrayList;
    
    public ArrayList(){
        DMArrayList = ArrayItem();
    }
    public DeliverymanGS[] ArrayItem(){
      DeliverymanGS[] DMArrayList ={
          
          new DeliverymanGS("F001","Thai Fried Rice","9.99","Promotion","5","A001","Tom Yam Soup","12.99","5","A001","Tom Yam Soup","12.99"),
          
    };
      return DMArrayList;
    }
    
public String[] getDMName(){
     String[] FoodID = new String[DMArrayList.length];
        for (int i = 0; i < DMArrayList.length; ++i) {
            FoodID[i] = DMArrayList[i].getDMName();
        }
        return FoodID;
    }

public String[] getDMAge(){
     String[] FoodName = new String[DMArrayList.length];
        for (int i = 0; i < DMArrayList.length; ++i) {
            FoodName[i] = DMArrayList[i].getDMAge();
        }
        return FoodName;
    }

public String[] getDMGender(){
     String[] Price = new String[DMArrayList.length];
        for (int i = 0; i < DMArrayList.length; ++i) {
            Price[i] = DMArrayList[i].getDMGender();
        }
        return Price;
    }
 
public String[] getDMIC1(){
     String[] Description = new String[DMArrayList.length];
        for (int i = 0; i < DMArrayList.length; ++i) {
            Description[i] = DMArrayList[i].getDMIC1();
        }
        return Description;
    }

public String[] getDMIC2(){
     String[] ID = new String[DMArrayList.length];
        for (int i = 0; i < DMArrayList.length; ++i) {
            ID[i] = DMArrayList[i].getDMIC2();
        }
        return ID;
    }

public String[] getDMIC3(){
     String[] ID = new String[DMArrayList.length];
        for (int i = 0; i < DMArrayList.length; ++i) {
            ID[i] = DMArrayList[i].getDMIC3();
        }
        return ID;
    }

public String[] getDMAddress1(){
     String[] ID = new String[DMArrayList.length];
        for (int i = 0; i < DMArrayList.length; ++i) {
            ID[i] = DMArrayList[i].getDMAddress1();
        }
        return ID;
    }

public String[] getDMAddress2(){
     String[] ID = new String[DMArrayList.length];
        for (int i = 0; i < DMArrayList.length; ++i) {
            ID[i] = DMArrayList[i].getDMAddress2();
        }
        return ID;
    }

public String[] getDMAddress3(){
     String[] ID = new String[DMArrayList.length];
        for (int i = 0; i < DMArrayList.length; ++i) {
            ID[i] = DMArrayList[i].getDMAddress3();
        }
        return ID;
    }

public String[] getDMEmail(){
     String[] ID = new String[DMArrayList.length];
        for (int i = 0; i < DMArrayList.length; ++i) {
            ID[i] = DMArrayList[i].getDMEmail();
        }
        return ID;
    }

public String[] getDMContactNo1(){
     String[] ID = new String[DMArrayList.length];
        for (int i = 0; i < DMArrayList.length; ++i) {
            ID[i] = DMArrayList[i].getDMContactNo1();
        }
        return ID;
    }

public String[] getDMContactNo2(){
     String[] ID = new String[DMArrayList.length];
        for (int i = 0; i < DMArrayList.length; ++i) {
            ID[i] = DMArrayList[i].getDMContactNo2();
        }
        return ID;
    }
}