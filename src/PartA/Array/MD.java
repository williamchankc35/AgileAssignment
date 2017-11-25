/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PartA.Array;
import PartA.GS.*;
/**
 *
 * @author Leong Tzee Yang
 */
public class MD {
    private Menu[] MenuArrayList;
    
    public MD(){
    MenuArrayList = MenuItem();
    }
 //ARRAY   
    public Menu[] MenuItem(){
      Menu[] MenuArrayList ={ 
          new Menu("F001","Rice","10.00","Promotion",1,"A001"),
          new Menu("F002","Egg","10.00","",2,"A001"),
          new Menu("F003","testing","testing","",3,"A002")
      };
  
      return MenuArrayList;
    
    }
public String[] getFoodID(){
     String[] FoodID = new String[MenuArrayList.length];
        for (int i = 0; i < MenuArrayList.length; ++i) {
            FoodID[i] = MenuArrayList[i].getFoodID();
        }
        return FoodID;
    }
public String[] getFoodName(){
     String[] FoodName = new String[MenuArrayList.length];
        for (int i = 0; i < MenuArrayList.length; ++i) {
            FoodName[i] = MenuArrayList[i].getFoodName();
        }
        return FoodName;
    }
public String[] getPrice(){
     String[] Price = new String[MenuArrayList.length];
        for (int i = 0; i < MenuArrayList.length; ++i) {
            Price[i] = MenuArrayList[i].getPrice();
        }
        return Price;
    }
 
public String[] getDescription(){
     String[] Description = new String[MenuArrayList.length];
        for (int i = 0; i < MenuArrayList.length; ++i) {
            Description[i] = MenuArrayList[i].getDescription();
        }
        return Description;
    }
public int[] getPriority(){
     int[] Priority = new int[MenuArrayList.length];
        for (int i = 0; i < MenuArrayList.length; ++i) {
            Priority[i] = MenuArrayList[i].getPriority();
        }
        return Priority;
    }
public String[] getID(){
     String[] ID = new String[MenuArrayList.length];
        for (int i = 0; i < MenuArrayList.length; ++i) {
            ID[i] = MenuArrayList[i].getID();
        }
        return ID;
    }
}
